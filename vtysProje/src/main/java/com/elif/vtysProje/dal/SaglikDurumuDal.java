/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import com.elif.vtysProje.util.HibernateUtil;
import com.elif.vtysproje.models.SaglikDurumu;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ELİF
 */
public class SaglikDurumuDal implements BaseDal<SaglikDurumu> {

    private SessionFactory sessionFactory;

    public SaglikDurumuDal() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    @Override
    public List<SaglikDurumu> getAll() {
        Session session = sessionFactory.openSession();
        List<SaglikDurumu> saglikdurumlari = session.createQuery("from SaglikDurumu").getResultList();
        session.close();
        return saglikdurumlari;
    }

    @Override
    public SaglikDurumu getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(SaglikDurumu t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(SaglikDurumu t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(SaglikDurumu t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public SaglikDurumu getByName(String name){
        Session session = sessionFactory.openSession();
        var saglikDurumu = session.createQuery("from SaglikDurumu s where s.kisiselSaglikDurumAdi = :saglikDurumuAdi", SaglikDurumu.class)
                .setParameter("saglikDurumuAdi", name).getSingleResult();
        session.close();
        return saglikDurumu;
    }
}
