import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriadorTabela {
    public static void main(String [] args){
        try (Connection conexao = ConexaoDB.conectar(); //try-with-resources
             Statement stmt = conexao.createStatement()) {

            // Definindo o comando SQL para criar a tabela
            String comandoSql = "CREATE TABLE IF NOT EXISTS produtos (" +
                    "id_produto INTEGER PRIMARY KEY," +
                    "nome_produto TEXT NOT NULL," +
                    "quantidade INTEGER," +
                    "preco REAL," +
                    "status TEXT" +
                    ")";
            System.out.println(comandoSql);

            //Executando o comando SQL
            stmt.execute(comandoSql);

            System.out.println("Tabela 'Produtos' criada com sucesso!");

        }
        catch (SQLException e ){
            // Este catch captura tnato exceções do execute quanto do auto-close
            System.err.println("Erro ao criar tabela ou fechar conexão: " + e.getMessage());
            e.printStackTrace(); //Esse comando mostra a sequencia de metodos chamadas que deu algum problema
        }
        //Conexão com o DB é fechada automaticamente aqui (ao sair do try-with-resources): A classe connection implementa a interface AutoCloseable
        //O try-with-resources foi criado especificamente para o fechamento automático de recursos. Java "sabe" que tudo dentro dos ( ) no try deve ser fechado.
        //A condição é: o recurso deve implementar AutoCloseable
    }
}
