package questao1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Random;

public class ModificaProduto {

	public static void main(String[] args) throws SQLException {


    	CriaConexao criaConexao = new CriaConexao();
    	Connection connection = criaConexao.recuperarConexao();
    	Statement stm = connection.createStatement();
    	
    	Scanner input = new Scanner(System.in);
    	
    	
    	int escolha;
    	int idAtualiza = 1;
    	int idExclui = 2;	
    	
    	
    		
		System.out.println("Selecione a operação que deseja realizar:");
		System.out.println("1 - Adicionar 3 itens.");
		System.out.println("2 - Atualizar o primeiro item adicionado na última operação número 1");
		System.out.println("3 - Excluir o segundo item adicionado na última operação número 1");
		System.out.println("0 - Encerrar o programa");
		escolha = input.nextInt();


while (escolha != 0) {
    switch (escolha) {
    case 1:
    	int i = 0;
    	while(i <=2) {

        	Random aleatorio = new Random();
        	int extra = aleatorio.nextInt(10000);
    			PreparedStatement st = connection.prepareStatement("insert into tabela_itens (nome, descricao, quantidade, preco) values (?,?,2,1.5)", Statement.RETURN_GENERATED_KEYS);
    			st.setString(1, "refrigerante" + extra);
    			st.setString(2, "refrigerante do tipo" + extra);
    			st.execute();
    			
    			
    	i ++;
    	ResultSet rst = st.getGeneratedKeys();
    	while(rst.next()) {
    		Integer id = rst.getInt(1);
    		idAtualiza = id - 2;
    		idExclui = id - 1;
    		System.out.println(id);
    	} }

    	System.out.println("Itens adicionados.");
		System.out.println("Selecione a operação que deseja realizar:");
		System.out.println("1 - Adicionar 3 itens.");
		System.out.println("2 - Atualizar o primeiro item adicionado na última operação número 1.");
		System.out.println("3 - Excluir o segundo item adicionado na última operação número 1.");
		System.out.println("0 - Encerrar o programa.");
		escolha = input.nextInt();

    	break;
    	
    case 2:
		stm.execute("update tabela_itens set quantidade = quantidade + 1, preco = preco + 2 where id = " + idAtualiza
				, Statement.RETURN_GENERATED_KEYS); 

		System.out.println("Item atualizado.");
		System.out.println("Selecione a operação que deseja realizar:");
		System.out.println("1 - Adicionar 3 itens.");
		System.out.println("2 - Atualizar o primeiro item adicionado na última operação número 1.");
		System.out.println("3 - Excluir o segundo item adicionado na última operação número 1.");
		System.out.println("0 - Encerrar o programa.");
		escolha = input.nextInt();

    	break;
    	
    case 3:
    	stm.execute("delete from tabela_itens where id =" + idExclui
				, Statement.RETURN_GENERATED_KEYS);

    	System.out.println("Item excluído.");
		System.out.println("Selecione a operação que deseja realizar:");
		System.out.println("1 - Adicionar 3 itens.");
		System.out.println("2 - Atualizar o primeiro item adicionado na última operação número 1.");
		System.out.println("3 - Excluir o segundo item adicionado na última operação número 1.");
		System.out.println("0 - Encerrar o programa.");
		escolha = input.nextInt();

    	break;
    		
    case 4:

    	System.out.println("Encerrando.");
    	input.close();
		connection.close();
    	break;
    	
    default:
    	
    	System.out.println("Comando não reconhecido, tente novamente.");
		escolha = input.nextInt();   
    
    }
}	
    	}
}