package com.maxalva.tareavirtual1;

/**
 * Created by max on 30/09/17.
 */

public class Destino {

    private String destino;
    private Double precio;
    private Double descuento;

    public Destino(){}

    public Destino(String destino, Double precio, Double descuento) {
        this.destino = destino;
        this.precio = precio;
        this.descuento = descuento;
    }


    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
}
