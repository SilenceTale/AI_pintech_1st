package exam03;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A(); // 객체를 생성해야 a.method를 호출이 가능함.
        a.num1 = 10; // 클래스 외부
        a.num2 = 20; // 클래스 외부

        a.method();
    }
}
