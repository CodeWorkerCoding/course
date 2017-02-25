package com.nchu.tech.course.service;

import com.nchu.tech.course.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户服务测试
 * Created by fujianjian on 2017/2/25.
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;


    @Test
    public void testCreateUser(){
        User user = new User();
        user.setName("Allensss");
        user.setNickname("master-allen-sss");
        userService.create(user);
    }

}
