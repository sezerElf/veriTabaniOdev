/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import com.elif.vtysProje.util.HibernateUtil;
import com.elif.vtysproje.models.Meslek;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ELİF
 */
public class MeslekDal implements BaseDal<Meslek>{

    private SessionFactory sessionFactory;

    public MeslekDal() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }
    
    @Override
    public List<Meslek> getAll() {
         Session session = sessionFactory.openSession();
        List<Meslek> meslekler = session.createQuery("from Meslek").getResultList();
        session.close();
        return meslekler;
    }

    @Override
    public Meslek getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Meslek t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Meslek t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Meslek t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Meslek getByName(String name){
        Session session = sessionFactory.openSession();
        var meslek = session.createQuery("from Meslek m where m.meslekAdi = :adi", Meslek.class)
                .setParameter("adi", name).getSingleResult();
        session.close();
        return meslek;
    }
    
}
