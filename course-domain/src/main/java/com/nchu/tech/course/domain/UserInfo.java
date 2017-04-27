package com.nchu.tech.course.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户基础信息
 * Created by fujianjian on 2017/2/28.
 */
public class UserInfo extends BaseModule {

    @Setter@Getter
    private String qq;
    @Setter@Getter
    private String moblie;
}
