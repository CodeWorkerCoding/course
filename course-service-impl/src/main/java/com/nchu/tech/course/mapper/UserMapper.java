package com.nchu.tech.course.mapper;

import com.nchu.tech.course.domain.User;
import com.nchu.tech.course.mapper.provider.UserProvider;
import org.apache.ibatis.annotations.*;

/**
 * Created by fujianjian on 2017/2/20.
 */
@Mapper
public interface UserMapper {

    @Select("select * from course_user where name = #{name}")
    User findByName(@Param("name") String name);

    @InsertProvider(type = UserProvider.class, method = "insert")
    @SelectKey(keyProperty = "id", before = false, resultType = int.class, statement = "SELECT LAST_INSERT_ID() AS id")
    int save(@Param("user") User user);


}
