package com.nchu.tech.course.mapper;

import com.nchu.tech.course.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by fujianjian on 2017/2/20.
 */
@Mapper
public interface UserMapper {

    @Select("select * from course_user where name = #{name}")
    User findByName(@Param("name") String name);
}
