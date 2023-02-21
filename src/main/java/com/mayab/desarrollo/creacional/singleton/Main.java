package com.mayab.desarrollo.creacional.singleton;

public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia de la clase HorarioClases
        HorarioClases horario = HorarioClases.obtenerInstancia();

        // Modificamos el horario de clases
        horario.modificarHorario(1, "Matemáticas");
        horario.modificarHorario(2, "Historia");
        horario.modificarHorario(3, "Ciencias");
        horario.modificarHorario(4, "Idiomas");
        horario.modificarHorario(5, "Educación Física");

        // Imprimimos el horario de clases
        horario.imprimirHorario();
    }
}
