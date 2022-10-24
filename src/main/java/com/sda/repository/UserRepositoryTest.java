package com.sda.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class UserRepositoryTest implements CommandLineRunner {
    private final UserRepository userRepository;

    public UserRepositoryTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {
    userRepository.uploadDefaultUsers();
        log.info(userRepository.findById(2).toString());
        log.info(userRepository.findByLogin("jankol").toString());
    }
}
