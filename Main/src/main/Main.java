
package main;

import dominio.*;
import interfaz.*;


public class Main {

    
    public static void main(String[] args) {
        Sistema modelo = new Sistema();
        modelo.getListaAreas().add(new Area("Marketing","Desc1",2000));
        modelo.getListaAreas().add(new Area("Management","Desc2",1500));
        VentanaModificacionArea vent = new VentanaModificacionArea(modelo);
        vent.setVisible(true);
        
    }
    
}
