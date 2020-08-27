package test0819;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//ctrl+alt+t
public class Test1 {
    /*public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        List<String> oneList = new ArrayList<>();

        for(String name:list){
            if(name.startsWith("张")){
                oneList.add(name);
            }
        }
        List<String> towList = new ArrayList<>();
        for(String name:oneList){
            if(name.length() == 3){
                towList.add(name);
            }
        }
        for (String name:towList){
            System.out.println(name);
        }
    }*/
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        Stream<String> stream = list.stream().filter(s -> {
//            System.out.println("过滤姓张的");
            return s.startsWith("张");
        }).filter(s -> {
//            System.out.println("过滤三个字的");
            return s.length() == 3;
        });
        stream.forEach(System.out::println);
//        List<String> list2 = stream.collect(Collectors.toList());
//        list2.stream().forEach(System.out::println);
    }
}
