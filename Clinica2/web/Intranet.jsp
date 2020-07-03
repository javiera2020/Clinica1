<%-- 
    Document   : Intranet
    Created on : 03-jul-2020, 14:06:01
    Author     : javil
--%>

<%@page import="Entidades.Paciente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Array"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Bienvenido</h1>
        <form>
            <table>
                <tr>
                    <td>Paciente</td>
                    <td>Doctor</td>
                    <td>HoraAtencion</td>
                    <td>Consulta</td>
                    <td>Receta</td>
                </tr>
                <tr>
                    <td><input type="text" name="paciente" value=""/></td>  
                    <td><input type="text" name="doctor" value=""/></td>  
                    <td><input type="date" name="HoraAtencion" value=""/></td>  
                    <td><input type="text" name="consulta" value=""/></td>  
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
                
                <% ArrayList<Paciente> paciente = new ArrayList();
                if(session.getAttribute("paciente")!=null){
                    paciente =(ArrayList) session.getAttribute("paciente");
                }
                for(Paciente p: paciente){
                    %>
                    <tr>
                        <td><%=p.getId()%></td>
                        <td><%=p.getNombre()%></td>
                        <td><%=p.getApellido()%></td>
                        <td><%=p.getFechaNacimiento()%></td>
                        <td><%=p.getDireccion()%></td>
                        <td><%=p.getCiudad()%></td>
                        <td><%=p.getComuna()%></td>
                        <td><%=p.getDiagnostico()%></td>
                        <td><%=p.getReceta()%></td>
                        <td><%=p.getHoraAtencion()%></td>
                        <td><%=p.getFechaAtencion()%></td>
                        <td><a href="ModificarP.jsp?Id=<%=p.getId()%>">
                                <input type="button" value="Modificar"/>
                            </a>
                    </tr>
              <%}%>
            </table>
        </form>
        </center>
    </body>
</html>
