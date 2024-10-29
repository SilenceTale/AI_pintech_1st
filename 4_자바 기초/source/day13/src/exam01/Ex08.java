package exam01;

import java.util.function.Supplier;

public class Ex08 {
    public static void main(String[] args) {
        Book book = new Book();

        Supplier<String> title = () -> book.getTitle();

        // 참조 변수로 더 짧고, 많은 범위에 사용할 수 있다.
        Supplier<String> title2 = book::getTitle;
    }
}
