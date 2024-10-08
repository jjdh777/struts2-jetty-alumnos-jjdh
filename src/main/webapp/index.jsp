<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Gestión de Alumnos</title>
</head>
<body>
    <h1>Buscar Alumno por DNI:</h1>
    <s:form action="buscarAlumno">
        <s:textfield name="dni" label="Introducir DNI" />
        <s:submit value="Buscar" />
    </s:form>

    <a href="altaAlumno.jsp">Enlace para dar de alta un nuevo alumno</a>

    <p>Número de alumnos registrados: <s:property value="numeroAlumnos" /></p>
</body>
</html>