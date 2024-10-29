package exam01;

import java.util.stream.Stream;

public class Ex06 {
    public static void main(String[] args) {
        String[] strs = Stream.of("Apple", "Orange", "Melon")
                .toArray(x -> new String[x]);
        // 배열을 사용할때 값을 하나하나 넣어주기 위한 코드.
        // 람다는 메서드 참조로 바꿀 수가 있다.

        String[] strs2 = Stream.of("Apple", "Orange", "Melon")
                .toArray(String[]::new);
        //람다는 한정적이면서도, 한 번만 쓰고 버리는 용도이니 짧은게 좋다.
    }
}
