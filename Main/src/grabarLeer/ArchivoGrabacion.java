package grabarLeer;

import java.io.*;
import java.util.*;

public class ArchivoGrabacion {
    private Formatter out;
    public ArchivoGrabacion(String nombre){
        try {
            out = new Formatter(nombre);
        }
        catch(FileNotFoundException e){
            System.out.println("Error al crear el archivo");
        }
    }
    public ArchivoGrabacion(String nombre, boolean extender){
        try {
            FileWriter f = new FileWriter(nombre, extender);
            out = new Formatter(f);
        }
        catch(IOException e){
            System.out.println("Error al crear el archivo");
        }
    }
    public void grabarLinea(String linea){
        out.format("%s%n", linea);
    }
    public void cerrar(){
        out.close();
    }
}

