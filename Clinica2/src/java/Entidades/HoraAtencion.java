
package Entidades;

/**
 *
 * @author javil
 */
public class HoraAtencion {
       int id;
   String fecha;
   String hora;
   String paciente;
   String tipoMedico;
   String descripcion;
   String nombreMedico;
   
   public HoraAtencion(){
       
   }
   
   public HoraAtencion(int id, String fecha, String hora, String paciente, String tipoMedico, String descripcion, String nombreMedico){
       
       this.id = id;
       this.fecha = fecha;
       this.hora = hora;
       this.paciente = paciente;
       this.tipoMedico = tipoMedico;
       this.descripcion = descripcion;
       this.nombreMedico = nombreMedico;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getTipoMedico() {
        return tipoMedico;
    }

    public void setTipoMedico(String tipoMedico) {
        this.tipoMedico = tipoMedico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }
   
   
}
