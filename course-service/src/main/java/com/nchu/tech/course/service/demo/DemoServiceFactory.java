package com.nchu.tech.course.service.demo;

import java.util.function.Supplier;

/**
 * 小样服务的工厂
 * Created by fujianjian on 2017/4/3.
 */
public interface DemoServiceFactory {

    static DemoService create(Supplier<DemoService> supplier) {
        return supplier.get();
    }
}
