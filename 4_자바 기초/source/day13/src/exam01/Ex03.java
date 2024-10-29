package exam01;

import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        Function<String, String> func1 = s -> s; // 항등 함수, 매개 변수로 투입된 값을 반환값으로 그대로 반환하는 형태

        Function<String, String> func2 = Function.identity(); // 의미적인 걸로 볼땐 위의 코드와 값이 동일함. s -> s;


    }
}
