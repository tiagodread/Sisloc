package br.com.sisloc.view;

import br.com.sisloc.control.UpperCaseDocument;
import br.com.sisloc.control.Validador;
import br.com.sisloc.dao.GerenciaCliente;
import br.com.sisloc.model.Cliente;
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
public final class CadastroCliente extends javax.swing.JInternalFrame {

    private final GerenciaCliente gerenciaCliente = new GerenciaCliente();
    private final Validador validador = new Validador();
    private String telefone, celular, cpf, cnpj;
    private ResultSet resultado;

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        setMaiusculo();
        txtnome.requestFocus();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtlogradouro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttelefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbuf = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbfisica = new javax.swing.JRadioButton();
        rbjuridica = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JFormattedTextField();
        txtcpf = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtbairro = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de Cliente");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(500, 400));
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Logradouro:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Telefone:");

        try {
            txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Celular:");

        try {
            txtcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Cidade:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("UF:");

        cbuf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Bairro:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("N°:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("E-mail:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(rbfisica);
        rbfisica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbfisica.setText("Fisica");
        rbfisica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbfisicaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbjuridica);
        rbjuridica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbjuridica.setText("Juridica");
        rbjuridica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbjuridicaMouseClicked(evt);
            }
        });
        rbjuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjuridicaActionPerformed(evt);
            }
        });
        rbjuridica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbjuridicaKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("CNPJ:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("CPF:");

        txtcnpj.setEditable(false);
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

        txtcpf.setEditable(false);
        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcpfFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbjuridica)
                        .addGap(10, 10, 10)
                        .addComponent(rbfisica)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcpf, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbfisica)
                    .addComponent(rbjuridica))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Gravar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Limpar Campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbuf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtlogradouro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtcelular, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                .addComponent(txtemail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbfisicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbfisicaMouseClicked
        txtcnpj.setText("");
        txtcnpj.setEditable(false);
        txtcpf.setEditable(true);
        txtcpf.requestFocus();
    }//GEN-LAST:event_rbfisicaMouseClicked

    private void rbjuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbjuridicaMouseClicked
        txtcpf.setText("");
        txtcpf.setEditable(false);
        txtcnpj.setEditable(true);
        txtcnpj.requestFocus();
    }//GEN-LAST:event_rbjuridicaMouseClicked

    private void rbjuridicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbjuridicaKeyPressed

    }//GEN-LAST:event_rbjuridicaKeyPressed

    private void rbjuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjuridicaActionPerformed

    }//GEN-LAST:event_rbjuridicaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limparDados();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        replace();
        String tipoCliente = "";
        if (rbfisica.isSelected()) {
            tipoCliente = "fisica";
            if (validador.isValidCPF(cpf) == true) {
                Cliente cliente = new Cliente(txtnome.getText(), telefone, celular, txtemail.getText(), tipoCliente, cpf, txtlogradouro.getText(), txtbairro.getText(), txtcidade.getText(), cbuf.getSelectedItem().toString(), Integer.parseInt(txtnumero.getText()), 0);
                gerenciaCliente.cadastraCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com suceso!");
                limparDados();
            } else {
                JOptionPane.showMessageDialog(null, "CPF Inválido!");
                txtcpf.setText("");
                txtcpf.requestFocus();
            }
        }
        if (rbjuridica.isSelected()) {
            if (validador.isValidCNPJ(cnpj) == true) {
                tipoCliente = "juridica";
                Cliente cliente = new Cliente(txtnome.getText(), txttelefone.getText(), txtcelular.getText(), txtemail.getText(), tipoCliente, cnpj, txtlogradouro.getText(), txtbairro.getText(), txtcidade.getText(), cbuf.getSelectedItem().toString(), Integer.parseInt(txtnumero.getText()));
                gerenciaCliente.cadastraCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com suceso!");
                limparDados();
            } else {
                JOptionPane.showMessageDialog(null, "CNPJ Inválido!");
                txtcnpj.setText("");
                txtcnpj.requestFocus();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpjFocusLost
        replace();
        resultado = gerenciaCliente.consultaClienteCnpj(cnpj);
        try {
            while (resultado.next()) {
                JOptionPane.showMessageDialog(null, "CNPJ já cadastrado no sistema!");
                txtcnpj.setText(null);
                txtcnpj.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcnpjFocusLost

    private void txtcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcpfFocusLost
        replace();
        resultado = gerenciaCliente.consultaClienteCpf(cpf);
        try {
            while (resultado.next()) {
                JOptionPane.showMessageDialog(null, "CPF já cadastrado no sistema!");
                txtcpf.setText(null);
                txtcpf.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcpfFocusLost

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        limparDados();
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbuf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbfisica;
    private javax.swing.JRadioButton rbjuridica;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JFormattedTextField txtcelular;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlogradouro;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JFormattedTextField txttelefone;
    // End of variables declaration//GEN-END:variables

    public void setMaiusculo() {
        txtbairro.setDocument(new UpperCaseDocument());
        txtcidade.setDocument(new UpperCaseDocument());
        txtemail.setDocument(new UpperCaseDocument());
        txtlogradouro.setDocument(new UpperCaseDocument());
        txtnome.setDocument(new UpperCaseDocument());
    }

    public void limparDados() {
        txtbairro.setText("");
        txtcelular.setText("");
        txtcidade.setText("");
        txtcnpj.setText("");
        txtemail.setText("");
        txtlogradouro.setText("");
        txtnome.setText("");
        txtnumero.setText("");
        txttelefone.setText("");
        txtcpf.setText("");
        cbuf.setSelectedIndex(0);
    }

    public void replace() {
        telefone = txttelefone.getText();
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace(" ", "");
        telefone = telefone.replace("-", "");

        celular = txtcelular.getText();
        celular = celular.replace("(", "");
        celular = celular.replace(")", "");
        celular = celular.replace(" ", "");
        celular = celular.replace("-", "");

        cpf = txtcpf.getText();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        cnpj = txtcnpj.getText();
        cnpj = cnpj.replace(".", "");
        cnpj = cnpj.replace("/", "");
        cnpj = cnpj.replace("-", "");
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
}
