package test0818.test1;

import java.util.ArrayList;

public class Common implements OpenMode{
    @Override
    public ArrayList<Integer> faHongBao(Integer money, Integer count) {
        ArrayList<Integer> redPack = new ArrayList<>();
        int tempMoney = money / count;
        for (int i = 0; i < count - 1; i++) {
            redPack.add(tempMoney);
            money -= tempMoney;
        }
        redPack.add(money);
        return redPack;
    }
}
