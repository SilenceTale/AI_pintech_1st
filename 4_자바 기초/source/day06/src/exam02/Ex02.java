package exam02;

public class Ex02 {
    public static void main(String[] args) {
        /*
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger(); // Animal animals[0] = new Tiger();
        animals[1] = new Bird(); // Animal animals[1] = new Bird();
        animals[2] = new Human(); // Animal animals[2] = new Human();
*/
        Animal[] animals = {new Tiger(), new Bird(), new Human()}; // 생성과 동시에 초기화를 해도 문제 없음! 짧기도함!

        for (Animal animal : animals) {
            animal.move(); //이렇게 한꺼번에 묶어서 정의할 수 있다.
        }
    }
}
