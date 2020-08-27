package test01;

/*
 * for循环扩展：
 *   break 和 continue 后可以标记 结束或者跳过指定循环
 *       格式：
 *           标记：for(;;){}
 *           break  标记/continue  标记
 *
 * if 单个分支扩展：
 *   当if大括号内部只有一条语句  大括号可以省略
 *
 * */
public class Test31 {
    public static void main(String[] args) {
        test01:
        for (int i = 1; i <= 3; i++) {
            /*
             *   1-1    1-2    1-3
             *   2-1    2-2    2-3
             *   3-1    3-2    3-3
             * */
            test02:
            for (int j = 1; j <= 3; j++) {
                if (i == 2) {
//                    break test01;
//                    continue test01;
                }
                System.out.print(i + "-" + j + "    ");
            }
            System.out.println();
        }
    }
}
