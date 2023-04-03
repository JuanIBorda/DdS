package org.example.TP1_Validador_Correlativas;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Alumno {
    private String nombre;
    private List<Materia>materiasAprobadas = new ArrayList<>();


    public Alumno (String nombre){
        this.nombre = nombre;
    }
    public void cargarMateriasAprobadas(Materia materia){
        this.materiasAprobadas.add(materia);
    }
}

