package com.iticbcn.yerayreyes;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.iticbcn.yerayreyes.model.Equip;

public class EquipDAO {

    private static SessionFactory sessionFactory;

    public static void setSessionFactory(SessionFactory sessionFactory) {
        EquipDAO.sessionFactory = sessionFactory;
    }

    public static void GuardarEquip(Equip equip) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(equip);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.err.println("Error en Hibernate: " + e.getMessage());
            rollbackTransaction();
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            rollbackTransaction();
        }
    }

    public static void ActualitzarEquip(Equip equip) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(equip);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.err.println("Error en Hibernate: " + e.getMessage());
            rollbackTransaction();
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            rollbackTransaction();
        }
    }

    public static void EliminarEquip(Equip equip) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(equip);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.err.println("Error en Hibernate: " + e.getMessage());
            rollbackTransaction();
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            rollbackTransaction();
        }
    }

    public static Equip ObtenirEquip(int EquipId) {
        Equip equip = null;

        try (Session session = sessionFactory.openSession()) {
            equip = session.find(Equip.class, EquipId);
        } catch (HibernateException e) {
            System.err.println("Error en Hibernate: " + e.getMessage());
            rollbackTransaction();
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            rollbackTransaction();
        }

        return equip;
    }

    public static void crearEquip(SessionFactory sesion, Equip equip) {
        try (Session session = sesion.openSession()) {
            session.beginTransaction();
            session.persist(equip);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            rollbackTransaction();
            System.err.println("Error en Hibernate: " + e.getMessage());
        } catch (Exception e) {
            rollbackTransaction();
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }

    private static void rollbackTransaction() {
        try (Session session = sessionFactory.openSession()) {
            if (session.getTransaction() != null && session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
        } catch (HibernateException e) {
            System.err.println("Error en Hibernate durante el rollback: " + e.getMessage());
        }
    }
}
