<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Alta de Alumno</title>
</head>
<body>
    <h1>Alta de Alumno</h1>
    <s:actionerror />
    <s:form action="altaAlumno">
        <s:fielderror fieldName = "alumno.dni" />
        <s:textfield name="alumno.dni" label="DNI" />
        <s:fielderror fieldName = "alumno.nombre" />
        <s:textfield name="alumno.nombre" label="Nombre" />
        <s:fielderror fieldName = "alumno.apellido" />
        <s:textfield name="alumno.apellido" label="Apellido" />
        <s:fielderror fieldName = "alumno.direccion" />
        <s:textfield name="alumno.direccion" label="Dirección" />
        <s:fielderror fieldName = "alumno.telefono" />
        <s:textfield name="alumno.telefono" label="Teléfono" />
        <s:fielderror fieldName = "alumno.email" />
        <s:textfield name="alumno.email" label="Email" />
        <s:fielderror fieldName = "alumno.fechaNacimiento" />
        <s:textfield name="alumno.fechaNacimiento" label="Fecha de Nacimiento" />
        <s:fielderror fieldName = "alumno.curso" />
        <s:textfield name="alumno.curso" label="Curso" />
        <s:fielderror fieldName = "alumno.grado" />
        <s:textfield name="alumno.grado" label="Grado" />
        <s:textarea name="alumno.observaciones" label="Observaciones" />
        <s:submit value="Dar de alta" />
    </s:form>
</body>
</html>