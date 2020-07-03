<%-- 
    Document   : IntranetDoctor
    Created on : 03-jul-2020, 15:28:20
    Author     : javil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Hello World!</h1>
        <form>
            <table>
                <tr>
                    <td>Id</td>
                    <td>Paciente</td>
                    <td>HoraAtencion</td>
                    <td>FechaAtencion</td>
                    <td>Consulta</td>
                    <td>Diagnostico</td>
                    <td>Receta</td>
                </tr>
                                <tr>
                    <td><input type="number" name="id" value=""/></td>  
                    <td><input type="text" name="paciente" value=""/></td>
                    <td><input type="time" name="HoraAtencion" value=""/></td>  
                    <td><input type="date" name="fechaAtencion" value=""/></td> 
                    <td><input type="text" name="consulta" value=""/></td>  
                    <td><input type="text" name="diagnostico" value=""/></td> 
                    <td><input type="text" name="receta" value=""/></td>  
                    <td>
                        <input type="submit" value="Agregar"/>
                    </td>
                    <td>
                        <a href="Salir">
                            <input type="button" value="Cerrar sesion"
                        </a>
                    </td>
                </tr>
            </table>
        <% if (request.getParameter("mensaje")!=null){%>
        <%=request.getParameter("mensaje")%>
        <%}%>
        </form>
    </center>
    </body>
</html>
