package biblioteca;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    // Configurações do Banco de Dados
   private static final String URL = "jdbc:mysql://localhost:3306/biblioteca"; // Altere se o endereço/porta for diferente
   private static final String USUARIO = "root"; // Altere para o seu usuário do MySQL
   private static final String SENHA = "maria"; // Altere para a sua senha do MySQL

   /**
    * Estabelece uma nova conexão com o banco de dados.
    * @return Objeto Connection se a conexão for bem-sucedida.
    */
   public static Connection getConnection() {
       try {
           // Carrega o driver JDBC (pode ser opcional dependendo da versão do JDBC)
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           // Retorna a conexão
           return DriverManager.getConnection(URL, USUARIO, SENHA);
           
       } catch (ClassNotFoundException e) {
           System.err.println("Erro: Driver JDBC do MySQL não encontrado. Verifique se o Connector/J está no classpath.");
           e.printStackTrace();
       } catch (SQLException e) {
           System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
           e.printStackTrace();
       }
       return null;
   }

   /**
    * Fecha a conexão com o banco de dados.
    * @param conn A conexão a ser fechada.
    */
   public static void closeConnection(Connection conn) {
       if (conn != null) {
           try {
               conn.close();
           } catch (SQLException e) {
               System.err.println("Erro ao fechar a conexão: " + e.getMessage());
           }
       }
   }
}


