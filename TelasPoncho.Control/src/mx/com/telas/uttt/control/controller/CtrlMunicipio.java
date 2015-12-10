package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Estado;
import mx.com.telas.uttt.data.entity.Municipio;

/**
 *
 * @author AlexisGasga
 */
public class CtrlMunicipio implements IOperaciones {

    private Connection conexion;

    public CtrlMunicipio(Connection conexion) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Object> find(Estado idEstado) {
        List<Object> listaMunicipios = null;
        try {
            PreparedStatement query = conexion.prepareStatement("select * from Municipio where idEstado = " + idEstado.getIdEstado() + " order by nombre");
            ResultSet resultado = query.executeQuery();
            if(!resultado.wasNull()){
                listaMunicipios = new ArrayList<>();
                while(resultado.next()){
                    Municipio temp = new Municipio();
                    temp.setIdMunicipio(resultado.getInt(1));
                    temp.setIdEstado(idEstado);
                    temp.setClave(resultado.getString(3));
                    temp.setNombre(resultado.getString(4));
                    temp.setSigla(resultado.getString(5));
                    listaMunicipios.add(temp);
                }
            }
            query.close();
            return listaMunicipios;
        } catch (Exception e) {
            return listaMunicipios;
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
        Municipio municipio = null;
        CtrlEstado ctrlEstado = new CtrlEstado(conexion);
        try {
            PreparedStatement query = conexion.prepareStatement("select * from Municipio where idMunicipio = " + id + " order by nombre");
            ResultSet resultado = query.executeQuery();
            if(resultado.next()){
                municipio = new Municipio();
                municipio.setIdMunicipio(resultado.getInt(1));
                municipio.setIdEstado((Estado) ctrlEstado.find(resultado.getInt(2)));
                municipio.setClave(resultado.getString(3));
                municipio.setNombre(resultado.getString(4));
                municipio.setSigla(resultado.getString(5));
            }
            query.close();
            return municipio;
        } catch (Exception ex) {
            System.err.println(this + "Find(Integer " + id + ")" + "\n" + ex);
            return municipio;
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
