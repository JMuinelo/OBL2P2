package grabarLeer;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class ArchivoLectura {
    private Scanner in;
    private String linea;
    
    public ArchivoLectura(String nombre){
        try {
            in = new Scanner(Paths.get(nombre));
        }
        catch(IOException e){
            System.out.println("No se pudo abrir el archivo");
        }
    }
    public boolean hayMasLineas(){
        boolean hay = false;
        linea = null;
        if (in.hasNext()){
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }
    public String linea(){
        return linea;
    }
    public void cerrar(){
        in.close();
    }
}


