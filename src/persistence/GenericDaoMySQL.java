package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoMySQL {

	public GenericDaoMySQL() {
		super();
	}

	private Connection c;

	public Connection getConnection() throws ClassNotFoundException, SQLException {
	    String hostName = "localhost";
	    String dbname = "escola";
	    String user = "root";
	    String senha = "123456";

	    Class.forName("com.mysql.cj.jdbc.Driver");

	    // Adicione "?serverTimezone=UTC" à string de conexão
	    c = DriverManager.getConnection(String.format("jdbc:mysql://%s:3306/%s?serverTimezone=UTC", hostName, dbname), user, senha);

	    return c;
	}


}
