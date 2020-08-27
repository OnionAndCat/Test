package test0813;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String s = "slasno";
        String s2 = s.substring(s.length()-2);
        System.out.println(s2);
        if ( s2.equals("no"))
            System.out.println("1");
        else
            System.out.println("2");
    }
}
