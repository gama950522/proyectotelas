package mx.com.telas.uttt.data.entity;

/**
 *
 * @author Alexis Gasga
 */
public class Transporte {
    private Integer idTransporte;
    private Caracteristica idCaracteristica;

    public Integer getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Integer id) {
        this.idTransporte = id;
    }

    public Caracteristica getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(Caracteristica idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransporte != null ? idTransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transporte)) {
            return false;
        }
        Transporte other = (Transporte) object;
        if ((this.idTransporte == null && other.idTransporte != null) || (this.idTransporte != null && !this.idTransporte.equals(other.idTransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Transporte[ id=" + idTransporte + " ]";
    }
    
}
