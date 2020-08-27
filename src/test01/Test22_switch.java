package test01;

public class Test22_switch {
    public static void main(String[] args) {
        int weekday = 6;
        switch (weekday) {
            case 1:
            case 2:
                System.out.println("吃肠粉");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("吃面");
                break;
            case 6:
            case 7:
                System.out.println("喝粥");
                break;
            default:
                System.out.println("做梦");
                break;
        }
    }
}
