package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // 구구단을 출력 해볼 것
        for(int i = 2;  i <= 9; i++) { // 2단 ~ 9단
            //System.out.println(" --- " + i + "단 ---");
            System.out.printf("--- %d단 ---%n", i);
            for(int j = 1; j <= 9; j++){ //a * 1~9
                //System.out.println(i + " X " + j + " = " + i * j );
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
        //System.out.print("가"); // 줄 개행( 줄 바꿈 X )
        System.out.println("가"); // 줄 개행( 줄 바꿈 O )
        System.out.print("나");
    }
}
