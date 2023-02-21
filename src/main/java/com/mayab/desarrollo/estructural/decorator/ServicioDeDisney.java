package com.mayab.desarrollo.estructural.decorator;

class ServicioDeDisney extends ServicioAdicional {
    public ServicioDeDisney(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + ", servicio de Disney";
    }

    @Override
    public double getPrecio() {
        return servicio.getPrecio() + 100.0;
    }
}