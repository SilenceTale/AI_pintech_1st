package exam01;

import java.util.Optional;
import java.util.function.Supplier;

public class Ex07 {
    public static void main(String[] args) {
        //Book안에 값이 없으니 value 안에 null을 집어넣는다.
        Optional<Book> opt = Optional.ofNullable(null);
        Book book = opt.orElseGet(() -> new Book());
        // 이것도 메서드 참조를 사용해서 짧게 작성이 가능하다.
        Book book2 = opt.orElseGet(Book::new);

    }
}
