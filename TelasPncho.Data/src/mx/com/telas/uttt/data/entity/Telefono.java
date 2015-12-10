package mx.com.telas.uttt.data.entity;

/**
 *
 * @author AlexisGasga
 */
public class Telefono {

    private Integer idTelefono;
    //private Proveedor idProveedor;
    private String numero;
    private String tipo;
    private String descripcion;

    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }
    /*
     public Proveedor getIdProveedor() {
     return idProveedor;
     }

     public void setIdProveedor(Proveedor idProveedor) {
     this.idProveedor = idProveedor;
     }*/

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdTelefono() != null ? getIdTelefono().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idTelefono fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.getIdTelefono() == null && other.getIdTelefono() != null) || (this.getIdTelefono() != null && !this.idTelefono.equals(other.idTelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Telefono[ id=" + getIdTelefono() + " ]";
    }

}
