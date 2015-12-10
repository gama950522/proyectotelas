/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.telas.uttt.control.validacion;

import java.awt.Dialog;
import java.awt.Frame;
import mx.com.telas.uttt.control.interfaces.IValidaciones;
import mx.com.telas.uttt.data.entity.Empleado;

/**
 *
 * @author AlexisGasga
 */
public class ValEmpleado implements IValidaciones{

    private Dialog parent;
    private Empleado empleado;
    public ValEmpleado(Dialog parent, Empleado empleado) {
        this.empleado= empleado;
        this.parent = parent;
    }

    @Override
    public boolean isValid() {
        if(isNull()){
            return false;
        }
        if(isEmpty()){
            return false;
        }
        if(!isValidLength()){
            return false;
        }
        return true;
    }

    @Override
    public boolean isNull() {
        if(empleado==null){
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(empleado.getCurp().isEmpty()){
            return true;
        }
        if(empleado.getRfc().isEmpty()){
            return true;
        }
        if (empleado.getEscolaridad().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidLength() {
        if(empleado.getCurp().length() == 18){
            return true;
        }
        if(empleado.getRfc().length() == 12){
            return true;
        }
        return false;
    }

    @Override
    public boolean isEquals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
