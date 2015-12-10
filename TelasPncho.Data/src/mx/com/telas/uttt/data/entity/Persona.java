package mx.com.telas.uttt.data.entity;

import static java.lang.reflect.Array.get;
import java.sql.Date;
import static javax.management.Query.value;

/**
 *
 * @author AlexisGasga
 */
public class Persona {
    
    private Integer idPersona;
    private String nombre;
    private String aPareno;
    private String aMaterno;
    private Integer edad;
    private String sexo;
    private String estadoCivil;
    private Date fechaNacimiento;

    
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPareno() {
        return aPareno;
    }

    public void setaPareno(String aPareno) {
        this.aPareno = aPareno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdPersona() != null ? getIdPersona().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idPersona fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.getIdPersona() == null && other.getIdPersona() != null) || (this.getIdPersona() != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Persona[ id=" + getIdPersona() + " ]";
    }

    
}
