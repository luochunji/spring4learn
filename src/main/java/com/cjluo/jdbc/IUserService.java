package com.cjluo.jdbc;

import java.util.List;

/**
 * @author：luocj
 * @date：2018/5/28
 */
public interface IUserService {

    void save(User user);

    List<User> listUsers();

}
