/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import com.elif.vtysProje.util.HibernateUtil;
import com.elif.vtysproje.models.Sehir;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ELİF
 */
public class SehirDal implements BaseDal<Sehir>{

    private SessionFactory sessionFactory;

    public SehirDal() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    @Override
    public List<Sehir> getAll() {
         Session session = sessionFactory.openSession();
        List<Sehir> sehirler = session.createQuery("from Sehir").getResultList();
        session.close();
        return sehirler;
    }

    @Override
    public Sehir getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Sehir t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Sehir t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Sehir t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Sehir getByName(String name){
        Session session = sessionFactory.openSession();
        Sehir sehir = session.createQuery("from Sehir s where s.sehirAdi = :sehirAdi", Sehir.class)
                .setParameter("sehirAdi", name).getSingleResult();
        session.close();
        return sehir;
    }
}
