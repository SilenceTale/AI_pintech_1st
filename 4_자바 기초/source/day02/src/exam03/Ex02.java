package exam03;

public class Ex02 {
    public static void main(String[] args) {
        int num = 1, total = 0;

        do {
            total += num;

            num++;
        } while(num <= 100);
        System.out.println(total); // <- 출력을 원할때 System.out.println(자료형)을 잊지 말 것
    }
}
