package com.sda.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Getter
@Builder
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private int age;


}
