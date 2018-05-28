package com.cjluo.chapter9;

import com.cjluo.chapter9.bean.User;
import com.cjluo.chapter9.mapper.IUserMapper;
import com.cjluo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class MapperTest {

    static SqlSessionFactory sqlSessionFactory = null;

    static {
        sqlSessionFactory  = MyBatisUtil.getSqlSessionFactory();
    }

    @Test
    public void getTest(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserMapper userMapper = sqlSession.getMapper(IUserMapper.class);
        User user = userMapper.getUser(3);
        System.out.println(user);
    }
}
