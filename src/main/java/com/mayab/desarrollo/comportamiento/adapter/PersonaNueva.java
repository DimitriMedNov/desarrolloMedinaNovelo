package com.mayab.desarrollo.comportamiento.adapter;

// Clase PersonaNueva
class PersonaNueva implements IPersonaNueva {
    private String nombre;
    private int edad;

    public PersonaNueva(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }
}