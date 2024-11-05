package exam01;

import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        List<String> items2 = List.of("내껀데?1", "내껀데?1", "내껀데?1", "내껀데?2", "내껀데?3", "내껀데?4", "내껀데?5");

        Stream<String> stm = items2.stream().distinct().map(s -> String.format("(☞ﾟヮﾟ)☞%s☜(ﾟヮﾟ☜)", s));
        // 중간 연산

        List<String> cItems2 = stm.toList(); // 최종 연산 - 실제 연산이 수행되는 메서드
        // 최종 연산이 호출되면, 중간 연산에 명시된 각 메서드 작업이 시작, 수행, 최종 연산 마무리 후 결과 값이 나온다.
        System.out.println(cItems2);
    }
}
