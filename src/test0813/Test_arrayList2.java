package test0813;

/*
 *集合中存储基本数据类型，泛型为基本数据类型的包装类（将一个基本数据类型包装成一个引用类型）
 *   //int -- Integer  char -- Character
 */

import java.util.ArrayList;
import java.util.Random;

public class Test_arrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = readue(new Random());
        print(list);
    }

    public static void print(ArrayList<Integer> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                System.out.println(list.get(i) + "}");
            else
                System.out.print(list.get(i) + "·");
        }
    }

    public static ArrayList<Integer> readue(Random random) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + 1);
        }
        return list;
    }
}
