package exam02;

public class Ex04 {
    public static void main(String[] args) {
        //int[] nums = new int[] {10, 20, 30, 40}; //인덱스 변수 선언과 동시에 초기화한 배열
        int[] nums = {10, 20, 30, 40, 50, 60};

        System.out.printf("length=%d%n", nums.length); // 배열 공간과 갯수
        /*
        for (int i = 0; i <= nums.length -1; i++) {
            System.out.println(nums[i]);
        }

         */
        for (int i = 0; i < nums.length; i++) { // 관래
            System.out.println(nums[i]);
        }
        for (int num : nums) { // 향상된 for 문
            System.out.println(num);
        }
    }
}

/* 비공식적이라면? 축약해서 사용도가능!
int[] nums = {10, 20, 30, 40};

for (int i = 0; i <= 3; i++) {
    System.out.println(nums[i]);
 */

//축약도 많이 씀!

/* int[] nums;
nums = {10, 20, 30, 40};
이 형식은 배열로 인식을 못함, 풀로 다 써야 인식.
ex)
int[] nums;
nums = new int = {10,20,30,40};
 */