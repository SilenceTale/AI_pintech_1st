package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        String[] items = {"항목1", "항목2","항목2", "항목2", "항목3", "항목4", "항목5"}; // 배열
        // 중복 제거 후 *단어* 형태로 변환 후 출력
        Arrays.stream(items).distinct().map(s -> String.format("*%s*", s)).forEach(System.out::println);


        List<String> items2 = List.of("항목1", "항목2", "항목2", "항목2", "항목3", "항목4", "항목5");
        // 컬렉션

        items2.stream().distinct().map(s -> String.format("*%s*", s)).forEach(System.out::println);

        // 동일하게 처리가 가능함.
        // 람다식으로 간단하게 식을 처리할 수 있다.
        /**
         * 나오는 값 =>
         * *항목1*
         * *항목2*
         * *항목3*
         * *항목4*
         * *항목5*
         */
    }
}
