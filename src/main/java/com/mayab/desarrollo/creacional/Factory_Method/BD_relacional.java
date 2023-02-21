package com.mayab.desarrollo.creacional.Factory_Method;

public class BD_relacional extends BD_create{
    public BD_relacional(String tipoBD){
        this.tipoBD = tipoBD;
    }

    @Override
    public BD_Connect createBD(String tipoBD) {
        BD_Connect DataBase = null;

        if(tipoBD == "oracle"){
            DataBase = new Oracle();
        } else if (tipoBD == "mysql") {
            DataBase = new MySQL();
        } else{
            System.out.println("BD no relacional");
        }
        return DataBase;
    }
}
