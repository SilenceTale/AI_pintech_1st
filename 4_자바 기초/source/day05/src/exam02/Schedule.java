package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year) {
        year = _year;
    }
    public void setMonth(int _month) {
        month = _month;
    }
    public void setDay(int _day) {
        day = _day;
    }

    void showDate() {
        System.out.printf("year=%d년 month=%d월 day=%d일 입니다.%n", year, month, day);
    }
}
