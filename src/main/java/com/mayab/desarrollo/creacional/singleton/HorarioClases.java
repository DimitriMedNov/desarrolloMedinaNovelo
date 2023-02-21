package com.mayab.desarrollo.creacional.singleton;

public class HorarioClases {
    // Instancia singleton
    private static HorarioClases instancia;

    // Detalles del horario de clases
    private String[] clases = new String[5];
    private String[] dias = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

    // Constructor privado para evitar la creación de instancias
    private HorarioClases() {}

    // Método estático para obtener la instancia singleton
    public static HorarioClases obtenerInstancia() {
        if (instancia == null) {
            instancia = new HorarioClases();
        }
        return instancia;
    }

    // Método para modificar el horario de clases
    public void modificarHorario(int dia, String clase) {
        clases[dia-1] = clase;
    }

    // Método para imprimir el horario de clases
    public void imprimirHorario() {
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i] + ": " + clases[i]);
        }
    }
}
