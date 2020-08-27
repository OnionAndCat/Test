package test0812;

public class Animal {
    public String name;
    private int age;
    public String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void behavior() {
        System.out.println(name + "，今年" + age + "岁了，是" + color +"的，正在向给他喂食的人摇尾巴。 ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
