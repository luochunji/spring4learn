package com.cjluo.chapter13.receiver;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author：luocj
 * @date：2018/6/6
 */
public class Receiver {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        try {
            Connection connection = connectionFactory.createConnection();
            connection.start();
            final Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("my-queue");
            MessageConsumer consumer = session.createConsumer(destination);
            while (true) {
                Message message = consumer.receive();
                if (message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
                    String msg = textMessage.getText();
                    if (null != msg && "SHUTDOWN".equals(msg.toUpperCase())) {
                        break;
                    } else {
                        System.out.println("收到消息：" + msg);
                    }
                }
            }
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
