package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController { // /member/login, /member/join 사용할 것임.

    @GetMapping("/join")
    public String join() {

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs() {

        return "redirect:/member/login"; // 재진입:/멤버/로그인으로. -> 회원가입 성공 후 로그인 화면 창으로 재진입
    }
}
