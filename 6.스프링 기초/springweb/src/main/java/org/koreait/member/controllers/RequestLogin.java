package org.koreait.member.controllers;

import lombok.Data;

/**
 * 커맨드 객체임. 요청 데이터를 분석해보고 값을 대입 시켜준다.
 *
 */
@Data
public class RequestLogin { //이 클래스는 커맨드 객체이다.
    private String email;
    private String password;
    private boolean saveEmail;

}
