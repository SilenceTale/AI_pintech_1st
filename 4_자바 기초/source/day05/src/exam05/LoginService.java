package exam05;

public class LoginService {

    private static LoginService instance; //변수, 객체의 자원임

    private LoginService() {} //1번, 기본 생성자 private 접근 제어 범위 변경

    public static LoginService getInstance() { // class 내부 객체 생성, 정적 변수 할당 //객체가 있어야 인스턴스 메소드 사용 가능
        if (instance == null) {
            instance = new LoginService();
        }
        return instance;
    }

    public void login(String userId, String password) { //class 생성 객체 조회가능한 정적 메서드

    }
}
