package main;
import dominio.*;
import interfaz.*;

public class Main {
    public static void main(String[] args) {
        Sistema modelo = new Sistema();
        
        VentanaInicial vent = new VentanaInicial(modelo);
        vent.setVisible(true);
        
    }
    
}
