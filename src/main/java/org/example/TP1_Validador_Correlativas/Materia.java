package org.example.TP1_Validador_Correlativas;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas = new ArrayList<>();


    public Materia (String nombre){
        this.nombre = nombre;
    }
    public void cargarmateriaCorrelativa(Materia materia){
        this.materiasCorrelativas.add((materia));
    }

    public boolean puedeCursar(Alumno alumno){
        for(Materia materiaCorrelativa: materiasCorrelativas)                           //Voy agarrando las materias del correlativas
            {
            if(!alumno.getMateriasAprobadas().contains(materiaCorrelativa)) return false;
            }
        return true;
    }
}
