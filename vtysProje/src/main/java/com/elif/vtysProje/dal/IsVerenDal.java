/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import com.elif.vtysProje.util.HibernateUtil;
import com.elif.vtysproje.models.IsVeren;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ELİF
 */
public class IsVerenDal implements BaseDal<IsVeren> {

    private SessionFactory sessionFactory;
    private UserDal userDal = new UserDal();

    public IsVerenDal() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    @Override
    public List<IsVeren> getAll() {
        Session session = sessionFactory.openSession();
        List<IsVeren> IsVerenler = session.createQuery("from IsVeren").getResultList();
        session.close();
        return IsVerenler;
    }

    @Override
    public IsVeren getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(IsVeren t) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(IsVeren t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(IsVeren t) {
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
            IsVeren isVeren = session.createQuery("from IsVeren i where i.kullanici.id = :kullaniciId", IsVeren.class)
                    .setParameter("kullaniciId", kullaniciId).getSingleResult();
            session.delete(isVeren);
            session.getTransaction().commit();
            session.close();
        } catch (NoResultException e) {

        }
    }

}
