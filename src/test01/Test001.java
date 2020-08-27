package test01;

import java.nio.channels.ClosedSelectorException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//public static void open(){}
// public static void open(int a){}
// static void open(int a,int b){}
// public static void open(double a,int b){}
// public static void open(int a,double b){}
// public void open(int i,double d){}
// public static void OPEN(){}
// public static void open(int i,int j){}
public class Test001 {
    //    public static void main(String[] args) {
////        int [] arr = {};
//        byte a = 10;
//        byte b = 10;
//        short c = 10;
//        short d = 20;
//        int e = 10;
//        int f = 10;
//        long g = 10;
//        long h = 20;
//
//        System.out.println(compare(a, b));
//        System.out.println(compare(c, d));
//        System.out.println(compare(e, f));
//        System.out.println(compare(g, h));
//    }
//    public static boolean compare(byte a, byte b) {
//        System.out.println("byte");
//        return a == b;
//    }
//    public static boolean compare(short a, short b) {
//        System.out.println("short");
//        return a == b;
//    }
//    public static boolean compare(int a, int b) {
//        System.out.println("int");
//        return a == b;
//    }
//    public static boolean compare(long a, long b) {
//        System.out.println("long");
//        return a == b;
//    }
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3};
//        arr = null;
//        System.out.println(arr);
//    }
//
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        input(in);
//
//        input(new Scanner(System.in));
//    }public static void input(Scanner in){
//        System.out.println(in);
//    }
//    public static void main(String[] args) {
//        Scanner in = getScanner();
//    }
//
//    public static Scanner getScanner() {
//        //普通方式
//        // Scanner in=new Scanner(System.in);
//        // return in;
//        // 匿名对象作为方法返回值
//        return new Scanner(System.in);
//    }
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            Random ron = new Random();
//            int r = ron.nextInt(2);
//            System.out.print(r + "");
//        }
//    }
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        System.out.println("1：" + list);
//        String s1 = "曹操";
//        String s2 = "孙权";
//        String s3 = "刘备";
//
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//
//        System.out.println("2:"+list);
//        System.out.println("2:"+list.get(0));
//
//    }

    //    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<Student>();
//
//        Student s1 = new Student("刘德华", 38);
//        Student s2 = new Student("刘若英", 45);
//        Student s3 = new Student("刘晓庆", 29);
//        Student s4 = new Student("刘欢", 42);
//
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        for (int i = 0; i < list.size(); i++) {
//            Student s = list.get(i);
//            System.out.println("姓名： " + s.getName() + ";年龄： " + s.getAge());
//        }
//    }
    public static void main(String[] args) {
        String s1 = "abcd";
        System.out.println(s1.length());

    }

}

//class Student {
//    String name;
//    int age;
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
