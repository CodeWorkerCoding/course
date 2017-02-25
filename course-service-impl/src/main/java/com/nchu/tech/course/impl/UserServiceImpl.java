package com.nchu.tech.course.impl;

import com.nchu.tech.course.domain.User;
import com.nchu.tech.course.mapper.UserMapper;
import com.nchu.tech.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fujianjian on 2017/2/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User get(String s) {
        return null;
    }

    public User create(User user) {
        int id = userMapper.save(user);
        System.out.println("生成记录的Id为：" + id);
        return user;
    }

    public User update(User user) {
        return null;
    }
}
