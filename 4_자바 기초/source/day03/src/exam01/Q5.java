package exam01;

public class Q5 {
    public static void main(String[] args) {
        // 5. 단을 곱하는 수보다 크거나 같은경우만 출력
        for (int i = 2; i <= 9; i++) {
            System.out.printf("--- %d단 ---%n", i);
            for (int j = 1; j <= 9; j++) {
                if (j >= i) {
                    System.out.printf("%d X %d = %d%n", i, j, i * j);
                }
            }
        }
    }
}

/*
* public static void main(String[] args) {

    // 5. 단을 곱하는 수보다 크거나 같은경우만 출력
    for (int i = 2; i <= 9; i++) {
        System.out.printf("--- %d단 ---%n", i);
        for (int j = 1; j <= 9; j++) {
            if (j < i) {
                continue;
            }
            System.out.printf("%d X %d = %d%n", i, j, i * j);
        }
    }
}*/