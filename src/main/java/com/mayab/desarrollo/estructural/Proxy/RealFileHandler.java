package com.mayab.desarrollo.estructural.Proxy;

public class RealFileHandler implements FileHandler {
    @Override
    public void write(String filename) {
        System.out.println("Escribiendo archivo " + filename);
    }

    @Override
    public void read(String filename) {
        System.out.println("Leyendo archivo " + filename);
    }

    @Override
    public void delete(String filename) {
        System.out.println("Borrando archivo " + filename);
    }
}
/*Esta clase implementa la interfaz FileHandler y proporciona la implementación real de los métodos write, read y delete.*/