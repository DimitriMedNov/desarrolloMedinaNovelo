package com.mayab.desarrollo.creacional.Factory_Method;


public abstract class BD_Connect {
    public abstract void abrirCon();
    public abstract void cerrarCon();
    public abstract void ejecutarSentencia();
    public abstract void crearSentencia();
}
