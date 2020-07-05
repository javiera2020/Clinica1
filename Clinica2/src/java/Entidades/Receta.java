
package Entidades;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author javil
 */
public class Receta {
     int id;
    String descripcion;
    String nombrePaciente;
    String apellidoPaciente;
    String fechaEmision;
    String horaEmision;
    String nombreDoctor;
    
    public Receta(){    
    }
    
    public Receta(int id, String descripcion, String nombrePaciente, String apellidoPaciente, String fechaEmision, String horaEmision, String nombreDoctor){    
        this.id = id;
        this.descripcion = descripcion;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.fechaEmision = fechaEmision;
        this.horaEmision = horaEmision;
        this.nombreDoctor = nombreDoctor;
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

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getHoraEmision() {
        return horaEmision;
    }

    public void setHoraEmision(String horaEmision) {
        this.horaEmision = horaEmision;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }
    
  public ArrayList<Receta> obtenerReceta() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, receta from receta ";
   
  ArrayList <Receta> receta = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      receta.add(new Receta(re.getInt("Id"),re.getString("descripcion"),re.getString("nombrePaciente"),re.getString("apellidoPaciente"),re.getString("fechaEmision"),re.getString("horaEmision"),re.getString("nombreDoctor")));
     
  }
  
      return receta;
  }
    
}
