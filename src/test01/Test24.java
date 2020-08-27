package test01;

public class Test24 {
    public static void main(String[] args) {
        //1
//        int sum = 0;
//        for (int i = 1; i < 101; i++) {
//            sum += i;
//        }
//        System.out.println("for  1-100之间的和：" + sum);
//        int i = 0;
//        while (i <= 100) {
//            sum += i;
//            i++;
//        }
//        System.out.println("while(true){}  1-100之间的和：" + sum);

//        int i = 0;
//        do {
//            sum += i;
//            i++;
//        }while (i <= 100);
//            System.out.println("do{}while(true);  1-100之间的和：" + sum);

        //2
//        int jSum = 0;
//        int oSum = 0;
//        for (int i = 1; i < 101; i++) {
//            if (i % 2 == 0)
//                oSum += i;
//            else
//                jSum += i;
//        }
//        System.out.println("for:  偶数：" + oSum + "，奇数：" + jSum);

//        int i = 1;
//        while (i <= 100) {
//            if (i % 2 == 0)
//                oSum += i;
//            else
//                jSum += i;
//            i++;
//        }
//        System.out.println("while:  偶数：" + oSum + "，奇数：" + jSum);

//        do{
//            if (i % 2 == 0)
//                oSum += i;
//            else
//                jSum += i;
//            i++;
//        }while (i <= 100);
//        System.out.println("do{}while():  偶数：" + oSum + "，奇数：" + jSum);


        //3
//        int jieChengSum = 1, num = 8;
//        for (int i = 1; i <= num; i++) {
//            jieChengSum *= i;
//            if(i < num)
//                System.out.print(i+"x");
//            else
//                System.out.print(i);
//        }
//        System.out.println("="+jieChengSum + "  for方法");
//        int i = 1;
//        while (i <= num) {
//            jieChengSum *= i;
//            if (i < num)
//                System.out.print(i + "x");
//            else
//                System.out.print(i);
//            i++;
//        }
//        System.out.println("=" + jieChengSum + "  while方法");

//        do{
//            jieChengSum *= i;
//            if (i < num)
//                System.out.print(i + "x");
//            else
//                System.out.print(i);
//            i++;
//        }while (i <= num);
//        System.out.println("=" + jieChengSum + "  do{}while方法");

        //4
//        System.out.print("for  水仙花数为：");
//        for (int i = 100; i < 1000; i++) {
//            int bai = i / 100;
//            int shi = i / 10 % 10;
//            int ge = i % 10;
//            if(bai * bai * bai + shi * shi * shi + ge * ge * ge == i) {
//                System.out.print(i + "、");
//            }
//        }

//        System.out.print("while方法  水仙花数为：");
//        int i = 100;
//        while (i < 1000) {
//            int bai = i / 100;
//            int shi = i / 10 % 10;
//            int ge = i % 10;
//            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == i) {
//                System.out.print(i + "  ");
//            }
//            i++;
//        }

//        System.out.print("do{]while方法  水仙花数为：");
//        int i = 100;
//        do {
//            int hund = i / 100;
//            int tens = i / 10 % 10;
//            int num = i % 10;
//            if (hund * hund * hund + tens * tens * tens + num * num * num == i) {
//                System.out.print(i + "  ");
//            }
//            i++;
//        } while (i < 1000);


//        int i = 0;
//        for (; ; ) {
//            System.out.println(i++);
//        }


    }
}
