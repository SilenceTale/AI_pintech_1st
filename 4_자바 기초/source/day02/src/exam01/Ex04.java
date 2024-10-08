package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 10;
        //int num2 = num1++; // 대입(=) -> 증가연산(++)
        int num2 = ++num1; // 앞에 있는 증가연산때문에 대입한것. 정리하면 num2(10) = 1 + 0이 되는 셈
        System.out.println(num2);
        System.out.println(num1);
        double num3 = 10.5;
        num3++;
        System.out.println(num3);
    }
}
