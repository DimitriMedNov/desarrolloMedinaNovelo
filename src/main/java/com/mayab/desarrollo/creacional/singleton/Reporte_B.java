package com.mayab.desarrollo.creacional.singleton;

public class Reporte_B {
    //Lamo a la base de datos
    BD_Connect conexion = BD_Connect.getInstance();

    //Declaro tipo de atributo
    private String info;

    //Creo contructor
    public Reporte_B(String info){
        this.info = info;
    }

    //Creo un metodo que devuelve si esta conectado a la base de datos
    public void print(){
        System.out.println(this.info);
        conexion.getConnection();
    }
}
