/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import com.elif.vtysProje.util.HibernateUtil;
import com.elif.vtysproje.models.EgitimDurumu;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author ELİF
 */
public class EgitimDurumuDal implements BaseDal<EgitimDurumu> {

    private SessionFactory sessionFactory;

    public EgitimDurumuDal() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    @Override
    public List<EgitimDurumu> getAll() {
        Session session = sessionFactory.openSession();
        List<EgitimDurumu> egitimDurumlari = session.createQuery("from EgitimDurumu").getResultList();
        session.close();
        return egitimDurumlari;
    }

    @Override
    public EgitimDurumu getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(EgitimDurumu t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(EgitimDurumu t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(EgitimDurumu t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public EgitimDurumu getByName(String name){
        Session session = sessionFactory.openSession();
        var egitimDurumu = session.createQuery("from EgitimDurumu e where e.egitimDurumuAdi = :adi", EgitimDurumu.class)
                .setParameter("adi", name).getSingleResult();
        session.close();
        return egitimDurumu;
    }

}
