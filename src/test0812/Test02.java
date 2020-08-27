package test0812;

/*
 * 编程思想：
 *   面向过程： 强调步骤
 *   面向对象： 强调结果  java是一门面向对象的编程语言
 *
 * 面向对象的三大特征：
 *   封装、继承、多态
 *
 * 类和对象的关系：
 *   类是对象的描述     对象是类的实体
 * 定义一个类的格式：
 *   public class 类名{
 *       属性--成员变量    和定义变量的格式一样  定义在类中方法外
 *       行为--成员方法    和定义方法的格式一样  去掉static
 *   }
 *
 * 创建对象的格式：
 *   类名  对象名 = new 类名();
 *   对象访问类中的成员变量和成员方法：
 *   对象名.成员变量
 *   对象名.成员方法()
 *
 * 成员变量和局部变量的区别：
 *   成员变量：
 *       1、定义在类方法中，这个类都可以使用
 *       2、存在堆内存的对象中
 *       3、有默认值  不赋值也可以使用
 *       4、随着对象的创建而创建，随着对象的销毁而释放
 *   局部变量：
 *       1、定义在方法中、局部代码块中，只在所属区域有效
 *       2、存在栈内存的方法中
 *       3、没有默认值  不赋值不可以使用
 *       4、随着方法的调用而存在，随着方法的结束而释放
 *
 *
 * */
public class Test02 {
    public static void main(String[] args) {
        Star s = new Star();
        s.name = "胡歌";
        s.sex = "男";
        s.production = "仙剑奇侠传";
        s.act();
        s.sing();

        Student student = new Student();
        student.name = "张三";
        student.age = 22;
        student.sex = "男";
        student.Sleep();
        student.Study();

        Teacher teacher = new Teacher();
        teacher.setName("李四");
        System.out.println(teacher.getName());
        teacher.setAge(33);
        System.out.println(teacher.getAge());
        teacher.setSubject("数学");
        System.out.println(teacher.getSubject());
        teacher.lesson();
        teacher.work();
    }
}
