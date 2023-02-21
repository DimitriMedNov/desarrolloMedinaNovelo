package com.mayab.desarrollo.creacional.Factory_Method;

public class Reporte {
    private String nombre;
    private BD_create manejador;

    public Reporte (String nombre, BD_create manejador) {
        this.nombre = nombre;
        this.manejador = manejador;
    }

    public void verReporte(){
        manejador.consultarReporte(nombre);
    }

}
