
package main;

import dominio.*;
import interfaz.*;


public class Main {

    
    public static void main(String[] args) {
        Sistema modelo = new Sistema();
        VentanaAltaArea vent = new VentanaAltaArea(modelo);
        vent.setVisible(true);
        
    }
    
}
