package test01;

public class Test32 {
    public static void main(String[] args) {
        System.out.println(compare(20, 20));
        System.out.println(Sum());
        print(10);
    }

    public static boolean compare(int a, int b) {
        return a == b ? true : false;
    }

    public static int Sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("HelloWorld  " + (i + 1));
        }
    }
    static void print(){

    }
}
