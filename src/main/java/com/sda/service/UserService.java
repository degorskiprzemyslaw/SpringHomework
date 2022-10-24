package com.sda.service;

import com.sda.model.User;
import com.sda.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public User findById(long id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("No entity found with id:" + id));
    }

    public User findByLogin(String login){
        return userRepository.findByLogin(login).orElseThrow(() -> new RuntimeException("No entity found with login:" + login));
    }

    public void initDataLoad(){
    userRepository.uploadDefaultUsers();
    }
}
