package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;


public class Sistema extends Observable implements Serializable{
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Area> listaAreas;
    private ArrayList<Manager> listaManagers;
    private ArrayList<Movimiento> listaMovimientos;

    public ArrayList<Empleado> getListaEmpleados() {
        setChanged();
        notifyObservers();
        return listaEmpleados;
    }

    public ArrayList<Area> getListaAreas() {
        setChanged();
        notifyObservers();
        return listaAreas;
    }

    public ArrayList<Manager> getListaManagers() {
        setChanged();
        notifyObservers();
        return listaManagers;
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        setChanged();
        notifyObservers();
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
    
    public boolean cedulaValida(String cedula){
        boolean retorno = true;
        for(Empleado emp : this.listaEmpleados){
            if(emp.getCedula().equals(cedula)){
                retorno = false;
            }
        }
        for(Manager man : this.listaManagers){
            if(man.getCedula().equals(cedula)){
                retorno = false;
            }
        }
        return retorno;
    }
    
    public boolean verificarAtributosVacios(String nombre, String cedula, String celular, String curriculum){
        //verifica si un conjunto de datos tiene un string vacio
        boolean valido = true;
        if(nombre.equals("")||cedula.equals(nombre)||celular.equals("")||curriculum.equals("")){
            valido = false;
        }
        return valido;
    }
    
    public boolean esUnNumero(String numero){
        boolean valida = true;
        try{
            int numValido = Integer.parseInt(numero);
        } 
        catch (NumberFormatException e){
            valida = false;
        }
        return valida;
    }
}
