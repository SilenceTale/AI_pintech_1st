package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year) {
        year = _year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int _month) {
        month = _month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int _day) {
        if (month == 2 && _day > 28) { // 통제 가능
            _day = 28;
        }

        day = _day;
    }

    public int getDay() { // get도 통제가 가능함. 통제가 가능한것은 함수 밖에 없음

        return day;
    }

    void showDate() {
        System.out.printf("year=%d년 month=%d월 day=%d일 입니다.%n", year, month, day);
    }
}
