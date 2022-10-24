package com.sda.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryTest implements CommandLineRunner {
    private final UserRepository userRepository;

    public UserRepositoryTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {
    userRepository.uploadDefaultUsers();
        System.out.println(userRepository.findById(1));
    }
}
