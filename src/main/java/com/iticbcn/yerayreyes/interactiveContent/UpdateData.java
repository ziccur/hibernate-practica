package com.iticbcn.yerayreyes.interactiveContent;

import com.iticbcn.yerayreyes.dao.ClassificacioDAO;
import com.iticbcn.yerayreyes.dao.EquipDAO;
import com.iticbcn.yerayreyes.dao.JugadorDAO;
import com.iticbcn.yerayreyes.dao.LligaDAO;

public class UpdateData {

    ClassificacioDAO classificacioDAO = new ClassificacioDAO();
    EquipDAO equipDAO = new EquipDAO();
    JugadorDAO jugadorDAO = new JugadorDAO();
    LligaDAO lligaDAO = new LligaDAO();

    public static boolean updateData(int opcio){
        return switch (opcio) {
            case 1 -> updateLliga();
            case 2 -> updateEquip();
            case 3 -> updateJugador();
            case 4 -> updateClassificacio();
            default -> false;
        };
    }
    
    public static boolean updateJugador(){
        // Implement the logic to update a player
        return true; // Return true if the update was successful
    }

    public static boolean updateEquip(){
        // Implement the logic to update a team
        return true; // Return true if the update was successful
    }

    public static boolean updateClassificacio(){
        // Implement the logic to update a classification
        return true; // Return true if the update was successful
    }

    public static boolean updateLliga(){
        // Implement the logic to update a league
        return true; // Return true if the update was successful
    }

}
