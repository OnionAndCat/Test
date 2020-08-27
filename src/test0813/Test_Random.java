package test0813;

//import com.sun.xml.internal.ws.spi.db.RepeatedElementBridge;

import java.util.Random;
import java.util.Scanner;

/*
 * java.util.Random  此类的实例用于生成伪随机数流。
 *   Random()  创建一个新的随机数生成器。
 *       int nextInt(int n)返回一个伪随机数，在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
 *
 *
 * */
public class Test_Random {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int i = 5;
        System.out.println("猜数字，请输入1-100的数字！！！");
        Scanner scanner = new Scanner(System.in);
        while (i >= 1) {
            if (i < 5)
                System.out.println("你还有" + i + "次机会");
            int s = scanner.nextInt();
            if (num == s) {
                System.out.print("你猜对了！！！正确数字就是：" + num);
                break;
            } else if (num > s)
                System.out.print("你猜小了！！！  ");
            else
                System.out.print("你猜大了！！！  ");
            if (i == 1 && num != s) {
                System.out.println("没机会了，正确数字是：" + num);
                break;
            } else
                i--;
        }
    }


    /*public static void main(String[] args) {
        int number = (int) Math.floor(Math.random() * 100 + 1);
        int num, i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            num = scanner.nextInt();
            if (num > number)
                System.out.println("猜大了");
            else if (num < number)
                System.out.println("猜小了");
            i++;
        } while (number != num && i < 6);
        if (i == 6)
            System.out.println("猜错了,没机会了,正确数字是：" + number);
        else
            System.out.println("正确了,数字是：" + number);
    }*/
}
