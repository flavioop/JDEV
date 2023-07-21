package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Realizar conexão com o banco de dados
 * @author Flavio
 *
 */

public class ConnectionDatabase {
	
	
	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp?autoRecconect=true";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	private ConnectionDatabase() {
		conectar();
	}
	
	private static void conectar() {
		try {
				if(connection == null) {
					Class.forName("org.postgresql.Driver");
					connection = DriverManager.getConnection(banco, user, password);
				}
			
		}catch(Exception exception) {
			throw new RuntimeException("Erro ao conectar com o banco de dados" + exception.getMessage());
			
		}
	}
	/**
	 * Retorna conexão com o banco de dados
	 * @return Conection SQL
	 */
	
	public static Connection getConnection() {
		return connection;
	}

}
