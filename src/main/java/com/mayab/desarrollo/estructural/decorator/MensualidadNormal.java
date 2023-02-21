package com.mayab.desarrollo.estructural.decorator;

class MensualidadNormal implements Servicio {
    @Override
    public String getDescripcion() {
        return "Mensualidad normal (incluye renta del teléfono)";
    }

    @Override
    public double getPrecio() {
        return 200.0;
    }
}
