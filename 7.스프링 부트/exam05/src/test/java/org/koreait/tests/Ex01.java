package org.koreait.tests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;

@SpringBootTest
public class Ex01 {

    @Autowired
    private MessageSource ms;

    @Test
    void test1() { //이거 중요하니 그냥 외워야함
        String email = ms.getMessage("이메일", null, Locale.KOREAN);
        String email2 = ms.getMessage("이메일", null, Locale.ENGLISH);
        System.out.println(email);
        System.out.println(email2);
    }
}
