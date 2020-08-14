/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import com.elif.vtysProje.util.HibernateUtil;
import com.elif.vtysproje.models.IsArayan;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ELİF
 */
public class IsArayanDal implements BaseDal<IsArayan> {

    private SessionFactory sessionFactory;
    private UserDal userDal = new UserDal();

    public IsArayanDal() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    @Override
    public List<IsArayan> getAll() {
        Session session = sessionFactory.openSession();
        List<IsArayan> IsArayanlar = session.createQuery("from IsArayan").getResultList();
        session.close();
        return IsArayanlar;
    }

    @Override
    public IsArayan getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(IsArayan t) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(IsArayan t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(IsArayan t) {
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
            IsArayan isArayan = session.createQuery("from IsArayan i where i.kullanici.id = :kullaniciId", IsArayan.class)
                    .setParameter("kullaniciId", kullaniciId).getSingleResult();
            session.delete(isArayan);
            session.getTransaction().commit();
            session.close();
        } catch (NoResultException e) {

        }
    }

}
