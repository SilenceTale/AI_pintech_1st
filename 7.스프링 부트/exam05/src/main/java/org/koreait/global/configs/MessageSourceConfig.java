package org.koreait.global.configs;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageSourceConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();

        ms.addBasenames("messages.commons"); //properties 파일만 사용가능.
        ms.setDefaultEncoding("UTF-8"); // 디폴트 인코딩을 "UTF-8"로 설정함.

        //메세지 코드를 발견하지 못하면 해당 코드를 메세지로 사용한다.
        ms.setUseCodeAsDefaultMessage(true);

        return ms;
    }
}
