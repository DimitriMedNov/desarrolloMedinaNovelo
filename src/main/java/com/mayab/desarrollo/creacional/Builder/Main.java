package com.mayab.desarrollo.creacional.Builder;

public class Main {
    public static void main(String[] args) {
        Sala sala1 = new Sala.Builder()
                .withSofa4(true)
                .withMesaCentro(true)
                .withLampara(true)
                .build();

        Sala sala2 = new Sala.Builder()
                .withSofa3(true)
                .withSofa2(true)
                .withMesaLateral(true)
                .withLampara(true)
                .build();

        // Verificando los componentes de la sala1
        System.out.println("Sala 1:");
        System.out.println("Sofa 4: " + sala1.hasSofa4());
        System.out.println("Sofa 3: " + sala1.hasSofa3());
        System.out.println("Sofa 2: " + sala1.hasSofa2());
        System.out.println("Sofa 1: " + sala1.hasSofa1());
        System.out.println("Mesa Centro: " + sala1.hasMesaCentro());
        System.out.println("Mesa Lateral: " + sala1.hasMesaLateral());
        System.out.println("Lampara: " + sala1.hasLampara());

        // Verificando los componentes de la sala2
        System.out.println("Sala 2:");
        System.out.println("Sofa 4: " + sala2.hasSofa4());
        System.out.println("Sofa 3: " + sala2.hasSofa3());
        System.out.println("Sofa 2: " + sala2.hasSofa2());
        System.out.println("Sofa 1: " + sala2.hasSofa1());
        System.out.println("Mesa Centro: " + sala2.hasMesaCentro());
        System.out.println("Mesa Lateral: " + sala2.hasMesaLateral());
        System.out.println("Lampara: " + sala2.hasLampara());
    }
}

