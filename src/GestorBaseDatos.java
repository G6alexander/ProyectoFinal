import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorBaseDatos {
    private static final String URL = "jdbc:mysql://localhost:3306/libreria";
    private static final String USUARIO = "root";
    private static final String CLAVE = "AyEDgrupo6"; 

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
            return null;
        }
    }
}

