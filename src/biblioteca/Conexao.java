package biblioteca;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao{ 

   private static final String URL = "jdbc:mysql://localhost:3306/biblioteca"; // Altere se o endereço/porta for diferente
   private static final String USUARIO = "root"; // Altere para o seu usuário do MySQL
   private static final String SENHA = "maria"; // Altere para a sua senha do MySQL

  
   public static Connection getConnection() {
       try {
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           
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


