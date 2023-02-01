package com.mayab.desarrollo.creacional.Factory_Method;

public class CouchDB extends BD_Connect {
    @Override
    public void abrirCon() {
        System.out.println("Se abrio con CouchDB");
    }

    @Override
    public void cerrarCon() {
        System.out.println("Se cerro con CouchDB");
    }

    @Override
    public void ejecutarSentencia() {
        System.out.println("La sentencia se ejecuto con CouchDB");
    }

    @Override
    public void crearSentencia() {
        System.out.println("Se creo la sentencia con CouchDB");
    }
}
