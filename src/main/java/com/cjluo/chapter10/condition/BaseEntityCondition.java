package com.cjluo.chapter10.condition;

import java.io.Serializable;

/**
 * 实体条件抽象类
 * @author：luocj
 * @date：2018/5/31
 */
public abstract class BaseEntityCondition implements Serializable{

    private String authCondition;

    protected Page page;

    public String getAuthCondition() {
        return authCondition;
    }

    public void setAuthCondition(String authCondition) {
        this.authCondition = authCondition;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 获取实体类
     * @return
     */
    public abstract Class<? extends BaseEntity> getEntityClass();
}
