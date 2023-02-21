package com.mayab.desarrollo.comportamiento.Template;
import java.util.List;
import java.util.ArrayList;

public class ClientesJson extends ClientesTemplate {

    @Override
    protected boolean validarArchivo(String archivo) {
        return archivo.endsWith(".json");
    }

    @Override
    protected void abrirArchivo(String archivo) {
        System.out.println("Abriendo archivo JSON " + archivo);
    }

    @Override
    protected List<Cliente> leerClientes() {
        List<Cliente> clientes = new ArrayList<>();
        // Aquí iría el código para leer los clientes del archivo JSON
        clientes.add(new Cliente("Pedro", "111222333", "pedro@gmail.com"));
        clientes.add(new Cliente("Laura", "444555666", "laura@gmail.com"));
        return clientes;
    }
}