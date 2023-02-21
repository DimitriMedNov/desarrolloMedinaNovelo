package com.mayab.desarrollo.comportamiento.Template;

public class Cliente {
    private String nombre;
    private String telefono;
    private String correoElectronico;

    public Cliente(String nombre, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // Otros métodos que puedan ser necesarios para interactuar con un objeto cliente
}
