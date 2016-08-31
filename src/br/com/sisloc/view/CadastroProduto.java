package br.com.sisloc.view;

import br.com.sisloc.control.UpperCaseDocument;
import br.com.sisloc.dao.GerenciaCliente;
import br.com.sisloc.dao.GerenciaFornecedor;
import br.com.sisloc.dao.GerenciaProduto;
import br.com.sisloc.model.Produto;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public final class CadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroProduto
     */
    private final GerenciaFornecedor gerenciaFornecedor = new GerenciaFornecedor();
    private ResultSet resultado;
    private String cnpj;
    private final GerenciaProduto gerenciaProduto = new GerenciaProduto();

    public CadastroProduto() {
        initComponents();
        setMaiusculo();
        carregaId();
        txtnomeproduto.requestFocus();
    }

    public static void main(String arg[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblnomeproduto = new javax.swing.JLabel();
        txtnomeproduto = new javax.swing.JTextField();
        lblquantidade = new javax.swing.JLabel();
        lblvalor = new javax.swing.JLabel();
        lblfornecedor = new javax.swing.JLabel();
        lbldescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescricao = new javax.swing.JTextArea();
        btcancelar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        btcadastrar = new javax.swing.JButton();
        txtcnpj1 = new javax.swing.JFormattedTextField();
        txtquantidade = new javax.swing.JFormattedTextField();
        txtvalorunitario = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadasto de Produto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(510, 310));
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

        lblnomeproduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblnomeproduto.setText("Nome do produto:");

        lblquantidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblquantidade.setText("Quantidade:");

        lblvalor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblvalor.setText("Valor Unitário:");

        lblfornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblfornecedor.setText("CNPJ do Fornecedor:");

        lbldescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbldescricao.setText("Descrição:");

        txtdescricao.setColumns(20);
        txtdescricao.setRows(5);
        jScrollPane1.setViewportView(txtdescricao);

        btcancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        btlimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        btcadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcadastrar.setText("Cadastrar");
        btcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarActionPerformed(evt);
            }
        });

        try {
            txtcnpj1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcnpj1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcnpj1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcnpj1FocusLost(evt);
            }
        });

        txtquantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtvalorunitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Id:");

        txtid.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblquantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblfornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblnomeproduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btcadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btlimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btcancelar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnomeproduto)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblvalor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomeproduto)
                    .addComponent(txtnomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblquantidade)
                    .addComponent(lblvalor)
                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfornecedor)
                    .addComponent(txtcnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcancelar)
                    .addComponent(btlimpar)
                    .addComponent(btcadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        dispose();
        limparDados();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        limparDados();
    }//GEN-LAST:event_btlimparActionPerformed

    private void btcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarActionPerformed
        replace();
        resultado = gerenciaFornecedor.consultaFornecedor(cnpj);
        try {
            if (!resultado.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Fornecedor não cadastrado, tente novamente.");
                txtcnpj1.setText(null);
                txtcnpj1.requestFocus();
            }
            while (resultado.next()) {
                int res = JOptionPane.showConfirmDialog(null, "Confirme o nome do fornecedor:\n" + resultado.getString("nome") + "\nCidade:\n" + resultado.getString("cidade"));
                if (res == 0) {
                    replace();
                    Produto produto = new Produto(txtnomeproduto.getText(), Integer.parseInt(txtquantidade.getText()),
                            Float.parseFloat(txtvalorunitario.getText()), txtdescricao.getText(), cnpj);
                    gerenciaProduto.cadastraProduto(produto);
                    carregaId();
                    limparDados();
                } else {
                    txtcnpj1.setText(null);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btcadastrarActionPerformed

    private void txtcnpj1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpj1FocusGained

    }//GEN-LAST:event_txtcnpj1FocusGained

    private void txtcnpj1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpj1FocusLost

    }//GEN-LAST:event_txtcnpj1FocusLost

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        limparDados();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastrar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldescricao;
    private javax.swing.JLabel lblfornecedor;
    private javax.swing.JLabel lblnomeproduto;
    private javax.swing.JLabel lblquantidade;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JFormattedTextField txtcnpj1;
    private javax.swing.JTextArea txtdescricao;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnomeproduto;
    private javax.swing.JFormattedTextField txtquantidade;
    private javax.swing.JFormattedTextField txtvalorunitario;
    // End of variables declaration//GEN-END:variables

    public void setMaiusculo() {
        txtnomeproduto.setDocument(new UpperCaseDocument());
        txtdescricao.setDocument(new UpperCaseDocument());
    }

    public void limparDados() {
        txtcnpj1.setText("");
        txtdescricao.setText("");
        txtnomeproduto.setText("");
        txtquantidade.setText("");
        txtvalorunitario.setText("");
    }

    public void replace() {
        cnpj = txtcnpj1.getText();
        cnpj = cnpj.replace(".", "");
        cnpj = cnpj.replace("/", "");
        cnpj = cnpj.replace("-", "");
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
        public void carregaId() {
        int id = 0;
        resultado = gerenciaProduto.carregaId();
        try {
            while (resultado.next()) {
                id = resultado.getInt("quantidade");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtid.setText(String.valueOf(id + 1));
    }
}
