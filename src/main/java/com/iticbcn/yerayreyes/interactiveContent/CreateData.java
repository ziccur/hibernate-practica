package com.iticbcn.yerayreyes.interactiveContent;

import java.util.ArrayList;

import com.iticbcn.yerayreyes.Entrada;
import com.iticbcn.yerayreyes.dao.ClassificacioDAO;
import com.iticbcn.yerayreyes.dao.EquipDAO;
import com.iticbcn.yerayreyes.dao.JugadorDAO;
import com.iticbcn.yerayreyes.dao.LligaDAO;
import com.iticbcn.yerayreyes.model.Equip;
import com.iticbcn.yerayreyes.model.Jugador;

public class CreateData {

    ClassificacioDAO classificacioDAO = new ClassificacioDAO();
    static EquipDAO equipDAO = new EquipDAO();
    static JugadorDAO jugadorDAO = new JugadorDAO();
        LligaDAO lligaDAO = new LligaDAO();
        
            public static void crearData(int opcio){
                System.out.println("############################");
                switch (opcio) {
                    case 1 -> crearLliga();
                    case 2 -> crearEquip();
                    case 3 -> crearJugador();
                    case 4 -> crearClassificacio();
                }
            }
            
            public static void crearJugador(){
                String nom;
                String cognom;

                System.out.println("Introdueix el nom del jugador:");
                nom = Entrada.readLine();
                System.out.println("Introdueix el cognom del jugador:");
                cognom = Entrada.readLine();
                System.out.println("Introdueixi el número de l'equip del jugador:");
                
                ArrayList<Equip> equips = (ArrayList<Equip>) equipDAO.findAll();
                if (equips.isEmpty()) {
                    System.out.println("Primer crea un equip");
                    System.exit(1);
                }
    
                for (int i = 0; i < equips.size(); i++) {
                    System.out.println(equips.get(i).toString());
                }
                
                System.out.print("Id de l'equip: ");
                int numEquip = Integer.parseInt(Entrada.readLine());
    
                for(Equip equip : equips){
                    if(equip.getIdEquip() == numEquip){
                        jugadorDAO.create(new Jugador(nom, cognom, equip));
                    System.out.println("Jugador creat correctament");
                    return;
                }

                System.out.println("No s'ha trobat l'equip amb aquest número");
                System.exit(1);
            
            }

    }

    public static void crearEquip(){
        // Add your logic here
    }

    public static void crearClassificacio(){
        // Add your logic here
    }

    public static void crearLliga(){
        // Add your logic here
    }

}
