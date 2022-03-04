package com.example.demo1.service;

import com.example.demo1.entity.User;
import com.example.demo1.entity.comment;
import com.example.demo1.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    public User Login(String account, String password){
        return userRepository.login(account, password);
    }
    public void Registered(String nickname, String sex, String account, String password){
        if(sex.equals("1")){
            sex = "男";
        }
        else{
            sex = "女";
        }
        userRepository.addUser(nickname, sex, account, password);
    }
    public List<comment> mycomment(String id){
        return userRepository.mycomment(id);
    }
}
