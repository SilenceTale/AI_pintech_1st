package exam01;

public class Ex04 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            System.out.println(str.toUpperCase()); // 예외가 발생하는데 뭔지 모르겠다.

            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; // ArithmethicException 발생
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}