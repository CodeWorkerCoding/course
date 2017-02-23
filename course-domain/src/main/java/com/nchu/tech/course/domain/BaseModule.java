package com.nchu.tech.course.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础模型
 * Created by fujianjian on 2017/2/23.
 */
public abstract class BaseModule implements Serializable {

    @Getter
    @Setter
    private String id;

    @Getter@Setter
    private Date createdTime;
    @Getter@Setter
    private Date modifiedTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (null != obj && this.getClass() == obj.getClass()){
            BaseModule that = (BaseModule) obj;
            if (null != this.id){
                if (!this.id.equals(that.id)){
                    return false;
                }
            } else if (null != that.id){
                return false;
            }
            return  true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.id != null ? this.id.hashCode() : 0;
    }
}
