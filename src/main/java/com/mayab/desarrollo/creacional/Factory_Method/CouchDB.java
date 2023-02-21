package com.mayab.desarrollo.creacional.Factory_Method;

public class CouchDB extends BD_Connect {
    @Override
    public void abrirCon() {
        System.out.println("Abierto con couch db");
    }

    @Override
    public void cerrarCon() {
        System.out.println("Cerrado con couch db");
    }

    @Override
    public void ejecutarSentencia() {
        System.out.println("Sentencia Ejecutada con couch db");
    }

    @Override
    public void crearSentencia() {
        System.out.println("Sentencia Creada con couch db");
    }
}
