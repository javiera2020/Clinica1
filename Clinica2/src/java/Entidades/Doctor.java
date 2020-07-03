
package Entidades;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author javil
 */
public class Doctor {
    int id;
    String nombre;
    String apellido;
    String especialidad;
    String paciente;
    String horaAtencion;
    String fechaAtencion;
    String diagnosticoPaciente;
    String recetaPaciente;
    String detalleConsulta;
    private String sentencia;
    
   public Doctor()throws ClassNotFoundException,SQLException{
       Conexion con;
   }
   
    public Doctor(int id, String nombre, String apellido, String especialidad, String paciente, String horaAtencion, String fechaAtencion, String diagnosticoPaciente, String recetaPaciente, String detallePaciente)throws ClassNotFoundException,SQLException{
        Conexion con;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.paciente = paciente;
        this.horaAtencion = horaAtencion;
        this.fechaAtencion = fechaAtencion;
        this.diagnosticoPaciente = diagnosticoPaciente;
        this.recetaPaciente = recetaPaciente;
        this.detalleConsulta = detalleConsulta;
        
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
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

    public String getDiagnosticoPaciente() {
        return diagnosticoPaciente;
    }

    public void setDiagnosticoPaciente(String diagnosticoPaciente) {
        this.diagnosticoPaciente = diagnosticoPaciente;
    }

    public String getRecetaPaciente() {
        return recetaPaciente;
    }

    public void setRecetaPaciente(String recetaPaciente) {
        this.recetaPaciente = recetaPaciente;
    }

    public String getDetalleConsulta() {
        return detalleConsulta;
    }

    public void setDetalleConsulta(String detalleConsulta) {
        this.detalleConsulta = detalleConsulta;
    }
     public ArrayList<Doctor> obtenerDoctor() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, doctores from doctores ";
      ArrayList <Doctor> doctores= new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      doctores.add(new Doctor(re.getInt("Id"),re.getString("nombre"),re.getString("apellido"),re.getString("especialidad"),re.getString("paciente"),re.getString("horaAtencion"),re.getString("fechaAtencion"),re.getString("diagnosticoPaciente"),re.getString("RecetaPaciente"),re.getString("detalleConsulta")));
      
     
  }
  
      return doctores;
  }
    
}
