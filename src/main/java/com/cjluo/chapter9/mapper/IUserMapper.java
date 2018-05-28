package com.cjluo.chapter9.mapper;

import com.cjluo.chapter9.bean.User;

public interface IUserMapper {

    void insertUser(User user);

    User getUser(Integer id);
}
