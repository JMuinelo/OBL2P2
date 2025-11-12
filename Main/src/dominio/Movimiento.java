
package dominio;


public class Movimiento implements Comparable<Movimiento>{
    private int mes;
    private String areaOrigen;
    private String areaDestino;
    private String nombreEmpleado;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getAreaOrigen() {
        return areaOrigen;
    }

    public void setAreaOrigen(String areaOrigen) {
        this.areaOrigen = areaOrigen;
    }

    public String getAreaDestino() {
        return areaDestino;
    }

    public void setAreaDestino(String areaDestino) {
        this.areaDestino = areaDestino;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Movimiento(int mes, String areaOrigen, String areaDestino, String nombreEmpleado) {
        this.mes = mes;
        this.areaOrigen = areaOrigen;
        this.areaDestino = areaDestino;
        this.nombreEmpleado = nombreEmpleado;
    }
    
    

    @Override
    public int compareTo(Movimiento mov) {
        return this.getMes()-mov.getMes();
    }
    
    
}
