package com.nchu.tech.course.service;

/**
 * Created by fujianjian on 2017/2/20.
 */
public interface BaseService<T, ID> {

    T get(ID id);

    T create(T t);

    T update(T t);

}
