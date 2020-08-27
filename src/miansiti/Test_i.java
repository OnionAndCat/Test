package miansiti;

import lianxi.Test01;

public class Test_i {
    public static void main(String[] args) {


        //(1)i>i+1;
//        int i = Integer.MAX_VALUE;
////        System.out.println(i);
//        if (i > i + 1) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        //(2)面试题：以上程序有没有错误  为什么？
//        byte num = 10;  //赋值的是常量，自动判断常量有没有超出左侧，没有超出范围自动补上强转换
//        byte num1 = 10;
//        byte num2 = 20;
////        byte result = num1 + num2; 错误
//        byte result = (byte) (num1 + num2);
//        byte result1 = (byte) (num1 + (byte) num2);
//        int result2 = num1 + num2;

        //(3)a=?  为什么
//        int a = 1;
//        a = a++;   //先赋值再运算
//        System.out.println(a);  //a=1

        //(4)面试题2  与负数取余数  符号看左边
//        System.out.println(5 % 3);
//        System.out.println(-5 % 3);
//        System.out.println(5 % -3);
//        System.out.println(-5 % -3);
//
//        int b = 5;
//        System.out.println(b++);


        //(5)  =  ==  ===  有什么区别
        //=   赋值
        //==  比较两个数是否相等吗
        //===  js里面有  先比较类型后比较值


        /*//（6）以下代码结果是？
        int x = 1;
        for (System.out.print("a"); x <= 3; System.out.print("c")) {
            System.out.print("b");
            x++;
        }
        //abcbcbc*/

        /*//(7)以下代码a的结果是？
        int a = 1;
        for (int i = 0; i < 100; i++) {
            a = a++;
        }
        System.out.println(a);*/

        //(8) a的结果是-- tset01
//        int a = 0;
//        test01(a);
//        a++; //a=1    //a=a++  a=0
//        System.out.println(a);

        //(9)
//        double a = 1.0/0;
//        System.out.println(a);//Infinity
//        //0会向上转型变成无穷小，任何一个数除以无穷小都会变成无穷大（微积分）

        //（10）
        /*ECMAScript 和 JavaScript  有什么关系？
        *
        *ECMAScript：所有脚本语言的标准
        *JavaScript：满足ECMAScript标准的脚本语言
        * */

        /*//(11)
        * jq对象和js对象的转换？
        *(1)jQuery对象是一个数据对象，可以通过[index]的方法，来得到相应的js对象。
        *(2)jQuery本身提供，通过.get(index)方法，得到相应的js对象
        *
        *对于已经是一个js对象，只需要用$()把DOM对象包装起来，就可以获得一个jQuery对象了。$(js对象)
         * */

        //(12)jq的ready和js的onload 有什么区别？
        /*1.执行时间
        *   window.onload必须bai等到页面内包括图片的所有元素du加载完毕后才能执zhi行。
        *   $(document).ready()是DOM结构绘制完毕后就执行，不必等到加载完毕。
        *2.编写个数不同
        *   window.onload不能同时编写多个，如果有多个window.onload方法，只会执行一个
        *   $(document).ready()可以同时编写多个，并且都可以得到执行
        *3.简化写法
        *   window.onload没有简化写法
        *   $(document).ready(function(){})可以简写成$(function(){});
        * */
    }

    //(8)
//    public static void test01(int a) {
//        a++;
//    }


}
