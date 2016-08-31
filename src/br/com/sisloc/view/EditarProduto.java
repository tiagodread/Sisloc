/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisloc.view;

import br.com.sisloc.control.UpperCaseDocument;
import br.com.sisloc.dao.GerenciaProduto;
import br.com.sisloc.model.Produto;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo
 */
public final class EditarProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarProduto
     */
    private final GerenciaProduto gerenciaProduto = new GerenciaProduto();
    private static ResultSet res;
    private int id_produto;
    private String cnpj;

    public EditarProduto(ResultSet r) {
        initComponents();
        setMaiusculo();
        carregaProdutos();
        this.res = r;
        getResult(res);
    }
    
    public EditarProduto() {
        initComponents();
        setMaiusculo();
        carregaProdutos();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProduto(res).setVisible(true);

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbid = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbprodutos = new javax.swing.JTable();
        btatualizarprod = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pneditarproduto = new javax.swing.JPanel();
        lblnomeproduto = new javax.swing.JLabel();
        txtnomeproduto = new javax.swing.JTextField();
        lblquantidade = new javax.swing.JLabel();
        txtquantidade = new javax.swing.JTextField();
        lblvalor = new javax.swing.JLabel();
        txtvalorunitario = new javax.swing.JFormattedTextField();
        lblfornecedor = new javax.swing.JLabel();
        txtcnpj1 = new javax.swing.JFormattedTextField();
        lbldescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescricao = new javax.swing.JTextArea();
        btlimpar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Editar Produto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 490));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lbid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbid.setText("Nome do produto:");

        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomeKeyReleased(evt);
            }
        });

        tbprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbprodutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbprodutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbprodutos);

        btatualizarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btatualizarprod.setText("Editar Produto");
        btatualizarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatualizarprodActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pneditarproduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblnomeproduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblnomeproduto.setText("Nome do produto:");

        lblquantidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblquantidade.setText("Quantidade:");

        lblvalor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblvalor.setText("Valor Unitário:");

        txtvalorunitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        lblfornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblfornecedor.setText("CNPJ do Fornecedor:");

        try {
            txtcnpj1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbldescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbldescricao.setText("Descrição:");

        txtdescricao.setColumns(20);
        txtdescricao.setLineWrap(true);
        txtdescricao.setRows(5);
        jScrollPane2.setViewportView(txtdescricao);

        javax.swing.GroupLayout pneditarprodutoLayout = new javax.swing.GroupLayout(pneditarproduto);
        pneditarproduto.setLayout(pneditarprodutoLayout);
        pneditarprodutoLayout.setHorizontalGroup(
            pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pneditarprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblnomeproduto)
                    .addGroup(pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblfornecedor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(lblquantidade, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pneditarprodutoLayout.createSequentialGroup()
                        .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblvalor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2)
                    .addComponent(txtnomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pneditarprodutoLayout.setVerticalGroup(
            pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pneditarprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomeproduto)
                    .addComponent(txtnomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblquantidade)
                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvalor)
                    .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfornecedor)
                    .addComponent(txtcnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pneditarprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pneditarprodutoLayout.createSequentialGroup()
                        .addComponent(lbldescricao)
                        .addGap(79, 79, 79))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btlimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btatualizarprod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btlimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pneditarproduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbid)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pneditarproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbid)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btatualizarprod)
                    .addComponent(btlimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btatualizarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatualizarprodActionPerformed
        replace();
        Produto produto = new Produto(txtnomeproduto.getText(), Integer.parseInt(txtquantidade.getText()),
                Float.parseFloat(txtvalorunitario.getText()), txtdescricao.getText(), cnpj);
        gerenciaProduto.editarProduto(id_produto, produto);
        carregaProdutos();
        limparDados();

    }//GEN-LAST:event_btatualizarprodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        limparDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        limparDados();
    }//GEN-LAST:event_btlimparActionPerformed

    private void txtnomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyReleased
        carregaProdutos();
    }//GEN-LAST:event_txtnomeKeyReleased

    private void tbprodutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbprodutosMouseClicked
        if (evt.getClickCount() == 1) {
            int linha = tbprodutos.getSelectedRow();
            id_produto = Integer.parseInt(tbprodutos.getValueAt(linha, 0).toString());
            consultaproduto(id_produto);
        }
    }//GEN-LAST:event_tbprodutosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (verificaItem(id_produto) == true) {
            gerenciaProduto.excluiProduto(id_produto);
            carregaProdutos();
            limparDados();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        limparDados();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btatualizarprod;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbid;
    private javax.swing.JLabel lbldescricao;
    private javax.swing.JLabel lblfornecedor;
    private javax.swing.JLabel lblnomeproduto;
    private javax.swing.JLabel lblquantidade;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JPanel pneditarproduto;
    protected javax.swing.JTable tbprodutos;
    private javax.swing.JFormattedTextField txtcnpj1;
    private javax.swing.JTextArea txtdescricao;
    protected javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnomeproduto;
    private javax.swing.JTextField txtquantidade;
    private javax.swing.JFormattedTextField txtvalorunitario;
    // End of variables declaration//GEN-END:variables

    public void limparDados() {
        txtnomeproduto.setText("");
        txtdescricao.setText("");
        txtquantidade.setText("");
        txtvalorunitario.setText("");
        txtcnpj1.setText("");
    }

    public void setMaiusculo() {
        txtnome.setDocument(new UpperCaseDocument());
        txtnomeproduto.setDocument(new UpperCaseDocument());
        txtdescricao.setDocument(new UpperCaseDocument());
    }

    public void carregaProdutos() {
        DefaultTableModel tabela = ((DefaultTableModel) tbprodutos.getModel());                 //o getModel() é responsável por pegar o modelo da tabela criada (colunas, linhas e nome da tabela)
        tabela.setRowCount(0);                                                                  //ajusta a quantidade de linhas para zero
        ResultSet resultados = gerenciaProduto.getTodosProdutos(txtnome.getText());                              //cria a variável resultados que irá guardar os resultados da consulta
        Object dados[] = new Object[4];                                                         //cria um array de tamanho 3 correspondente à quantidade de campos da tabela (são 3 campos: codigo, nome e telefone)
        try {//Irá tentar executar o acesso aos resultados
            while (resultados.next()) {                             //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                dados[0] = resultados.getInt("idproduto");          //guarda no bloco 0 o valor do campo idContato
                dados[1] = resultados.getString("nome");
                dados[2] = resultados.getInt("quantidade");
                dados[3] = resultados.getString("valor_unitario");
                tabela.addRow(dados);                                   //adiciona na tabela uma linha com os dados captados através da variável resultados
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void consultaproduto(int id) {
        res = gerenciaProduto.getprodutoId(id);

        try {
            while (res.next()) {
                txtnomeproduto.setText(res.getString("nome"));
                txtquantidade.setText(String.valueOf(res.getInt("quantidade")));
                txtvalorunitario.setText(String.valueOf(res.getFloat("valor_unitario")));
                txtcnpj1.setText(res.getString("fornecedor_cnpj"));
                txtdescricao.setText(res.getString("descricao"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(EditarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void replace() {
        cnpj = txtcnpj1.getText();
        cnpj = cnpj.replace(".", "");
        cnpj = cnpj.replace("/", "");
        cnpj = cnpj.replace("-", "");
    }

    public boolean verificaItem(int idProduto) {
        boolean status = false;
        res = gerenciaProduto.verificaItemAlocado(idProduto);

        try {
            if (!res.isBeforeFirst()) {
                status = true;
            }
            while (res.next()) {
                JOptionPane.showMessageDialog(null, "Impossível excluir um produto alocado!");
                status = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void getResult(ResultSet res) {
        try {
            while (res.next()) {
                txtnomeproduto.setText(res.getString("nome"));
                txtquantidade.setText(String.valueOf(res.getInt("quantidade")));
                txtvalorunitario.setText(String.valueOf(res.getFloat("valor_unitario")));
                txtcnpj1.setText(res.getString("fornecedor_cnpj"));
                txtdescricao.setText(res.getString("descricao"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(EditarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
