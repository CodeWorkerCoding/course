package com.nchu.tech.course.impl.dubbo;

import com.nchu.tech.course.service.dubbo.DubbeDemoService;
import org.springframework.stereotype.Service;

/**
 * dubbo 小样服务实现
 * Created by fujianjian on 2017/2/27.
 */
@Service
public class DubboDemoServiceImpl implements DubbeDemoService {

    @Override
    public String geet(String name) {
        StringBuilder sb = new StringBuilder("hello ");
        sb.append(name).append(" this is dubbo demo service testsss");
        return sb.toString();
    }
}
