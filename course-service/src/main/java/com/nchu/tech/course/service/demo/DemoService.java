package com.nchu.tech.course.service.demo;

/**
 * 小样服务
 * Created by fujianjian on 2017/4/3.
 */
public interface DemoService {

    default String geet() {
        return "this is default DemoService, Hello world";
    }

}
