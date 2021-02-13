package com.focus.easymail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.focus.easymail.dao")
public class  EasymailApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymailApplication.class, args);
    }

}
