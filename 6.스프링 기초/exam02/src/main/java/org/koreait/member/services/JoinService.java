package org.koreait.member.services;

import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.validators.JoinValidator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 회원 가입 기능
 */
public class JoinService {

    @Autowired
    public JoinValidator validator;

    @Autowired
    public MemberRepository repository;

//    public JoinService(JoinValidator validator, MemberRepository repository) {
//        this.validator = validator;
//        this.repository = repository;
//    } //AppCtx와 연동됨.


    /**
     * 가입 처리
     */
    public void process(RequestJoin form) { // 캡슐화?
        validator.validate(form); // RequestJoin 유효성 검사

        repository.register(form); // DB 영구 저장 처리
    }
}
