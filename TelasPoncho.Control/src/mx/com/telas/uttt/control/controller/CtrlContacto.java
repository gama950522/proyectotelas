package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Contacto;
import mx.com.telas.uttt.data.entity.Direccion;
import mx.com.telas.uttt.data.entity.Empresa;
import mx.com.telas.uttt.data.entity.Proveedor;
import mx.com.telas.uttt.data.entity.Telefono;

/**
 *
 * @author AlexisGasga
 */
public class CtrlContacto implements IOperaciones{

    private Connection connection;
    
    public CtrlContacto(Connection connection) {
        this.connection = connection;
    }

    
    @Override
    public boolean add(Object o) {
        Contacto contacto = (Contacto)o;
        try {
            PreparedStatement query = null;// = connection.prepareStatement("insert into Contacto (idProveedor, idDireccion, idTelefono) values (?,?,?)");
            if (contacto.getIdDireccion() != null && contacto.getIdTelefono() != null) {
                query = connection.prepareStatement("insert into Contacto (idProveedor, idDireccion, idTelefono) values (?,?,?)");
                query.setInt(1, contacto.getIdProveedor().getIdProveedor());
                query.setInt(2, contacto.getIdDireccion().getIdDireccion());
                query.setInt(3, contacto.getIdTelefono().getIdTelefono());
            } else if(contacto.getIdDireccion() != null && contacto.getIdTelefono() == null) {
                query = connection.prepareStatement("insert into Contacto (idProveedor, idDireccion) values (?,?)");
                query.setInt(1, contacto.getIdProveedor().getIdProveedor());
                query.setInt(2, contacto.getIdDireccion().getIdDireccion());
            } else if (contacto.getIdDireccion() == null && contacto.getIdTelefono() != null) {
                query = connection.prepareStatement("insert into Contacto (idProveedor, idTelefono) values (?,?)");
                query.setInt(1, contacto.getIdProveedor().getIdProveedor());
                query.setInt(2, contacto.getIdTelefono().getIdTelefono());
            }
            query.execute();
            query.close();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "CtrlContacto\nadd(Object o)" + ex);
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
    
    public List<Object> find(Proveedor proveedor) throws SQLException {
        List<Object> lstContacto = null;
        CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
        CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
        try {
            PreparedStatement query = connection.prepareStatement("select * from Contacto where idProveedor=" + proveedor.getIdProveedor());
            ResultSet rs = query.executeQuery();
            lstContacto = new LinkedList<>();
            while (rs.next()) {
                Contacto temp = new Contacto();
                temp.setIdContacto(rs.getInt(1));
                temp.setIdProveedor(proveedor);
                temp.setIdDireccion((Direccion) ctrlDireccion.find(rs.getInt(3)));
                temp.setIdTelefono((Telefono)ctrlTelefono.find(rs.getInt(4)));
                lstContacto.add(temp);
            }
            query.close();
            return lstContacto;
        } catch (SQLException ex) {
            throw ex;//new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
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
