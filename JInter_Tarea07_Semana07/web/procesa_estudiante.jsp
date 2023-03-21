<%-- 
    Document   : procesa_contribuyente
    Created on : Mar 20, 2023, 2:46:05 AM
    Author     : Isabel
--%>

<%@page import="java.math.BigDecimal"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
        <title>Procesa Adicion de Estudiante</title>
        <jsp:useBean id="beanEstudiante" scope="request" class="mantenimiento.MantenimientoEstudianteJpa" />
    </head>
    <body>
        <form name="formContri" action="formEstudiante.jsp" method="POST">
        
        
        <h1>Procesa Adicion de Estudiante</h1>

        <%
            String carnet = request.getParameter("carnet");
            String apellidosEstudiante = request.getParameter("apellidos_estudiante");
            String nombresEstudiante = request.getParameter("nombres_estudiante");
            String direccion = request.getParameter("direccion");            
            String telefono = request.getParameter("telefono");            
            String carrera = request.getParameter("carrera");   
            String departamento = request.getParameter("departamento");
            
            out.println("Carnet               : " + carnet + "<br>");
            out.println("Apellidos Estudiante : " + apellidosEstudiante + "<br>");
            out.println("Nombres Estudiante   : " + nombresEstudiante + "<br>");
            out.println("Dirección            : " + direccion + "<br>");
            out.println("Teléfono             : " + telefono + "<br>");
            out.println("Carrera              : " + carrera + "<br>"); 
            out.println("Departamento         : " + departamento + "<br>"); 
            
            persistencia.IvEstudiantes estudiantes = new persistencia.IvEstudiantes();

            estudiantes.setCarnet(carnet);
            estudiantes.setApellidos(apellidosEstudiante);
            estudiantes.setNombres(nombresEstudiante);
            estudiantes.setDireccion(direccion);
            estudiantes.setTelefono(telefono);
            estudiantes.setCarrera(carrera);
            estudiantes.setDepartamento(departamento);

            if (beanEstudiante.guardarEstudiante(estudiantes) == 1) {
                out.println("Estudiante almacenado satisfactoriamente...");
            } else {

                out.println("Estudiante ya se encuentra registrado...");
            }
        %>
        <br><br>
            
        <input type="submit" value="Ingresar Estudiante" name="btnRegresar" />
        <a href="formModificarEstudiante.jsp" >CONSULTAR ESTUDIANTE</a>
        </form>
        </body>
</html>
