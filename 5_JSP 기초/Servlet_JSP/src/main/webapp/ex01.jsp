//<%@ ... %> Directive 태그

<%@ page contentType='text/html; charset=UTF-8' %>

//<%%>은 스크립트 태그이다. 이 안에 값을 넣으면 _jspService() 내부에 번역됌

<% // _jspService() 내부에 번역
int num1 = 100; // _jspService()의 지역 변수
int num2 = 200; // _jspService()의 지역 변수
out.write(num1+num2);
// out.write("<h1>" + message + "</h1>");
printMessage();
%>

<%! // 선언문 태그
String message = "안녕하세요."; // 인스턴스 변수이다.

void printMessage() {
    System.out.println(message);
}
%>