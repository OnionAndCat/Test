package test0813;

import java.util.Scanner;

/*
* 学习一个类分三步：
*   1、导包    java.lang包下得类不需要导
*       import  包名.类名
*   2、学习构造犯法建立对象
*   3.学习成员方法使用
*
*   创建对象的格式
*       类名 对象 = new 类名(参数)
*
*   java.util.Scanner  一个可以使用正则表达式来解析基本类型和字符串的简单文本扫描器。
*   构造方法：
*       Scanner(InputStream source) 构造一个新的 Scanner，它生成的值是从指定的输入流扫描的。
 *          InputStream source： 固定写法 -- System.in  系统输入指的是通过键盘录入数据
*  成员方法：
*        String next() 获取键盘输入的信息，空格、Tab、enter都会视为结束符
*        int nextInt()  获取键盘输入的数字  int
*        String nextLine()  获取键盘输入的信息  只有enter才是结束符  可以保留空格
*
*   匿名对象：
*       格式：
*           new[ 类名(参数列表);
*   使用场景：
*        当这个对象在本类中只使用一次时推荐写匿名对象
*
* */
public class Test_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("两个数的和:" + (num1 + num2));

        int num3 = scanner.nextInt();

        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;

        System.out.println("最大值：" + max);
    }
}
