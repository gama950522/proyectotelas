package mx.com.telas.uttt.data.entity;

import java.util.List;

/**
 *
 * @author AlexisGasga
 */
public class Contacto {
    private Integer idContacto;
    private Telefono idTelefono;
    private Direccion idDireccion;
    private Proveedor idProveedor;

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public Telefono getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Telefono idTelefono) {
        this.idTelefono = idTelefono;
    }

    public Direccion getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Direccion idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    //public Empresa getIdEmpresa() {
    //    return idEmpresa;
    //}

    //public void setIdEmpresa(Empresa idEmpresa) {
    //    this.idEmpresa = idEmpresa;
    //}
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContacto != null ? idContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idContacto fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.idContacto == null && other.idContacto != null) || (this.idContacto != null && !this.idContacto.equals(other.idContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Contacto[ id=" + idContacto + " ]";
    }

    
}
