package test0814;

/*
*java.lang.String(常量)
*String 类代表字符串。Java程序中的所有字符串字面值(如"abc")都作为看此类的实例实现。
*   所有用引号都是String对象
*   特点：
*   1、字符串是常量，它们的值在创建之后不能更改
*   2、因为String对象是不可改变的，所以可以共享
*
*
* 构造方法：5+1
*   String()  创建一个空的字符串对象
*   String(String original)  根据字符串来创建一个字符串对象
*   String(char[] value)通过字符数组来创建一个字符串对象
*   String(byte[] bytes)通过字节数组来构造新的字符串对象
*   String(byte[] bytes,int offers,int length)通过字节数组一部分来构造新的字符串对象
*直接用双引号引起来的也是一个字符串对象
*
* 判断功能的方法
*       public boolean equals (Object anObject):将此字符串与指定对象进行比较。区分大小写
*       public boolean equalsIgnoreCase (String anotherString):将此字符串与指定对象进行比较。忽略大小写
*
*变量.成员方法(常量/变量) 不推荐
* java.lang.NullPointerException  空指针异常
*
* 建议写法  常量.成员方法(变量)
*
* 获取功能的方法：
*   public int length () ：返回此字符串的长度。
*   public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
*   public char charAt (int index) ：返回指定索引处的 char值。
*   public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
*   public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
*   public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到 endIndex截取字符串。
*   含beginIndex，不含endIndex。
* */
public class Test1 {
    public static void main(String[] args) {
        String str = null;
        System.out.println();
    }
}
