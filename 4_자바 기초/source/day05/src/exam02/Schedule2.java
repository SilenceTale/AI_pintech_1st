package exam02;

public class Schedule2 {
    private int year; //년도
    private int month; //월
    private int day; //일

    // public Schedule2() {} //default instance

//    public Schedule2() {
//       this(2024, 10, 14);
//       /* year = 2024;
//        month = 10;
//        day = 14;
//        //이 중간은 객체가 생성된 이후에 실행되는 코드 주로 정리하는 것(변수만들기)이니, 초기화 작업을 주로 함
//        */
//    }
//
//
//    public Schedule2(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showInfo() {
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);

        //this.printThis();
        printThis();
    }

    public void printThis() {
        System.out.println(this);
    }

    public Schedule2 getThis(){
        return this;
    }
}
