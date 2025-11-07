
package dominio;

import java.util.ArrayList;


public class Area {
    private String nombre;
    private String descripcion;
    private int presupuestoAnual;
    private int presupuestoRestante;
    private ArrayList<Empleado> listaEmpleados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(int presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public int getPresupuestoRestante() {
        return presupuestoRestante;
    }

    public void setPresupuestoRestante(int presupuestoRestante) {
        this.presupuestoRestante = presupuestoRestante;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleados;
    }

    public void agregarEmpleadoAlArea(Empleado empleado){
        this.getListaEmpleado().add(empleado);
        this.setPresupuestoRestante(this.getPresupuestoRestante() - 12 * empleado.getSalario());
    }
    
    public Area(String nombre, String descripcion, int presupuesto){
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPresupuestoAnual(presupuesto);
        this.setPresupuestoRestante(presupuesto);
        this.listaEmpleados = new ArrayList<Empleado>();
    }
    
    public String toString(){
        return this.nombre + " (" + this.presupuestoAnual + ") ";
    }
}
