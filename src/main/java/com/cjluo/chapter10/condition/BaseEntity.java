package com.cjluo.chapter10.condition;

import com.cjluo.chapter10.util.EntityUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author：luocj
 * @date：2018/5/31
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseEntity implements Serializable {

    public static final String DEFAULT_FIELD_NAME_PRIMARY_KEY = "id";

    /**
     * 主键
     */
    protected String id;

    /**
     * 赋值的字段名集合
     */
    private List<String> settedFields = new ArrayList<>();

    /**
     * 数据状态
     */
    private Integer rowState = RowStateEnum.UNCHANGED.getValue();

    /**
     * 数据状态 枚举类
     *
     * @author xiezm
     */
    public enum RowStateEnum {
        /**
         * 0 = 未改变状态
         */
        UNCHANGED(0),
        /**
         * 1 = 新增的状态
         */
        ADDED(1),
        /**
         * 2 = 删除的状态
         */
        DELETED(2),
        /**
         * 3 = 修改过的状态
         */
        MODIFIED(3);

        private int value;

        RowStateEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public void setupSettedFieldArr(String[] fieldNameArr) {
        settedFields.clear();
        settedFields.addAll(Arrays.asList(fieldNameArr));
    }

    public void setupSettedFields(List<String> settedFields) {
        this.settedFields = settedFields;
    }

    /**
     * 添加赋值的字段名称
     *
     * @param fieldName
     */
    protected void addSettedField(String fieldName) {
        if (!settedFields.contains(fieldName)) {
            settedFields.add(fieldName);
        }
    }

    /**
     * 所有赋值字段的集合
     *
     * @return
     */
    public List<String> obtainSettedFields() {
        return settedFields;
    }

    @Transient
    public Integer getRowState() {
        return rowState;
    }

    public void setRowState(Integer rowState) {
        this.rowState = rowState;
    }

    public void setId(String id) {
        this.id = id;
        addSettedField("id");
    }

    @Column(name = "id")
    @Id
    @GeneratedValue(generator = "UUIDGenerator")
    public String getId() {
        return id;
    }

    /**
     * 获取实体的Mapper Class，由子类实现
     *
     * @return
     */
    public Class<?> obtainEntityMapperClass() {
        throw new RuntimeException(this.getClass().getName() + " not implement the obtainEntityMapperClass method!");
    }

    /**
     * 保存字段值
     * @param field
     * @param value
     */
    public void setAttributeValue(String field, Object value) {
        if (field != null && field.length() < 1) {
            throw new RuntimeException("field name is must.");
        }
        EntityUtil.setFieldValueByFieldName(this, field, value);
    }

    /**
     * 获取字段值
     * @param field
     * @return
     */
    @Transient
    public Object getAttributeValue(String field) {
        if (field != null && field.length() < 1) {
            return null;
        }
        return EntityUtil.getFieldValueByFieldName(this, field);
    }
}
