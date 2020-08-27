package test01;


public class Test33 {
    public static void main(String[] args) {
        byte b1 = 10, b2 = 20;
        short s1 = 20, s2 = 30;
        char c1 = 30, c2 = 40;
        int i1 = 40, i2 = 50;
        long l1 = 50, l2 = 60;
        float f1 = 60.01f, f2 = 60.02f;
        double d1 = 70.01, d2 = 70.02;

        System.out.println("byte:" + getSum(b1, b2));
        System.out.println("short:" + getSum(s1, s2));
        System.out.println("char:" + getSum(c1, c2));
        System.out.println("int:" + getSum(i1, i2));
        System.out.println("long:" + getSum(l1, l2));
        System.out.println("float:" + getSum(f1, f2));
        System.out.println("double:" + getSum(d1, d2));
    }

    public static int getSum(byte a, byte b) {
        return a + b;
    }

    public static int getSum(short a, short b) {
        return a + b;
    }

    public static int getSum(char a, char b) {
        return a + b;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static long getSum(long a, long b) {
        return a + b;
    }

    public static float getSum(float a, float b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }
}
