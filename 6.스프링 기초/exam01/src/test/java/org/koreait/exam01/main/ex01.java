package org.koreait.exam01.main;

import org.koreait.exam01.Greeter;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        /**
         * AnnotationConfig : 설정 방식
         * ApplicationContext : 스프링 컨테이너
         */


        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("Mr.kwon");

        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println(g1 == g2); // 싱글톤 형태로 객체를 관리함.

        ctx.close();
    }
}
