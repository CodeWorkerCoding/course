package com.nchu.tech.course.mapper.provider;

import com.nchu.tech.course.domain.User;

/**
 * user sql提供者
 * Created by fujianjian on 2017/2/23.
 */
public class UserProvider  {

    public String insert(){
        StringBuilder sb = new StringBuilder(
                "INSERT INTO `course_user` (`id`, `name`, `nickname`, `created_time`, `modified_time`) VALUES ( ");
        sb.append("REPLACE(UUID(), '-', ''), #{user.name}, #{user.nickname}, CURRENT_TIMESTAMP, NULL").append(");");
        return sb.toString();
    }


}
