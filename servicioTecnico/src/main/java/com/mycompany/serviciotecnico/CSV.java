package com.mycompany.serviciotecnico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSV {
    /*public static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File("C:\\Users\\sebas\\Documents\\NetBeansProjects\\servicioTecnico\\src\\main\\resources\\Productos.txt");
        Producto listaProductos = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            String st;
            while((st = entrada.readLine())!= null){
                String[] newString = st.split("\\s+");
                for (String ss: newString){
                    String id = listaProductos.getId();
                    String nombre = listaProductos.getNombre();
                    listaProductos.getNombre();
                    
                    System.out.println(ss);
                }
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }*/
}
