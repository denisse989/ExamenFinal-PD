package ParcialFinal.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private String nombre;
    private int capacidad;
    private List<Estudiantes> estudiantes;
    private String requisitos;

    public Colegio(String nombre, int capacidad, Estudiantes[] estudiantes, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estudiantes = new ArrayList<>();
        this.requisitos = requisitos;
    }
}
