package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
    public static void main(String[] args) {

        //throw new FileNotFoundException()... //throw를 상속받은 던질 수 있는 파일
        try{
        FileInputStream fis = new FileInputStream("C:/b.txt");

            System.out.println("정상 처리");

        } catch(FileNotFoundException e) {
            String message = e.getMessage();
            System.out.println(message);

            e.printStackTrace();

            //System.out.println("예외 발생");
        }

        System.out.println("매우 중요한 실행 코드.....");
    }
}
