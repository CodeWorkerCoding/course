package com.nchu.tech.course.mapper.provider;

import com.nchu.tech.course.domain.BaseModule;
import com.nchu.tech.course.helper.common.StringHelper;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 基础的Provider
 * Created by fujianjian on 2017/2/23.
 */
@Slf4j
public abstract class BaseProvider<T extends BaseModule> {

    @Setter@Getter
    private String tablenamePrefix = "course_";
    @Getter
    private Class<T> moduleClass;

    private String tableName;

    public BaseProvider() {
        Type type = this.getClass().getGenericSuperclass();
        ParameterizedType genType = (ParameterizedType) type;
        Type[] arguments = genType.getActualTypeArguments();
        this.moduleClass = (Class<T>) arguments[0];
        this.tableName = tablenamePrefix + StringHelper.camelToUnderline(this.moduleClass.getSimpleName());
    }
}
