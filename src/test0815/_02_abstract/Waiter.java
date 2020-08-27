package test0815._02_abstract;

public class Waiter extends Staff{
    public Waiter(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void work() {
        System.out.println("点菜");
    }
}
