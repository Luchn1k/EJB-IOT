/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modle;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

/**
 *
 * @author Luchn1k
 */
public class MyListener {

    static String s = "";

    public static String MessageListner() throws JMSException {
        QueueConnection con = null;
        System.out.println("Here");
        try {
            InitialContext ctx = new InitialContext();
            QueueConnectionFactory f = (QueueConnectionFactory) ctx.lookup("jms/iotConnectionFactory");
            con = f.createQueueConnection();
            con.start();
            QueueSession ses = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            Queue t = (Queue) ctx.lookup("jms/iot");
            MessageConsumer createConsumer = ses.createConsumer(t);
            Message m = createConsumer.receive();
            if (m != null) {
                if (m instanceof TextMessage) {
                    TextMessage message = (TextMessage) m;
                    s = message.getText();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (con != null) {
            con.close();
        }
        return s;
    }

}
