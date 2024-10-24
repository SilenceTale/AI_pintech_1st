package exam02;

public class Human extends Animal {
    public void move() {
        //super.move(); // 이 코드는 Animal의 move();를 사용할 수 있게 해줌 즉, 맨 아래로

        System.out.println("두 발로 직립보행");
    }
}
/* 즉 결과값은
움직인다
두 발로 직립보행
이렇게 2가지의 값이 동시에 나온다. 필요하다면 super.move();로 가져오고 필요없다면 지우기. 이것이 메서드 재정의이다.
 */