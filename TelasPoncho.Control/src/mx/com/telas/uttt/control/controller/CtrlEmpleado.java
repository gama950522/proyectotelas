package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Cuenta;
import mx.com.telas.uttt.data.entity.Departamento;
import mx.com.telas.uttt.data.entity.Direccion;
import mx.com.telas.uttt.data.entity.Empleado;
import mx.com.telas.uttt.data.entity.Persona;
import mx.com.telas.uttt.data.entity.Puesto;
import mx.com.telas.uttt.data.entity.Telefono;
import mx.com.telas.uttt.data.entity.Turno;

/**
 *
 * @author AlexisGasga
 */
public class CtrlEmpleado implements IOperaciones {

    private final Connection connection;

    public CtrlEmpleado(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean add(Object o) {
        Empleado empleado = (Empleado) o;
        try {
            PreparedStatement query = connection.prepareStatement("insert into Empleado (idPersona, idCuenta, idPuesto, idTurno, idDireccion, idTelefono, numControl, curp, rfc, escolaridad, fechaRegistro) values (?,?,?,?,?,?,?,?,?,?,?) ");
            query.setInt(1, empleado.getIdPersona().getIdPersona());
            query.setInt(2, empleado.getIdCuenta().getIdCuenta());
            query.setInt(3, empleado.getIdPuesto().getIdPuesto());
            query.setInt(4, empleado.getIdTurno().getIdTurno());
            query.setInt(5, empleado.getIdDireccion().getIdDireccion());
            query.setInt(6, empleado.getIdTelefono().getIdTelefono());
            query.setString(7, empleado.getNumControl());
            query.setString(8, empleado.getCurp());
            query.setString(9, empleado.getRfc());
            query.setString(10, empleado.getEscolaridad());
            query.setDate(11, empleado.getFechaRegistro());
            query.execute();
            query.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean edit(Object o) {
        Empleado empleado = (Empleado) o;
        try {
            PreparedStatement query = connection.prepareStatement("update Empleado set curp=?, rfc=?, escolaridad=? where idEmpleado=? ");
            query.setString(1, empleado.getCurp());
            query.setString(2, empleado.getRfc());
            query.setString(3, empleado.getEscolaridad());
            query.setInt(4, empleado.getIdEmpleado());
            query.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Integer id) {
        try {
            PreparedStatement query = connection.prepareStatement("delete from Empleado where idEmpleado=?");
            query.setInt(1, id);
            query.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Object> find() {
        List<Object> empleados = null;
        CtrlPersona ctrlPersona = new CtrlPersona(connection);
        CtrlCuenta ctrlCuenta = new CtrlCuenta(connection);
        CtrlPuesto ctrlPuesto = new CtrlPuesto(connection);
        CtrlTurno ctrlTurno = new CtrlTurno(connection);
        CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
        CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
        try {
            PreparedStatement query = connection.prepareStatement("select * from Empleado");
            ResultSet resultado = query.executeQuery();
            empleados = new ArrayList<>();
            while (resultado.next()) {
                Empleado temp = new Empleado();
                temp.setIdEmpleado(resultado.getInt(1));
                temp.setIdPersona((Persona) ctrlPersona.find(resultado.getInt(2)));
                temp.setIdCuenta((Cuenta) ctrlCuenta.find(resultado.getInt(3)));
                temp.setIdPuesto((Puesto) ctrlPuesto.find(resultado.getInt(4)));
                temp.setIdTurno((Turno) ctrlTurno.find(resultado.getInt(5)));
                temp.setIdDireccion((Direccion) ctrlDireccion.find(resultado.getInt(6)));
                temp.setIdTelefono((Telefono) ctrlTelefono.find(resultado.getInt(7)));
                temp.setNumControl(resultado.getString(8));
                temp.setCurp(resultado.getString(9));
                temp.setRfc(resultado.getString(10));
                temp.setEscolaridadl(resultado.getString(11));
                temp.setFechaRegistro(resultado.getDate(12));
                empleados.add(temp);
            }
            query.close();
            return empleados;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return empleados;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> find(List<Object> lst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object find(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Object> find(String nombre, Departamento departamento, Turno turno) {
        List<Object> empleados = null;
        CtrlPersona ctrlPersona = new CtrlPersona(connection);
        CtrlCuenta ctrlCuenta = new CtrlCuenta(connection);
        CtrlPuesto ctrlPuesto = new CtrlPuesto(connection);
        CtrlTurno ctrlTurno = new CtrlTurno(connection);
        CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
        CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
        try {
            PreparedStatement query;
            if (departamento != null && turno != null) {
                query = connection.prepareStatement("select * from empleado where idPersona in ("
                        + "     select idPersona from Persona where nombre like'" + nombre + "%') "
                        + "and idPuesto in  ("
                        + "     select idPuesto from Puesto where idDepartamento=?) and idTurno=?");
                query.setInt(1, departamento.getIdDepartamento());
                query.setInt(2, turno.getIdTurno());
            } else if (turno == null && departamento != null) {
                query = connection.prepareStatement("select * from empleado where idPersona in ("
                        + "     select idPersona from Persona where nombre like'" + nombre + "%')"
                        + " and idPuesto in ("
                        + "     select idPuesto from Puesto where idDepartamento=?)");
                query.setInt(1, departamento.getIdDepartamento());
            } else if (departamento == null && turno != null) {
                query = connection.prepareStatement("select * from empleado where idPersona in ("
                        + "     select idPersona from Persona where nombre like'" + nombre + "%')"
                        + " and idTurno=?");
                query.setInt(1, turno.getIdTurno());
            } else {
                query = connection.prepareStatement("select * from empleado where idPersona in ("
                        + "     select idPersona from Persona where nombre like'" + nombre + "%')");
            }
            //System.out.println(query);
            ResultSet resultado = query.executeQuery();
            empleados = new ArrayList<>();
            while (resultado.next()) {
                Empleado temp = new Empleado();
                temp.setIdEmpleado(resultado.getInt(1));
                temp.setIdPersona((Persona) ctrlPersona.find(resultado.getInt(2)));
                temp.setIdCuenta((Cuenta) ctrlCuenta.find(resultado.getInt(3)));
                temp.setIdPuesto((Puesto) ctrlPuesto.find(resultado.getInt(4)));
                temp.setIdTurno((Turno) ctrlTurno.find(resultado.getInt(5)));
                temp.setIdDireccion((Direccion) ctrlDireccion.find(resultado.getInt(6)));
                temp.setIdTelefono((Telefono) ctrlTelefono.find(resultado.getInt(7)));
                temp.setNumControl(resultado.getString(8));
                temp.setCurp(resultado.getString(9));
                temp.setRfc(resultado.getString(10));
                temp.setEscolaridadl(resultado.getString(11));
                temp.setFechaRegistro(resultado.getDate(12));
                empleados.add(temp);
            }
            query.close();
            return empleados;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return empleados;
        }
    }

    public Object find(String user, String password) {
        Empleado empleados = null;
        CtrlPersona ctrlPersona = new CtrlPersona(connection);
        CtrlCuenta ctrlCuenta = new CtrlCuenta(connection);
        CtrlPuesto ctrlPuesto = new CtrlPuesto(connection);
        CtrlTurno ctrlTurno = new CtrlTurno(connection);
        CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
        CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
        try {
            PreparedStatement query = connection.prepareStatement("select * from empleado where idCuenta = (select idCuenta from Cuenta where usuario=? and password=?)");
            query.setString(1, user);
            query.setString(2, password);
            ResultSet resultado = query.executeQuery();
            if (resultado.next()) {
                empleados = new Empleado();
                empleados.setIdEmpleado(resultado.getInt(1));
                empleados.setIdPersona((Persona) ctrlPersona.find(resultado.getInt(2)));
                empleados.setIdCuenta((Cuenta) ctrlCuenta.find(resultado.getInt(3)));
                empleados.setIdPuesto((Puesto) ctrlPuesto.find(resultado.getInt(4)));
                empleados.setIdTurno((Turno) ctrlTurno.find(resultado.getInt(5)));
                empleados.setIdDireccion((Direccion) ctrlDireccion.find(resultado.getInt(6)));
                empleados.setIdTelefono((Telefono) ctrlTelefono.find(resultado.getInt(7)));
                empleados.setNumControl(resultado.getString(8));
                empleados.setCurp(resultado.getString(9));
                empleados.setRfc(resultado.getString(10));
                empleados.setEscolaridadl(resultado.getString(11));
                empleados.setFechaRegistro(resultado.getDate(12));
            }
            query.close();
            return empleados;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return empleados;
        }
    }

    @Override
    public Object find(Integer id) {
        Empleado empleado = null;
        try {
            PreparedStatement query = connection.prepareStatement("select * from Empleado where idEmpleado=?");
            query.setInt(1, id);
            ResultSet resultado = query.executeQuery();
            CtrlPersona ctrlPersona = new CtrlPersona(connection);
            CtrlCuenta ctrlCuenta = new CtrlCuenta(connection);
            CtrlPuesto ctrlPuesto = new CtrlPuesto(connection);
            CtrlTurno ctrlTurno = new CtrlTurno(connection);
            CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
            CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
            if (resultado.next()) {
                empleado = new Empleado();
                empleado.setIdEmpleado(resultado.getInt(1));
                empleado.setIdPersona((Persona) ctrlPersona.find(resultado.getInt(2)));
                empleado.setIdCuenta((Cuenta) ctrlCuenta.find(resultado.getInt(3)));
                empleado.setIdPuesto((Puesto) ctrlPuesto.find(resultado.getInt(4)));
                empleado.setIdTurno((Turno) ctrlTurno.find(resultado.getInt(5)));
                empleado.setIdDireccion((Direccion) ctrlDireccion.find(resultado.getInt(6)));
                empleado.setIdTelefono((Telefono) ctrlTelefono.find(resultado.getInt(7)));
                empleado.setNumControl(resultado.getString(8));
                empleado.setCurp(resultado.getString(9));
                empleado.setRfc(resultado.getString(10));
                empleado.setEscolaridadl(resultado.getString(11));
                empleado.setFechaRegistro(resultado.getDate(12));
                //empleados.add(temp);
            }
            query.close();
            return empleado;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return empleado;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLastID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getLastField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Object> findConductores() {
        List<Object> lstConductores = null;
        try {
            PreparedStatement query = connection.prepareStatement("select * from Empleado where idPuesto=5");
            ResultSet rs = query.executeQuery();
            lstConductores = new ArrayList<>();
            CtrlPersona ctrlPersona = new CtrlPersona(connection);
            CtrlCuenta ctrlCuenta = new CtrlCuenta(connection);
            CtrlPuesto ctrlPuesto = new CtrlPuesto(connection);
            CtrlTurno ctrlTurno = new CtrlTurno(connection);
            CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
            CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
            while (rs.next()) {
                Empleado temp = new Empleado();
                temp.setIdEmpleado(rs.getInt(1));
                temp.setIdPersona((Persona) ctrlPersona.find(rs.getInt(2)));
                temp.setIdCuenta((Cuenta) ctrlCuenta.find(rs.getInt(3)));
                temp.setIdPuesto((Puesto) ctrlPuesto.find(rs.getInt(4)));
                temp.setIdTurno((Turno) ctrlTurno.find(rs.getInt(5)));
                temp.setIdDireccion((Direccion) ctrlDireccion.find(rs.getInt(6)));
                temp.setIdTelefono((Telefono) ctrlTelefono.find(rs.getInt(7)));
                temp.setNumControl(rs.getString(8));
                temp.setCurp(rs.getString(9));
                temp.setRfc(rs.getString(10));
                temp.setEscolaridadl(rs.getString(11));
                temp.setFechaRegistro(rs.getDate(12));
                lstConductores.add(temp);
            }
            query.close();
            return lstConductores;
        } catch (Exception ex) {
            System.err.println(ex);
            return lstConductores;
        }
    }

}
