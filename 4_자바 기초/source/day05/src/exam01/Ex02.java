package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000; //지양
        s1.name = "김이름";
        s1.major = "수학";
        s1.showInfo();

        Student s2 = new Student();
        s2.id = 1001; // 지양
        s2.name = "박이름";
        s2.major = "영어";
        s2.showInfo();
        s1.showInfo();

        s2.staticMethod(); // 지양. (인스턴스 메서드인지 정적 메서드인지 햇갈리니 지양할 것)
    }
}
