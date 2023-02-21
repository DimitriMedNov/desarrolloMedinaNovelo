package com.mayab.desarrollo.comportamiento.adapter;

public class Main {
    public static void main(String[] args) {
        // Crear una PersonaVieja
        PersonaVieja personaVieja = new PersonaVieja("Dimitri", "Medina Novelo", "28/01/2002");

        // Adaptar la PersonaVieja a la nueva interfaz
        IPersonaNueva personaNueva = new PersonaViejaAdapter(personaVieja);

        // Crear una PersonaNueva utilizando la nueva interfaz
        PersonaNueva personaNuevaFinal = new PersonaNueva(personaNueva.getNombre(), personaNueva.getEdad());

        // Utilizar los métodos de la nueva clase Persona
        String nombre = personaNuevaFinal.getNombre(); // Devuelve "Juan Pérez"
        int edad = personaNuevaFinal.getEdad(); // Devuelve la edad calculada a partir de la fecha de nacimiento

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
