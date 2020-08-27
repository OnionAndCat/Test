package test0815._02_abstract;

public abstract class Staff {
    private String id;
    private String name;
    private double money;

    public Staff(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public abstract void work();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
