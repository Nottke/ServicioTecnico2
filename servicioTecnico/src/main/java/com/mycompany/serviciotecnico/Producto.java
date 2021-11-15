package com.mycompany.serviciotecnico;

public abstract class Producto implements Reporte {
    private String id;
    private String nombre;
    private String stock;

   
    public Producto(String id,String nombre, String stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }   
    public Producto(){
        nombre = new String();
        stock = new String();
    }
    public void mostrarProducto(){                        //Uno de los métodos utilizados y sobreescrito por los hijos de producto
        System.out.println("El producto es:"+this.nombre);
    }
    
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
    @Override
    public String toString(){
        return "ID: "+getId()+" Nombre: "+getNombre()+" Stock: "+getStock();
    }
    void agregarProductoEnServicio(Producto producto1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
