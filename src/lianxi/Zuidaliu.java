package lianxi;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Zuidaliu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // 输入结点个数和边的个数
        int n = scn.nextInt();
        int m = scn.nextInt();
        // 因为第一个结点时1不是0，所以我们多申请一些空间，索引为0的位置就不使用了。从索引为1的位置看是放
        // gragh[i][j]是第i个结点到第j个结点的权重。
        int[][] gragh = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int vertex1 = scn.nextInt();
            int vertex2 = scn.nextInt();
            int weight = scn.nextInt();
            buildGragh(gragh, vertex1, vertex2, weight);
        }
        // path[i]是第i个结点的父节点。我们通过在BFS中不断更新path[i]里的数，从而保存一条路径。
        int[] path = new int[n + 1];
        int flow = 0;
        while (BFSfindPath(gragh, 1, n, path)) {
            // 如果能够找到增广路径，那么我们在该路径上能够通过的容量就是这个路径上能通过的最小容量。
            int min_capacity = minCapacity(path, gragh);
            flow += min_capacity;
            for (int i = n; i != 1; i = path[i]) {
                int j = path[i];
                gragh[j][i] -= min_capacity;
                gragh[i][j] += min_capacity;
            }
        }
        System.out.println(flow);
    }

    private static void buildGragh(int[][] gragh, int vertex1, int vertex2, int weight) {
        gragh[vertex1][vertex2] += weight;// 一条边可能会出现多次
    }

    private static boolean BFSfindPath(int[][] gragh, int s, int t, int[] path) {
        // path[]是通过记录每个结点的父节点，从而记录下一条完整的路径。
        for (int i = 0; i < path.length; i++) {
            path[i] = 0;
        }
        int vertex_num = gragh.length;
        // 用于标记是否已经访问过该结点,默认是没有访问过的
        boolean[] visited = new boolean[vertex_num];

        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(s);
        visited[s] = true;

        while (q.isEmpty() == false) {
            int tem = q.poll();
            for (int i = 1; i < vertex_num; i++) {
                if (gragh[tem][i] > 0 && visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                    path[i] = tem;
                }
            }
        }
        return visited[t] == true;
    }

    private static int minCapacity(int[] path, int[][] gragh) {
        int min = gragh[path[path.length - 1]][path.length - 1];
        for (int i = path.length - 2; i != 1; i = path[i]) {
            if (gragh[path[i]][i] < min && gragh[path[i]][i] > 0) {
                min = gragh[path[i]][i];
            }
        }
        return min;
    }
}
