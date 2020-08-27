package lianxi;

import java.util.Scanner;

public class Erjinzhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += getOne(i);
        }
        System.out.println(sum);
    }
    public static int getOne(int x) {
        int sum = 0;
        for (int i = x; i > 0; i /= 2) {
            if (i % 2 != 0)
                sum++;
        }
        return sum;
    }
}
