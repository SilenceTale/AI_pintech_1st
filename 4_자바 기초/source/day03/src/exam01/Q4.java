package exam01;

public class Q4 {
    public static void main(String[] args) {
        //구구단 홀수만 출력하기
        for (int i = 2; i <= 9; i++) {// 단
            if (i % 2 == 1) {
                System.out.printf("--- %d단 ---%n", i);
                for (int j = 1; j <= 9; j++) { // 곱하는 수
                    System.out.printf("%d X %d = %d%n", i, j, i * j);
                }
            }
        }
    }
}

    /*
            for (int i = 2; i <= 9; i++) {// 단
            if (i % 2 == 0) {
                continue;
                }
            System.out.printf("--- %d단 ---%n", i);
            for (int j = 1; j <= 9; j++) { // 곱하는 수
                System.out.printf("%d X %d = %d%n", i, j, i * j);
     */