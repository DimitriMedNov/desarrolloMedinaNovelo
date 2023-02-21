package com.mayab.desarrollo.estructural.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        // Creamos una mensualidad normal
        Servicio mensualidad = new MensualidadNormal();
        System.out.println("Mensualidad normal: " + mensualidad.getDescripcion() + ", precio: $" + mensualidad.getPrecio());

        // Agregamos el servicio de internet
        mensualidad = new ServicioDeInternet(mensualidad);
        System.out.println("Mensualidad con internet: " + mensualidad.getDescripcion() + ", precio: $" + mensualidad.getPrecio());

        // Agregamos el servicio de Netflix
        mensualidad = new ServicioDeNetflix(mensualidad);
        System.out.println("Mensualidad con internet y Netflix: " + mensualidad.getDescripcion() + ", precio: $" + mensualidad.getPrecio());

        // Agregamos el servicio de Prime
        mensualidad = new ServicioDePrime(mensualidad);
        System.out.println("Mensualidad con internet, Netflix y Prime: " + mensualidad.getDescripcion() + ", precio: $" + mensualidad.getPrecio());

        // Agregamos el servicio de Disney
        mensualidad = new ServicioDeDisney(mensualidad);
        System.out.println("Mensualidad con internet, Netflix, Prime y Disney: " + mensualidad.getDescripcion() + ", precio: $" + mensualidad.getPrecio());

        // Agregamos el servicio de HBO
        mensualidad = new ServicioDeHBO(mensualidad);
        System.out.println("Mensualidad con internet, Netflix, Prime, Disney y HBO: " + mensualidad.getDescripcion() + ", precio: $" + mensualidad.getPrecio());

        // Eliminamos el servicio de internet
        mensualidad = new MensualidadNormal();
        System.out.println("Mensualidad normal (sin internet): " + mensualidad.getDescripcion() + ", precio: $" + mensualidad.getPrecio());

        // Agregamos el servicio de Disney y HBO
        mensualidad = new ServicioDeDisney(new ServicioDeHBO(mensualidad));
        System.out.println("Mensualidad sin internet, con Disney y HBO: " + mensualidad.getDescripcion() + ", precio: $" + mensualidad.getPrecio());
    }
}
