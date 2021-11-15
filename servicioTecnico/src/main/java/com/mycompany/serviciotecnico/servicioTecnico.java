package com.mycompany.serviciotecnico;

//import java.util.HashMap;

import java.io.FileNotFoundException;
import java.util.ArrayList;

//import java.util.Map;

/**
 * 
 * @author sebas
 */

public class servicioTecnico {
    private static ArrayList<Servicio> servicios = new ArrayList();
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("|||||| Bienvenido al Servicio Tecnico ||||||");
        System.out.println("Seleccione alguna opción porfavor :");
        CSV csv = new CSV();
        //csv.leerArchivo("Productos.txt");
        Menu m = new Menu (); //Da inicio al programa mostrando un menú
        m.metodMenu(1);
        System.out.println("He compilado sin problemas, finalización del programa normal.");
    }
}
