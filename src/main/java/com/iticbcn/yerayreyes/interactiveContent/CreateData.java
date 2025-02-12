package com.iticbcn.yerayreyes.interactiveContent;

import com.iticbcn.yerayreyes.dao.ClassificacioDAO;
import com.iticbcn.yerayreyes.dao.EquipDAO;
import com.iticbcn.yerayreyes.dao.JugadorDAO;
import com.iticbcn.yerayreyes.dao.LligaDAO;

public class CreateData {

    ClassificacioDAO classificacioDAO = new ClassificacioDAO();
    EquipDAO equipDAO = new EquipDAO();
    JugadorDAO jugadorDAO = new JugadorDAO();
    LligaDAO lligaDAO = new LligaDAO();

    public static boolean crearData(int opcio){

        return switch (opcio) {
            case 1 -> crearLliga();
            case 2 -> crearEquip();
            case 3 -> crearJugador();
            case 4 -> crearClassificacio();
            default -> false;
        };
    }
    
    public static boolean crearJugador(){
        // Add your logic here
        return true; // or false based on your logic
    }

    public static boolean crearEquip(){
        // Add your logic here
        return true; // or false based on your logic
    }

    public static boolean crearClassificacio(){
        // Add your logic here
        return true; // or false based on your logic
    }

    public static boolean crearLliga(){
        // Add your logic here
        return true; // or false based on your logic
    }

}
