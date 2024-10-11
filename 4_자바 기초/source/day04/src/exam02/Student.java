package exam02;

//exam02.Student : 전체 클래스명
public class Student {
    int id; // 학번
    String name; // 학생 이름
    String major; // 학생의 전공과목
    // 변수 정의

    /**
     * 따로 정의 하지 않으면 기본 생성되는 생성자
     * default 생성자라고도 불림
     * 이게 없으면 사용하질 못함
     * 생성자의 목적은 오직 단 한가지, 객체를 생성하기 위함
     * 다르게 말하면 객체를 생성하는 기능을 가지고 있음
     */
    // 기본 생성자, 따로 정의 X -> 컴파일러가 추가, 디폴트 생성자
    public Student() {
        // 객체 생성 이후 실행
        // 객체의 변수 추가 후
        id = 1000;
        name = "이이름";
        major = "영어";
    }
    // 객체가 없으면 목적을 잃음, 객체를 생성에 필요한 기본 생성자.
    // 따로 정의가 안돼며 -> 컴파일러가 추가해줌 다른말론 Default 생성자
    // 생성자에 반환값을 생성해선 안돼고, return 도 사용할 수 없음.
    // 정의가 안됐어도 기본 생성자(default)는 이미 자기 할 일을 하고있음
    // 객체 생성 이후 실행
    // 객체의 변수의 초기화

    public Student(int _id, String _name, String _major) {
        id = _id;
        name = _name;
        major = _major;
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
    } // 함수 정의
}
// 실제로 만든건 객체의 변수 정의
