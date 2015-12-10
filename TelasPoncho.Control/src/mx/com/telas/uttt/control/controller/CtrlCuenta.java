package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Cuenta;

/**
 *
 * @author AlexisGasga
 */
public class CtrlCuenta implements IOperaciones {

    private Connection conexion;

    public CtrlCuenta(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean add(Object o) {
        Cuenta cuenta = (Cuenta) o;
        try {
            PreparedStatement query = conexion.prepareStatement("insert into Cuenta (usuario, password) values (?,?) ");
            query.setString(1, cuenta.getUsuario());
            query.setString(2, cuenta.getPassword());
            query.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean edit(Object o) {
        Cuenta cuenta = (Cuenta) o;
        try {
            PreparedStatement query = conexion.prepareStatement("update Cuenta set usuario=?, password=? where idCuenta=?");
            query.setString(1, cuenta.getUsuario());
            query.setString(2, cuenta.getPassword());
            query.setInt(3, cuenta.getIdCuenta());
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
            PreparedStatement query = conexion.prepareStatement("delete from Cuenta where idCuenta=?");
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> find(List<Object> lst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object find(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object find(Integer id) {
        Cuenta cuenta = null;
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Cuenta where idCuenta = " + id);
            ResultSet result = query.executeQuery();
            if(result.next()){
                cuenta = new Cuenta();
                cuenta.setIdCuenta(result.getInt(1));
                cuenta.setUsuario(result.getString(2));
                cuenta.setPassword(result.getString(3));
            }
            return cuenta;
        }catch(Exception ex){
            return cuenta;
        }
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLastID() {
        try{
            PreparedStatement query = conexion.prepareStatement("select max(idCuenta) from Cuenta");
            ResultSet result = query.executeQuery();
            return (result.next() ? result.getInt(1) : 0);
        }catch(Exception ex){
            return 0;
        }
    }

    @Override
    public Object getLastField() {
        return find(getLastID());
    }

}
