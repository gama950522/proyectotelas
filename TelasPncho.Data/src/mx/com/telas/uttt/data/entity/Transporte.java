package mx.com.telas.uttt.data.entity;

/**
 *
 * @author Alexis Gasga
 */
public class Transporte {
    private Integer idTransporte;
    private Caracteristica idCaracteristica;
    private String agencia;
    private Integer year;
    private Double velocidad;
    private String unidadVelocidad;
    private String matricula;
    private Double peso;
    private String unidadPeso;
    private Double capasidad;
    private String unidadCapasidad;
    private Empleado idEmpleado;
    private Boolean activo;
    private Boolean disponible;
    private Boolean tieneRutas;

    public Integer getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Integer idTransporte) {
        this.idTransporte = idTransporte;
    }

    public Caracteristica getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(Caracteristica idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public String getUnidadVelocidad() {
        return unidadVelocidad;
    }

    public void setUnidadVelocidad(String unidadVelocidad) {
        this.unidadVelocidad = unidadVelocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getUnidadPeso() {
        return unidadPeso;
    }

    public void setUnidadPeso(String unidadPeso) {
        this.unidadPeso = unidadPeso;
    }

    public Double getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(Double capasidad) {
        this.capasidad = capasidad;
    }

    public String getUnidadCapasidad() {
        return unidadCapasidad;
    }

    public void setUnidadCapasidad(String unidadCapasidad) {
        this.unidadCapasidad = unidadCapasidad;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Boolean getTieneRutas() {
        return tieneRutas;
    }

    public void setTieneRutas(Boolean tieneRutas) {
        this.tieneRutas = tieneRutas;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdTransporte() != null ? getIdTransporte().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transporte)) {
            return false;
        }
        Transporte other = (Transporte) object;
        if ((this.getIdTransporte() == null && other.getIdTransporte() != null) || (this.getIdTransporte() != null && !this.idTransporte.equals(other.idTransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Transporte[ id=" + getIdTransporte() + " ]";
    }
    
}
