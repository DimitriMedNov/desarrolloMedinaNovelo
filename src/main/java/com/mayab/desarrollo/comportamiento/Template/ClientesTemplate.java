package com.mayab.desarrollo.comportamiento.Template;
import java.util.List;

public abstract class ClientesTemplate {

    public final void procesarClientes(String archivo) {
        if (validarArchivo(archivo)) {
            abrirArchivo(archivo);
            List<Cliente> clientes = leerClientes();
            guardarClientes(clientes);
        } else {
            System.out.println("El archivo no es válido");
        }
    }

    protected abstract boolean validarArchivo(String archivo);

    protected abstract void abrirArchivo(String archivo);

    protected abstract List<Cliente> leerClientes();

    protected void guardarClientes(List<Cliente> clientes) {
        // Aquí iría el código para guardar los clientes en la base de datos
        System.out.println("Guardando " + clientes.size() + " clientes en la base de datos");
    }
}

