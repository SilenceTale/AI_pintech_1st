package exam01;

import java.sql.SQLOutput;

public class Q1 {
    public static void main(String[] args) {
        //1 변수 두 개 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력
        int a = 20;
        double b = 3.0;
        // int c = a + (int)b; // 오답
        int result = (int)(a * b); // 정답
        System.out.println(result);
    }
}
