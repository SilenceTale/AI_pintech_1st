package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        //IoC컨테이너에서 실행되는 afterPropertiesSet!
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        // 객체 생성 -> 의존 설정(의존성 주입) -> 초기화

        Message m1 = ctx.getBean(Message.class);
        m1.send("안녕하세요!");

        Message m2 = ctx.getBean(Message.class);
        System.out.println(m1 == m2); //true - 싱글턴 형태로 객체 관리

        ctx.close(); // 소멸 전 destroy() 호출!


        //이 모든게 Bean의 라이프 사이클이다.
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message2 m1 = ctx.getBean(Message2.class);
        Message2 m2 = ctx.getBean(Message2.class);

        System.out.println(m1 == m2); // false : 다른 객체로 생성

        ctx.close();
    }
}
