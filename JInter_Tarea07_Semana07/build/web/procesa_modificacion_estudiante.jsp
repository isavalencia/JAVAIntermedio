<%-- 
    Document   : procesa_modificacion_contribuyente
    Created on : Mar 20, 2023, 3:18:07 AM
    Author     : Isabel
--%>

<%@page import="persistencia.IvEstudiantes"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
        <title>Procesa Modificacion de Estudiante</title>
        <jsp:useBean id="beanEstudiante" scope="request" class="mantenimiento.MantenimientoEstudianteJpa" />
    </head>
    <body>
        <form name="formVerEstudiantes" action="formEstudiante.jsp" method="POST">
        
        <h1>Procesa Modificacion de Estudiante</h1>
        
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
            out.println("Departamento         : " + departamento + "<br>"+ "<br>"); 
            
            if (beanEstudiante.consultarEstudiante(carnet) == null) {
                out.println("Estudiante no se encuentra registrado...");
            }else{ 
            if(beanEstudiante.modificarEstudiante(carnet, apellidosEstudiante, nombresEstudiante, direccion, telefono, carrera, departamento)==1){
            out.println("Estudiante modificado satisfactoriamente...");
            }
            }
            
        
        %>
        
        
        <input type="submit" value="Insertar Estudiante" name="btnInsertarEstudiante" />
        </form>
    </body>
</html>
