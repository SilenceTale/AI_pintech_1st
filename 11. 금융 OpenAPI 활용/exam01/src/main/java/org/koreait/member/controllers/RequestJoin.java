package org.koreait.member.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestJoin { // requestJoin 객체를 만들고 안에 데이터를 JSON 문자열로 변환할 것.
    private String email;
    private String password;
    private String confirmPassword;
    private String name;
}
