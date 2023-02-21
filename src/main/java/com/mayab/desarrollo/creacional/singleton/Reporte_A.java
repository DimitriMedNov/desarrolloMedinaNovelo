package com.mayab.desarrollo.creacional.singleton;

public class Reporte_A {
    BD_Connect conexion = BD_Connect.getInstance();
    private String info;
    public Reporte_A(String info){
        this.info = info;
    }
    public void print(){
        System.out.println(this.info);
        conexion.getConnection();
    }
}
