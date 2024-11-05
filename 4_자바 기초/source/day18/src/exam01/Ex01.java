package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        // 배열 형식
        String[] items1 = {"항목1", "항목1", "항목1", "항목2", "항목3", "항목4", "항목5"};
        List<String> cItems1 = Arrays.stream(items1).distinct().map(s -> String.format("**%s**", s)).toList();
        System.out.println(cItems1);

        // 컬렉션 형식
        List<String> items2 = List.of("항목1", "항목1", "항목1", "항목2", "항목3", "항목4", "항목5");
        List<String> cItems2 = items2.stream().distinct().map(s -> String.format("**%s**", s)).toList();
        System.out.println(cItems2);
    }
}
