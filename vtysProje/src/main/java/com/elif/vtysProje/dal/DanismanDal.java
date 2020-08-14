/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import com.elif.vtysProje.util.HibernateUtil;
import com.elif.vtysproje.models.Danisman;
import com.elif.vtysproje.models.Kullanici;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ELİF
 */
public class DanismanDal implements BaseDal<Danisman> {

    private SessionFactory sessionFactory;
    private UserDal userDal = new UserDal();

    public DanismanDal() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    @Override
    public List<Danisman> getAll() {
        Session session = sessionFactory.openSession();
        List<Danisman> danismanlar = session.createQuery("from Danisman").getResultList();
        session.close();
        return danismanlar;
    }

    @Override
    public Danisman getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Danisman t) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Danisman t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Danisman t) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(t);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteByKullaniciId(int kullaniciId) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Danisman danisman = session.createQuery("from Danisman d where d.kullanici.id = :kullaniciId", Danisman.class)
                    .setParameter("kullaniciId", kullaniciId).getSingleResult();
            session.delete(danisman);
            session.getTransaction().commit();
            session.close();
        } catch (NoResultException e) {

        }
    }

}
