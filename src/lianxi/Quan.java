package lianxi;

import java.util.Scanner;

public class Quan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1 ,m = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        while (m != n - 1){
            for (int i = 0; i < n; i++) {
                if(arr[i] != 0){
                    if (number % 3 == 0) {
                        arr[i] = 0;
                        m++;
                    }
                    number++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] != 0)
                System.out.println(i+1);
        }
    }
}
