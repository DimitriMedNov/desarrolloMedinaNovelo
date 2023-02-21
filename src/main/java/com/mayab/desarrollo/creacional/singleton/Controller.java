package com.mayab.desarrollo.creacional.singleton;

public class Controller {
    public static void main( String[] args )
    {
        Reporte_A ReporteA = new Reporte_A("Se ha hecho la conecxion con Reporte A");
        Reporte_B ReporteB = new Reporte_B("Se ha hecho la conecxion con Reporte B!");
        ReporteA.print();
        ReporteB.print();
    }
}
