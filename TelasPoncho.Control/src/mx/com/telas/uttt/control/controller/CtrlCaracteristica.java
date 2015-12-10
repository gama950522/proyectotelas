package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Caracteristica;

/**
 *
 * @author AlexisGasga
 */
public class CtrlCaracteristica implements IOperaciones{
    
    private Connection connection;
    
    public CtrlCaracteristica(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean add(Object o) {
        Caracteristica catacteristica = (Caracteristica)o;
        try{
            PreparedStatement query = connection.prepareStatement("insert into Caracteristica (marca, modelo, numSerie, costo, moneda) values (?,?,?,?,?)");
            query.setString(1, catacteristica.getMarca());
            query.setString(2, catacteristica.getModelo());
            query.setString(3, catacteristica.getNumSerie());
            query.setDouble(4, catacteristica.getCosto());
            query.setString(5, catacteristica.getMoneda());
            query.execute();
            query.close();
            return true;
        }catch(Exception ex){
            System.err.println(ex);
            return false;
        }
    }

    @Override
    public boolean edit(Object o) {
        Caracteristica catacteristica = (Caracteristica)o;
        try{
            PreparedStatement query = connection.prepareStatement("update Caracteristica set marca=?, modelo=?, numSerie=?, costo=?, moneda=? where idCaracteristica=?");
            query.setString(1, catacteristica.getMarca());
            query.setString(2, catacteristica.getModelo());
            query.setString(3, catacteristica.getNumSerie());
            query.setDouble(4, catacteristica.getCosto());
            query.setString(5, catacteristica.getMoneda());
            query.setInt(6, catacteristica.getIdCaracteristica());
            query.execute();
            query.close();
            return true;
        }catch(Exception ex){
            System.err.println(ex);
            return false;
        }
    }

    @Override
    public boolean delete(Integer id) {
        try{
            PreparedStatement query = connection.prepareStatement("delete from Caracteristica where idCaracteristica=?");
            query.setInt(1, id);
            query.execute();
            query.close();
            return true;
        }catch(Exception ex){
            System.err.println(ex);
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
        Caracteristica caracteristica = null;
        try {
            PreparedStatement query = connection.prepareStatement("select * from Caracteristica where idCaracteristica = "+ id);
            ResultSet rs =  query.executeQuery();
            if(rs.next()){
                caracteristica = new Caracteristica();
                caracteristica.setIdCaracteristica(rs.getInt(1));
                caracteristica.setMarca(rs.getString(2));
                caracteristica.setModelo(rs.getString(3));
                caracteristica.setNumSerie(rs.getString(4));
                caracteristica.setCosto(rs.getDouble(5));
                caracteristica.setMoneda(rs.getString(6));
            }
            query.close();
            return caracteristica;
        } catch (Exception ex) {
            System.err.println(ex);
            return caracteristica;
        }
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLastID() {
        Integer lastID = null;
        try {
            PreparedStatement query = connection.prepareStatement("select max(idCaracteristica) from Caracteristica");
            ResultSet rs = query.executeQuery();
            if(rs.next()){
                lastID= rs.getInt(1);
            }
            query.close();
            return lastID;
        } catch (Exception ex) {
            System.err.println(ex);
            return lastID;
        }
    }

    @Override
    public Object getLastField() {
        return find(getLastID());
    }
    
}
