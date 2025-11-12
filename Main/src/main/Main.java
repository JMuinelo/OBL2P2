package main;
import dominio.*;
import interfaz.*;

public class Main {
    public static void main(String[] args) {
        Sistema modelo = new Sistema();
        /*
        
        
        
        area.getListaEmpleado().add(new Empleado("Juan",100,manager,area,"1111","1111"));
        area.getListaEmpleado().add(new Empleado("Pedro",100,manager,area,"1111","1111"));
        */
        
        Manager manager = new Manager("Jorge","11111111","2221212",2);
        modelo.getListaManagers().add(manager);
        
        Area area = new Area("Marketing","Desc1",2000);
        modelo.getListaAreas().add(area);
        modelo.getListaAreas().add(new Area("Management","Desc2",1500));
        
        
        VentanaInicial vent = new VentanaInicial(modelo);
        vent.setVisible(true);
        
    }
    
}
