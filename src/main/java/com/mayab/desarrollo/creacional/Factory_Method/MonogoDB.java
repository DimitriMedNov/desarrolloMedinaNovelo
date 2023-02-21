package com.mayab.desarrollo.creacional.Factory_Method;

public class MonogoDB extends BD_Connect {
    @Override
    public void abrirCon() {
        System.out.println("Abierto con mongo db");
    }

    @Override
    public void cerrarCon() {
        System.out.println("Cerrado con mongo db");
    }

    @Override
    public void ejecutarSentencia() {
        System.out.println("Sentencia Ejecutada con mongo db");
    }

    @Override
    public void crearSentencia() {
        System.out.println("Sentencia Creada con mongo db");
    }
}
