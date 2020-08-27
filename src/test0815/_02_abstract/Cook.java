package test0815._02_abstract;

public class Cook extends Staff{

    public Cook(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
