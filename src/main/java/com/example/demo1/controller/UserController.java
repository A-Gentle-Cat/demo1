package com.example.demo1.controller;

import com.example.demo1.entity.User;
import com.example.demo1.entity.comment;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public User login(String account, String password) {
        return userService.Login(account, password);
    }
//    @GetMapping("/signup")
//    public Responsemsg
    @GetMapping("/check_comment")
    public List<comment> check_comment(String id){
        return userService.mycomment(id);
    }
}
