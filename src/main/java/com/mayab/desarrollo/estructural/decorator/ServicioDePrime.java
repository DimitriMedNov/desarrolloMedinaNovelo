package com.mayab.desarrollo.estructural.decorator;

class ServicioDePrime extends ServicioAdicional {
    public ServicioDePrime(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + ", servicio de Prime";
    }

    @Override
    public double getPrecio() {
        return servicio.getPrecio() + 50.0;
    }
}
