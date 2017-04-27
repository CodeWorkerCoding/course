package com.nchu.tech.course.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户模型
 * Created by fujianjian on 2017/2/20.
 */
public class User extends BaseModule {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String nickname;

}
