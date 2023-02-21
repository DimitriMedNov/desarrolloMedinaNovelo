package com.mayab.desarrollo.comportamiento.Template;

public class Main {

    public static void main(String[] args) {
        ClientesTemplate procesador;
        String archivo = "clientes.xls";
        if (archivo.endsWith(".xls") || archivo.endsWith(".xlsx")) {
            procesador = new ClientesExcel();
        } else if
        (archivo.endsWith(".json")) {
            procesador = new ClientesJson();
        } else {
            procesador = null;
            System.out.println("Formato de archivo no soportado");
        }

        if (procesador != null) {
            procesador.procesarClientes(archivo);
        }
    }
}
