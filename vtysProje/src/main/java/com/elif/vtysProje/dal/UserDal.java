/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import com.elif.vtysProje.util.HibernateUtil;
import com.elif.vtysproje.models.Kullanici;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ELİF
 */
public class UserDal implements BaseDal<Kullanici> {

    private SessionFactory sessionFactory;

    public UserDal() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    @Override
    public List<Kullanici> getAll() {
        Session session = sessionFactory.openSession();
        List<Kullanici> kullanicilar = session.createQuery("from Kullanici").getResultList();
        session.close();
        return kullanicilar;
    }

    @Override
    public Kullanici getById(int id) {
        Session session = sessionFactory.openSession();
        Kullanici kullanici = session.get(Kullanici.class, id);
        session.close();
        return kullanici;
    }

    @Override
    public void save(Kullanici kullanici) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(kullanici);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Kullanici t) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(t);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Kullanici t) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(t);
        session.getTransaction().commit();
        session.close();
    }

    public List<Kullanici> searchByName(String name) {
        Session session = sessionFactory.openSession();
        List<Kullanici> kullanicilar = session.createQuery("from Kullanici k where k.ad like :search or k.soyad like :search")
                .setParameter("search", "%" + name + "%").getResultList();
        session.close();
        return kullanicilar;
    }
}
