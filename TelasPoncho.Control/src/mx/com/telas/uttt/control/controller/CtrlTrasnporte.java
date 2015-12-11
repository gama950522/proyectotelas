package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Caracteristica;
import mx.com.telas.uttt.data.entity.Empleado;
import mx.com.telas.uttt.data.entity.Transporte;

/**
 *
 * @author Alexis Gasga
 */
public class CtrlTrasnporte implements IOperaciones{

    private final Connection connection;
    
    public CtrlTrasnporte(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean add(Object o) {
        Transporte transporte = (Transporte)o;
        try {
            PreparedStatement query = connection.prepareStatement("insert into Transporte (idCaracteristica, idEmpleado, agencia, year, velocidad, unidadVelocidad, matricula, peso, unidadPeso, capasidad, unidadCapasidad, activo, disponible, tieneRutas) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            query.setInt(1, transporte.getIdCaracteristica().getIdCaracteristica());
            query.setInt(2, transporte.getIdEmpleado().getIdEmpleado());
            query.setString(3, transporte.getAgencia());
            query.setInt(4, transporte.getYear());
            query.setDouble(5, transporte.getVelocidad());
            query.setString(6, transporte.getUnidadVelocidad());
            query.setString(7, transporte.getMatricula());
            query.setDouble(8, transporte.getPeso());
            query.setString(9, transporte.getUnidadPeso());
            query.setDouble(10, transporte.getCapasidad());
            query.setString(11, transporte.getUnidadCapasidad());
            query.setBoolean(12, transporte.getActivo());
            query.setBoolean(13, transporte.getDisponible());
            query.setBoolean(14, transporte.getTieneRutas());
            query.execute();
            query.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean edit(Object o) {
        Transporte transporte = (Transporte)o;
        try {
            PreparedStatement query = connection.prepareStatement("update Transporte set idEmpleado=?, agencia=?, year=?, velocidad=?, unidadVelocidad=?, matricula=?, peso=?, unidadPeso=?, capasidad=?, unidadCapasidad=?, activo=?, disponible=?, tieneRutas=? where idTransporte=?");
            query.setInt(1, transporte.getIdEmpleado().getIdEmpleado());
            query.setString(2, transporte.getAgencia());
            query.setInt(3, transporte.getYear());
            query.setDouble(4, transporte.getVelocidad());
            query.setString(5, transporte.getUnidadVelocidad());
            query.setString(6, transporte.getMatricula());
            query.setDouble(7, transporte.getPeso());
            query.setString(8, transporte.getUnidadPeso());
            query.setDouble(9, transporte.getCapasidad());
            query.setString(10, transporte.getUnidadCapasidad());
            query.setBoolean(11, transporte.getActivo());
            query.setBoolean(12, transporte.getDisponible());
            query.setBoolean(13, transporte.getTieneRutas());
            query.setInt(14, transporte.getIdTransporte());
            query.execute();
            query.close();
            return true;
        } catch (Exception ex) {
            System.err.println(ex);
            return false;
        }
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
            CtrlEmpleado ctrlEmp = new CtrlEmpleado(connection);
            PreparedStatement query = connection.prepareStatement("select * from Transporte");
            ResultSet rs = query.executeQuery();
            lstTrasporte = new ArrayList<>();
            while(rs.next()){
                Transporte temp = new Transporte();
                temp.setIdTransporte(rs.getInt(1));
                temp.setIdCaracteristica((Caracteristica) ctrlCaract.find(rs.getInt(2)));
                temp.setIdEmpleado((Empleado)ctrlEmp.find(rs.getInt(3)));
                temp.setAgencia(rs.getString(4));
                temp.setYear(rs.getInt(5));
                temp.setVelocidad(rs.getDouble(6));
                temp.setUnidadVelocidad(rs.getString(7));
                temp.setMatricula(rs.getString(8));
                temp.setPeso(rs.getDouble(9));
                temp.setUnidadPeso(rs.getString(10));
                temp.setCapasidad(rs.getDouble(11));
                temp.setUnidadCapasidad(rs.getString(12));
                temp.setActivo(rs.getBoolean(13));
                temp.setDisponible(rs.getBoolean(14));
                temp.setTieneRutas(rs.getBoolean(15));
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
