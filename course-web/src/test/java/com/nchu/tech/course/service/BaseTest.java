package com.nchu.tech.course.service;

import com.nchu.tech.course.CourseWebApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 服务测试基础
 * Created by fujianjian on 2017/2/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CourseWebApplication.class)
public abstract class BaseTest {
}
