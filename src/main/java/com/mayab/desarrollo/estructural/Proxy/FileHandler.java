package com.mayab.desarrollo.estructural.Proxy;

public interface FileHandler {
    public void read(String filename);
    public void write(String filename);
    public void delete(String filename);
}
/*Definir una interfaz común para los objetos reales y los proxies,
esta interfaz podría es una interfaz de manejo de archivos,
que incluya métodos para leer, escribir y borrar archivos.*/
