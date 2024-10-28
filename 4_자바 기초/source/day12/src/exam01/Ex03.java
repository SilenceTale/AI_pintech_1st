package exam01;

public class Ex03 {
    public static void main(String[] args) {
        //MyLambda my = (s) -> System.out.println(s);
        //(s)부분의 소괄호를 빼도 문제 없이 작동할 수 있다.
        //MyLambda my2 = s -> System.out.println(s);

        // 인터페이스의 매개변수가 없는 경우 ()가 생략 불가.
        MyLambda my3 = () -> System.out.println("출력");
        my3.print();
        //my3은 인터페이스를 구현했기때문에 호출해서 바로 사용이 가능하다.

    }
}
