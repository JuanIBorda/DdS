package org.example.TP1_Validador_Correlativas;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias = new ArrayList<>();


    public boolean aprobada(){
        for (Materia materiaInscripta:materias){
            if (!materiaInscripta.puedeCursar(alumno)) return false;
        }
    return true;
    }

}
