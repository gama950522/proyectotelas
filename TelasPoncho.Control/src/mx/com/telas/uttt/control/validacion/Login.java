package mx.com.telas.uttt.control.validacion;

import mx.com.telas.uttt.data.entity.Empleado;

/**
 *
 * @author AlexisGasga
 */
public class Login extends Object{
    public static final String USER = "root";
    public static final String PASSWORD = "4321";
    private static Empleado empleado;

    public static Empleado getEmpleado() {
        return empleado;
    }

    public static void setEmpleado(Empleado aEmpleado) {
        empleado = aEmpleado;
    }

}
