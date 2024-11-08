package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {
            int ch = fis.read(); // A라는 값의 1 바이트 읽기
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch); // B라는 값의 1 바이트 읽기

            ch = fis.read();
            System.out.println((char)ch); // C 라는 값의 1 바이트 읽기

            ch = fis.read();
            System.out.println((char)ch); // D라는 값의 1바이트 읽기

            ch = fis.read(); // 다 읽은 상태에서 다시 읽기 -> 값은 -1.
            System.out.println(ch);

        } catch (IOException e) {
            e.printStackTrace(); // 에러 메세지 출력
        }
    }
}
