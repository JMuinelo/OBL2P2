package dominio;

import java.util.ArrayList;


public class Sistema {
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Area> listaAreas;
    private ArrayList<Manager> listaManagers;
    private ArrayList<Movimiento> listaMovimientos;

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Area> getListaAreas() {
        return listaAreas;
    }

    public ArrayList<Manager> getListaManagers() {
        return listaManagers;
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }
    
    public Sistema(){
        this.listaAreas = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaManagers = new ArrayList<>();
        this.listaMovimientos = new ArrayList<>();
        
        
    }
    
    public boolean validarNombre(String nombre){
        boolean retorno = true;
        for(Area ar:this.listaAreas){
            if(nombre.equals(ar.getNombre())){
                retorno = false;
            }
        }
        return retorno;
    }
}
