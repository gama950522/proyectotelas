package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Caracteristica;
import mx.com.telas.uttt.data.entity.Departamento;
import mx.com.telas.uttt.data.entity.Maquinaria;

/**
 *
 * @author AlexisGasga
 */
public class CtrlMaquinaria implements IOperaciones{

    private Connection connection;
    
    public CtrlMaquinaria(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean add(Object o) {
        Maquinaria maquina = (Maquinaria)o;
        try {
            PreparedStatement query = connection.prepareStatement("insert into Maquinaria (idCaracteristica, idDepartamento, funcion) values (?,?,?)");
            query.setInt(1, maquina.getIdCaracteristica().getIdCaracteristica());
            query.setInt(2, maquina.getIdDepartamento().getIdDepartamento());
            query.setString(3, maquina.getFuncionamiento());
            query.execute();
            query.close();
            return true;
        } catch (Exception ex) {
            System.err.println(ex);
            return false;
        }
    }

    @Override
    public boolean edit(Object o) {
        Maquinaria maquina = (Maquinaria)o;
        try {
            PreparedStatement query = connection.prepareStatement("update Maquinaria set idDepartamento=?, funcion=? where idMaquinaria=?");
            query.setInt(1, maquina.getIdDepartamento().getIdDepartamento());
            query.setString(2, maquina.getFuncionamiento());
            query.setInt(3, maquina.getIdMaquinaria());
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
        List<Object> lstMaquinaria = null;
        try {
            CtrlCaracteristica ctrlCar = new CtrlCaracteristica(connection);
            CtrlDepartamento ctrlDep = new CtrlDepartamento(connection);
            PreparedStatement query = connection.prepareStatement("select * from Maquinaria");
            ResultSet rs = query.executeQuery();
            lstMaquinaria = new ArrayList<>();
            while(rs.next()){
                Maquinaria temp = new Maquinaria();
                temp.setIdMaquinaria(rs.getInt(1));
                temp.setIdCaracteristica((Caracteristica)ctrlCar.find(rs.getInt(2)));
                temp.setIdDepartamento((Departamento)ctrlDep.find(rs.getInt(3)));
                temp.setFuncionamiento(rs.getString(4));
                lstMaquinaria.add(temp);
            }
            query.close();
            return lstMaquinaria;
        } catch (Exception ex) {
            System.err.println(ex);
            return lstMaquinaria;
        }
    }
    
    public List<Object> find(int idDepartamento, String modelo) {
        List<Object> lstMaquinaria = null;
        try {
            CtrlCaracteristica ctrlCar = new CtrlCaracteristica(connection);
            CtrlDepartamento ctrlDep = new CtrlDepartamento(connection);
            PreparedStatement query = connection.prepareStatement("select * from Maquinaria where idDepartamento=? and idCaracteristica = (select idCaracteristica from Caracteristica where modelo=?)");
            query.setInt(1, idDepartamento);
            query.setString(2, modelo);
            ResultSet rs = query.executeQuery();
            lstMaquinaria = new ArrayList<>();
            while(rs.next()){
                Maquinaria temp = new Maquinaria();
                temp.setIdMaquinaria(rs.getInt(1));
                temp.setIdCaracteristica((Caracteristica)ctrlCar.find(rs.getInt(2)));
                temp.setIdDepartamento((Departamento)ctrlDep.find(rs.getInt(3)));
                temp.setFuncionamiento(rs.getString(4));
                lstMaquinaria.add(temp);
            }
            query.close();
            return lstMaquinaria;
        } catch (Exception ex) {
            System.err.println(ex);
            return lstMaquinaria;
        }
    }
    
    public List<Object> find(int idDepartamento) {
        List<Object> lstMaquinaria = null;
        try {
            CtrlCaracteristica ctrlCar = new CtrlCaracteristica(connection);
            CtrlDepartamento ctrlDep = new CtrlDepartamento(connection);
            PreparedStatement query = connection.prepareStatement("select * from Maquinaria where idDepartamento=?");
            query.setInt(1, idDepartamento);
            ResultSet rs = query.executeQuery();
            lstMaquinaria = new ArrayList<>();
            while(rs.next()){
                Maquinaria temp = new Maquinaria();
                temp.setIdMaquinaria(rs.getInt(1));
                temp.setIdCaracteristica((Caracteristica)ctrlCar.find(rs.getInt(2)));
                temp.setIdDepartamento((Departamento)ctrlDep.find(rs.getInt(3)));
                temp.setFuncionamiento(rs.getString(4));
                lstMaquinaria.add(temp);
            }
            query.close();
            return lstMaquinaria;
        } catch (Exception ex) {
            System.err.println(ex);
            return lstMaquinaria;
        }
    }
    
    public List<Object> find(String modelo) {
        List<Object> lstMaquinaria = null;
        try {
            CtrlCaracteristica ctrlCar = new CtrlCaracteristica(connection);
            CtrlDepartamento ctrlDep = new CtrlDepartamento(connection);
            PreparedStatement query = connection.prepareStatement("select * from Maquinaria where idCaracteristica in (select idCaracteristica from Caracteristica where modelo=?)");
            query.setString(1, modelo);
            ResultSet rs = query.executeQuery();
            lstMaquinaria = new ArrayList<>();
            while(rs.next()){
                Maquinaria temp = new Maquinaria();
                temp.setIdMaquinaria(rs.getInt(1));
                temp.setIdCaracteristica((Caracteristica)ctrlCar.find(rs.getInt(2)));
                temp.setIdDepartamento((Departamento)ctrlDep.find(rs.getInt(3)));
                temp.setFuncionamiento(rs.getString(4));
                lstMaquinaria.add(temp);
            }
            query.close();
            return lstMaquinaria;
        } catch (Exception ex) {
            System.err.println(ex);
            return lstMaquinaria;
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
