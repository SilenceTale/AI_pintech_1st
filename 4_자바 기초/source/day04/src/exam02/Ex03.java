package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "김이름", "영어"); //이게 생성자 오버로드임
        Student s2 = new Student(1002, "박이름", "수학"); // s1과 s2는 변수임

        s1.showInfo();
        s2.showInfo();

        Class cls = Student.class;
    }
}
