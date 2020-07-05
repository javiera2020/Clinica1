
package Entidades;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author javil
 */
public class Paciente {
   Conexion con;
    int id;
   String nombre;
   String apellido;
   String fechaNacimiento;
   String direccion;
   String ciudad;
   String comuna;
   String diagnostico;
   String receta;
   String horaAtencion;
   String fechaAtencion;
 
   public Paciente ()throws ClassNotFoundException,SQLException{
     Conexion con = new Conexion(); 
      
   }
   
    public Paciente (int id, String nombre, String apellido,String fechaNacimiento,String direccion, String ciudad,String comuna,String diagnostico,String receta,String horaAtencion,String fechaAtencion)throws ClassNotFoundException,SQLException{
    Conexion con = new Conexion(); 
    
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.direccion = direccion;
    this.ciudad = ciudad;
    this.comuna = comuna;
    this.diagnostico = diagnostico;
    this.receta = receta;
    this.horaAtencion = horaAtencion;
    this.fechaAtencion = fechaAtencion;  
       
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
       public ArrayList<Paciente> obtenerPaciente() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, paciente from paciente ";
   
  ArrayList <Paciente> paciente = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      paciente.add(new Paciente(re.getInt("Id"),re.getString("nombre"),re.getString("apellido"),re.getString("fechaNacimiento"),re.getString("direccion"),re.getString("ciudad"),re.getString("comuna"),re.getString("diagnostico"), re.getString("receta"),re.getString("horaAtencion"),re.getString("fechaAtencion")));
     
  }
  
      return paciente;
  }
    
}
