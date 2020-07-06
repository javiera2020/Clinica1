/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author javil
 */
public class Registro {
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        String accion = request.getParameter("accion");
        
        switch(accion){
            case "1": ingresar(request,response);
            break;
            case "2": modificar(request,response);
            break;
            case "3": eliminar(request,response);
            break;
        }
        
        
        }
        catch(Exception e){
            response.sendRedirect("registro.jsp?mensaje=Complete todos los campos");
        }
    }

    private void ingresar(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        String usuario = request.getParameter("usuario").trim();
        String nombre = request.getParameter("nombre").trim();
        String apellido = request.getParameter("apellido").trim();
        String password = request.getParameter("password").trim();
        if(usuario.isEmpty()||nombre.isEmpty()||apellido.isEmpty()||password.isEmpty()){
            response.sendRedirect("registro.jsp?mensaje=Complete todos los campos");
        }else{
        Usuario u = new Usuario(usuario,nombre,apellido,password);
        ArrayList<Usuario> usuarios;
        HttpSession sesion = request.getSession();
        if(sesion.getAttribute("usuarios")!=null){
            usuarios = (ArrayList) sesion.getAttribute("usuarios");
        }else{
            usuarios = new ArrayList();
        }
        if(validarUsuario(u,usuarios)){
            usuarios.add(u);
            sesion.setAttribute("usuarios", usuarios);
            response.sendRedirect("index.jsp?mensaje=Usuario registrado");
        }else{
            response.sendRedirect("registro.jsp?mensaje=Nombre de usuario ya esta en uso");
        }
        }
        }
    private boolean validarUsuario(Usuario u, ArrayList<Usuario> usuarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           Usuario temporal = null;
        for(Usuario usuario:usuarios){
            if(usuario.getUsuario().equalsIgnoreCase(u.getUsuario())){
                temporal = usuario;
                u = usuario;
            }
        }
        return (temporal == null);
    
    }
    
    

    private void modificar(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
        String usuario = request.getParameter("usuario").trim();
        String nombre = request.getParameter("nombre").trim();
        String apellido = request.getParameter("apellido").trim();
        String password = request.getParameter("password").trim();
        Usuario u = new Usuario(usuario,nombre,apellido,password);
        ArrayList<Usuario> usuarios;
        HttpSession sesion = request.getSession();
        if(sesion.getAttribute("usuarios")!=null){
            usuarios = (ArrayList) sesion.getAttribute("usuarios");
        }else{
            usuarios = new ArrayList();
        }
        Usuario validado = validar2(u,usuarios);
        int flag = 0;
        if(validado.getPassword().equals(u.getPassword())){
            flag=1;
        }
        if(validado!=null){
            validado.setNombre(u.getNombre());
            validado.setApellido(u.getApellido());
            validado.setPassword(u.getPassword());
            sesion.setAttribute("usuarios", usuarios);
            if(flag==1){
            response.sendRedirect("intranet.jsp?mensaje=Usuario modificado");
            }else{
                response.sendRedirect("Salir");
            }
        }else{
            response.sendRedirect("intranet.jsp?mensaje=Usuario no existe");
        }
    
  }

    private Usuario validar2(Usuario u, ArrayList<Usuario> usuarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          Usuario temporal = null;
        for(Usuario usuario:usuarios){
            if(usuario.getUsuario().equalsIgnoreCase(u.getUsuario())){
                temporal = usuario;
            }
        }
        return temporal;
    
    
    }
    
   

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
         String usuario = request.getParameter("usuario").trim();
        Usuario u = new Usuario();
        u.setUsuario(usuario);
        ArrayList<Usuario> usuarios;
        HttpSession sesion = request.getSession();
        if(sesion.getAttribute("usuarios")!=null){
            usuarios = (ArrayList) sesion.getAttribute("usuarios");
        }else{
            usuarios = new ArrayList();
        }
       u = validar2(u,usuarios);
        if(u!=null){
            usuarios.remove(u);
            sesion.setAttribute("usuarios", usuarios);
            response.sendRedirect("intranet.jsp?mensaje=Usuario eliminado");
        }else{
            response.sendRedirect("intranet.jsp?mensaje=Usuario no existe");
        }
    
}
}
