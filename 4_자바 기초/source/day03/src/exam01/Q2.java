package exam01;

public class Q2 {
    public static void main(String[] args) {
        //2. 학생 40명이 리조트에 수학여행가서 리조트로 갔다. 리조트는 방이 10개가 있고
        //번호는 0~9번까지 있다. 40명의 학생이 각각 번호표를 받아 한 방이 4명씩 배정된다면
        //다음과 같이 출력하시오( 예 : 학생1, 방번호 1번) - 균등 배분 ( 나머지 연산자 - %)
        for (int i = 1; i <= 40; i++) {
            int roomNo = i % 10; // 0~9가 반복
            System.out.printf("학생%d, 방번호 %d번%n", i, roomNo);
        }
    }
}
