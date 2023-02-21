package com.mayab.desarrollo.comportamiento.Template;

import java.util.List;
import java.util.ArrayList;


public class ClientesExcel extends ClientesTemplate {

    @Override
    protected boolean validarArchivo(String archivo) {
        return archivo.endsWith(".xls") || archivo.endsWith(".xlsx");
    }

    @Override
    protected void abrirArchivo(String archivo) {
        System.out.println("Abriendo archivo Excel " + archivo);
    }

    @Override
    protected List<Cliente> leerClientes() {
        List<Cliente> clientes = new ArrayList<>();
        // Aquí iría el código para leer los clientes del archivo Excel
        clientes.add(new Cliente("Juan", "123456789", "juan@gmail.com"));
        clientes.add(new Cliente("María", "987654321", "maria@gmail.com"));
        return clientes;
    }
}