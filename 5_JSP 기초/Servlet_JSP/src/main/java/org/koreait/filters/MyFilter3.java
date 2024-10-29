package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 최초 객체 생성시에 호출되며, 단 1 번만 호출 된다.
        String key1 = filterConfig.getInitParameter("key1");
        String key2 = filterConfig.getInitParameter("key2");
        System.out.printf("key1=%s%n", key1);
        System.out.printf("key2=%s%n", key2);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // ↑매 요청마다 호출 됨
        System.out.println("MyFilter3 - 응답 전"); // 요청 처리 전 공통 처리 부분
        //  요청 처리 전 공통 처리 코드를 여기 정의하는 것은 지양한다.

        chain.doFilter(request, response);

        System.out.println("MyFilter3 - 응답 후"); // 응답 후 공통 처리 부분
        //  응답 후 공통 처리 코드를 여기 정의하는 것은 지양한다.
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter3 - destroy()"); // 소멸되기 직전에 단 1 번만 호출됨
    }
}
