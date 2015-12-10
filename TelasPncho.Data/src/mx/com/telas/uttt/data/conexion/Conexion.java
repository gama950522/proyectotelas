package mx.com.telas.uttt.data.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AlexisGasga
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost/Industria_Textil";
//    private static String dataBase = "experimento1";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    private static Connection conexion;

    /*
     private static String getUrl() {
     return "jdbc:mysql://localhost/experimento1";
     }

     private static String getDataBase() {
     return "experimento1";
     }

     private static String getUser() {
     return "root";
     }

     private static String getPassword() {
     return "1234";
     }
     */
    
    public static Connection getConexion() throws ClassNotFoundException, SQLException {
        if (conexion == null) {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return conexion;
    }
}
