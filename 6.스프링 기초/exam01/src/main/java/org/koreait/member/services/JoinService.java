package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;

/**
 * 회원 가입 기능
 */
public class JoinService {
        //구성
    private Validator<RequestJoin> joinValidator;

    /**
     * 의존 - 서로를 필요로 하는 고나계
     * 의존 관계
     * - JoinService 객체 생성을 위해서는 joinValidator가 필수! -> 이게 의존 관계.
     * - JoinService 와 JoinValidator는 서로 의존하고 연관돼있다.
     * @param joinValidator
     */
    public JoinService(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    }

    /**
     * 연관 관계.
     * JoinService 객체를 생성할때 필수는 아니기떄문
     * @param joinValidator
     */

//    public void setValidator(Validator<RequestJoin> joinValidator) {
//        this.joinValidator = joinValidator;
//    }

    /**
     * 가입 처리
     *
     * RequestJoin - DTO(Data Transfer Object) : 사용자가 입력한 데이터 값을 전달
     */
    public void process(RequestJoin form) {
        //JoinValidator validaotr = new JoinValidator(); 얘는 한정적이라서 어울리지가 않음.

    }
}
