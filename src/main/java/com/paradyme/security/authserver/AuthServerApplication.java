package com.paradyme.security.authserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class AuthServerApplication {

//    @Bean
//    CommandLineRunner initial(AccountRepository accountRepository) {
//        return args -> {
//            Stream.of("dayong,spring", "andrew,boot").map(tpl -> tpl.split(","))
//                    .forEach(tpl -> accountRepository
//                            .save(new Account(tpl[0], tpl[1], true, true, true, true, "ROLE_AMIN,ROLE_USER,COLLECTION_EVENT_READ")));
//        };
//    }


    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }
}


