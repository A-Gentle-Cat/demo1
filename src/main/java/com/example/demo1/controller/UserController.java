package com.example.demo1.controller;

import com.example.demo1.entity.User;
import com.example.demo1.entity.Comment;
import com.example.demo1.service.UserService;
import com.example.demo1.utility.ResponseMsg;
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
    @GetMapping("/signup")
    public ResponseMsg signup(String account, String password, String nickname, String sex){
        return userService.Signup(account, password, nickname, sex);
    }
//    @GetMapping("/article")
//    public ResponseMsg show_layout(String aid){
//        @GetMapping("/s0
//
//    }
    @GetMapping("/check_comment")
    public List<Comment> check_comment(String id){
        return userService.mycomment(id);
    }
//    @GetMapping("/post")
//    public void post(String content){
//
//    }
}
