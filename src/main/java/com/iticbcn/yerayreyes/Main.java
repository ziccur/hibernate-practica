package com.iticbcn.yerayreyes;

import org.hibernate.SessionFactory;

import com.iticbcn.yerayreyes.dao.ClassificacioDAO;
import com.iticbcn.yerayreyes.dao.EquipDAO;
import com.iticbcn.yerayreyes.dao.JugadorDAO;
import com.iticbcn.yerayreyes.dao.LligaDAO;
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        ClassificacioDAO classificacioDAO = new ClassificacioDAO();
        EquipDAO equipDAO = new EquipDAO();
        JugadorDAO jugadorDAO = new JugadorDAO();
        LligaDAO lligaDAO = new LligaDAO();

        equipDAO.findAll().forEach(lliga1 -> System.out.println(lliga1.getNomEquip()));
        System.out.println(equipDAO.count());

    }
}
