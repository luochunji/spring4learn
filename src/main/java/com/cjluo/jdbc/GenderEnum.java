package com.cjluo.jdbc;

/**
 * @author：luocj
 * @date：2018/5/28
 */
public enum GenderEnum {

    MALE("0"),
    FEMALE("1");

    private String code;

    GenderEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static String getNameByCode(String code){
        for(GenderEnum e : GenderEnum.values()){
            if(code.equals(e.getCode())){
                return e.toString();
            }
        }
        return null;
    }
}
