package com.mayab.desarrollo.estructural.Proxy;
import java.lang.String;
public class SecureFileHandlerProxy implements FileHandler {
    private FileHandler realHandler;

    public SecureFileHandlerProxy(FileHandler realHandler) {
        this.realHandler = realHandler;
    }

    // implementar los métodos de la interfaz
    public void read(String filename) {
        realHandler.read(filename);
    }

    public void write(String filename) {
        realHandler.write(filename);
    }

    public void delete(String filename) {
        // no permitir borrar archivos a menos que el usuario sea superusuario
        UserManager userManager = new UserManager(false);
        String currentUser = "Juan";
        if (UserManager.getCurrentUser("Juan") != null && UserManager.getCurrentUser("Juan").isSuperUser()) {
            realHandler.delete(filename);
        } else {
            System.out.println("No tienes permiso para borrar archivos.");
        }
    }
}

/*Implementamos una clase que actúe como proxy, y que implemente la misma interfaz que los objetos reales.
Esta clase se llama SecureFileHandlerProxy, y tiene una referencia al objeto real (FileHandler) que está protegiendo.*/

/*En esta clase, el método delete verifica si el usuario actual es un superusuario antes de permitir que el objeto real maneje la operación.
Si el usuario no es un superusuario, simplemente se imprime un mensaje de error.*/