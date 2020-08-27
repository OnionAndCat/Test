package test0818.test1;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        RedPackage redPackage = new RedPackage();
//        redPackage.setName("群主大大");

        redPackage.setOpenMode(new Lucky());

        OpenMode openMode = redPackage.getOpenMode();

        ArrayList<Integer> luckyRedPack = openMode.faHongBao(50, 8);
        System.out.println(/*redPackage.getName() + */"发了一个随机红包： " + luckyRedPack);

        redPackage.setOpenMode(new Common());
        ArrayList<Integer> commonRedPack = redPackage.getOpenMode().faHongBao(10, 5);
        System.out.println(/*redPackage.getName() + */"发了一个普通红包： " + commonRedPack);
    }
}
