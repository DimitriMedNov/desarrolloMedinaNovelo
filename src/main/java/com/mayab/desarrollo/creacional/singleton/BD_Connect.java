package com.mayab.desarrollo.creacional.singleton;

public class BD_Connect {
    private static BD_Connect instance = new BD_Connect();
    private BD_Connect(){  }
    public static BD_Connect getInstance(){
        if (BD_Connect.instance == null){
            BD_Connect.instance = new BD_Connect();
        }
        return BD_Connect.instance;
    }
    public void getConnection(){
        System.out.println("Conectado\n");
    }
}
