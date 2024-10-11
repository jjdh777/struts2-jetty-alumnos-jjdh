package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.Alumno;


public class BuscarAlumnoAction extends ActionSupport {
    private String dni;
    private Alumno alumno;
    private int numeroAlumnos;

    public String execute() {
        if (dni == "") {
            addActionError("Error: DNI no puede ser nulo.");
            return INPUT;

        } else {
            alumno = AlumnoService.buscarAlumnoPorDNI(dni);
            numeroAlumnos = AlumnoService.getNumeroAlunmos();
            if (alumno != null) {
                return SUCCESS;
            } else {
                addActionError("Error: Alumno no encontrado.");
                return INPUT;
            }

        }
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

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