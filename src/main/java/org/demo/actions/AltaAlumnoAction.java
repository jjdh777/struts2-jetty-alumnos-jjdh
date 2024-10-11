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

    public void validate() {
        if (alumno.getDni().isEmpty()) {
            addFieldError("alumno.dni", "El DNI es obligatorio.");
        }
        if (alumno.getDni().length()!=9) {
            addFieldError("alumno.dni", "El DNI debe tener 9 dígitos.");
        }
        if (alumno.getNombre().isEmpty()) {
            addFieldError("alumno.nombre", "El NOMBRE es obligatorio.");
        }
        if (alumno.getNombre().length()<4) {
            addFieldError("alumno.nombre", "El NOMBRE debe tener mas de 4 caracteres.");
        }
        if (alumno.getApellido().isEmpty()) {
            addFieldError("alumno.apellido", "El APELLIDO es obligatorio.");
        }
        if (alumno.getApellido().length()<4) {
            addFieldError("alumno.apellido", "El APELLIDO debe tener mas de 4 caracteres.");
        }
        if (alumno.getDireccion().isEmpty()) {
            addFieldError("alumno.direccion", "La DIRECCION es obligatoria.");
        }
        if (alumno.getTelefono().isEmpty()) {
            addFieldError("alumno.telefono", "El TELEFONO es obligatorio.");
        }
        if (alumno.getTelefono().length()!=9) {
            addFieldError("alumno.telefono", "El TELEFONO debe tener 9 cifras.");
        }
        if (alumno.getEmail().isEmpty()) {
            addFieldError("alumno.email", "El EMAIL es obligatorio.");
        }
        if (alumno.getFechaNacimiento().isEmpty()) {
            addFieldError("alumno.fechaNacimiento", "La FECHA DE NACIMIENTO es obligatoria.");
        }
        if (alumno.getCurso().isEmpty()) {
            addFieldError("alumno.curso", "El CURSO es obligatorio.");}
        else{
            if (!alumno.isCursoNumeric()) {
                addFieldError("alumno.curso", "El CURSO deber ser un número.");
            }
            else {
                if (alumno.isCursoNotCorrect()) {
                    addFieldError("alumno.curso", "El CURSO deber ser 1,2 o 3.");
                }
            }
        }
        if (alumno.getGrado().isEmpty()) {
            addFieldError("alumno.grado", "El GRADO es obligatorio.");}
        else{
            if (!alumno.isGradoNumeric()) {
                addFieldError("alumno.grado", "El GRADO deber ser un número.");
            }
            else {
                if (alumno.isGradoNotCorrect()) {
                    addFieldError("alumno.grado", "El GRADO deber ser 1,2 o 3.");
                }
            }
        }
        // Es opcional.
        //if (alumno.getObservaciones().isEmpty()) {
        //  addFieldError("alumno.observaciones", "Las Observaciones son obligatorias.");
        //}
    }
}
