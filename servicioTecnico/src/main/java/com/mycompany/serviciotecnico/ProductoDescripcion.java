package com.mycompany.serviciotecnico;

public class ProductoDescripcion extends Producto {
    private String tipo;
    private String descripcion;
    
    public ProductoDescripcion(String id,String nombre, String stock, String tipo, String descripcion){
        super(id,nombre,stock);
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    
    @Override
    public void mostrarProducto(){
        System.out.println("El producto "+getNombre()+" se clasifica como un "+this.tipo+" y se le asocia la siguiente informacion: "+this.descripcion);
    }

    @Override
    public String getInfoReporte(){
        return ("Producto:"+getNombre()+"-Stock:"+getStock()+"-Tipo:"+this.tipo+"-Descripcion:"+this.descripcion);
    }
}
