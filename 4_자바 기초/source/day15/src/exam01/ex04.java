package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ex04 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add("항목" +(i + 1));
        }

        ListIterator<String> iter = items.listIterator();
        System.out.println("-------- 순 방 향 --------");
        while(iter.hasNext()) {
            String item = iter.next();
            System.out.println(item);
        }
        System.out.println("-------- 역 방 향 --------");
        while(iter.hasPrevious()) {
            String item = iter.previous();
            System.out.println(item);
        }
    }
}
