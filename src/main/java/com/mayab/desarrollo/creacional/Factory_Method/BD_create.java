package com.mayab.desarrollo.creacional.Factory_Method;

public abstract class BD_create {
    public String tipoBD;

    public abstract BD_Connect createBD(String tipoBD);

    public BD_Connect consultarReporte(String Reporte) {
        BD_Connect DataBase = createBD(tipoBD);
        DataBase.abrirCon();
        DataBase.cerrarCon();
        DataBase.ejecutarSentencia();
        DataBase.crearSentencia();
        return DataBase;

    }
}
