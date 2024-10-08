<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Información del Alumno</title>
</head>
<body>
    <h1>Información del Alumno</h1>
     <p>DNI: <s:property value="alumno.dni" /></p>
       <p>Nombre: <s:property value="alumno.nombre" /></p>
       <p>Apellido: <s:property value="alumno.apellido" /></p>
       <p>Dirección: <s:property value="alumno.direccion" /></p>
       <p>Teléfono: <s:property value="alumno.telefono" /></p>
       <p>Email: <s:property value="alumno.email" /></p>
       <p>Fecha de Nacimiento: <s:property value="alumno.fechaNacimiento" /></p>
       <p>Curso: <s:property value="alumno.curso" /></p>
       <p>Grado: <s:property value="alumno.grado" /></p>
       <p>Observaciones: <s:property value="alumno.observaciones" /></p>
</body>
</html>