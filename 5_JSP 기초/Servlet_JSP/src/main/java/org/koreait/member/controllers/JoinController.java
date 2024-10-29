package org.koreait.member.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class JoinController extends HttpServlet {
    //퍼블릭으로 접근제어자를 쓰는게 일반적
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        //문자가 깨지지 않게.
        PrintWriter out = resp.getWriter();
        //입력받는 양식을 form 태그로 시작 action은 제출 경로
        out.write("<form method='POST' action='join'>");
        //이메일 인풋 타입은 텍스트로, 이름과 값은 name='email'로. <br>로 연장
        out.write("이메일: <input type='text' name='email'<br>");
        //비밀번호 확인 인풋 타입은 패스워드, 이름과 값은 name='email'<br>로
        out.write("비밀번호: <input type='password' name='password'><br>");
        //비밀번호 확인 인풋 타입 패스워드, 이름과 값은 name='confirmPassword' <br>로 연장
        out.write("비밀번호 확인: <input type='password' name='confirmPassword'<br>");
        //회원명 인풋 타입 텍스트로, 이름과 값은 name='username' <br>로 연장
        out.write("회원명: <input type='text' name='userName'><br>" );
        out.write("취미: <label><input type='checkbox' name='hobby' value='취미1'>취미1</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미2'>취미2</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미3'>취미3</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미4'>취미4</label>");
        out.write("<label><input type='checkbox' name='hobby' value='취미5'>취미5</label>");
        //양식을 제출할 버튼 만들기
        out.write("<button type='submit'>가입하기</button>");
        // </form>으로 태그 닫아주기
        out.write("</form>");
    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //서블릿 4버전까지는 필수! 기본 인코딩이 IS08859_1 - 2 바이트 유니코드,
        // 6버전은 기본 인코딩 UTF-8, 생략가능!
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String userName = req.getParameter("userName");
        String hobby = req.getParameter("hobby"); // hobby로 요청한 값이 여러개더라도 처음 1개만 출력하는게 parameter의 특징

        System.out.printf("email=%s, password=%s, confirmPassword=%s, userName=%s, hobby=%s%n", email, password, confirmPassword, userName, hobby);

        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));
    }
/*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key1 = req.getParameter("key1");
        String key2 = req.getParameter("key2");
        System.out.printf("key1=%s%n", key1);
        System.out.printf("key2=%s%n", key2);
    }*/
}
