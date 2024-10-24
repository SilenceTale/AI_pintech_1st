package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Animal tiger = new Tiger(); //tiger == animal / Tiger tiger = new Tiger() -> Animal tiger = new Tiger 이것이 다형성!
        tiger.move();

        Animal bird = new Bird(); // 다형성 -> Bird로도 가능하지만 Animal로도 가능함
        bird.move();

        Animal human = new Human(); // 똑같이 Human, Animal로 바꿔쓰기 가능.
        human.move();
    }
}
