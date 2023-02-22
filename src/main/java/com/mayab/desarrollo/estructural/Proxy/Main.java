package com.mayab.desarrollo.estructural.Proxy;

public class Main {
    public static void main(String[] args) {
        // crear una instancia de un objeto real que implementa la interfaz FileHandler
        FileHandler realHandler = new RealFileHandler();

        // crear una instancia de un objeto proxy que implementa la misma interfaz que el objeto real
        // y que recibe el objeto real en su constructor
        FileHandler secureHandler = new SecureFileHandlerProxy(realHandler);

        // usar el objeto proxy para llamar a los métodos de la interfaz FileHandler
        secureHandler.write("documento.txt");
        secureHandler.read("documento.txt");
        secureHandler.delete("documento.txt");
    }
}

/*En esta clase, el programa primero crea una instancia del objeto real RealFileHandler, que implementa la interfaz FileHandler.
Luego, crea una instancia del objeto proxy SecureFileHandlerProxy, que implementa la misma interfaz y recibe el objeto real en su constructor.*/

/*Finalmente, el programa usa el objeto proxy SecureFileHandlerProxy para llamar a los métodos write, read y delete de la interfaz FileHandler,
lo que garantiza que se cumplen las restricciones de seguridad definidas en el proxy.*/