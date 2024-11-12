package org.koreait.member.controllers;

import org.koreait.member.entities.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/member")
public class MemberController { // /member/login, /member/join 사용할 것임.

    @GetMapping("/join")
    public String join(Model model) {

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setName("엄준식01");

        model.addAttribute("requestJoin", form);

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs() {

        return "redirect:/member/login"; // 재진입:/멤버/로그인으로. -> 회원가입 성공 후 로그인 화면 창으로 재진입
    }

    @GetMapping("/list")
    public String list(Model model) {

        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> {
                    Member member = new Member();
                    member.setSeq(i);
                    member.setName("엄준식01" + i);
                    member.setPassword("12345678");
                    member.setRegDT(LocalDateTime.now());
                    member.setModDT(LocalDateTime.now());

                    return member;
                }).toList();

        model.addAttribute("members", members);

        return "member/list";
    }
}
