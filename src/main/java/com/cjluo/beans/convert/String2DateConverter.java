package com.cjluo.beans.convert;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

/**
 * @author：luocj
 * @date：2018/5/25
 */
public class String2DateConverter implements Converter<String,Date> {

    public Date convert(String source) {
        try{
            return DateUtils.parseDate(source,new String[]{"yyyy-MM-dd HH:mm:ss"});
        }catch (ParseException e){
            return null;
        }
    }
}
