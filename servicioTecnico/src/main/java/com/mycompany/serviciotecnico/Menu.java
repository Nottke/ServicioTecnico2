package com.mycompany.serviciotecnico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Menu {   
    public void metodMenu(int opcion){
        Scanner input = new Scanner(System.in);
        Map<Integer,Producto> mapaProductos = new HashMap();
        Map<Integer,Servicio> mapaServicios = new HashMap();
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();//Creating arraylist  
        ArrayList<Servicio> listaServicios = new ArrayList<Servicio>();
        Servicio serviciosPrueba = new Servicio("",""); // Creacion pequeña base datos de productos (de pruebas)
        //Producto productosPrueba;
        for (int i = 0; i<50; i++){
            String nombre = String.format("Producto%s", i);
            Random randomI = new Random();
            int priceI;
            priceI = (randomI.nextInt(100)+50)*1000;
            String precio = Integer.toString(priceI);
            String stock = Integer.toString(i);
            String id = Integer.toString(i);
            //productosPrueba = new ProductoVenta(id,nombre,precio,stock);
            //serviciosPrueba.agregarProducto(productosPrueba);
            //mapaProductos.put(i,productosPrueba);
        }
        //
        Orden ordenPruebas = new Orden("Id","Rut"," Servicio","Fecha","Precio"); // Creacion pequeña base de datos de servicios (de pruebas)
        Servicio ordenServicios;
        for (int z = 0; z <50; z++){
            String nombre = String.format("Servicio%s", z);
            Random randomZ = new Random();
            int priceZ;
            priceZ = (randomZ.nextInt(100)+50)*10000;
            String precio = Integer.toString(priceZ);
            ordenServicios = new Servicio(nombre,precio);
            ordenPruebas.agregarServicio(ordenServicios);
            mapaServicios.put(z, serviciosPrueba);
        }
        //
        
        boolean exiting = false;
        while(!exiting){
            System.out.println("1. Agregar producto  .- ");
            System.out.println("2. Buscar producto   .- ");
            System.out.println("3. Mostrar productos .- ");
            System.out.println("4. Agregar servicio  .- ");
            System.out.println("5. Buscar servicio   .- ");
            System.out.println("6. Mostrar servicios .- ");
            System.out.println("7. Finalizar programa.  ");
            try {
                System.out.println("Elige una opción");
                String option = input.nextLine();
                opcion = Integer.parseInt(option);
                switch(opcion){
                    case 1: //agregar servicio
                        System.out.println("Ingrese datos del producto: ");
                        input.nextLine();
                        String[] datos = input.nextLine().split("&");
                        ProductoVenta producto;
                        producto = new ProductoVenta(datos[0],datos[1],datos[2],datos[3]);
                        
                        int numServicio = 0;
                        String nombreServicio = "";
                        
                        if (listaServicios.isEmpty()){
                            numServicio = 0;
                            System.out.println("Ingrese nombre del servicio :");
                            nombreServicio = input.nextLine();                          
                        }else{
                            for (int i = 0; i < listaServicios.size(); i++){
                                System.out.println( i + "->" + listaServicios.get(i).getNombre());
                            }
                            System.out.println(listaServicios.size()+ "-> Disponible ");
                            System.out.println("Seleccione el numero del servicio :");
                            numServicio = input.nextInt();
                            if(numServicio >= listaServicios.size()){
                                System.out.println("Ingrese nombre del servicio: ");
                                input.nextLine();
                                nombreServicio = input.nextLine();
                            }                                                    
                        }
                        //agregarProducto(numServicio, nombreServicio, producto);
                        break;
                    case 2:
                        System.out.println("Agregar nombre del producto a buscar : ");
                        String nombre = input.nextLine();
                        serviciosPrueba.buscarProducto(nombre);
                        break;

                    case 3:
                        System.out.println("Aquí se muestran los productos guardados : ");
                        serviciosPrueba.mostrarProductos();
                        break;  
                    case 4:
                        System.out.println("Agregar nombre del servicio: ");
                        String nombre2 = input.nextLine();
                        System.out.println("Agregar precio del servicio: ");
                        String precio2 = input.nextLine();
                        ordenPruebas.agregarServicio(new Servicio(nombre2,precio2));
                        break;
                    case 5:
                        System.out.println("Agregar nombre del servicio a buscar : ");
                        nombre2 = input.nextLine();
                        ordenPruebas.buscarServicio(nombre2);
                        break;
                    case 6:
                        System.out.println("Aquí se muestran los servicios guardados : ");
                        ordenPruebas.mostrarServicios();
                        break;
                    case 7:
                        System.out.println("Finaliza el programa ");
                        return;
                    default:
                        System.out.println("Sólo numeros entre 1 y 7 ");
                    }
                }
            catch (InputMismatchException e){
                System.out.println("Debes insertar un número ");
                input.next();              
            }
        }
    }
    /*public static void agregarProducto (int numServicio, String nombreServicio, Producto producto1){
        if (numServicio < listaServicios.size()){
            listaServicios.get(numServicio).agregarProductoEnServicio(producto1);
        }else{
            Servicio servicio1 = new Servicio(nombre);
            servicio1.agregarProductoEnServicio(producto1);
            listaServicios.add(servicio1);
        }
        System.out.println(listaServicios);
        for (int i = 0; i < listaServicios.size(); i++){
            System.out.println(listaServicios.get(i));;
        }
    }*/
}

