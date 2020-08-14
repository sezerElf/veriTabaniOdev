package com.elif.vtysProje.util;

import com.elif.vtysProje.models.Deneme;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static HibernateUtil instance;
    private final StandardServiceRegistry registry;
    private SessionFactory sessionFactory;

    private HibernateUtil(){
        registry = new StandardServiceRegistryBuilder()
                .configure().build();
        try{
            sessionFactory = new MetadataSources( registry )
                    .buildMetadata().buildSessionFactory();
        }catch(Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    public static HibernateUtil getInstance(){
        if(instance == null) instance = new HibernateUtil();

        return instance;
    }

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
