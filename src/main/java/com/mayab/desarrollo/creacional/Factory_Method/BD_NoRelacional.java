package com.mayab.desarrollo.creacional.Factory_Method;

public class BD_NoRelacional extends BD_create {
    public BD_NoRelacional(String tipoBD){
        this.tipoBD = tipoBD;
    }
    @Override
    public BD_Connect createBD(String tipoBD) {
        BD_Connect DataBase = null;

        if(tipoBD == "mongo db"){
            DataBase = new MonogoDB();
        }else if(tipoBD == "couch db"){
            DataBase = new CouchDB();
        }else{
            System.out.println("BD relacional");
        }
        return DataBase;
    }
}
