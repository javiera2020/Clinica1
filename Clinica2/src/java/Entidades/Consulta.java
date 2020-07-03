
package Entidades;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author javil
 */
public class Consulta {
    Conexion con;
    int id;
    String descripcion;
    String hora;
    String fecha;
    String nombrePaciente;
    
    
         
    
    public Consulta()throws ClassNotFoundException,SQLException{
    Conexion con = new Conexion(); 
    } 
    
    public Consulta(int id, String Descripcion, String hora, String fecha, String nombrePaciente)throws ClassNotFoundException,SQLException{
       Conexion con = new Conexion();
        this.id = id;
        this.descripcion = descripcion;
        this.hora = hora;
        this.fecha = fecha;
        this.nombrePaciente = nombrePaciente;
       
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
        public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

   public ArrayList<Consulta> obtenerConsulta() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, consulta from consulta ";
   
  ArrayList <Consulta> consulta = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      consulta.add(new Consulta(re.getInt("Id"),re.getString("Descripcion"),re.getString("Fecha"),re.getString("Hora"),re.getString("NombrePaciente")));
     
  }
  
      return consulta;
  }
}
