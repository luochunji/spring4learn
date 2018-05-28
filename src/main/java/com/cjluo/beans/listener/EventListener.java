package com.cjluo.beans.listener;

import com.cjluo.beans.event.EventBean;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author：luocj
 * @date：2018/5/25
 */
public class EventListener implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof EventBean) {
            EventBean eventBean = (EventBean) event;
            eventBean.print();
        }
    }
}
