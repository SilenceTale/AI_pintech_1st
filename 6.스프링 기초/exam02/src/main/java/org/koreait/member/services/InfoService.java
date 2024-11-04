package org.koreait.member.services;

import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InfoService {

    private MemberRepository repository;

    @Autowired //IoC 컨테이너에서 찾아서 주입해달라는 뜻인 Autowired
    public void setRepository(MemberRepository repository) {
        this.repository = repository;
    }

    public void print() {
        List<Member> members = repository.getList();
        members.forEach(System.out::println);
    }
}
