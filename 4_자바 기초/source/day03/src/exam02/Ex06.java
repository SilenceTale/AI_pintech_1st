package exam02;

public class Ex06 {
    static int num1;
    static double num2;
    static boolean result;
    static String str; // <-- String도 참조형 참조하면 null이 됌

    public static void main(String[] args) {
        System.out.println(num1); //0
        System.out.println(num2); //0.0
        System.out.println(result); // false
        System.out.println(str); // null
    }
}
