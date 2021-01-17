package org.groupmavinichi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextXmlAlterntaive {

    @Bean
    PersonIntro personIntro(String name){
        return new PersonIntro(name);
    }

}
