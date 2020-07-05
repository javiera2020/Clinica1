
package Entidades;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author javil
 */
public class Usuario {
     Conexion con; 
     int Id;
     String usuario;
     String nombre;
     String apellido;
     String password;
 
    public Usuario ()throws ClassNotFoundException,SQLException{
        
        
        Conexion con = new Conexion();
    }
    public Usuario (String usuario, String nombre, String apellido, String password)throws ClassNotFoundException,SQLException{
       Conexion con = new Conexion();
        this.Id = Id;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
 
   }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   public ArrayList<Usuario> obtenerUsuario() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, usuario from usuario ";
   
  ArrayList <Usuario> usuario = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      usuario.add(new Usuario (re.getInt("Id"),re.getString("usuario"),re.getString("nombre"),re.getString("apellido"),re.getString("password")));
     
  }
  
      return usuario;
  }
}
