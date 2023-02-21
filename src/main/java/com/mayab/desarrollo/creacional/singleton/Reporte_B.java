package com.mayab.desarrollo.creacional.singleton;

public class Reporte_B {
    BD_Connect conexion = BD_Connect.getInstance();
    private String info;
    public Reporte_B(String info){
        this.info = info;
    }
    public void print(){
        System.out.println(this.info);
        conexion.getConnection();
    }
}
