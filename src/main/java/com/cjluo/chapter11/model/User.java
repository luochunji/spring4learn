package com.cjluo.chapter11.model;

import java.io.Serializable;

/**
 * @author：luocj
 * @date：2018/5/31
 */
public class User implements Serializable {

    private String username;

    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
