package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "이이름";
        s1.major = "영어";
        s1.showInfo();
        // 변수 정의와 함수 정의를 합쳐서 값을 나타낸게 객체

        System.out.println("s1:" + System.identityHashCode(s1));

        s1 = null; // 값이 없는 상태 s1에서 null 얘를 집어넣어버리면 s2나 s3의 주소에 더 접근을 하지 못함
                    //즉, 사용하지 못한다는 소리

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.major = "수학";
        s2.showInfo();

        System.out.println("s2:" + System.identityHashCode(s2));

        Student s3 = s2;
        s3.name = "엄준식";
        s3.showInfo();
        s2.showInfo();

        System.out.println("s1, s2 주소 : " + (s1 == s2));
        System.out.println("s2, s3 주소 : " + (s2 == s3));
        //주소만 복사해서 이동하는 것을 약소 복사라고 함
    }

}
