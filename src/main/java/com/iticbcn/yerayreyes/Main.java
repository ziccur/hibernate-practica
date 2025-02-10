package com.iticbcn.yerayreyes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main( String[] args )
    {
        SessionFactory sesion = HibernateUtil.getSessionFactory();

        Session session = sesion.openSession();

        session.beginTransaction();

        System.out.println("Hola desde Hibernate");

        session.getTransaction().commit();

        session.close();

    }
}