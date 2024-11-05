package org.koreait.exam02;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        if (num < 1) {
            return 1L;
        }

        return num * factorial(num - 1L);
    }
}
