package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Puesto;
import mx.com.telas.uttt.data.entity.Turno;

/**
 *
 * @author AlexisGasga
 */
public class CtrlTurno implements IOperaciones{

    private Connection conexion;

    public CtrlTurno(Connection conexion) {
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
        List<Object> listaTurnos = null;
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Turno");
            ResultSet resultado = query.executeQuery();
            if (!resultado.wasNull()) {
                listaTurnos = new ArrayList<>();
                while(resultado.next()){
                    Turno turno = new Turno();
                    turno.setIdTurno(resultado.getInt(1));
                    turno.setTurno(resultado.getString(2));
                    turno.setHoraEntrada(resultado.getTime(3));
                    turno.setHoraSalida(resultado.getTime(4));
                    listaTurnos.add(turno);
                }
            }
            query.close();
            return listaTurnos;
        }catch(Exception ex){
            System.out.println(this + "find()" + "\n" + ex);
            return listaTurnos;
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
        Turno turno = null;
        try{
            PreparedStatement query = conexion.prepareStatement("select * from Turno where idTurno = " + id);
            ResultSet resrult = query.executeQuery();
            if(resrult.next()){
                turno = new Turno();
                turno.setIdTurno(resrult.getInt(1));
                turno.setTurno(resrult.getString(2));
                turno.setHoraEntrada(resrult.getTime(3));
                turno.setHoraSalida(resrult.getTime(4));
            }
            return turno;
        }catch(Exception ex){
            return turno;
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
