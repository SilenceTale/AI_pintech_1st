package org.koreait.exam04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    private AnnotationConfigApplicationContext ctx;
    @BeforeEach
    void init() {
        ctx = new AnnotationConfigApplicationContext(AppCtx.class);
    }

    @AfterEach
    void close() {
        ctx.close();
    }

    @Test
    void test1() { // 위에 BeforeEach를 정의했다면 test1에 ctx는 지워도 괜찮다!
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        //RecCalculator cal = ctx.getBean(RecCalculator.class);
        Calculator cal = ctx.getBean(Calculator.class);

        Long result = cal.factorial(10L);
        System.out.println(result);

        //ctx도 @AfterEach가 정의돼서 일을 함으로써 지워도 문제가 없다.
        //ctx.close();
    }

    @Test
    void test2() { //cache 가 돼는지 체크 용
       Calculator cal = ctx.getBean(Calculator.class); // 캐시에 값을 저장
       long r1 = cal.factorial(10L);
        System.out.printf("r1= %d%n", r1);

        long r2 = cal.factorial(10L); // 캐시에서 가져옴!
        System.out.printf("r2= %d%n", r2);

        long r3 = cal.factorial(10L); // 캐시에서 가져옴!
        System.out.printf("r3= %d%n", r3);
    }
}
