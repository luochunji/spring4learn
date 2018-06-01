package com.cjluo.chapter10.mapper;

import com.cjluo.chapter10.condition.BaseEntityCondition;

/**
 * mapper接口
 * @author：luocj
 * @date：2018/5/31
 */
public interface IBaseMapper {

    /**
     * 查询记录数
     * @param condition
     * @param <Condition>
     * @return
     */
    <Condition extends BaseEntityCondition> int countByCondition(Condition condition);


}
