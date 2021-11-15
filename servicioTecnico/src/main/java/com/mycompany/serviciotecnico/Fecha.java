package com.mycompany.serviciotecnico;

import java.util.ArrayList;

public class Fecha {
    private String fecha;
    private String cargaTrabajo; //considerar que lo máximo de carga de trabajo para una fecha son 4
    private boolean reservaDisponible = true;
    private ArrayList<Orden> listaOrdenes;
    
    public Fecha(String fecha, String cargaTrabajo, boolean reservaDisponible){
        this.fecha = fecha;
        this.cargaTrabajo = cargaTrabajo;
        this.reservaDisponible = reservaDisponible;
        this.listaOrdenes = new ArrayList<>();
    }

    public void mostrarFecha(){
        System.out.println("La fecha correspondiente a : "+this.fecha);
        if("0".equals(this.cargaTrabajo) || "1".equals(this.cargaTrabajo) || "2".equals(this.cargaTrabajo) || "3".equals(this.cargaTrabajo)){
            reservaDisponible = true;
        }else if("4".equals(this.fecha)){
            reservaDisponible = false;
        }else{
            reservaDisponible = false;
            System.out.println("tiene una carga de trabajo incompatible, favor de revisar su ingreso.");
        }
        if (reservaDisponible = true){
            System.out.println(" tiene una carga de trabajo "+this.cargaTrabajo+".");
        }
    }
    public void agregarOrden(Orden o){
        this.listaOrdenes.add(o);
        System.out.println("Orden agregada.");
    }
    public void mostrarOrdenes(){
        for(int i = 0; i<this.listaOrdenes.size(); i++){
            this.listaOrdenes.get(i).mostrarOrden();
        }
    }
    public void mostrarOrdenes(String idOrden){
        for(int i = 0; i<this.listaOrdenes.size(); i++){
            if (this.listaOrdenes.get(i).getIdOrden().equals(idOrden)){
                this.listaOrdenes.get(i).mostrarOrden();
            }        
        }
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCargaTrabajo() {
        return cargaTrabajo;
    }

    public void setCargaTrabajo(String cargaTrabajo) {
        this.cargaTrabajo = cargaTrabajo;
    }

    public boolean isReservaDisponible() {
        return reservaDisponible;
    }

    public void setReservaDisponible(boolean reservaDisponible) {
        this.reservaDisponible = reservaDisponible;
    }

    public ArrayList<Orden> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(ArrayList<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }
    
}
