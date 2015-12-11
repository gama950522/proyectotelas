package mx.com.telas.uttt.control.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.telas.uttt.control.interfaces.IOperaciones;
import mx.com.telas.uttt.data.entity.Persona;

/**
 *
 * @author AlexisGasga
 */
public class CtrlPersona implements IOperaciones {

    private final Connection connection;

    public CtrlPersona(Connection conexion) {
        this.connection = conexion;
    }

    @Override
    public boolean add(Object o) {
        Persona persona = (Persona) o;
        try {
            PreparedStatement query = connection.prepareStatement("insert into Persona (nombre, aPaterno, aMaterno, edad, sexo, estadoCivil, fechaNacimiento) values (?,?,?,?,?,?,?) ");
            query.setString(1, persona.getNombre());
            query.setString(2, persona.getaPareno());
            query.setString(3, persona.getaMaterno());
            query.setInt(4, persona.getEdad());
            query.setString(5, persona.getSexo());
            query.setString(6, persona.getEstadoCivil());
            query.setDate(7, persona.getFechaNacimiento());
            query.execute();
            query.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(this + "\n add(Object o) \n" + ex);
            return false;
        }
    }

    @Override
    public boolean edit(Object o) {
        Persona persona = (Persona) o;
        try {
            PreparedStatement query = connection.prepareStatement("update Persona set nombre=?, aPaterno=?, aMaterno=?, edad=?, sexo=?, estadoCivil=?, fechaNacimiento=? where idPersona=?");
            query.setString(1, persona.getNombre());
            query.setString(2, persona.getaPareno());
            query.setString(3, persona.getaMaterno());
            query.setInt(4, persona.getEdad());
            query.setString(5, persona.getSexo());
            query.setString(6, persona.getEstadoCivil());
            query.setDate(7, persona.getFechaNacimiento());
            query.setInt(8, persona.getIdPersona());
            query.execute();
            query.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(this + "\n edit(Object o) \n" + ex);
            return false;
        }
    }

    @Override
    public boolean delete(Integer id) {
        try {
            PreparedStatement query = connection.prepareStatement("delete from Persona where idPersona=?");
            query.setInt(1, id);
            query.execute();
            query.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
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

    @Override
    public Object find(Integer id) {
        Persona persona = null;
        try{
            PreparedStatement query = connection.prepareStatement("select * from Persona where idPersona = " + id);
            ResultSet result = query.executeQuery();
            if(result.next()){
                persona = new Persona();
                persona.setIdPersona(result.getInt(1));
                persona.setNombre(result.getString(2));
                persona.setaPareno(result.getString(3));
                persona.setaMaterno(result.getString(4));
                persona.setEdad(result.getInt(5));
                persona.setSexo(result.getString(6));
                persona.setEstadoCivil(result.getString(7));
                persona.setFechaNacimiento(result.getDate(8));
            }
            query.close();
            return persona;
        }catch(Exception ex){
            System.err.println(ex);
            return persona;
        }
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLastID() {
        try{
            PreparedStatement query = connection.prepareStatement("select max(idPersona) from Persona");
            ResultSet result = query.executeQuery();
            return (result.next()) ? result.getInt(1) : 0;
        }catch(Exception ex){
            System.err.println(ex);
            return 0;
        }
    }

    @Override
    public Object getLastField() {
        return find(getLastID());
    }

}
