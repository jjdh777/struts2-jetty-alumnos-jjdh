package org.demo.actions;


import org.demo.actions.beans.Alumno;

import java.util.HashMap;
import java.util.Map;

public class AlumnoService {
    // Simulación de una base de datos en memoria
    private static final Map<String, Alumno> alumnos = new HashMap<>();

    // Método para buscar un alumno por DNI
    public static Alumno buscarAlumnoPorDNI(String dni) {
        return alumnos.get(dni);
    }

    // Método para dar de alta un nuevo alumno
    public static void altaAlumno(Alumno alumno) {
        alumnos.put(alumno.getDni(), alumno);
    }

    public static int getNumeroAlunmos(){
        return alumnos.size();
    }
}