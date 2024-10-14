package exam01;

public class Ex05 {
    public static void main(String[] args) {
        try{String str = "abc";
        System.out.println(str.toUpperCase());

            System.out.println("정상 실행");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("비정상 실행");
        } finally { // 예외가 발생하든 안하든 무조건 실행합니다.
            System.out.println("무족건 실행");
        }

    }
}

//값
//비정상 실행
//무족건 실행
