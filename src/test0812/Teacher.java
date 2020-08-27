package test0812;
/*
*   this关键字:
*       当局部变量和成员变量重名时，根据就近原则选择局部变量
*       格式：
*           this.成员变量
* */
public class Teacher {
    private String name;
    private int age;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void lesson() {
        System.out.println(name + "老师正在讲课，讲的是" + subject);
    }

    public void work() {
        System.out.println(name + "班级加作业");
    }
}
