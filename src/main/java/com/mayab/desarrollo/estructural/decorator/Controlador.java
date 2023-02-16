package com.mayab.desarrollo.estructural.decorator;

public class Controlador {
    public static void main(String []args) {

        Recibo recibo1 = new ReciboBase();
        System.out.println(recibo1.getDescription());
        System.out.println(recibo1.cost());

        recibo1 = new HBO(recibo1);
        System.out.println(recibo1.getDescription());
        System.out.println(recibo1.cost());

        recibo1 = new Netflix(recibo1);
        System.out.println(recibo1.getDescription());
        System.out.println(recibo1.cost());

        recibo1 = new Prime(recibo1);
        System.out.println(recibo1.getDescription());
        System.out.println(recibo1.cost());

        recibo1 = new internet(recibo1);
        System.out.println(recibo1.getDescription());
        System.out.println(recibo1.cost());

        recibo1 = new Disney(recibo1);
        System.out.println(recibo1.getDescription());
        System.out.println(recibo1.cost());

    }
}
