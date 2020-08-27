package test01;

/*
 * 数组：是一个容器，可以一次性存放多个值（同类型的数据），长度固定
 * 创建数组三种方式：
 *      1.创建数组初始化长度
 *          数据类型[]  数组名 = new 数据类型[长度]
 *      2.创建数组初始化数组中的元素
 *          数据类型[]  数组名= new 数据类型[数值]{元素1，元素2，元素3...}
 *      3.创建数组初始化数组中的元素  简写格式
 *          数据类型[]  数组名={元素1，元素2，元素3...}
 *
 * 直接打印数组输出的是数组的地址值   [I@7f31245a
 * [                表示这个一个数组
 * I                表示数组中的数据是int
 * @                没有意义   连接符
 * 7f31245a         哈希值     地址值
 *
 * 数组的核心：对索引进行操作
 * 索引：数组中的每一个元素都要一个编号，这个编号叫做索引（下标、角标）
 *      索引从0开始
 *
 * 取值：
 *      数组名[索引]
 *  修改值：
 *      数组名[索引] = 值
 *
 *  基本数据类型：
 *      byte short int long     0
 *      float  double           0.0
 *      char                    \u0000  空字符
 *      boolean                 false
 * 引用类型：String             null
 *
 *  数组的长度：
 *      每一个数组都有一个length属性，返回数组中长度   最大索引 = 数组长度 - 1
 *  常见错误
 *      java.lang.ArrayIndexOutOfBoundsException  索引越界异常
 * */
public class Test34 {
    public static void main(String[] args) {
        byte[] b1 = {};
        int[] b2 = new int[6];
        short[] s1 = {};
        char[] c1 = {};
        int[] i1 = {};
        long[] l1 = {};
        float[] f1 = {};
        double[] d1 = {};

        System.out.println("b1 " + b1);
        System.out.println("b2 " + b2[2]);
        System.out.println("s  " + s1);
        System.out.println("c  " + c1);
        System.out.println("i  " + i1);
        System.out.println("l  " + l1);
        System.out.println("f  " + f1);
        System.out.println("d  " + d1);
    }
}
