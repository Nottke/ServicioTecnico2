package com.mycompany.serviciotecnico;

import java.util.ArrayList;

public class Orden {
    private String idOrden /*= "0"*/;
    private String rut;
    private String servicio;
    private String fecha;
    private String precio;
    private ArrayList<Servicio> listaServicios;
    

    public Orden(String idOrden, String rut, String servicio, String fecha, String precio) {
        /*int auxiliar;
        auxiliar = Integer.parseInt(numOrden)+1;
        numOrden = Integer.toString(auxiliar);*/
        this.idOrden = idOrden;
        this.rut = rut;
        this.servicio = servicio;
        this.fecha = fecha;
        this.precio = precio;
        this.listaServicios = new ArrayList<>();      
    }
    
    public void mostrarOrden(){
        System.out.println("La orden "+this.idOrden+" del cliente"+this.rut+" solicita el servicio :"+this.precio+". A la fecha :"+this.fecha+". por un precio $"+this.precio+".");
    }
    public void agregarServicio(Servicio s){
        this.listaServicios.add(s);
        System.out.println("Servicio agregado");
    }
    public void mostrarServicios(){
        for(int i = 0; i<this.listaServicios.size(); i++){
            this.listaServicios.get(i).mostrarServicio();
        }
    }

    /**
     *
     * @param nombre
     */
    public void mostrarServicios(String nombre){                            //para la busqueda
        for(int i = 0; i<this.listaServicios.size(); i++){
            if (this.listaServicios.get(i).getNombre().equals(nombre)){
                this.listaServicios.get(i).mostrarServicio();
            }
        }
    }
    public void buscarServicio(String nombre){
        this.listaServicios.forEach(
        (b) -> {
            if (b.getNombre().equals(nombre)){
                b.mostrarServicio();
            /*}else
            {
                System.out.println("pase por aqui");¨*/
            }              
        });
    }
    
    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(ArrayList<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    
    
}