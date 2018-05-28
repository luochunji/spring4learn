package com.cjluo.beans.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author：luocj
 * @date：2018/5/25
 */
public class EventBean extends ApplicationEvent{

    public String msg;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never <code>null</code>)
     */
    public EventBean(Object source) {
        super(source);
    }

    public EventBean(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public void print(){
        System.out.println(msg);
    }
}
