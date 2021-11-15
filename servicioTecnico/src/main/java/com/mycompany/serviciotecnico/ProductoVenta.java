package com.mycompany.serviciotecnico;

public class ProductoVenta extends Producto {
    private String precio;

    public ProductoVenta(String id,String nombre,String precio, String stock){
        super(id,nombre,stock);
        this.precio = precio;
    }
    public ProductoVenta(){  
    }
    @Override
    public void mostrarProducto(){
        System.out.println("El producto "+getNombre()+", código: "+getId()+" tiene un precio de $"+this.precio+" y quedan "+getStock()+" disponibles.");
    }
    
    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    @Override
    public String getInfoReporte(){
        return ("Producto: "+getNombre()+"- Precio: $"+this.precio);
    }
}
