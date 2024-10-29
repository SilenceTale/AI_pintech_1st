package exam01;

import java.util.function.ToIntFunction;

public class Ex04 {
    public static void main(String[] args) {
        ToIntFunction<String> func1 = s -> s.length();
        //이걸 더 짧게 코딩을 해보자.

        ToIntFunction<String> func2 = String::length; // 메서드 참조
    }
}
