package com.crt.test;


import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSSH {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public  void testDemo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory)ac.getBean("sessionFactory");
        System.out.println(sessionFactory);
    }
    @Test
    public void testDemo2(){
        TestService service = (TestService)ac.getBean("testService");
        service.savePerson();
    }
}
