package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.repositories.MemberRepository;

/**
 * 회원 가입 기능
 */
public class JoinService {
        //구성
    private final Validator<RequestJoin> validator;
    private final MemberRepository repository;

    /**
     * 의존 - 서로를 필요로 하는 고나계
     * 의존 관계
     * - JoinService 객체 생성을 위해서는 joinValidator가 필수! -> 이게 의존 관계.
     * - JoinService 와 JoinValidator는 서로 의존하고 연관돼있다.
     * @param validator
     */
    public JoinService(Validator<RequestJoin> validator, MemberRepository repository) {
        this.validator = validator;
        this.repository = repository;
    }

    /**
     * 연관 관계.
     * JoinService 객체를 생성할때 필수는 아니다, 연관성이 있다.
     * @param Validator
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

        // form, joinservice에 서로 영향을 주고 받는 관계 - 변화에 영향을 받는다
        // 통제가 필요함 - 메서드 안에 감출 필요 O - 캡슐화를 하자. / 변화에 닫힌 구조
        //JoinValidator validaotr = new JoinValidator(); 얘는 한정적이라서 어울리지가 않음.
        validator.check(form);

    }
}
