package test0812;

public class Student {
    String name;
    String sex;
    int age;

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Study() {
        System.out.println(name + "正在学习！！！");
    }

    public void Sleep() {
        System.out.println(name + "正在睡觉！！！");
    }
}
