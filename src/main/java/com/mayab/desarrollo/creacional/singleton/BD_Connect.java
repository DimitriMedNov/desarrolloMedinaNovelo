package com.mayab.desarrollo.creacional.singleton;

public class BD_Connect {
    //Singleton start //Nunca cambia
    private static BD_Connect instance = new BD_Connect();
    private BD_Connect(){  }
    public static BD_Connect getInstance(){
        if (BD_Connect.instance == null){
            BD_Connect.instance = new BD_Connect();
        }
        return BD_Connect.instance;
    }
    //Singleton end

    //Metodo para tener la conecxion
    public void getConnection(){
        System.out.println("Ya se conecto\n");
    }

}
