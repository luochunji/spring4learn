package com.cjluo.chapter13.sender;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author：luocj
 * @date：2018/6/6
 */
public class Sender {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        try {
            Connection connection = connectionFactory.createConnection();
            connection.start();
            Session session = connection.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("my-queue");

            MessageProducer producer = session.createProducer(destination);
            for(int i=0;i<3;i++){
                TextMessage message = session.createTextMessage("This is a test");
                Thread.sleep(1000);
                producer.send(message);
            }
//            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
