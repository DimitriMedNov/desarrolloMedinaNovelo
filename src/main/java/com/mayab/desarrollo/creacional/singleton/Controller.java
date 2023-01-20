package com.mayab.desarrollo.creacional.singleton;

public class Controller {
    public static void main( String[] args )
    {
        //Instancie los objetos de las clases Reportes A/B
        Reporte_A ReporteA = new Reporte_A("Se ha realizado la conecxion com el Reporte A, satisfactoriamente!");
        Reporte_B ReporteB = new Reporte_B("Se ha realizado la conecxion com el Reporte B, satisfactoriamente!");

        //LLamo a los metodos Print de los Reportes A/B
        ReporteA.print();
        ReporteB.print();
    }
}
