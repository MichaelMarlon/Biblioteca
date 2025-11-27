package biblioteca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Gerenciacao {
	 
    /**
     * Retorna o próximo valor de nCadastrados para ser exibido/usado.
     * @param conn Conexão com o banco de dados.
     * @return O valor atual de nCadastrados na tabela.
     */
    public int getNomesCount() {
        String sql = "SELECT COUNT(id) FROM livros";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            if (rs.next()) {
                // Se a tabela estiver vazia, retorna 0. Senão, retorna a soma.
                return rs.getInt(1); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    /**
     * Retorna o próximo valor de nEmprestados para ser exibido/usado.
     * @param conn Conexão com o banco de dados.
     * @return O valor atual de nEmprestados na tabela.
     */
    public int getEmprestadosCount() {
        String sql = "SELECT COUNT(id) FROM livros WHERE status = 'EMPRESTADO'";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            if (rs.next()) {
                // Se a tabela estiver vazia, retorna 0. Senão, retorna a soma.
                return rs.getInt(1); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    // --- CADASTRO (btnCadastrar) ---
    public boolean cadastrarLivro(String id, String titulo, String autor, String classificacao, String ano, String leitor, String dataEmprestimo, String dataDevolucao, String status) {
        String sql = "INSERT INTO livros (id, titulo, autor, classificacao, ano, leitor, dataEmprestimo, dataDevolucao, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setString(2, titulo);
            stmt.setString(3, autor);
            stmt.setString(4, classificacao);
            stmt.setInt(5, Integer.parseInt(ano));
            stmt.setString(6, leitor);
            stmt.setString(7, dataEmprestimo);
            stmt.setString(8, dataDevolucao);
            stmt.setString(9, status);
            
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Objeto de ajuda para retornar os dados do livro, 
     * como a classe 'Moeda' que você criou.
     */
    public static class Livro {
        public String id;
        public String titulo;
        public String autor;
        public String classificacao;
        public String ano;
        public String leitor;
        public String dataEmprestimo;
        public String dataDevolucao;
        
        public String status;
    }
    
    // --- PROCURAR (btnProcurar) ---
    public Livro procurarLivro(String id, String titulo, String leitor) {
        // A query será montada dinamicamente, priorizando ID, depois Título, depois Leitor
        String sql = "SELECT * FROM livros WHERE ";
        if (!id.isEmpty()) {
            sql += "id = ?";
        } else if (!titulo.isEmpty()) {
            sql += "titulo = ?";
        } else if (!leitor.isEmpty()) {
            sql += "leitor = ?";
        } else {
            return null; // Nenhum critério de pesquisa
        }
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Define o parâmetro com base no critério usado
            if (!id.isEmpty()) {
                stmt.setInt(1, Integer.parseInt(id));
            } else if (!titulo.isEmpty()) {
                stmt.setString(1, titulo);
            } else if (!leitor.isEmpty()) {
                stmt.setString(1, leitor);
            }
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Livro livro = new Livro();
                    livro.id = rs.getString("id");
                    livro.titulo = rs.getString("titulo");
                    livro.autor = rs.getString("autor");
                    livro.classificacao = rs.getString("classificacao");
                    livro.ano = rs.getString("ano");
                    livro.leitor = rs.getString("leitor");
                    livro.dataEmprestimo = rs.getString("dataEmprestimo");
                    livro.dataDevolucao = rs.getString("dataDevolucao");
                    
                    livro.status = rs.getString("status");
                    return livro;
                }
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // --- EMPRESTAR (btnEmprestar) ---
    public boolean emprestarLivro(String id, String leitor, String dataEmprestimo, String dataDevolucao) {
        String status = "EMPRESTADO";
        String sql = "UPDATE livros SET leitor = ?, dataEmprestimo = ?, dataDevolucao = ?, status = ? WHERE id = ?";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, leitor);
            stmt.setString(2, dataEmprestimo);
            stmt.setString(3, dataDevolucao);
            stmt.setString(4, status);
            stmt.setInt(5, Integer.parseInt(id));
            
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // --- DEVOLVER (btnDevolver) ---
    public boolean devolverLivro(String id) {
        String status = "DISPONÍVEL";
        String sql = "UPDATE livros SET leitor = NULL, dataEmprestimo = NULL, dataDevolucao = NULL, status = ? WHERE id = ?";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, status);
            stmt.setInt(2, Integer.parseInt(id));
            
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // --- EXCLUIR (btnExcluir) ---
    public boolean excluirLivro(String id) {
        String sql = "DELETE FROM livros WHERE id = ?";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, Integer.parseInt(id));
            
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }
}
