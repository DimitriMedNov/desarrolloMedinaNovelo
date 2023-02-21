package com.mayab.desarrollo.creacional.Factory_Method;

public class Oracle extends BD_Connect {
    @Override
    public void abrirCon() {
        System.out.println("Se abrio con oracle");
    }

    @Override
    public void cerrarCon() {
        System.out.println("Se cerro con oracle");
    }

    @Override
    public void ejecutarSentencia() {
        System.out.println("Sentencia Ejecutada con oracle");
    }

    @Override
    public void crearSentencia() {
        System.out.println("Sentencia Creada con oracle");
    }
}
