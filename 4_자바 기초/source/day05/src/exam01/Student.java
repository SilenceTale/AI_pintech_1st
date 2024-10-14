package exam01;

public class Student {
        int id; //학번
        String name; // 학생명
        String major; // 전공

        public Student() {} // 이 코드는 반환값을 받질 않아도 기본적으로 설정되어있다.


        void showInfo() {
            System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
        }
}
