
package dominio;


public class Manager {
    private String nombre;
    private String cedula;
    private String celular;
    private int antiguedad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public Manager(String nombre, String cedula, String celular, int antiguedad){
        this.setNombre( nombre);
        this.setCedula(cedula);
        this.setCelular(celular);
        this.setAntiguedad((antiguedad));
    }
}
