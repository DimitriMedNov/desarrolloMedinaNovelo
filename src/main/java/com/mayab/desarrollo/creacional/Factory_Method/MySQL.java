package com.mayab.desarrollo.creacional.Factory_Method;

public class MySQL extends BD_Connect {
    @Override
    public void abrirCon() {
        System.out.println("Se abrio con MySQL");
    }

    @Override
    public void cerrarCon() {
        System.out.println("Se cerro con MySQL");
    }

    @Override
    public void ejecutarSentencia() {
        System.out.println("La sentencia se ejecuto con MySQL");
    }

    @Override
    public void crearSentencia() {
        System.out.println("Se creo la sentencia con MySQL");
    }
}