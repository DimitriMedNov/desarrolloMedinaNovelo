package com.mayab.desarrollo.estructural.decorator;

class ServicioDeNetflix extends ServicioAdicional {
    public ServicioDeNetflix(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + ", servicio de Netflix";
    }

    @Override
    public double getPrecio() {
        return servicio.getPrecio() + 50.0;
    }
}