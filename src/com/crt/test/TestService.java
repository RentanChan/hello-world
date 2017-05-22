package com.crt.test;

import javax.annotation.Resource;
import javax.persistence.Transient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {
    @Resource
    private SessionFactory sessionFactory;
    @Transactional
    public void savePerson(){
        Person p = new Person();
        p.setAge(11);
        p.setName("hxk");
        Session session = sessionFactory.getCurrentSession();
        session.save(p);
    }
}
