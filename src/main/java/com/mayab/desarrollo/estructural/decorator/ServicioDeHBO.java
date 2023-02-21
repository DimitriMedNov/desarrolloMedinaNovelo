package com.mayab.desarrollo.estructural.decorator;

class ServicioDeHBO extends ServicioAdicional {
    public ServicioDeHBO(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + ", servicio de HBO";
    }

    @Override
    public double getPrecio() {
        return servicio.getPrecio() + 100.0;
    }
}