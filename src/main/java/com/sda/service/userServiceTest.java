package com.sda.service;

import com.sda.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class userServiceTest implements CommandLineRunner {

    private final UserService userService;
    private UserRepository userRepository;

    public userServiceTest(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        userService.initDataLoad();
        log.info(userService.findById(1).toString());
        log.info(userService.findByLogin("luknow").toString());
        log.info(userService.findByLogin("alalak3").toString());
    }
}
