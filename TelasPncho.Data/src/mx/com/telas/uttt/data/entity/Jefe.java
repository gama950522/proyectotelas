package mx.com.telas.uttt.data.entity;


/**
 *
 * @author AlexisGasga
 */
public class Jefe {
    private Integer idJefe;
    private Empleado idEmpleado;

    public Integer getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Integer idJefe) {
        this.idJefe = idJefe;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdJefe() != null ? getIdJefe().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idJefe fields are not set
        if (!(object instanceof Jefe)) {
            return false;
        }
        Jefe other = (Jefe) object;
        if ((this.getIdJefe() == null && other.getIdJefe() != null) || (this.getIdJefe() != null && !this.idJefe.equals(other.idJefe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Jefe[ id=" + getIdJefe() + " ]";
    }
    
}
