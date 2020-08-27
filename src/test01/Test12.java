package test01;

/*
 * 三元表达式：  必须要有结果  结果必须要被使用
 *   数据类型  变量名 = 条件表达式？表达式1：表达式2
 *   条件表达式为true运行表达式1；
 *   条件表达式为false运行表达式2；
 *
 * */
public class Test12 {

    public static void main(String[] args) {
//        int num = 1, num1 = 2, num2 = 3;
//        int max = num > num1 ? num : num1;
//        max = max > num2 ? max : num2;
//        System.out.println((num > num1 ? num : num1) > num2 ? (num > num1 ? num : num1) : num2);
//        System.out.println(max);
        int num = 25, num1 = 56, num2 = 16, num3 = 63;
        getSum(num, num1);
        getSum(num1, num2);
        getLiangMax(num, num3);
        getLiangMax(num1, num2);
        getLiangMax(num, num2);
        getSanMax(num, num1, num2);
        System.out.println(getMAx(num, num1) > getMAx(num2, num3) ? getMAx(num, num1) : getMAx(num2, num3));
    }

    public static void getSum(int a, int b) {
        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);
    }

    public static void getLiangMax(int a, int b) {
        int result = a > b ? a : b;
        System.out.println(a + "和" + b + "比" + result + "大");
    }

    public static void getSanMax(int a, int b, int c) {
        int result = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(a + "和" + b + "和" + c + "比" + result + "大");
    }

    public static int getMAx(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}
