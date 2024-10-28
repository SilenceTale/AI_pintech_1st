package exam01;

import java.util.function.Function;

public class Ex01 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length(); // 문자열이 들어오면 문자열 길이를 정수로 반환하는 함수

        Function<Integer, Integer> func2 = x -> x * x; // 정수가 들어오면 제곱한 정수로 내보내는 함수

        // 문자열 -> 정수 길이 -> 제곱 = 함수의 합성
        Function<String, Integer> func3 = func1.andThen(func2); // func1 과 func2를 결합해서 func3을 만들어낸 함수

        int result = func3.apply("ABC"); // 3 -> 9
        System.out.println(result);
    }
}
