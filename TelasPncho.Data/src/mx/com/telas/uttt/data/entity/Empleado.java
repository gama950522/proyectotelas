package mx.com.telas.uttt.data.entity;

import java.sql.Date;


/**
 *
 * @author AlexisGasga
 */
public class Empleado {
    private Integer idEmpleado;
    private Persona idPersona;
    private Puesto idPuesto;
    private Turno idTurno;
    private Direccion idDireccion;
    private Telefono idTelefono;
    private Cuenta idCuenta;
    private String  email;
    private String numControl;
    private String curp;
    private String rfc;
    private String escolaridad;
    private Date fechaRegistro;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Puesto getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Puesto idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Turno getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Turno idTurno) {
        this.idTurno = idTurno;
    }

    public Direccion getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Direccion idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Telefono getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Telefono idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cuenta getIdCuenta(){
        return idCuenta;
    }
    
    public void setIdCuenta(Cuenta idCuenta){
        this.idCuenta = idCuenta;
    }
    
    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridadl(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdEmpleado() != null ? getIdEmpleado().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idEmpleado fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.getIdEmpleado() == null && other.getIdEmpleado() != null) || (this.getIdEmpleado() != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getIdPersona().getNombre() + " " + getIdPersona().getaPareno();
    }
    
}
