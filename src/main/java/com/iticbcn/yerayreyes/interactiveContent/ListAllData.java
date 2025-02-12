package com.iticbcn.yerayreyes.interactiveContent;

import com.iticbcn.yerayreyes.dao.ClassificacioDAO;
import com.iticbcn.yerayreyes.dao.EquipDAO;
import com.iticbcn.yerayreyes.dao.JugadorDAO;
import com.iticbcn.yerayreyes.dao.LligaDAO;

public class ListAllData {
    
    ClassificacioDAO classificacioDAO = new ClassificacioDAO();
    EquipDAO equipDAO = new EquipDAO();
    JugadorDAO jugadorDAO = new JugadorDAO();
    LligaDAO lligaDAO = new LligaDAO();

    @SuppressWarnings("empty-statement")
    public static void listAllData(int opcio){
        switch (opcio) {
            case 1 -> listLliga();
            case 2 -> listEquip();
            case 3 -> listJugador();
            case 4 -> listClassificacio();
        };
    }

    public static void listJugador(){

    }

    public static void listEquip(){

    }

    public static void listClassificacio(){

    }

    public static void listLliga(){

    }

}
