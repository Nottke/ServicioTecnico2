package com.mycompany.serviciotecnico;

import java.util.ArrayList;

public class Servicio {
    private String nombre;                              
    private String precio;
    private ArrayList<Producto> listaProductos;
    private static ArrayList<Servicio> listaServicios = new ArrayList(); 
    public Servicio(String nombre, String precio) {      
        this.nombre = nombre;
        this.precio = precio;
        this.listaProductos = new ArrayList();
    }
    public Servicio(String nombreServicio){
        this.nombre = nombreServicio;
    }
    
    public void mostrarServicio(){
        System.out.println("El servicio "+this.nombre+" tiene un costo de $ "+this.precio+".");
    }
    public void agregarProductoEnServicio (Producto producto1){             //Se agregan productos a listaProductos a través del teclado por el usuario
        this.listaProductos.add(producto1);
        System.out.println("Producto agregado.");
    }
    public void mostrarProductos(){
        for (int i = 0; i < listaProductos.size(); i++){
            System.out.println(listaProductos.get(i));
        }
    }
    public void agregarProducto (int numServicio, String nombreServicio, Producto producto1){
        if (numServicio < listaServicios.size()){
            listaServicios.get(numServicio).agregarProductoEnServicio(producto1);
        }else{
            Servicio servicio1 = new Servicio(nombre);
            servicio1.agregarProductoEnServicio(producto1);
            listaServicios.add(servicio1);
        }
        System.out.println(listaServicios);
        for (int i = 0; i < listaServicios.size(); i++){
            listaServicios.get(i).mostrarProductos();
        }
    }
    /*public void mostrarProductos(){                      //Método llamado por el menú para mostrar los productos guardados en una lista
        for(int i = 0; i<this.listaProductos.size();i++){
            this.listaProductos.get(i).mostrarProducto();
        }
    }*/
    public void mostrarProductos(String nombre){           
        for(int i = 0; i<this.listaProductos.size();i++){
            if (this.listaProductos.get(i).getNombre().equals(nombre)){
                this.listaProductos.get(i).mostrarProducto();
            }
        }
    }
    
    public void buscarProducto(String nombre){
        this.listaProductos.forEach(
        (b) -> {
            if (b.getNombre().equals(nombre)){
                b.mostrarProducto();
            /*}else
            {
                System.out.println("pase por aqui");¨*/
            }              
        });
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public String toString(){
        return "Nombre Servicio "+getNombre();
    }

    void agregarProducto(Producto productosPrueba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

