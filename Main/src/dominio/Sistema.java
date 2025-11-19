package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;
import java.util.*;


public class Sistema extends Observable implements Serializable{
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Area> listaAreas;
    private ArrayList<Manager> listaManagers;
    private ArrayList<Movimiento> listaMovimientos;
    
    public void notificarCambios(){
        this.setChanged();
        this.notifyObservers();
    }
            
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    
    public void agregarEmpleado(Empleado empleado) {
        this.listaEmpleados.add(empleado);
        notificarCambios();
    }
    
    public void modificarAreaEmpleado(Area area, Empleado empleado){
        empleado.setArea(area);
        notificarCambios();
    }
    
    public void eliminarEmpleadoDeArea(Area area, Empleado empleado){
        area.getListaEmpleado().remove(empleado);
        notificarCambios();
    }
    
    public void agregarEmpleadoAArea(Area area, Empleado empleado){
        area.getListaEmpleado().add(empleado);
        notificarCambios();
    }

    public ArrayList<Area> getListaAreas() {
        return listaAreas;
    }
    
    public void agregarArea(Area area) {
        this.listaAreas.add(area);
        notificarCambios();
    }
    
    public void eliminarArea(Area area) {
        this.listaAreas.remove(area);
        notificarCambios();
    }
    
    public void modificarDescripcionArea(Area area, String descripcion){
        area.setDescripcion(descripcion);
        notificarCambios();
    }
    
    public void modificarPresupuestoRestanteArea(Area area, int restante){
        area.setPresupuestoRestante(restante);
        notificarCambios();
    }

    public ArrayList<Manager> getListaManagers() {
        return listaManagers;
    }
    
    public void agregarManager(Manager manager) {
        this.listaManagers.add(manager);
        notificarCambios();
    }
    
    public void eliminarManager(Manager manager) {
        this.listaManagers.remove(manager);
        notificarCambios();
    }
    
    public void modificarTelefonoManager(Manager manager, String celular){
        manager.setCelular(celular);
        notificarCambios();
    }
    
    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }
    
    public void agregarMovimiento(Movimiento mov) {
        this.listaMovimientos.add(mov);
        notificarCambios();
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
