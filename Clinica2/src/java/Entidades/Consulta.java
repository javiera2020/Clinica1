
package Entidades;

/**
 *
 * @author javil
 */
public class Consulta {
    int id;
    String hora;
    String fecha;
    String paciente;
    String detalle;
    String nombreDoctor;
    String especialidadDoctor;         
    
    public Consulta(){
        
    } 
    
    public Consulta(int id, String hora, String fecha, String paciente, String detalle, String nombreDoctor, String especialidadDoctor){
               this.id = id;
        this.hora = hora;
        this.fecha = fecha;
        this.paciente = paciente;
        this.detalle = detalle;
        this.nombreDoctor = nombreDoctor;
        this.especialidadDoctor= especialidadDoctor; 
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }
    
}
