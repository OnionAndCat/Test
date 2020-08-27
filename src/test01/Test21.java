package test01;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
//        while (true){
//            Scanner scanner = new Scanner(System.in);
//            int weekday = scanner.nextInt();
//            System.out.println("请输入1-7的数字：");
            int weekday = 3;
            if (weekday < 1 || weekday > 7) {
                System.out.println("你输入的数字有误");
            } else if (weekday == 7) {
                System.out.println("周日");
            } else if (weekday == 6) {
                System.out.println("周六");
            } else if (weekday == 5) {
                System.out.println("周五");
            } else if (weekday == 4) {
                System.out.println("周四");
            } else if (weekday == 3) {
                System.out.println("周三");
            } else if (weekday == 2) {
                System.out.println("周二");
            } else if (weekday == 1) {
                System.out.println("周一");
            }
//        }
    }
}
