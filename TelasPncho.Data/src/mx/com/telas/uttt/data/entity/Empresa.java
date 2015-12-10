package mx.com.telas.uttt.data.entity;

/**
 *
 * @author AlexisGasga
 */
public class Empresa {

    private Integer idEmpresa;
    private String razonSocial;
    private String rfc;
    private String gerenteGeneral;
    private String referencia;
    private String email;
    private String webSite;
    
    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer id) {
        this.idEmpresa = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getGerenteGeneral() {
        return gerenteGeneral;
    }

    public void setGerenteGeneral(String gerenteGeneral) {
        this.gerenteGeneral = gerenteGeneral;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idEmpresa fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.telas.uttt.data.entity.Empresa[ id=" + idEmpresa + " ]";
    }

    
    
}
