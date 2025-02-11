package com.iticbcn.yerayreyes.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iticbcn.yerayreyes.HibernateUtil;
import com.iticbcn.yerayreyes.model.Lliga;

public class LligaDAO {

    public void create(Lliga lliga) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(lliga);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("Error en LligaDAO: " + e.getMessage());
        } finally {
            if (session != null) session.close();
        }
    }

    public Lliga findById(Long id) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            return session.get(Lliga.class, id);
        } catch (Exception e) {
            System.out.println("Error en LligaDAO: " + e.getMessage());
            return null;
        } finally {
            if (session != null) session.close();
        }
    }

    public List<Lliga> findAll() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            return session.createQuery("FROM Lliga", Lliga.class).list();
        } catch (Exception e) {
            System.out.println("Error en LligaDAO: " + e.getMessage());
            return null;
        } finally {
            if (session != null) session.close();
        }
    }

    public void update(Lliga lliga) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.merge(lliga);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("Error en LligaDAO: " + e.getMessage());
        } finally {
            if (session != null) session.close();
        }
    }

    public void delete(Long id) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Lliga lliga = session.get(Lliga.class, id);
            if (lliga != null) {
                session.remove(lliga);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("Error en LligaDAO: " + e.getMessage());
        } finally {
            if (session != null) session.close();
        }
    }
}
