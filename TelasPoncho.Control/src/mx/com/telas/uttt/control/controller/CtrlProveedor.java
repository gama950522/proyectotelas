package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Empresa;
import mx.com.telas.uttt.data.entity.Proveedor;

/**
 *
 * @author AlexisGasga
 */
public class CtrlProveedor implements IOperaciones{

    private Connection connection;

    public CtrlProveedor(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public boolean add(Object o) {
        Proveedor proveedor = (Proveedor)o;
        try{
            PreparedStatement query = connection.prepareStatement("insert into proveedor(idEmpresa) values(?)");
            query.setInt(1, proveedor.getIdEmpresa().getIdEmpresa());
            query.execute();
            query.close();
            return true;
        }catch(Exception ex){
            System.err.println("CtrlProveedor\nadd(Object o)\n"+ex);
            return false;
        }
    }

    @Override
    public boolean edit(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> find() {
        CtrlEmpresa ctrlEmpresa = new CtrlEmpresa(connection);
        List<Object> listaProvedoores = null;
        try {
            PreparedStatement query = connection.prepareStatement("select * from Proveedor");
            ResultSet result = query.executeQuery();
            listaProvedoores = new ArrayList<>();
            while(result.next()){
                Proveedor provTemp = new Proveedor();
                provTemp.setIdProveedor(result.getInt(1));
                provTemp.setIdEmpresa((Empresa) ctrlEmpresa.find(result.getInt(2)));
                listaProvedoores.add(provTemp);
            }
            query.close();
            return listaProvedoores;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    public List<Object> find(String referencia) {
        CtrlEmpresa ctrlEmpresa = new CtrlEmpresa(connection);
        List<Object> listaProvedoores = null;
        try {
            PreparedStatement query = connection.prepareStatement("select * from Proveedor where idEmpresa=(select idEmpresa from Empresa where referencia='"+referencia+"')");
            ResultSet result = query.executeQuery();
            listaProvedoores = new ArrayList<>();
            while(result.next()){
                Proveedor provTemp = new Proveedor();
                provTemp.setIdProveedor(result.getInt(1));
                provTemp.setIdEmpresa((Empresa) ctrlEmpresa.find(result.getInt(2)));
                listaProvedoores.add(provTemp);
            }
            query.close();
            return listaProvedoores;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
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
        CtrlEmpresa ctrlEmpresa = new CtrlEmpresa(connection);
        Proveedor proveedor = null;
        try {
            PreparedStatement query = connection.prepareStatement("select * from Proveedor where idProveedor = "+id);
            ResultSet result = query.executeQuery();
            if(result.next()){
                proveedor = new  Proveedor();
                proveedor.setIdProveedor(result.getInt(1));
                proveedor.setIdEmpresa((Empresa) ctrlEmpresa.find(result.getInt(2)));
            }
            query.close();
            return proveedor;
        } catch (Exception ex) {
            return proveedor;
        }
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLastID() {
        try {
            PreparedStatement query = connection.prepareStatement("select max(idProveedor) from Proveedor");
            ResultSet result = query.executeQuery();
            return (result.next()) ? result.getInt(1) : 0;
        } catch (Exception ex) {
            System.out.println("getLastID()"+ex);
            return 0;
        }
    }

    @Override
    public Object getLastField() {
        return find(getLastID());
    }
    
}
