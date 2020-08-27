package test0812;

public class Test03 {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        dog1.setName("哈士奇");
        dog1.setAge(5);
        dog1.setColor("黑白色");
        dog1.behavior();

        Animal dog2 = new Animal("藏獒",6,"金黄色");
        dog2.behavior();

        Animal dog3 = new Animal("秋田犬",7,"黄白色");
        dog3.behavior();

        if(dog1.getAge()>dog2.getAge()){

        }
    }
    public void MaxAge(Animal dog1,Animal dog2,Animal dog3){

    }
}
