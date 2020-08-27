package test0820;

import java.util.HashSet;
import java.util.Set;

public class Test02_HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaaa");
        set.add("cccc");
        set.add("bbbb");
        set.add("dddd");
        set.add("aaaa");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
