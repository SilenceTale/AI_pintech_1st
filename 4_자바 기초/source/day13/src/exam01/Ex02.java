package exam01;

import java.util.function.IntPredicate;

public class Ex02 {
    public static void main(String[] args) {
        // 넘버를 판별할 수 있는 식을 추가할 것.
        IntPredicate cond1 = x -> x >= 10;
        IntPredicate cond2 = x -> x <= 100;
        IntPredicate cond3 = cond1.and(cond2); // x >= 10 && x <= 100 을 표현한 함수
        System.out.println(cond3.test(150)); // false
        System.out.println(cond3.test(50)); // true

        IntPredicate cond4 = cond3.negate(); // x < 10 || x > 100
        // 100을 초과하는 수를 넣고 싶을때 부정문을 사용.
        System.out.println(cond4.test(150)); //true
        // 10 미만인 수를 넣고 싶을때 부정문을 사용.
        System.out.println(cond4.test(5)); // true
    }
}
