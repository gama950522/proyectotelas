package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Localidad;
import mx.com.telas.uttt.data.entity.Municipio;


/**
 *
 * @author AlexisGasga
 */
public class CtrlLocalidad implements IOperaciones{
    private Connection conexion;

    public CtrlLocalidad(Connection conexion) {
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
    
    public List<Object> find(Municipio idMunicipio) {
        List<Object> listaLocalidades = null;
        try {
            PreparedStatement query = conexion.prepareStatement("select * from Localidad where idMunicipio = " + idMunicipio.getIdMunicipio() + " order by nombre");
            ResultSet resultado = query.executeQuery();
            if(!resultado.wasNull()){
                listaLocalidades = new ArrayList<>();
                while(resultado.next()){
                    Localidad temp = new Localidad();
                    temp.setIdLocalidad(resultado.getInt(1));
                    temp.setIdMunicipio(idMunicipio);
                    temp.setClave(resultado.getString(3));
                    temp.setNombre(resultado.getString(4));
                    temp.setLatitud(resultado.getString(5));
                    temp.setAltitud(resultado.getString(6));
                    temp.setLongitud(resultado.getString(7));
                    listaLocalidades.add(temp);
                }
            }
            //System.out.println(query.toString());
            query.close();
            return listaLocalidades;
        } catch (Exception e) {
            return listaLocalidades;
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
        Localidad localidad = null;
        CtrlMunicipio ctrlMunicipio = new CtrlMunicipio(conexion);
        try {
            PreparedStatement query = conexion.prepareStatement("select * from Localidad where idLocalidad = " + id + " order by nombre");
            ResultSet resultado = query.executeQuery();
            if(resultado.next()){
                localidad = new Localidad();
                localidad.setIdLocalidad(resultado.getInt(1));
                localidad.setIdMunicipio((Municipio) ctrlMunicipio.find(resultado.getInt(2)));
                localidad.setClave(resultado.getString(3));
                localidad.setNombre(resultado.getString(4));
                localidad.setLatitud(resultado.getString(5));
                localidad.setAltitud(resultado.getString(6));
                localidad.setLongitud(resultado.getString(7));
            }
            query.close();
            return localidad;
        } catch (Exception ex) {
            System.err.println(this + "Find(Integer " + id + ")" + "\n" + ex);
            return localidad;
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
