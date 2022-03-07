package com.example.demo1.repository;

import com.example.demo1.entity.User;
import com.example.demo1.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRepository {
    @Select("select * from user where account=#{account} and password=#{password}")
    User login(String account, String password);

    @Insert("insert into user(id, nickname, sex, account, password)value(null, #{nickname}, #{sex}, #{account}, #{password}")
    void addUser(String nickname, String sex, String account, String password);

    @Select("select * from comment where id = #{id}")
    List<Comment> mycomment(String id);

//    @Insert("insert into comment(cid, content, time, id, aid)value(#{cid}, #{content, #{time}, #{id}, #{aid})")
//    void Post(String cid, String content, String time, String id, String aid);

//    @Select("SELECT content, time, nickname, `comment`.id" +
//            "FROM article, `comment`, `user`" +
//            "WHERE `comment`.aid = '0001' and `comment`.id = `user`.id")
//    List<int> Show_Layout(String Stringaid);
}
