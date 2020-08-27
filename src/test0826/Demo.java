package test0826;

public class Demo {
    public static void main(String[] args) {
        Shower s = new Shower();

        new Thread(() -> {
            try {
                s.show1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                s.show2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
