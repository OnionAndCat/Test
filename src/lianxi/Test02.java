package lianxi;

import java.util.Scanner;

public class Test02 {
    //1
//    public static void main(String[] args) {
//        int x = 1, y = 100, sum = 0;
//        System.out.println(print(x, y, sum));
//    }
//
//    public static int print(int x, int y, int sum) {
//        sum = (x <= y) ? print(++x, y, sum + x - 1) : sum;
//        return sum;
//    }

    //2
//    public static void main(String[] args) {
//        int x = 1, y = 100, sum = 0;
//        System.out.println(print(x, y, sum));
//    }
//
//    public static int print(int x, int y, int sum) {
//        sum = (x <= y) ? print((x + 2), y, sum + x) : sum;
//        return sum;
//    }

    //3
//    public static void main(String[] args) {
//        int x = 0;
//        for (int i = 3000; i > 5; i /= 2) {
//            x++;
//        }
//        System.out.println(x);
//    }

    //4
//    public static void main(String[] args) {
//        for(int i = (int)'α' ; i <= 'ω'; i++)
//            System.out.print((char)i + " ");
//    }

    //5
//    public static void main(String[] args) {
//        for (int i = 8; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //6
//    public static void main(String[] args) {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //7
//    public static void main(String[] args) {
//        int num = 30;
//        for (int i = 0; i < num; i++) {
//            for (int j = (num - i) / 2; j >0; j--) {
//                System.out.print("   ");
//            }
//            for (int k = 1; k < i; k++) {
//                System.out.print("*  ");
//            }
//            i++;
//            System.out.println();
//        }
//    }

//    8
    public static void main(String[] args) {
        int num = 15;
        for (int i = 0; i < num; i++) {
            for (int j = (num - i) / 2; j > -15; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("+  ");
            }
            i++;
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = -15; j <= i / 2; j++) {
                System.out.print("   ");
            }
            for (int k = num - i - 2; k > 1; k--) {
                System.out.print("+  ");
            }
            i++;
            System.out.println();
        }
    }

    //9
//    public static void main(String[] args) {
//        for(int i =100;i<1000;i++){
//            int x = i/100;
//            int y = i/10%10;
//            int z = i%10;
//            if ((x*x*x+y*y*y+z*z*z) == i)
//                System.out.println(i);
//        }
//    }

    //10
//    public static void main(String[] args) {
//        int number = (int) Math.floor(Math.random() * 100 + 1);
//        int num = 0, i = 0;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            num = scanner.nextInt();
//            if(num>number)
//                System.out.println("猜大了");
//            else if (num<number)
//                System.out.println("猜小了");
//            i++;
//        } while (number != num && i < 6);
//        if (i==6)
//            System.out.println("猜错了,没机会了,正确数字是："+ number);
//        else
//            System.out.println("正确了,数字是："+ number);
//    }
}
