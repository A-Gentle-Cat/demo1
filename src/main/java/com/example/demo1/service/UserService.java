package com.example.demo1.service;

import com.example.demo1.entity.User;
import com.example.demo1.entity.Comment;
import com.example.demo1.repository.UserRepository;
import com.example.demo1.utility.ResponseMsg;
import com.example.demo1.utility.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public List<Comment> mycomment(String id){
        return userRepository.mycomment(id);
    }
    public ResponseMsg Signup(String account, String password, String nickname, String sex){
        try {
            userRepository.addUser(nickname, sex, account, password);
            return ResponseUtil.success(nickname);
        }catch (Exception e){
            System.out.println("错误：" + e.getMessage());
            return ResponseUtil.error(e.getMessage());
        }
    }
//    public ResponseMsg Post(User user, String content, String aid){
//        String TIME_FORMAT = "yyyy-MM-dd hh-mm-ss";
//        Date date = new Date();
//        SimpleDateFormat FORMAT = new SimpleDateFormat(TIME_FORMAT);
//        String time =FORMAT.format(date);
//        String id = user.getId();
//        String cid = time + String.format("%02d", (int) (Math.random() * 100));
//        System.out.println(time);
//        cid = cid.replace(" ", "");
//        try {
////            userRepository.Post(cid, content, time, id, aid);
//            return ResponseUtil.success();
//        } catch (Exception e){
//            System.out.println("错误：" + e.getMessage());
//            return ResponseUtil.error(e.getMessage());
//        }
//    }
//    public show_layout(String aid){
//        return
//    }
}
