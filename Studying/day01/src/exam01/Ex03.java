package exam01;

public class Ex03 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            System.out.println(str.toUpperCase()); //NullPointerException이 발생

            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; // ArithmethicException 발생
            System.out.println(result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
            /*
        } catch (NullPointerException | ArithmeticException e) { // 코드가 짧은 경우, catch() 안에 nullpointer, arithmetic 사용가능
            System.out.println(e.getMessage());
        }
        */

        /*
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("1번");// try로 던져서 int num...을 버리고 catch로 가버림.
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("2번");
            // catch를 여러개 사용해서 각자의 객체를 사용할 수 있다.
        }*/

        System.out.println("실행 완료!");

    }
}
