package test0815._02_abstract;

public class Manager extends Staff{

    public Manager(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
