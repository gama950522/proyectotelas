package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Direccion;
import mx.com.telas.uttt.data.entity.Estado;
import mx.com.telas.uttt.data.entity.Localidad;
import mx.com.telas.uttt.data.entity.Municipio;


/**
 *
 * @author AlexisGasga
 */
public class CtrlDireccion implements IOperaciones{

    private Connection conexion;

    public CtrlDireccion(Connection conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public boolean add(Object o) {
        Direccion direccion = (Direccion) o;
        try {
            PreparedStatement query = conexion.prepareStatement("insert into Direccion (idLocalidad, calle, numInterior, numExterior, codigoPostal) values (?,?,?,?,?) ");
            query.setInt(1, direccion.getIdLocalidad().getIdLocalidad());
            query.setString(2, direccion.getCalle());
            query.setString(3, direccion.getNumInterior());
            query.setString(4, direccion.getNumExterior());
            query.setString(5, direccion.getCodigoPostal());
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
        Direccion direccion = (Direccion) o;
        try {
            PreparedStatement query = conexion.prepareStatement("update Direccion set idLocalidad=?, calle=?, numInterior=?, numExterior=?, codigoPostal=? where idDireccion=?");
            query.setInt(1, direccion.getIdLocalidad().getIdLocalidad());
            query.setString(2, direccion.getCalle());
            query.setString(3, direccion.getNumInterior());
            query.setString(4, direccion.getNumExterior());
            query.setString(5, direccion.getCodigoPostal());
            query.setInt(6, direccion.getIdDireccion());
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
            PreparedStatement query = conexion.prepareStatement("delete from Direccion where idDireccion=?");
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
        Direccion direccion = null;
        CtrlLocalidad ctrlLocalidad = new CtrlLocalidad(conexion);
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Direccion where idDireccion = " + id);
            ResultSet result = query.executeQuery();
            if(result.next()){
                direccion = new Direccion();
                direccion.setIdDireccion(result.getInt(1));
                direccion.setIdLocalidad((Localidad)ctrlLocalidad.find(result.getInt(2)));
                direccion.setCalle(result.getString(3));
                direccion.setNumInterior(result.getString(4));
                direccion.setNumExterior(result.getString(5));
                direccion.setCodigoPostal(result.getString(6));
            }
            query.close();
            return direccion;
        }catch(Exception ex){
            System.err.println(this + "Find(Integer " + id + ")" + "\n" + ex);
            return direccion;
        }
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLastID() {
        try{
            PreparedStatement query = conexion.prepareStatement("select max(idDireccion) from Direccion");
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
