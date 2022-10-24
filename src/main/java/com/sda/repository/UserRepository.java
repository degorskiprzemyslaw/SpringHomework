package com.sda.repository;

import com.sda.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class UserRepository {



    private final List<User> users;




    public List<User> getAllUsers(){
        return users;
    }

    public void uploadDefaultUsers(){
        this.users.add(User.builder()
                .id(1)
                .firstName("Jan")
                .lastName("Kowalski")
                .login("jankol")
                .password("asd123")
                .age(20).build());
        this.users.add(User.builder()
                .id(2)
                .firstName("Lukasz")
                .lastName("Nowak")
                .login("luknow")
                .password("qwe321")
                .age(31).build());
    }

    public Optional<User> findById(long id){
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }

    public Optional<User> findByLogin(String login){
        return users.stream().filter(user -> user.getLogin().equals(login)).findFirst();
    }
}
