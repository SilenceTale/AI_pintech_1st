package exam01;

@FunctionalInterface //함수형 프로그래밍 단일 기능 수행으로 추상 메서드가 단 1개만 정의되도록 통제함.
public interface Calculator {
    int add(int num1, int num2);
    //()안은 매개변수임.
    //추상 메서드를 정의할 수 있는게 인터페이스.
//    int minus(int num1, int num2);
    //인터페이스 내부에 여러개의 함수를 작성할 수 없음. 식을 작성해도 현재 인터페이스 기준 -> add가 올지 minus가 들어올지 모르기 때문임.
    //즉 메서드를 2개 이상 작성할 수 없다.

}
