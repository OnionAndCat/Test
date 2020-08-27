package test01;

public class Test9x9Biao {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + "x" + i + "=" + i * j);
                if (i * j > 9)
                    System.out.print("  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
