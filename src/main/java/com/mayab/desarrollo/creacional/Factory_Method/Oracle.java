package com.mayab.desarrollo.creacional.Factory_Method;

public class Oracle extends BD_Connect {
    @Override
    public void abrirCon() {
        System.out.println("Se abrio con Oracle");
    }

    @Override
    public void cerrarCon() {
        System.out.println("Se cerro con Oracle");
    }

    @Override
    public void ejecutarSentencia() {
        System.out.println("La sentencia se ejecuto con oracle");
    }

    @Override
    public void crearSentencia() {
        System.out.println("Se creo la sentencia con Oracle");
    }
}
