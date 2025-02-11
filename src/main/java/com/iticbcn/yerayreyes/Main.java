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



        String equip = equipDAO.findById(1).toString();
        System.out.println(equip);

    }
}
