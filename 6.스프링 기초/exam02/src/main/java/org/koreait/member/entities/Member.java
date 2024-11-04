package org.koreait.member.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private long seq; // sequance 회원 번호
    private String email; // 회원 email
    private String password; // 회원 비밀번호
    private String userName; // 회원명
    private LocalDateTime regDt; // 회원 정보 가입 일시
    private LocalDateTime modDt; // 회원 정보 수정 일시

    private String regDtStr;
}
