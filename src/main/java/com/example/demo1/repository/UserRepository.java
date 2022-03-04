package com.example.demo1.repository;

import com.example.demo1.entity.User;
import com.example.demo1.entity.comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.xml.stream.events.Comment;
import java.util.List;

@Mapper
public interface UserRepository {
    @Select("select * from user where account=#{account} and password=#{password}")
    User login(String account, String password);

    @Insert("insert into user(id, nickname, sex, account, password)value(null, #{nickname}, #{sex}, #{account}, #{password}")
    void addUser(String nickname, String sex, String account, String password);

    @Select("select * from comment where id = #{id}")
    List<comment> mycomment(String id);
}
