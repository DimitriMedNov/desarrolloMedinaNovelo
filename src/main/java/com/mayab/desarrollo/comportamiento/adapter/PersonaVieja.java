package com.mayab.desarrollo.comportamiento.adapter;

// Clase PersonaVieja
class PersonaVieja {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public PersonaVieja(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
}