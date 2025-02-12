package com.iticbcn.yerayreyes.interactiveContent;

import com.iticbcn.yerayreyes.dao.ClassificacioDAO;
import com.iticbcn.yerayreyes.dao.EquipDAO;
import com.iticbcn.yerayreyes.dao.JugadorDAO;
import com.iticbcn.yerayreyes.dao.LligaDAO;

public class DeleteData {

    ClassificacioDAO classificacioDAO = new ClassificacioDAO();
    EquipDAO equipDAO = new EquipDAO();
    JugadorDAO jugadorDAO = new JugadorDAO();
    LligaDAO lligaDAO = new LligaDAO();

    public static boolean eliminarData(int opcio){

        return switch (opcio) {
            case 1 -> eliminarLliga();
            case 2 -> eliminarEquip();
            case 3 -> eliminarJugador();
            case 4 -> eliminarClassificacio();
            default -> false;
        };
    }
    
    public static boolean eliminarJugador(){
        // Implement the logic to delete a player
        return true; // Return true if the deletion was successful
    }

    public static boolean eliminarEquip(){
        // Implement the logic to delete a team
        return true; // Return true if the deletion was successful
    }

    public static boolean eliminarClassificacio(){
        // Implement the logic to delete a classification
        return true; // Return true if the deletion was successful
    }

    public static boolean eliminarLliga(){
        // Implement the logic to delete a league
        return true; // Return true if the deletion was successful
    }

}
