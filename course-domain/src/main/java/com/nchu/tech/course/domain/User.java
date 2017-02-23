package com.nchu.tech.course.domain;

import lombok.Getter;
import lombok.Setter;

/**
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
