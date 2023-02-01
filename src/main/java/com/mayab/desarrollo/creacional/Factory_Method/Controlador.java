package com.mayab.desarrollo.creacional.Factory_Method;

public class Controlador {
    public static void main(String[] args) {
        BD_create manejador = new BD_relacional("oracle");

        Reporte reporte = new Reporte("REPORTE A", manejador);
        reporte.verReporte();
    }
}
