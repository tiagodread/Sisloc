package br.com.sisloc.view;

import br.com.sisloc.control.UpperCaseDocument;
import br.com.sisloc.control.Validador;
import br.com.sisloc.dao.GerenciaCliente;
import br.com.sisloc.dao.GerenciaFornecedor;
import br.com.sisloc.model.Fornecedor;
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
public final class CadastroFornecedor extends javax.swing.JInternalFrame {

    GerenciaFornecedor gerenciaFornecedor = new GerenciaFornecedor();
    private String telefone, cnpj;
    private ResultSet resultado;
    Validador validador = new Validador();

    public CadastroFornecedor() {
        initComponents();
        setMaiusculo();
        replace();
    }

    public static void main(String arg[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcnpj = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        txtrazao = new javax.swing.JTextField();
        lblendereco = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        lbltelefone = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lbldescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescricao = new javax.swing.JTextArea();
        btcancelar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        txtcadastrar = new javax.swing.JButton();
        txtcnpj = new javax.swing.JFormattedTextField();
        txttelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtlogradouro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbuf = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Cadastro de Fornecedor");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(540, 430));
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

        lblcnpj.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcnpj.setText("CNPJ:");

        lblnome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblnome.setText("Razão Socia:l");

        lblendereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblendereco.setText("Cidade:");

        lbltelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbltelefone.setText("Telefone:");

        lblemail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblemail.setText("E-mail:");

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

        txtcadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcadastrar.setText("Cadastrar");
        txtcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadastrarActionPerformed(evt);
            }
        });

        try {
            txtcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcnpjFocusLost(evt);
            }
        });

        try {
            txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Logradouro:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Número:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Bairro:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("UF:");

        cbuf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldescricao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btlimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btcancelar))
                            .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcnpj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblendereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblemail, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtrazao, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                            .addComponent(txtlogradouro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbairro))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtcidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcnpj)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome)
                    .addComponent(txtrazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblendereco)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcancelar)
                    .addComponent(btlimpar)
                    .addComponent(txtcadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        limparDados();
        dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        limparDados();
    }//GEN-LAST:event_btlimparActionPerformed

    private void txtcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadastrarActionPerformed
        replace();
        if (validaCampos() == true) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            Fornecedor fornecedor = new Fornecedor(cnpj, txtrazao.getText(), txtlogradouro.getText(),
                    Integer.parseInt(txtnumero.getText()), txtbairro.getText(), txtcidade.getText(),
                    cbuf.getSelectedItem().toString(), txtemail.getText(), telefone, txtdescricao.getText());
            gerenciaFornecedor.cadastraFornecedor(fornecedor);
            limparDados();
        }
    }//GEN-LAST:event_txtcadastrarActionPerformed

    private void txtcnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpjFocusLost
        replace();
        resultado = gerenciaFornecedor.consultaFornecedor(cnpj);
        try {
            while (resultado.next()) {
                JOptionPane.showMessageDialog(null, "CNPJ já cadastrado no sistema!");
                txtcnpj.setText(null);
                txtcnpj.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (validador.isValidCNPJ(cnpj) == false) {
            JOptionPane.showMessageDialog(null, "CNPJ Inválido!");
            txtcnpj.setText(null);
            txtcnpj.requestFocus();
        }


    }//GEN-LAST:event_txtcnpjFocusLost

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        limparDados();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JComboBox cbuf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcnpj;
    private javax.swing.JLabel lbldescricao;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lbltelefone;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JButton txtcadastrar;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JTextArea txtdescricao;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlogradouro;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtrazao;
    private javax.swing.JFormattedTextField txttelefone;
    // End of variables declaration//GEN-END:variables

    public void setMaiusculo() {
        txtrazao.setDocument(new UpperCaseDocument());
        txtcidade.setDocument(new UpperCaseDocument());
        txtlogradouro.setDocument(new UpperCaseDocument());
        txtbairro.setDocument(new UpperCaseDocument());
        txtemail.setDocument(new UpperCaseDocument());
        txtdescricao.setDocument(new UpperCaseDocument());
    }

    public void limparDados() {
        txtcidade.setText("");
        txtcnpj.setText(null);
        txtdescricao.setText("");
        txtemail.setText("");
        txtrazao.setText("");
        txttelefone.setText("");
        txtcidade.setText("");
        txtbairro.setText("");
        txtlogradouro.setText("");
        txtnumero.setText("");
        cbuf.setSelectedIndex(0);
    }

    public final void replace() {
        telefone = txttelefone.getText();
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace(" ", "");
        telefone = telefone.replace("-", "");

        cnpj = txtcnpj.getText();
        cnpj = cnpj.replace(".", "");
        cnpj = cnpj.replace("/", "");
        cnpj = cnpj.replace("-", "");
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public boolean validaCampos() {
        boolean status = false;
        if (txtbairro.getText().equals("") || txtcadastrar.getText().equals("") || txtcidade.getText().equals("")
                || cnpj.equals("") || txtdescricao.getText().equals("") || txtemail.getText().equals("")
                || txtlogradouro.getText().equals("") || txtnumero.getText().equals("") || txtrazao.getText().equals("")
                || txttelefone.getText().equals("")) {
            status = true;
        }
        return status;
    }
}
