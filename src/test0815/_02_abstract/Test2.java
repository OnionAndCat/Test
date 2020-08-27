package test0815._02_abstract;

/*
abstract抽象：
抽象方法的定义格式：
    public abstract 返回值类型 方法名();
抽象类的定义格式：
    public abstract class 类名{}

注意事项：
    1、抽象类不一定要有抽象方法，抽象方法所在的类必须是抽象类
    2、抽象类不能直接创建对象，必须要用一个子类来继承这个抽象父类
    3、子类必须覆盖重写抽象父类的所有抽象方法
        覆盖重写：去掉abstract  加上方法体
* */
public class Test2 {
    public static void main(String[] args) {
        Manager manager = new Manager("123" ,"liu",1122);
        Cook cook = new Cook("456","li",2132);
        Waiter waiter = new Waiter("789","zhang",458);

        manager.work();
        System.out.println("=======");
        cook.work();
        System.out.println("=======");
        waiter.work();

    }
}
