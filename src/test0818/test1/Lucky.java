package test0818.test1;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode {
    @Override
    public ArrayList<Integer> faHongBao(Integer money, Integer count) {
        Random r = new Random();
        ArrayList<Integer> redPack = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int tempMoney = r.nextInt(money / count * 2) + 1;
            redPack.add(tempMoney);
            money -= tempMoney;
            count--;
        }
        redPack.add(money);
        return redPack;
    }
}
