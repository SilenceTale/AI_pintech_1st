package exam01;

public class Student {
        static int id; //학번
        String name; // 학생명
        String major; // 전공

        public Student() {} // 이 코드는 반환값을 받질 않아도 기본적으로 설정되어있다.


        void showInfo() {
            System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
        }

        static void staticMethod() {
                System.out.println("정적 메서드!");
                //this.name = "이이름"; //this 사용 불가능
                id = 1005; // 정적 변수 사용 가능

                //this.showInfo();
                //showInfo();
                staticMethod2(); //정적인 자원만 사용 가능한 예시
        }

        static void staticMethod2() {

        }
}
