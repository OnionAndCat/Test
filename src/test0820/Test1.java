package test0820;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    四种遍历：
        for循环遍历
        迭代Iterator
        for增强
        λ：Lambda格式
* */
public class Test1 {
    public static void main(String[] args) {
        Collection<String>  collection = new ArrayList<>();
        collection.add("石破天");
        collection.add("扫地僧");
        collection.add("小李广");
        collection.add("da李广");

        Iterator<String> it = collection.iterator();
       while (it.hasNext()){
            String str = it.next();
//            String str2 = it.next();

            System.out.println(str);
        }
    }
}
