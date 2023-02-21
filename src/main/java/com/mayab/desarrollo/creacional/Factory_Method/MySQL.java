package com.mayab.desarrollo.creacional.Factory_Method;

public class MySQL extends BD_Connect {
    @Override
    public void abrirCon() {
        System.out.println("Se abrio con mysql");
    }

    @Override
    public void cerrarCon() {
        System.out.println("Se cerro con mysql");
    }

    @Override
    public void ejecutarSentencia() {
        System.out.println("Sentencia Ejecutada con mysql");
    }

    @Override
    public void crearSentencia() {
        System.out.println("Sentencia Creada con mysql");
    }
}