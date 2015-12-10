package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Result;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Departamento;


/**
 *
 * @author AlexisGasga
 */
public class CtrlDepartamento implements IOperaciones{

    private Connection conexion;

    public CtrlDepartamento(Connection conexion) {
        this.conexion = conexion;
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
        List<Object> listaDepartamentos = null;
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Departamento");
            ResultSet resutl = query.executeQuery();
            listaDepartamentos = new ArrayList<>();
            while(resutl.next()){
                Departamento departamento = new Departamento();
                departamento.setIdDepartamento(resutl.getInt(1));
                departamento.setIdJefe(null);
                departamento.setNombre(resutl.getString(3));
                departamento.setFuncion(resutl.getString(4));
                listaDepartamentos.add(departamento);
            }
            query.close();
            return listaDepartamentos;
        }catch(Exception ex){
            System.out.println(this + "find()" + "\n" + ex);
            return listaDepartamentos;
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
        Departamento departamento = null;
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Departamento where idDepartamento=" + id);
            ResultSet resrult = query.executeQuery();
            if(resrult.next()){
                departamento = new Departamento();
                departamento.setIdDepartamento(resrult.getInt(1));
                departamento.setIdJefe(null);
                departamento.setNombre(resrult.getString(3));
                departamento.setFuncion(resrult.getString(4));
            }
            return departamento;
        }catch(Exception ex){
            System.err.println(ex);
            return departamento;
        }
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
