<%-- 
    Document   : EliminarP
    Created on : 03-jul-2020, 14:46:13
    Author     : javil
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Eliminar Paciente</h1>
        <form>
          
             <% String Id = request.getParameter("Id");
               ArrayList<Paciente> paciente = new ArrayList();
               if(session.getAttribute("paciente")!=null){
                   paciente =(ArrayList) session.getAttribute("paciente");
               }   
               Paciente p = new Paciente();
               for(Paciente pacientes:paciente){
                   if(paciente.getId().equalsIgnoreCase(Id)){
                       p = paciente;
                   }
               }
            %>
            
              <table>
                      <tr>
                        <td>Id</td>
                        <td><input type="text" name="id" value="<%= p.getId()%>"
                                   readonly="true" /></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="nombre" value="<%= p.getNombre()%>" readonly="true" /></td>
                    </tr>
                    <tr>
                        <td>Apellido</td>
                        <td><input type="text" name="apellido" value="<%= p.getApellido()%>" readonly="true"/></td>
                    </tr>
                    <tr>
                        <td>FechaNacimiento</td>
                        <td><input type="date" name="fechaNacimiento" value="<%= p.getFechaNacimiento()%>" readonly="true"/></td>
                    </tr>
                     <tr>
                     <tr>
                        <td>Direccion</td>
                        <td><input type="text" name="direccion" value="<%= p.getDireccion()%>" readonly="true"/></td>
                    </tr>
                        <td>Ciudad</td>
                        <td><input type="text" name="ciudad" value="<%= p.getCiudad()%>" readonly="true"/></td>
                    </tr>
                      <tr>
                        <td>Comuna</td>
                        <td><input type="text" name="comuna" value="<%= p.getComuna()%>" readonly="true"/></td>
                    </tr>
                      <tr>
                        <td>Diagnostico</td>
                        <td><input type="text" name="Diagnostico" value="<%= p.getDiagnostico()%>" readonly="true"/></td>
                    </tr>
                      <tr>
                        <td>Receta</td>
                        <td><input type="text" name="receta" value="<%= p.getReceta()%>" readonly="true"/></td>
                    </tr>
                      <tr>
                        <td>HoraAtencion</td>
                        <td><input type="time" name="horaAtencion" value="<%= p.getHoraAtencion()%>" readonly="true"/></td>
                    </tr>
                      <tr>
                        <td>FechaAtencion</td>
                        <td><input type="date" name="fechaAtencion" value="<%= p.getFechaAtencion()%>" readonly="true"/></td>
                    </tr>
                    
                    <td><a href="intranet.jsp">Volver</a></td>
                    <td><input type="submit" value="Eliminar"/></td>
                    </tr>
                    <input type="hidden" name="accion" value=""/>
                    </table> 
                    <% if(request.getParameter("mensaje")!=null){%>
                    <%=request.getParameter("mensaje") %>
                     <%}%>
        </form>
        
      </center>  
    </body>
</html>
