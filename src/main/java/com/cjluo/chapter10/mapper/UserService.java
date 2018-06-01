package com.cjluo.chapter10.mapper;

import com.cjluo.chapter10.bean.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * @author：luocj
 * @date：2018/5/29
 */
public class UserService implements IUserService{

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void save(User user) {
        jdbcTemplate.update("INSERT INTO user(name,age,sex) VALUES (?,?,?)",
                new Object[]{user.getName(),user.getAge(),user.getSex()},
                new int[]{Types.VARCHAR,Types.INTEGER,Types.VARCHAR});
        throw new RuntimeException("this is an error");
    }
}
