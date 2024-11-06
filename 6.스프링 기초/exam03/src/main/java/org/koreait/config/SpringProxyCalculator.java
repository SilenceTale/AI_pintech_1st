package org.koreait.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SpringProxyCalculator {

    @Pointcut("execution(* org.koreait.exam04..*(..))")
    public void publicTarget() {

    }
    /*
    @Before("publicTarget()")
    public void beforeProcess(JoinPoint joinPoint) {
        System.out.println("@Before() 효과 발동!");
    }

    @After("publicTarget()")
    public void afterProcess(JoinPoint joinPoint) throws Throwable {
        System.out.println("@After() 효과 발동!");
    }
    */
    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        long stime = System.nanoTime();// 공통 기능
        try {

            Object result = joinPoint.proceed(); // 핵심 기능을 대신 수행

            System.out.println("HO출!");

            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime); // 공통 기능
        }
    }
}
