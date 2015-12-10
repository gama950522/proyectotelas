package mx.com.telas.uttt.data.entity;

import java.util.List;

/**
 *
 * @author AlexisGasga
 */
public class Proveedor {
    
    private Integer idProveedor;
    private Empresa idEmpresa;
    private List<Object> contacto;

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public List<Object> getContacto() {
        return contacto;
    }

    public void setContacto(List<Object> contacto) {
        this.contacto = contacto;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdProveedor() != null ? getIdProveedor().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idProveedor fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.getIdProveedor() == null && other.getIdProveedor() != null) || (this.getIdProveedor() != null && !this.idProveedor.equals(other.idProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Proveedor[ id=" + getIdProveedor() + " ]";
    }
    
}
