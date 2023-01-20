package com.mayab.desarrollo.creacional.singleton;

public class Reporte_A {
    //Lamo a la base de datos
    BD_Connect conexion = BD_Connect.getInstance();

    //Declaro tipo de atributo
    private final String info;

    //Creo contructor
    public Reporte_A(String info){
        this.info = info;
    }

    //Creo un metodo que devuelve si esta conectado a la base de datos
    public void print(){
        System.out.println(this.info);
        conexion.getConnection();
    }
}
