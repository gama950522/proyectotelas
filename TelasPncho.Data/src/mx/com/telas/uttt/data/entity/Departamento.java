package mx.com.telas.uttt.data.entity;

/**
 *
 * @author AlexisGasga
 */
public class Departamento{
    
    private Integer idDepartamento;
    private Jefe idJefe;
    private String nombre;
    private String funcion;

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Jefe getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Jefe idJefe) {
        this.idJefe = idJefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdDepartamento() != null ? getIdDepartamento().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idDepartamento fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.getIdDepartamento() == null && other.getIdDepartamento() != null) || (this.getIdDepartamento() != null && !this.idDepartamento.equals(other.idDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
}
