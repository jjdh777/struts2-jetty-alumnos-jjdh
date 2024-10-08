<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Alta de Alumno</title>
</head>
<body>
    <h1>Alta de Alumno</h1>
    <s:form action="altaAlumno">
        <s:textfield name="alumno.dni" label="DNI" />
        <s:textfield name="alumno.nombre" label="Nombre" />
        <s:textfield name="alumno.apellido" label="Apellido" />
        <s:textfield name="alumno.direccion" label="Dirección" />
        <s:textfield name="alumno.telefono" label="Teléfono" />
        <s:textfield name="alumno.email" label="Email" />
        <s:textfield name="alumno.fechaNacimiento" label="Fecha de Nacimiento" />
        <s:textfield name="alumno.curso" label="Curso" />
        <s:textfield name="alumno.grado" label="Grado" />
        <s:textarea name="alumno.observaciones" label="Observaciones" />
        <s:submit value="Dar de alta" />
    </s:form>
</body>
</html>