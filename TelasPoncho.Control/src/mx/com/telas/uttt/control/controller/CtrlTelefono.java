package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Persona;
import mx.com.telas.uttt.data.entity.Telefono;


/**
 *
 * @author AlexisGasga
 */
public class CtrlTelefono implements IOperaciones{

    private Connection conexion;

    public CtrlTelefono(Connection conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public boolean add(Object o) {
        Telefono telefono = (Telefono) o;
        try {
            PreparedStatement query = conexion.prepareStatement("insert into Telefono (numero, tipo, descripcion) values (?,?,?) ");
            //query.setInt(1, telefono.getIdProveedor().getIdProveedor());
            query.setString(1, telefono.getNumero());
            query.setString(2, telefono.getTipo());
            query.setString(3, telefono.getDescripcion());
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
        Telefono telefono = (Telefono) o;
        try {
            PreparedStatement query = conexion.prepareStatement("update Telefono set numero=?, tipo=?, descripcion=? where idTelefono=?");
            query.setString(1, telefono.getNumero());
            query.setString(2, telefono.getTipo());
            query.setString(3, telefono.getDescripcion());
            query.setInt(4, telefono.getIdTelefono());
            query.execute();
            query.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Integer id) {
        try {
            PreparedStatement query = conexion.prepareStatement("delete from Telefono where idTelefono=?");
            query.setInt(1, id);
            query.execute();
            query.close();
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
        Telefono telefono = null;
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Telefono where idTelefono = " + id);
            ResultSet result = query.executeQuery();
            if(result.next()){
                telefono = new Telefono();
                telefono.setIdTelefono(result.getInt(1));
                telefono.setNumero(result.getString(2));
                telefono.setTipo(result.getString(3));
                telefono.setDescripcion(result.getString(4));
            }
            query.close();
            return telefono;
        }catch(Exception ex){
            return telefono;
        }
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLastID() {
        try{
            PreparedStatement query = conexion.prepareStatement("select max(idTelefono) from Telefono");
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
