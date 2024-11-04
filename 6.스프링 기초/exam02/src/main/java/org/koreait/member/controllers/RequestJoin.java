package org.koreait.member.controllers;

import lombok.Data;

/**
 * 회원 가입 양식
 */
@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private boolean agree;
}
