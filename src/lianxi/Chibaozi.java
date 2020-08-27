package lianxi;

import java.util.Scanner;

public class Chibaozi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println(String.format("%.2f",(double)x1/x + (double)y1/y + (double)z1/z));
    }
}