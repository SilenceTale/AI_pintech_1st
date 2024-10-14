package exam05;

public class LoginService {

    private static LoginService instance; //변수, 객체의 자원임

    private LoginService() {}

    public static LoginService getInstance() { //객체가 있어야 인스턴스 메소드 사용 가능
        if (instance == null) {
            instance = new LoginService();
        }
        return instance;
    }

    public void login(String userId, String password) {

    }
}
