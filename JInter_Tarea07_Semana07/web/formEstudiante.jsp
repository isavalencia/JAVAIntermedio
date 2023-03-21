<%-- 
    Document   : formContribuyente
    Created on : Mar 20, 2023, 2:44:39 AM
    Author     : Isabel
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
        <title>Registro Estudiantes</title>
        
    </head>
    <body>
        <h1 align="center">Registro Estudiantes</h1>
        <form name="Form1" action="procesa_estudiante.jsp" method="POST">
            <table border="1" align="center">
                <tbody>
                    <tr>
                        <td style="font-size: 20px; font-weight: bold;">Carnet:  </td>
                        <td><input type="text" name="carnet" style="width:200px; height:20px" value="" size="20" /><br></td>
                    </tr>
                    <tr>
                        <td style="font-size: 20px; font-weight: bold;">Apellidos Estudiante:  </td>
                        <td><input type="text" name="apellido_estudiante" style="width:400px; height:20px" value="" size="100" /></td>
                    </tr>
                    <tr>
                        <td style="font-size: 20px; font-weight: bold;">Nombres Estudiante:  </td>
                        <td><input type="text" name="apellido_estudiante" style="width:400px; height:20px" value="" size="100" /></td>
                    </tr>
                    <tr>
                        <td style="font-size: 20px; font-weight: bold;">Direccion:  </td>
                        <td><input type="text" name="direccion" style="width:400px; height:20px" value="" size="100" /></td>
                    </tr>
                    <tr>
                        <td style="font-size: 20px; font-weight: bold;">Telefono:  </td>
                        <td><input type="text" name="telefono" style="width:150px; height:20px" value="" size="18" /></td>
                    </tr>
                    <tr>
                        <td style="font-size: 20px; font-weight: bold;">Carrera:  </td>
                        <td><select name="carrera" style="width:200px; height:30px; font-size: 15px;" >
                                <option>Ingenieria en Sistemas</option>
                                <option>Arquitectura</option>
                                <option>Diseño Grafico</option>
                                <option>Ingenieria Electrica</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td style="font-size: 20px; font-weight: bold;">Departamento:  </td>
                        <td><select name="departamento" style="width:200px; height:30px; font-size: 15px;">
                                <option>Ahuachapan</option>
                                <option>San Vicente</option>
                                <option>San Salvador</option>
                                <option>Chalatenango</option>
                            </select></td>
                    </tr>
                    <tr>
                    
                        <td colspan="2" align="center">
                            <input type="submit" style="width:150px; height:30px;font-size: 20px; font-weight: bold;" value="Guardar" name="Guardar" />
                            <input type="submit" style="width:150px; height:30px;font-size: 20px; font-weight: bold;" value="Limpiar" name="Limpiar" />
                        </td>
                    </tr>
                </tbody>
            </table>

            
        </form>
    </body>
</html>
