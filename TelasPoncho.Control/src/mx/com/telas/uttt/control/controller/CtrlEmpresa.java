package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Empresa;

/**
 *
 * @author AlexisGasga
 */
public class CtrlEmpresa implements IOperaciones{

    private Connection connection;
    
    public CtrlEmpresa(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean add(Object o) {
        Empresa empresa = (Empresa)o;
        try{
            PreparedStatement query = connection.prepareStatement("insert into empresa (razonSocial, rfc, gerenteGeneral,referencia, webSite, email) values (?,?,?,?,?,?)");
            query.setString(1, empresa.getRazonSocial());
            query.setString(2, empresa.getRfc());
            query.setString(3, empresa.getGerenteGeneral());
            query.setString(4, empresa.getReferencia());
            query.setString(5, empresa.getWebSite());
            query.setString(6, empresa.getEmail());
            query.execute();
            query.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex,this.toString(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
            return false;
        }
    }

    @Override
    public boolean edit(Object o) {
        Empresa empresa = (Empresa)o;
        try {
            PreparedStatement query = connection.prepareStatement("update empresa set razonSocial=?, rfc=?, gerenteGeneral=?, webSite=?, email=? where idEmpresa=? ");
            query.setString(1, empresa.getRazonSocial());
            query.setString(2, empresa.getRfc());
            query.setString(3, empresa.getGerenteGeneral());
            query.setString(4, empresa.getWebSite());
            query.setString(5, empresa.getEmail());
            query.setInt(6, empresa.getIdEmpresa());
            query.execute();
            query.close();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "CtrlEmpresa\nedit(Object o)" + ex);
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        Empresa empresa = null;
        try{
            PreparedStatement query = connection.prepareStatement("select * from Empresa where idEmpresa= "+id);
            ResultSet result = query.executeQuery();
            if(result.next()){
                empresa = new Empresa();
                empresa.setIdEmpresa(result.getInt(1));
                empresa.setRazonSocial(result.getString(2));
                empresa.setRfc(result.getString(3));
                empresa.setGerenteGeneral(result.getString(4));
                empresa.setReferencia(result.getString(5));
                empresa.setWebSite(result.getString(6));
                empresa.setEmail(result.getString(7));
            }
            query.close();
            return empresa;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "find(Integer id)" + ex, this.toString(), JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
            return empresa;
        }
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLastID() {
        try {
            PreparedStatement query = connection.prepareStatement("select max(idEmpresa) from Empresa");
            ResultSet result = query.executeQuery();
            return (result.next()) ? result.getInt(1) : 0;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Object getLastField() {
        return find(getLastID());
        
    }
    
}
