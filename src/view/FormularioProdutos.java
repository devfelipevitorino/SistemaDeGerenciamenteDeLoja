/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import dao.FornecedoresDao;
import dao.ProdutosDao;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedores;
import model.Produtos;
import utilitarios.Utilitarios;

/**
 *
 * @author Administrador
 */
public class FormularioProdutos extends javax.swing.JDialog {

    /**
     * Creates new form FormularioClientes
     */
    public void listar() {
        ProdutosDao dao = new ProdutosDao();
        List<Produtos> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setNumRows(0);
        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco(),
                c.getQtdEstoque(),
                c.getFornecedores().getNome()
            });
        }
    }

    public FormularioProdutos(java.awt.Frame paret, boolean modal) {
        super(paret, true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painel_guias = new javax.swing.JTabbedPane();
        painel_dados_pessoais = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        cbFornecedor = new javax.swing.JComboBox();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtQtdEstoque = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        painel_consulta = new javax.swing.JPanel();
        btnPesquisaDescricao = new javax.swing.JButton();
        txtPesquisaDescricao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Noto Sans Lisu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produtos");

        jLabel2.setText("Codigo");

        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição");

        txtDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescricaoMousePressed(evt);
            }
        });
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        btnPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesquisarKeyPressed(evt);
            }
        });

        cbFornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbFornecedorAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbFornecedorMouseClicked(evt);
            }
        });
        cbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFornecedorActionPerformed(evt);
            }
        });

        btnNovo.setText("NOVO");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel17.setText("Preço");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoKeyPressed(evt);
            }
        });

        txtQtdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdEstoqueActionPerformed(evt);
            }
        });
        txtQtdEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtdEstoqueKeyPressed(evt);
            }
        });

        jLabel18.setText("Quantidade");

        jLabel19.setText("Fornecedor");

        javax.swing.GroupLayout painel_dados_pessoaisLayout = new javax.swing.GroupLayout(painel_dados_pessoais);
        painel_dados_pessoais.setLayout(painel_dados_pessoaisLayout);
        painel_dados_pessoaisLayout.setHorizontalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir))
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPesquisar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbFornecedor, javax.swing.GroupLayout.Alignment.LEADING, 0, 121, Short.MAX_VALUE)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(332, 332, 332)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        painel_dados_pessoaisLayout.setVerticalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnImprimir))
                .addGap(35, 35, 35))
        );

        painel_dados_pessoaisLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPreco, txtQtdEstoque});

        painel_guias.addTab("Dados do produto", painel_dados_pessoais);

        btnPesquisaDescricao.setText("Pesquisar");
        btnPesquisaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDescricaoActionPerformed(evt);
            }
        });

        txtPesquisaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaDescricaoActionPerformed(evt);
            }
        });
        txtPesquisaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaDescricaoKeyReleased(evt);
            }
        });

        jLabel15.setText("DESCRIÇÃO");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "PREÇO", "QUANTIDADE", "FORNECEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout painel_consultaLayout = new javax.swing.GroupLayout(painel_consulta);
        painel_consulta.setLayout(painel_consultaLayout);
        painel_consultaLayout.setHorizontalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisaDescricao)
                .addContainerGap(321, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        painel_consultaLayout.setVerticalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPesquisaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        painel_guias.addTab("Consulta de produtos", painel_consulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_guias)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_guias, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Produtos obj = new Produtos();
        obj.setDescricao(txtDescricao.getText());
        obj.setPreco(Double.parseDouble(txtPreco.getText()));
        obj.setQtdEstoque(Integer.parseInt(txtQtdEstoque.getText()));
        obj.setFornecedores((Fornecedores)cbFornecedor.getSelectedItem());

        ProdutosDao dao = new ProdutosDao();
        dao.Salvar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(painel_dados_pessoais);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtPesquisaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaDescricaoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        String descricao = txtDescricao.getText();
        Produtos obj = new Produtos();
        ProdutosDao dao = new ProdutosDao();
        Fornecedores f = new Fornecedores();
        FornecedoresDao daof = new FornecedoresDao();

        obj = dao.BuscarProdutos(descricao);
        if (obj.getDescricao()!= null) {
            txtCodigo.setText(String.valueOf(obj.getId()));
            txtDescricao.setText(obj.getDescricao());
            txtPreco.setText(String.valueOf(obj.getPreco()));
            txtQtdEstoque.setText(String.valueOf(obj.getQtdEstoque()));
            
            f = (Fornecedores) daof.BuscarFornecedores(obj.getFornecedores().getNome());
            cbFornecedor.getModel().setSelectedItem(f);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        Utilitarios util = new Utilitarios();
        util.LimpaTela(painel_dados_pessoais);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void btnPesquisaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDescricaoActionPerformed
        // TODO add your handling code here:
        String nome = "%" + txtPesquisaDescricao.getText() + "%";
        ProdutosDao dao = new ProdutosDao();
        List<Produtos> lista = dao.Filtrar(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setNumRows(0);
        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco(),
                c.getQtdEstoque(),
                c.getFornecedores().getNome()
            });
        }
    }//GEN-LAST:event_btnPesquisaDescricaoActionPerformed

    private void txtPesquisaDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaDescricaoKeyReleased
        // TODO add your handling code here:
        String nome = "%" + txtPesquisaDescricao.getText() + "%";
        ProdutosDao dao = new ProdutosDao();
        List<Produtos> lista = dao.Filtrar(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setNumRows(0);
        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco(),
                c.getQtdEstoque(),
                c.getFornecedores().getNome()
            });
        }
    }//GEN-LAST:event_txtPesquisaDescricaoKeyReleased

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String descricao = txtDescricao.getText();
        Produtos obj = new Produtos();
        ProdutosDao dao = new ProdutosDao();
        Fornecedores f = new Fornecedores();
        FornecedoresDao daof = new FornecedoresDao();

        obj = dao.BuscarProdutos(descricao);
        if (obj.getDescricao()!= null) {
            txtCodigo.setText(String.valueOf(obj.getId()));
            txtDescricao.setText(obj.getDescricao());
            txtPreco.setText(String.valueOf(obj.getPreco()));
            txtQtdEstoque.setText(String.valueOf(obj.getQtdEstoque()));
            
            f = (Fornecedores) daof.BuscarFornecedores(obj.getFornecedores().getNome());
            cbFornecedor.getModel().setSelectedItem(f);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
        }
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        painel_guias.setSelectedIndex(0);
        txtCodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtDescricao.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtPreco.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        txtQtdEstoque.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        
        Fornecedores f = new Fornecedores();
        FornecedoresDao dao = new FornecedoresDao();
        f = (Fornecedores) dao.BuscarFornecedores(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        cbFornecedor.removeAllItems();
        cbFornecedor.getModel().setSelectedItem(f);
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Produtos obj = new Produtos();
        obj.setId(Integer.parseInt(txtCodigo.getText()));
        obj.setDescricao(txtDescricao.getText());
        obj.setPreco(Double.parseDouble(txtPreco.getText()));
        obj.setQtdEstoque(Integer.parseInt(txtQtdEstoque.getText()));
        
        Fornecedores f = new Fornecedores();
        f = (Fornecedores) cbFornecedor.getSelectedItem();
        obj.setFornecedores(f);

        ProdutosDao dao = new ProdutosDao();
        dao.Editar(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(painel_dados_pessoais);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Produtos obj = new Produtos();
        obj.setId(Integer.parseInt(txtCodigo.getText()));
        ProdutosDao dao = new ProdutosDao();
        dao.Excluir(obj);
        Utilitarios util = new Utilitarios();
        util.LimpaTela(painel_dados_pessoais);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoKeyPressed

    private void txtQtdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdEstoqueActionPerformed

    private void txtQtdEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdEstoqueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdEstoqueKeyPressed

    private void cbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFornecedorActionPerformed

    private void cbFornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbFornecedorAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbFornecedorAncestorAdded

    private void cbFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFornecedorMouseClicked
        // TODO add your handling code here:
        FornecedoresDao dao = new FornecedoresDao();
        List<Fornecedores> lista= dao.Listar();
        cbFornecedor.removeAllItems();
        for(Fornecedores f : lista){
            cbFornecedor.addItem(f);
        }
    }//GEN-LAST:event_cbFornecedorMouseClicked

    private void btnPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisarKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPesquisarKeyPressed

    private void txtDescricaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescricaoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoMousePressed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new relatorios.RelatorioEstoqueEProdutos();
    }//GEN-LAST:event_btnImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new FormularioProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisaDescricao;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel_consulta;
    private javax.swing.JPanel painel_dados_pessoais;
    public javax.swing.JTabbedPane painel_guias;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisaDescricao;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdEstoque;
    // End of variables declaration//GEN-END:variables
}