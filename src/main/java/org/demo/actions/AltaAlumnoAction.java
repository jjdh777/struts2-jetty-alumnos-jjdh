package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.Alumno;


public class AltaAlumnoAction extends ActionSupport {
    private Alumno alumno;
    private int numeroAlumnos;

    public String execute() {
        AlumnoService.altaAlumno(alumno);
        numeroAlumnos = AlumnoService.getNumeroAlunmos();
        addActionMessage("Alumno dado de alta correctamente");
        return SUCCESS;
    }

    // Getters y setters
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }
}