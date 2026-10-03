import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    private static final String HOST = "pg-prog2cerp-prog2cerp.c.aivencloud.com";
	private static final String PUERTO = "27995";
	private static final String BASE_DATOS = "foro";
	private static final String USUARIO = "avnadmin";
	private static final String PASSWORD = "AVNS_kQ-8sO0FbP5AQEWTTl4";

	private static final String URL = "jdbc:postgresql://"+HOST+":"+PUERTO+"/"+BASE_DATOS+"?sslmode=require";
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		}
		catch (ClassNotFoundException e){
			System.out.println("No se encontro el driver de MySQL (O postgresql) en el Classpath: "+ e.getMessage());
		}
	}
	
	public static Connection getConexion() throws SQLException {
		return DriverManager.getConnection(URL,USUARIO,PASSWORD);
	}

    public static void main(String[] args) {
        System.out.println("Intentando conectar a la base de datos...");
        
        try (Connection conexion = getConexion()) {
            if (conexion != null && !conexion.isClosed()) {
                System.out.println(" ¡Conexión exitosa a la base de datos '" + BASE_DATOS + "'!");
            } else {
                System.out.println(" La conexión falló (la conexión es nula o está cerrada).");
            }
        } catch (SQLException e) {
            System.out.println(" Error de SQL al intentar conectar:");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("Código de error: " + e.getErrorCode());
        }
    }
}
