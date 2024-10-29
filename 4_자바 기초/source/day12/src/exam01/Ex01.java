package exam01;

public class Ex01 {
    public static void main(String[] args) {
        //Calculator은 문장이기에 {}안에 ; 붙히기.
        //add는 사용할 순 없지만, add2는 객체로 만들었기에 사용이 가능함.
        // 실행과정 중에 정의함.
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return 0;
            }
            /*
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = add2(cal, 10, 20);
        System.out.println(result);
        */

            int result = add2((a, b) -> a * b, 10, 20);

        };

    }
    //    interface가 있으므로 cal은 참조 변수가 됨.
    public static int add2(Calculator cal, int num1, int num2) {
        return cal.add(num1, num2);
    }

}