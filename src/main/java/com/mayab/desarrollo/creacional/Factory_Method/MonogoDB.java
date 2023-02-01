package com.mayab.desarrollo.creacional.Factory_Method;

public class MonogoDB extends BD_Connect {
    @Override
    public void abrirCon() {
        System.out.println("Se abrio con MonogoDB");
    }

    @Override
    public void cerrarCon() {
        System.out.println("Se cerro con MonogoDB");
    }

    @Override
    public void ejecutarSentencia() {
        System.out.println("La sentencia se ejecuto con MonogoDB");
    }

    @Override
    public void crearSentencia() {
        System.out.println("Se creo la sentencia con MonogoDB");
    }
}
