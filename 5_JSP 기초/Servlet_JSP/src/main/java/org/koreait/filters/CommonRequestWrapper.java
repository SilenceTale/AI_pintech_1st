package org.koreait.filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(ServletRequest request) {
        super((HttpServletRequest) request);

        // 요청시 공통 코드

        System.out.println("요청 공통 코드 처리...");
    }

//    @Override
//    public String getParameter(String name) {
//
//
//        String value = super.getParameter(name);
//
//       // if 밸류가 값이 null이 아니고, isBlank의 값이 공백이 아닐경우 value 값을 확인하겠다.
//        // -> String.format의 **%s**안에 value를 넣겠다.
//        if(value != null && !value.isBlank()) {
//            value = String.format("**%s**", value);
//        }
//
//        return value;
//    }
}
