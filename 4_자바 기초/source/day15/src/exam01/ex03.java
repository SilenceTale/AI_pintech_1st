package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex03 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();{
            for (int i = 0; i < 5; i++) {
                items.add("항목" +(i + 1));
            }

            System.out.println(items); // items.toString

            Iterator<String> iter = items.iterator();

            iter = items.iterator(); // 반복을 더 하려면 새로운 Iterator 객체를 생성해야함.
            while (iter.hasNext()) {
                String item = iter.next();
                System.out.println(item);
            }
        }
    }
}
