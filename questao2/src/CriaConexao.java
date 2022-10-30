import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {
	
	String url = "jdbc:mysql://localhost:3306/filmes?useTimezone=true&serverTimezone=UTC";
	String nome = "java";
    String senha = "password";
    String nomeTeste = "root";
    String senhaTeste = "8acl";
    
	
	public Connection recuperarConexao() throws SQLException {
	        
	       return DriverManager.getConnection(url, nomeTeste, senhaTeste);
	        
	}

}
