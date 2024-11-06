package org.koreait.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SpringProxyCalculator {

    @Pointcut("execution(* org.koreait.exam04..*(..))")
    public void publicTarget() {

    }

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
