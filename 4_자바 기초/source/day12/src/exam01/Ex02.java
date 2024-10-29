package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        //->로 내가 정보를 직접 알려줘야함.
//        Calculator cal2 = (int num1, int num2) -> {
//            return num1 + num2;
//        };
        //한 줄로 줄일 수 있을땐 -> int와 중괄호{}, return 값인 얘도 날려버려도 괜찮다.
        //값을 인터페이스에 지정을 했으니 int num1, int num2를 a, b로 넣어도 똑같은 값이 나온다.
        Calculator cal2 = (a,b) -> a + b;

    }
}
