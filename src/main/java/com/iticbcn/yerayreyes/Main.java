package com.iticbcn.yerayreyes;

import org.hibernate.SessionFactory;

import com.iticbcn.yerayreyes.dao.ClassificacioDAO;
import com.iticbcn.yerayreyes.dao.EquipDAO;
import com.iticbcn.yerayreyes.dao.JugadorDAO;
import com.iticbcn.yerayreyes.dao.LligaDAO;
import com.iticbcn.yerayreyes.model.Equip;
import com.iticbcn.yerayreyes.model.Jugador;
import com.iticbcn.yerayreyes.model.Lliga;
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        ClassificacioDAO classificacioDAO = new ClassificacioDAO();
        EquipDAO equipDAO = new EquipDAO();
        JugadorDAO jugadorDAO = new JugadorDAO();
        LligaDAO lligaDAO = new LligaDAO();
        /* 
        Lliga lligaNova = new Lliga("prova1", "2025");
        lligaDAO.create(lligaNova);
        System.out.printf("Lliga %S afegida a la BBDD", lligaNova.getNomLliga());
        long longValue = 1;
        lligaNova = lligaDAO.findById(longValue);

        Equip equipNou = new Equip("equip1", "2025", lligaNova);
        equipDAO.create(equipNou);
        System.out.printf("Equip %S afegit a la BBDD", equipNou.getNomEquip());
        equipNou = equipDAO.findById(1);

        Jugador jugadorNou = new Jugador("Raul", "Numero1", equipNou);
        jugadorDAO.create(jugadorNou);
        System.out.printf("Jugador %S afegit a la BBDD", jugadorNou.getNom());
        */

        long longValue = 1;
        Lliga lliga = lligaDAO.findById(longValue);
        Equip equip = equipDAO.findById(1);
        Jugador jugador = jugadorDAO.findById(longValue);


        /*lliga.setNomLliga("PROVACANVI");
        lligaDAO.update(lliga);
        System.out.printf("Lliga %S modificada a la BBDD", lliga.getNomLliga());
        */

        /*lligaDAO.findAll().forEach(lliga1 -> System.out.println(lliga1.getNomLliga()));
        equipDAO.create(new Equip("Equip2", "Canada", lliga));
        equipDAO.findAll().forEach(equip1 -> System.out.println(equip1.getNomEquip()));
        jugadorDAO.create(new Jugador("Prova2", "prova3", equip));
        jugadorDAO.findAll().forEach(jugador1 -> System.out.println(jugador1.getNom()));
        */
        Jugador jugador2 = jugadorDAO.findById((long)2);
        jugadorDAO.delete(jugador2.getIdJugador());
    }
}
