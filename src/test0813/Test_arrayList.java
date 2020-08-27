package test0813;

//数据类型[]  数组名 = new 数据类型[]
/*
* java.util.ArrayList<E>  集合
*   特点：
*       1、大小可变数组的实现
*       2、<E>（泛型）：指的是当前集合中存放的统一都是什么类型的。泛型只能是引用类型
*       3、直接打印集合，不是地址值。打印的集合中的元素，没有元素则[]
*       4、创建集合时，右侧的<>里面的泛型在jdk1.7后可以省略不写，但是<>不能省略
*   构造方法：
*       ArrayList<E>() 构造一个初始容量为10的空列表
*   成员方法：
*       boolean add(E e) 将指定的元素添加到此列表的尾部
*       E remove (int index)移除此列表中指定位置上的元素。 返回被删除的元素
*       E get(int index)  返回此列表中指定位置上的元素
*       int size()  返回此列表中的元素数
*
* */

import java.util.ArrayList;

public class Test_arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}
