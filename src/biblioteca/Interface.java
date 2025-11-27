package biblioteca;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import biblioteca.Gerenciacao;
public class Interface extends javax.swing.JFrame {
	  private Gerenciacao gerencia = new Gerenciacao();
	  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Interface.class.getName());

	    public Interface() {
	        initComponents();
	        atualizarContadores();
	    }
	 // Método auxiliar para atualizar os labels de contagem
	    private void atualizarContadores() {
	        // Assume que a tabela armazena a contagem atualizada em cada linha.
	        // O método getNomesCount/getEmprestadosCount na LivroDAO soma as colunas
	        // nCadastrados e nEmprestados de todas as linhas.
	        lblCadastrado2.setText(String.valueOf(gerencia.getNomesCount()));
	        lblEmprestado2.setText(String.valueOf(gerencia.getEmprestadosCount()));
	    }
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        lblPrincipal = new javax.swing.JLabel();
	        lblCadastrado = new javax.swing.JLabel();
	        lblEmprestado = new javax.swing.JLabel();
	        lblCadastrado2 = new javax.swing.JLabel();
	        lblEmprestado2 = new javax.swing.JLabel();
	        lblId = new javax.swing.JLabel();
	        txtId = new javax.swing.JTextField();
	        lblStatus = new javax.swing.JLabel();
	        lblDisponivel = new javax.swing.JLabel();
	        lblTitulo = new javax.swing.JLabel();
	        txtAutor = new javax.swing.JTextField();
	        lblAutor = new javax.swing.JLabel();
	        lblClassificacao = new javax.swing.JLabel();
	        txtClassificacao = new javax.swing.JTextField();
	        txtTitulo = new javax.swing.JTextField();
	        lblAno = new javax.swing.JLabel();
	        txtAno = new javax.swing.JTextField();
	        lblLeitor = new javax.swing.JLabel();
	        txtLeitor = new javax.swing.JTextField();
	        lblEmprestimo = new javax.swing.JLabel();
	        lblDevolucao = new javax.swing.JLabel();
	        txtEmprestimo = new javax.swing.JTextField();
	        txtDevolucao = new javax.swing.JTextField();
	        btnCadastrar = new javax.swing.JButton();
	        btnProcurar = new javax.swing.JButton();
	        btnDevolver = new javax.swing.JButton();
	        btnEmprestar = new javax.swing.JButton();
	        btnLimpar = new javax.swing.JButton();
	        btnExcluir = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        lblPrincipal.setFont(new java.awt.Font("Algerian", 0, 46)); // NOI18N
	        lblPrincipal.setForeground(new java.awt.Color(0, 153, 153));
	        lblPrincipal.setText("Biblioteca APAC");

	        lblCadastrado.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
	        lblCadastrado.setForeground(new java.awt.Color(0, 51, 102));
	        lblCadastrado.setText("LIVROS CADASTRADOS");

	        lblEmprestado.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
	        lblEmprestado.setForeground(new java.awt.Color(0, 51, 102));
	        lblEmprestado.setText("LIVROS EMPRESTADOS");

	        lblCadastrado2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
	        lblCadastrado2.setText("0");

	        lblEmprestado2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
	        lblEmprestado2.setText("0");

	        lblId.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblId.setForeground(new java.awt.Color(0, 51, 102));
	        lblId.setText("ID");

	        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
	        txtId.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                txtIdActionPerformed(evt);
	            }
	        });

	        lblStatus.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
	        lblStatus.setForeground(new java.awt.Color(0, 51, 102));
	        lblStatus.setText("STATUS LIVRO");

	        lblDisponivel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblDisponivel.setForeground(new java.awt.Color(0, 102, 51));
	        lblDisponivel.setText("");

	        lblTitulo.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblTitulo.setForeground(new java.awt.Color(0, 51, 102));
	        lblTitulo.setText("TÍTULO");

	        txtAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
	        txtAutor.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                txtAutorActionPerformed(evt);
	            }
	        });

	        lblAutor.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblAutor.setForeground(new java.awt.Color(0, 51, 102));
	        lblAutor.setText("AUTOR(A)");

	        lblClassificacao.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblClassificacao.setForeground(new java.awt.Color(0, 51, 102));
	        lblClassificacao.setText("CLASSIFICAÇÃO");

	        txtClassificacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
	        txtClassificacao.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                txtClassificacaoActionPerformed(evt);
	            }
	        });

	        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
	        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                txtTituloActionPerformed(evt);
	            }
	        });

	        lblAno.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblAno.setForeground(new java.awt.Color(0, 51, 102));
	        lblAno.setText("ANO");

	        txtAno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
	        txtAno.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                txtAnoActionPerformed(evt);
	            }
	        });

	        lblLeitor.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblLeitor.setForeground(new java.awt.Color(0, 51, 102));
	        lblLeitor.setText("LEITOR(A)");

	        txtLeitor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

	        lblEmprestimo.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblEmprestimo.setForeground(new java.awt.Color(0, 51, 102));
	        lblEmprestimo.setText("DATA EMPRÉSTIMO");

	        lblDevolucao.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
	        lblDevolucao.setForeground(new java.awt.Color(0, 51, 102));
	        lblDevolucao.setText("DATA DEVOLUÇÃO");

	        txtEmprestimo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

	        txtDevolucao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

	        btnCadastrar.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
	        btnCadastrar.setText("CADASTRAR LIVRO");

	        btnProcurar.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
	        btnProcurar.setText("PROCURAR LIVRO");

	        btnDevolver.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
	        btnDevolver.setText("DEVOLVER LIVRO");

	        btnEmprestar.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
	        btnEmprestar.setText("EMPRESTAR LIVRO");

	        btnLimpar.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
	        btnLimpar.setText("LIMPAR CAMPOS");
	        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnLimparActionPerformed(evt);
	            }
	        });

	        btnExcluir.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
	        btnExcluir.setText("EXCLUIR LIVRO");
	         // Adiciona ActionListeners para os novos botões
	        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnCadastrarActionPerformed(evt);
	            }
	        });

	        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnProcurarActionPerformed(evt);
	            }
	        });

	        btnEmprestar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnEmprestarActionPerformed(evt);
	            }
	        });

	        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnDevolverActionPerformed(evt);
	            }
	        });

	        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnExcluirActionPerformed(evt);
	            }
	        });
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(21, 21, 21)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(32, 32, 32)
	                        .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(btnEmprestar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(24, 24, 24)
	                        .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(26, 26, 26)
	                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(50, 50, 50))
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                        .addComponent(lblCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(lblCadastrado2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(26, 26, 26)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(lblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(lblEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(27, 27, 27)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(0, 0, Short.MAX_VALUE)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addGap(13, 13, 13)
	                                        .addComponent(lblEmprestado2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(277, 277, 277))
	                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                            .addComponent(lblDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                        .addGap(217, 217, 217))))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(0, 0, Short.MAX_VALUE))))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(lblClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(31, 31, 31)
	                                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addGap(628, 628, 628)
	                                .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addComponent(lblEmprestimo)
	                                        .addGap(26, 26, 26)
	                                        .addComponent(txtEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(99, 99, 99)
	                                        .addComponent(lblDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(txtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addComponent(lblLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(txtLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addGap(0, 0, Short.MAX_VALUE)))
	                        .addGap(185, 185, 185))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(txtClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(12, 12, 12))
	                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(34, 34, 34)))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addContainerGap())))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(lblPrincipal)
	                .addGap(32, 32, 32)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lblCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblEmprestado2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblCadastrado2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(51, 51, 51)
	                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(lblDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(18, 18, 18)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(23, 23, 23)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(24, 24, 24)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(txtClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(lblClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(32, 32, 32)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(45, 45, 45)
	                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(48, 48, 48)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lblDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(txtEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(txtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 101, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnEmprestar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(75, 75, 75))
	        );

	        pack();
	    }// </editor-fold>                        
	    private void limparCampos(){
	        txtId.setText("");
	        txtAutor.setText("");
	        txtClassificacao.setText("");
	        txtTitulo.setText("");
	        txtAno.setText("");
	        txtDevolucao.setText("");
	        txtEmprestimo.setText("");
	        txtLeitor.setText("");
	        lblDisponivel.setText("");
	        txtId.requestFocus();
	    }
	    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {                                      
	        // TODO add your handling code here:
	    }                                     

	    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    }                                        

	    private void txtClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
	        // TODO add your handling code here:
	    }                                                

	    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {                                          
	        // TODO add your handling code here:
	    }                                         

	    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {                                       
	        // TODO add your handling code here:
	    }                                      

	    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {                                          
	        limparCampos();
	        
	    }       
	     /**
	     * Lógica para o botão CADASTRAR LIVRO.
	     */
	    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
	        String id = txtId.getText();
	        String titulo = txtTitulo.getText();
	        String autor = txtAutor.getText();
	        String classificacao = txtClassificacao.getText();
	        String ano = txtAno.getText();
	        
	        if (id.isEmpty() || titulo.isEmpty() || autor.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "ID, Título e Autor são obrigatórios para o cadastro.", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        try {
	            // A palavra DISPONÍVEL deve ser gravada no campo status
	            String status = "DISPONÍVEL";
	            // O campo nCadastrados da tabela livros deve ser acrescentado mais 1
	            

	            boolean sucesso = gerencia.cadastrarLivro(
	                id, titulo, autor, classificacao, ano, 
	                "", "", "", // leitor, dataEmprestimo, dataDevolucao vazios no cadastro
	               status
	            );

	            if (sucesso) {
	                JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
	                limparCampos();
	                atualizarContadores();
	            } else {
	                JOptionPane.showMessageDialog(this, "Falha ao cadastrar livro. Verifique o ID (se é um número e se já existe).", "Erro", JOptionPane.ERROR_MESSAGE);
	            }
	            
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, "Erro durante o cadastro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	            logger.severe("Erro ao cadastrar: " + e.getMessage());
	        }
	    }

	    /**
	     * Lógica para o botão PROCURAR LIVRO.
	     */
	    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {
	        String id = txtId.getText();
	        String titulo = txtTitulo.getText();
	        String leitor = txtLeitor.getText();

	        if (id.isEmpty() && titulo.isEmpty() && leitor.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Digite ID, Título ou Leitor para pesquisar.", "Atenção", JOptionPane.WARNING_MESSAGE);
	            return;
	        }

	        Gerenciacao.Livro livro = gerencia.procurarLivro(id, titulo, leitor);

	        if (livro != null) {
	            // Insere nas caixas de texto os valores da tabela
	            txtId.setText(livro.id);
	            txtTitulo.setText(livro.titulo);
	            txtAutor.setText(livro.autor);
	            txtClassificacao.setText(livro.classificacao);
	            txtAno.setText(livro.ano);
	            txtLeitor.setText(livro.leitor != null ? livro.leitor : ""); // Trata NULL do DB
	            txtEmprestimo.setText(livro.dataEmprestimo != null ? livro.dataEmprestimo : "");
	            txtDevolucao.setText(livro.dataDevolucao != null ? livro.dataDevolucao : "");

	            // Preenche o lblStatus
	            lblDisponivel.setText(livro.status);
	            
	            // Define a cor
	            if ("DISPONÍVEL".equals(livro.status)) {
	                lblDisponivel.setForeground(new Color(0, 102, 51)); // Verde Escuro
	            } else if ("EMPRESTADO".equals(livro.status)) {
	                lblDisponivel.setForeground(Color.RED); // Vermelho
	            } else {
	                lblDisponivel.setForeground(Color.BLACK);
	            }

	        } else {
	            JOptionPane.showMessageDialog(this, "Nenhum livro encontrado com os critérios fornecidos.", "Não Encontrado", JOptionPane.INFORMATION_MESSAGE);
	            limparCampos();
	        }
	    }

	    /**
	     * Lógica para o botão EMPRESTAR LIVRO.
	     */
	    private void btnEmprestarActionPerformed(java.awt.event.ActionEvent evt) {
	        String id = txtId.getText();
	        String leitor = txtLeitor.getText();
	        String dataEmprestimo = txtEmprestimo.getText();
	        String dataDevolucao = txtDevolucao.getText();

	        if (id.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "O campo ID não pode estar vazio.", "Erro de Empréstimo", JOptionPane.ERROR_MESSAGE);
	            return;
	        }
	        
	        // Simplesmente tenta emprestar. A checagem de existência e status é feita implicitamente
	        // no update, mas um check anterior pode ser mais amigável.
	        // Vamos usar a lógica mais simples (direto no update) por brevidade, mas
	        // o ideal seria procurar o livro primeiro.

	        if (gerencia.emprestarLivro(id, leitor, dataEmprestimo, dataDevolucao)) {
	            JOptionPane.showMessageDialog(this, "Livro emprestado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
	            // Atualiza labels e limpa campos
	            lblDisponivel.setText("EMPRESTADO");
	            lblDisponivel.setForeground(Color.RED);
	            limparCampos();
	            atualizarContadores();
	        } else {
	            JOptionPane.showMessageDialog(this, "Falha ao emprestar. Verifique se o ID existe.", "Erro de Empréstimo", JOptionPane.ERROR_MESSAGE);
	        }
	    }

	    /**
	     * Lógica para o botão DEVOLVER LIVRO.
	     */
	    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {
	        String id = txtId.getText();

	        if (id.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "O campo ID não pode estar vazio para devolver.", "Erro de Devolução", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        if (gerencia.devolverLivro(id)) {
	            JOptionPane.showMessageDialog(this, "Livro devolvido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
	            // Atualiza labels e limpa campos
	            lblDisponivel.setText("DISPONÍVEL");
	            lblDisponivel.setForeground(new Color(0, 102, 51));
	            limparCampos();
	            atualizarContadores();
	        } else {
	            JOptionPane.showMessageDialog(this, "Falha ao devolver. Verifique se o ID existe.", "Erro de Devolução", JOptionPane.ERROR_MESSAGE);
	        }
	    }

	    /**
	     * Lógica para o botão EXCLUIR LIVRO.
	     */
	    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
	        String id = txtId.getText();

	        if (id.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "O campo ID não pode estar vazio para excluir.", "Erro de Exclusão", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja EXCLUIR o livro com ID: " + id + "?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
	        
	        if (confirmacao == JOptionPane.YES_OPTION) {
	            if (gerencia.excluirLivro(id)) {
	                JOptionPane.showMessageDialog(this, "Livro excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
	                // O nCadastrados foi diminuído na exclusão, basta atualizar.
	                limparCampos();
	                atualizarContadores();
	            } else {
	                JOptionPane.showMessageDialog(this, "Falha ao excluir. Verifique se o ID existe.", "Erro de Exclusão", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    } 

	    public static void main(String[] args) {
	         java.awt.EventQueue.invokeLater(() -> new Interface().setVisible(true));
	    }
	     private javax.swing.JButton btnCadastrar;
	    private javax.swing.JButton btnDevolver;
	    private javax.swing.JButton btnEmprestar;
	    private javax.swing.JButton btnExcluir;
	    private javax.swing.JButton btnLimpar;
	    private javax.swing.JButton btnProcurar;
	    private javax.swing.JLabel lblAno;
	    private javax.swing.JLabel lblAutor;
	    private javax.swing.JLabel lblCadastrado;
	    private javax.swing.JLabel lblCadastrado2;
	    private javax.swing.JLabel lblClassificacao;
	    private javax.swing.JLabel lblDevolucao;
	    private javax.swing.JLabel lblDisponivel;
	    private javax.swing.JLabel lblEmprestado;
	    private javax.swing.JLabel lblEmprestado2;
	    private javax.swing.JLabel lblEmprestimo;
	    private javax.swing.JLabel lblId;
	    private javax.swing.JLabel lblLeitor;
	    private javax.swing.JLabel lblPrincipal;
	    private javax.swing.JLabel lblStatus;
	    private javax.swing.JLabel lblTitulo;
	    private javax.swing.JTextField txtAno;
	    private javax.swing.JTextField txtAutor;
	    private javax.swing.JTextField txtClassificacao;
	    private javax.swing.JTextField txtDevolucao;
	    private javax.swing.JTextField txtEmprestimo;
	    private javax.swing.JTextField txtId;
	    private javax.swing.JTextField txtLeitor;
	    private javax.swing.JTextField txtTitulo;
	}
