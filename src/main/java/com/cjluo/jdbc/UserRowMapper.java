package com.cjluo.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author：luocj
 * @date：2018/5/28
 */
public class UserRowMapper implements RowMapper {
    public Object mapRow(ResultSet set, int index) throws SQLException {
        User user = new User(set.getInt("id"),
                set.getString("name"),
                set.getInt("age"),
                set.getString("sex"));
        return user;
    }
}
