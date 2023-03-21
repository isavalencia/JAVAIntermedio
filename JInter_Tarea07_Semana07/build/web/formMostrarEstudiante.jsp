<%-- 
    Document   : formMostrarContribuyente
    Created on : Mar 20, 2023, 3:34:37 AM
    Author     : Isabel
--%>

<%@page import="persistencia.IvEstudiantes"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
        <title>Mostrar Estudiantes</title>
        <jsp:useBean id="beanEstudiante" scope="request" class="mantenimiento.MantenimientoEstudianteJpa" />
    </head>
    <body>
        <h1>Mostrar Estudiantes</h1>
        
        <%
            String carnet = request.getParameter("carnet");
            IvEstudiantes estudiante = beanEstudiante.consultarEstudiante(carnet);
            if (estudiante == null) {
                out.print("No se encontro informacion del Estudiante...");
            }
            
        %>
        <% if (estudiante != null){ %>
       
       <form name="formMostrarcontribuy" action="procesa_modificacion_estudiante.jsp" method="POST">
       <table border="1">
                <tbody>
                    <tr>
                        <td>Carnet:  </td>
                        <td><input type="text" name="carnet" size="18" value="<%= estudiante.getCarnet() %>"/></td>
                    </tr>
                    <tr>
                        <td>Apellidos Estudiante:  </td>
                        <td><input type="text" name="apellidos_estudiante" size="65" value="<%= estudiante.getApellidos() %>" /></td>
                    </tr>
                    <tr>
                        <td>Nombres Estudiante:  </td>
                        <td><input type="text" name="nombres_estudiante" size="200" value="<%= estudiante.getNombres() %>" /></td>
                    </tr>
                    <tr>
                        <td>Dirección:  </td>
                        <td><input type="text" name="direcion" size="65" value="<%= estudiante.getDireccion() %>"  /></td>
                    </tr>
                    <tr>
                        <td>Teléfono:  </td>
                        <td><input type="text" name="renta_anual" size="10" value="<%= estudiante.getTelefono()%>" /></td>
                    </tr>
                    <tr>
                        <td>Carrera:  </td>
                        <td><select name="carrera" value="<%= estudiante.getCarrera()%>">
                                <option>Ingenieria en Sistemas</option>
                                <option>Arquitectura</option>
                                <option>Diseño Grafico</option>
                                <option>Ingenieria Electrica</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Departamento:  </td>
                        <td><select name="departamento" value="<%= estudiante.getDepartamento()%>" >
                                <option>Ahuachapan</option>
                                <option>San Vicente</option>
                                <option>San Salvador</option>
                                <option>Chalatenango</option>
                            </select></td>
                    </tr>
                    <tr>
                        <center>
                             <td colspan="2">
                            <input type="submit" value="Guardar" name="Guardar" />
                        </center>
                    </tr>
                       
                </tbody>
            </table>
       

       </form>
      <% } %>
                
        
    </body>
</html>
