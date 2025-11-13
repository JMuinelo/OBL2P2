package dominio;


public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private String curriculum; //probablemente descartable
    private int salario;
    private Manager manager;
    private Area area;
    private String celular;
    private String cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    public Empleado(String nombre, int salario, Manager manager, Area area, String celular, String cedula){
        this.setNombre(nombre);
        this.setSalario(salario);
        this.setManager(manager);
        this.setArea(area);
        this.setCelular(celular);
        this.setCedula(cedula);
    }
    public String toString(){
        return this.nombre;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.salario -o.salario;
    }
    
}
