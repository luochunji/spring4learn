package com.cjluo.chapter10.util;

import com.cjluo.chapter10.condition.BaseEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanWrapperImpl;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author：luocj
 * @date：2018/5/31
 */
public class EntityUtil {

    /**
     * 获取实体类映射的表名
     * @param entityClass
     * @param <Entity>
     * @return
     */
    public static <Entity extends BaseEntity> String getTableName(Class<Entity> entityClass) {
        if (null != entityClass && entityClass.isAnnotationPresent(Table.class)) {
            return entityClass.getAnnotation(Table.class).name();
        }
        return null;
    }


    public static <Entity extends BaseEntity> void setFieldValueByFieldName(Entity entity,String fieldName,Object value){
        if(StringUtils.isNotEmpty(fieldName)){
            new BeanWrapperImpl(entity).setPropertyValue(fieldName,value);
        }
    }

    public static <Entity extends BaseEntity> Serializable getFieldValueByFieldName(Entity entity, String fieldName) {
        if(StringUtils.isNotEmpty(fieldName)){
            return (Serializable) new BeanWrapperImpl(entity).getPropertyValue(fieldName);
        }
        return null;
    }
}
