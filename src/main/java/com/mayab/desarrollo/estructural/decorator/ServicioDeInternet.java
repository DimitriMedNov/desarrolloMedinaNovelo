package com.mayab.desarrollo.estructural.decorator;

class ServicioDeInternet extends ServicioAdicional {
    public ServicioDeInternet(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + ", servicio de internet";
    }

    @Override
    public double getPrecio() {
        return servicio.getPrecio() + 250.0;
    }
}