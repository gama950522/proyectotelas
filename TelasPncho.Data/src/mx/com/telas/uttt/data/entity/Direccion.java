package mx.com.telas.uttt.data.entity;

/**
 *
 * @author AlexisGasga
 */
public class Direccion {

    private Integer idDireccion;
    //private Proveedor idProveedor;
    //private Estado idEstado;
    //private Municipio idMunicipio;
    private Localidad idLocalidad;
    private String calle;
    private String numInterior;
    private String numExterior;
    private String codigoPostal;

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    /*
     public Proveedor getIdProveedor(){
     return idProveedor;
     }
    
     public void setIdProveedor(Proveedor proveedor){
     this.idProveedor = proveedor;
     }
    
     public Estado getIdEstado() {
     return idEstado;
     }

     public void setIdEstado(Estado idEstado) {
     this.idEstado = idEstado;
     }

     public Municipio getIdMunicipio() {
     return idMunicipio;
     }

     public void setIdMunicipio(Municipio idMunicipio) {
     this.idMunicipio = idMunicipio;
     }*/
    public Localidad getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Localidad idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumInterior() {
        return numInterior;
    }

    public void setNumInterior(String numInterior) {
        this.numInterior = numInterior;
    }

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdDireccion() != null ? getIdDireccion().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idDireccion fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.getIdDireccion() == null && other.getIdDireccion() != null) || (this.getIdDireccion() != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Direccion[ id=" + getIdDireccion() + " ]";
    }

}
