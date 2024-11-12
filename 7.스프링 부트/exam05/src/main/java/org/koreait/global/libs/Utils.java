package org.koreait.global.libs;

import org.springframework.stereotype.Component;

@Component("ut") //이름을 짧게 짓고 싶으면 컴포넌트() 안에 이름짓기.
public class Utils { // utils가 bean의 이름이 됀다.
    public String hello(String name) {
        return String.format("%s님 반갑습니다.", name);
    }
}
