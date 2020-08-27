package test0813._Test01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Students s1 = new Students("刘星", 28, "男");
        Students s2 = new Students("夏雪", 31, "女");
        Students s3 = new Students("小雨", 25, "男");

        ArrayList<Students> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(index).getAge() < list.get(i).getAge())
                index = i;
        }
        list.get(index).show();
        list.get(index).setName("小魔仙");
        list.get(index).show();
    }
}
