package com.mayab.desarrollo.estructural.decorator;

abstract class ServicioAdicional implements Servicio {
    protected Servicio servicio;

    public ServicioAdicional(Servicio servicio) {
        this.servicio = servicio;
    }
}

