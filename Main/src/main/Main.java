
package main;

import dominio.*;
import interfaz.*;


public class Main {

    
    public static void main(String[] args) {
        Sistema modelo = new Sistema();
        
        Area area = new Area("Marketing","Desc1",2000);
        Manager manager = new Manager("Nombre","11111111","2221212",2);
        
        area.getListaEmpleado().add(new Empleado("Juan","ajsaj",100,manager,area,"1111","1111"));
        area.getListaEmpleado().add(new Empleado("Pedro","ajsaj",100,manager,area,"1111","1111"));
        modelo.getListaAreas().add(area);
        modelo.getListaAreas().add(new Area("Management","Desc2",1500));
        
        
        VentanaRealMovArea vent = new VentanaRealMovArea(modelo);
        vent.setVisible(true);
        
    }
    
}
