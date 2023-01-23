package com.mayab.desarrollo.creacional.singleton;

public class Controller {
    public static void main( String[] args )
    {
        //Instancie los objetos de las clases Reportes A/B
        Reporte_A ReporteA = new Reporte_A("Se realizo la conecxion com el Reporte A, satisfactoriamente!");
        Reporte_B ReporteB = new Reporte_B("Se realizo la conecxion com el Reporte B, satisfactoriamente!");

        //LLamo a los metodos Print de los Reportes A y B
        ReporteA.print();
        ReporteB.print();
    }
}
