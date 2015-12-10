package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Departamento;
import mx.com.telas.uttt.data.entity.Puesto;

/**
 *
 * @author AlexisGasga
 */
public class CtrlPuesto implements IOperaciones{

    private Connection conexion;

    public CtrlPuesto(Connection conexion) {
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
        List<Object> listaPuestos = null;
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Puesto");
            ResultSet resultado = query.executeQuery();
            if (!resultado.wasNull()) {
                listaPuestos = new ArrayList<>();
                while(resultado.next()){
                    Puesto temp = new Puesto();
                    temp.setIdPuesto(resultado.getInt(1));
                    temp.setIdDepartamento(null);
                    temp.setIdPerfil(null);
                    temp.setNombre(resultado.getString(4));
                    temp.setSalario(resultado.getDouble(5));
                    temp.setFuncion(resultado.getString(6));
                    listaPuestos.add(temp);
                }
            }
            query.close();
            return listaPuestos;
        }catch(Exception ex){
            return listaPuestos;
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
        Puesto puesto = null;
        CtrlDepartamento ctrlDepartamento = new CtrlDepartamento(conexion);
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Puesto where idPuesto = " + id);
            ResultSet resrult = query.executeQuery();
            if(resrult.next()){
                puesto = new Puesto();
                puesto.setIdPuesto(resrult.getInt(1));
                puesto.setIdDepartamento((Departamento) ctrlDepartamento.find(resrult.getInt(2)));
                puesto.setIdPerfil(null);
                puesto.setNombre(resrult.getString(4));
                puesto.setSalario(resrult.getDouble(5));
                puesto.setFuncion(resrult.getString(6));
            }
            return puesto;
        }catch(Exception ex){
            System.err.println(this + "\nError en el metodo: Find(Integer id)\n" + ex);
            return puesto;
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
