package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Caracteristica;
import mx.com.telas.uttt.data.entity.Transporte;

/**
 *
 * @author Alexis Gasga
 */
public class CtrlTrasnporte implements IOperaciones{

    private Connection connection;
    
    public CtrlTrasnporte(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        List<Object> lstTrasporte = null;
        try {
            CtrlCaracteristica ctrlCaract=new CtrlCaracteristica(connection);
            PreparedStatement query = connection.prepareStatement("select * from Transporte");
            ResultSet rs = query.executeQuery();
            lstTrasporte = new ArrayList<>();
            while(rs.next()){
                Transporte temp = new Transporte();
                temp.setIdTransporte(rs.getInt(1));
                temp.setIdCaracteristica((Caracteristica) ctrlCaract.find(rs.getInt(2)));
                lstTrasporte.add(temp);
            }
            query.close();
            return lstTrasporte;
        } catch (Exception ex) {
            System.err.println(ex);
            return lstTrasporte;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
