import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String URL_JDBC_PADRAO = "jdbc:sqlite:meu_banco_de_dados.db";
    //Caso o arquivo .db nao seja encontrado, o arquivo sera criado

    // ⚠️ ADICIONE ESTE BLOCO ESTÁTICO ⚠️
    static {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver SQLite carregado com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("ERRO: Driver SQLite não encontrado!");
            e.printStackTrace();
        }
    }

    // Metodo conectar padrão - Retorna um objeto do tipo connection:
    public static Connection conectar(){
        try {
            return DriverManager.getConnection(URL_JDBC_PADRAO);
        } catch (SQLException e){
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage()); //Mensagem de erro sai em vermelho
            return null; //Retorna null pois a conexão com o banco de dados não foi criada
        }
    }

    // Metodo para conectar com url, usuário e senha
    public static Connection conectarGenerico(String url, String usuario, String senha){
        try {
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch (SQLException e){
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }

}
