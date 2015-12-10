package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Estado;

/**
 *
 * @author AlexisGasga
 */
public class CtrlEstado implements IOperaciones {

    private Connection conexion;

    public CtrlEstado(Connection conexion) {
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
        List<Object> listaEstados = null;
        try {
            PreparedStatement query = conexion.prepareStatement("select * from Estado order by estado");
            ResultSet resultado = query.executeQuery();
            if(!resultado.wasNull()){
                listaEstados = new ArrayList<>();
                while(resultado.next()){
                    Estado temp = new Estado();
                    temp.setIdEstado(resultado.getInt(1));
                    temp.setClave(resultado.getString(2));
                    temp.setEstado(resultado.getString(3));
                    temp.setAbreviatura(resultado.getString(4));
                    listaEstados.add(temp);
                }
            }
            query.close();
            return listaEstados;
        } catch (Exception ex) {
            System.out.println(this + "find()" + "\n" + ex);
            return listaEstados;
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
        Estado estado = null;
        try {
            PreparedStatement query = conexion.prepareStatement("select * from Estado where idEstado = " + id + " order by estado");
            ResultSet resultado = query.executeQuery();
            if(resultado.next()){
                estado = new Estado();
                estado.setIdEstado(resultado.getInt(1));
                estado.setEstado(resultado.getString(2));
                estado.setClave(resultado.getString(3));
                estado.setAbreviatura(resultado.getString(4));
            }
            query.close();
            return estado;
        } catch (Exception ex) {
            System.out.println(this + "Find(Integer " + id + ")" + "\n" + ex);
            return estado;
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
