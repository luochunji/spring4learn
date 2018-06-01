package com.cjluo.chapter10.mapper;

import com.cjluo.chapter10.bean.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED,noRollbackFor = RuntimeException.class)
public interface IUserService {

    void save(User user);

}
