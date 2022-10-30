
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Paginacao {

    
    public static void main(String[] args) throws SQLException {
     
       
    	CriaConexao criaConexao = new CriaConexao();
    	Connection connection = criaConexao.recuperarConexao();
    	Scanner input = new Scanner(System.in);
    	
    	int qualPag = 3;
    	int qualNum = 11;  	  
        
        while (qualPag != 2 && qualPag != 1) {
        System.out.println("Existem 2 páginas disponíveis, qual você quer visualizar?");
		qualPag = input.nextInt();
        }
        
        while (qualNum > 10) {
		System.out.println("Quantos itens você deseja visualizar na página? O limite é 10");
		qualNum = input.nextInt();
        }
		
    	PreparedStatement stm = connection.prepareStatement("select id, nome, descricao, ano from tabela_filmes where pagina = ? limit ?", Statement.RETURN_GENERATED_KEYS);
		stm.setInt(1, qualPag);
		stm.setInt(2, qualNum);


		stm.execute();
        ResultSet resultado = stm.getResultSet();

        
        while(resultado.next()) {
        	Integer id = resultado.getInt("id");
        	String nome = resultado.getString("nome");
        	String descricao = resultado.getString("descricao");
        	Integer ano = resultado.getInt("ano");

        	System.out.println("Id: " + id + "| Nome: " + nome + "| Descrição: " + descricao + "| Ano: " + ano);
        }
        
        
        
        
        
    }
}
        
        
        
        

    
    

