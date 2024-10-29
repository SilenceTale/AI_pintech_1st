package org.koreait.member.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {
    //private String value; // 지양해야함

    @Override
    public void init(ServletConfig config) throws ServletException {
        //ServletConfig의 주요 메서드 : 설정 값 조회 메서드
        //              String getInitParameter (String name);

        String key1 = config.getInitParameter("key1"); // init-param의 key1의 값을 가져옴
        String key2 = config.getInitParameter("key2"); // init-param의 key2의 값을 가져옴
        System.out.printf("key1=%s%n", key1);
        System.out.printf("key2=%s%n", key2);
    }
    /*public void init() throws ServletException {
        System.out.println("서블릿 객체가 생성되면 최초 1번 실행");
        // 설정 값들을 조회할 때 최초 1번 조회하고 서블릿 객체 내에서 유지할 때 init() 메서드 사용, 최초 로그 유입 기록...

    }*/

    @Override
    public void destroy() {
        System.out.println("서블릿 객체가 소멸되기 직전에 1번만 실행");
        // 공통 자원 해제라던지 또는 로그 기록
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGET()!");

        //resp.setContentType("text/html"); //응답 헤더에 text/html
       //resp.setCharacterEncoding("UTF-8"); 응답 헤더에 encode UTF-8 삽입
        //차라리 이렇게 2개를 연결해서 사용하는 것이 편함.
        resp.setContentType("text/html;charset=UTF-8");

        //생성된 객체 내에서 조회하기에, new 사용 안함.
        PrintWriter out = resp.getWriter();

        //응답 body에 데이터 출력
        out.write("<h1>로그인</h1>");
    }
}
