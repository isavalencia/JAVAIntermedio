<%-- 
    Document   : formModificarContribuyente
    Created on : Mar 20, 2023, 3:22:39 AM
    Author     : Isabel
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
        <title>Modificar Contribuyentes</title>
    </head>
    <body>
        <h1>Modificar Contribuyentes</h1>
        <form name="Form1" action="formMostrarEstudiante.jsp" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Carnet:  </td>
                        <td><input type="text" name="carnet" value="" size="18" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="Consultar" name="Consultar" />
                        </td>       
                    </tr>
                </tbody>
            </table>

            
        </form>
        
    </body>
</html>
