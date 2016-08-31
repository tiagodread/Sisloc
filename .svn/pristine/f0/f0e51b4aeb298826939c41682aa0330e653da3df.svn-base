/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisloc.view;

import br.com.sisloc.control.UpperCaseDocument;
import br.com.sisloc.control.Validador;
import br.com.sisloc.dao.GerenciaFuncionario;
import br.com.sisloc.model.Funcionario;
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
public final class EditarFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarFuncionario
     */
    private GerenciaFuncionario gerenciaFuncionario = new GerenciaFuncionario();
    private final Validador validador = new Validador();
    private String telefone, celular, cpf;
    boolean status;
    private ResultSet resultado;
    private String matricula;

    public EditarFuncionario(ResultSet r) {
        initComponents();
        setMaiusculo();
        carregaFuncionario();
        resultado = r;
        getResult(resultado);
    }
    
    public EditarFuncionario() {
        initComponents();
        setMaiusculo();
        carregaFuncionario();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFuncionario().setVisible(true);

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbrg = new javax.swing.JLabel();
        txtnomepesquisa = new javax.swing.JTextField();
        btprocurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelafuncionario = new javax.swing.JTable();
        pneditarfunc = new javax.swing.JPanel();
        txtlogin = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtconfirmasenha = new javax.swing.JPasswordField();
        txttelefone = new javax.swing.JFormattedTextField();
        txtnumero = new javax.swing.JTextField();
        txtbairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbuf = new javax.swing.JComboBox();
        txtcpf = new javax.swing.JFormattedTextField();
        txtnome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtsalario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtlogradouro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Editar Funcionário");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(505, 640));

        lbrg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbrg.setText("Nome:");

        txtnomepesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomepesquisaKeyReleased(evt);
            }
        });

        btprocurar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btprocurar.setText("Procurar");

        tabelafuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelafuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelafuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelafuncionario);

        pneditarfunc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Confirme a senha:");

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Matricula:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("UF:");

        txtmatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmatriculaFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("CPF:");

        cbuf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Cargo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Bairro:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Logradouro:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Salário:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("N°:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Login:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("E-mail:");

        javax.swing.GroupLayout pneditarfuncLayout = new javax.swing.GroupLayout(pneditarfunc);
        pneditarfunc.setLayout(pneditarfuncLayout);
        pneditarfuncLayout.setHorizontalGroup(
            pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pneditarfuncLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addComponent(jLabel11)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGap(24, 24, 24)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnome)
                        .addComponent(txtlogradouro)
                        .addGroup(pneditarfuncLayout.createSequentialGroup()
                            .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtcelular))
                        .addComponent(txtemail)
                        .addGroup(pneditarfuncLayout.createSequentialGroup()
                            .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtsalario))
                        .addComponent(txtlogin)
                        .addGroup(pneditarfuncLayout.createSequentialGroup()
                            .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pneditarfuncLayout.createSequentialGroup()
                                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtbairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37)
                                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pneditarfuncLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbuf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pneditarfuncLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtconfirmasenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(txtsenha, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGap(0, 67, Short.MAX_VALUE)))
                    .addGap(2, 2, 2)))
        );
        pneditarfuncLayout.setVerticalGroup(
            pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
            .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pneditarfuncLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pneditarfuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtconfirmasenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Alterar Funcionario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pneditarfunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbrg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnomepesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btprocurar)
                                .addGap(77, 77, 77))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbrg)
                    .addComponent(txtnomepesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btprocurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pneditarfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomepesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomepesquisaKeyReleased
        carregaFuncionario();
    }//GEN-LAST:event_txtnomepesquisaKeyReleased

    private void txtmatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmatriculaFocusLost
        resultado = gerenciaFuncionario.consultaFuncionarioMatricula(Integer.parseInt(txtmatricula.getText()));
        try {
            while (resultado.next()) {
                JOptionPane.showMessageDialog(null, "Matricula já cadastrada no sistema!");
                txtmatricula.setText(null);
                txtmatricula.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtmatriculaFocusLost

    private void txtcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcpfFocusLost
        replace();
        if (Validador.isValidCPF(cpf) == false) {
            JOptionPane.showMessageDialog(null, "CPF Inválido!");
            txtcpf.setText("");
        }

        resultado = gerenciaFuncionario.consultaFuncionarioCPF(cpf);
        try {
            while (resultado.next()) {
                JOptionPane.showMessageDialog(null, "CPF já cadastrado no sistema!");
                txtcpf.setText(null);
                txtcpf.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcpfFocusLost

    private void tabelafuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelafuncionarioMouseClicked
        if (evt.getClickCount() == 1) {
            int linha = tabelafuncionario.getSelectedRow();
            matricula = tabelafuncionario.getValueAt(linha, 0).toString();
            setaCampos();
        }
    }//GEN-LAST:event_tabelafuncionarioMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        replace();
        if (validaCampos() == true) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else if (txtsenha.getText().equalsIgnoreCase(txtconfirmasenha.getText())) {
            Funcionario funcionario = new Funcionario(Integer.parseInt(txtmatricula.getText()), txtcargo.getText(),
                    txtlogradouro.getText(), txtbairro.getText(), txtcidade.getText(), cbuf.getSelectedItem().toString(),
                    Integer.parseInt(txtnumero.getText()), Float.parseFloat(txtsalario.getText()), txtlogin.getText(),
                    txtsenha.getText(), cpf, txtnome.getText(), telefone, celular,
                    txtemail.getText());
            gerenciaFuncionario.editarFuncionario(Integer.parseInt(txtmatricula.getText()), funcionario);
            limparDados();
            JOptionPane.showMessageDialog(null, "Funcionario editado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "As senhas não correspondem");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       limparDados();
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btprocurar;
    private javax.swing.JComboBox cbuf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbrg;
    private javax.swing.JPanel pneditarfunc;
    private javax.swing.JTable tabelafuncionario;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JFormattedTextField txtcelular;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JPasswordField txtconfirmasenha;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtlogradouro;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnomepesquisa;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtsalario;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JFormattedTextField txttelefone;
    // End of variables declaration//GEN-END:variables

    public void limparDados() {
        txtcargo.setText("");
        txtcelular.setText("");
        txtcpf.setText("");
        txtemail.setText("");
        txtbairro.setText("");
        txtcidade.setText("");
        txtnumero.setText("");
        cbuf.setSelectedIndex(0);
        txtlogin.setText("");
        txtnome.setText("");
        txtsenha.setText("");
        txttelefone.setText("");
        txtsalario.setText("");
        txtmatricula.setText("");
        txtconfirmasenha.setText("");
        txtlogradouro.setText("");
    }

    public void setMaiusculo() {
        txtcargo.setDocument(new UpperCaseDocument());
        txtcelular.setDocument(new UpperCaseDocument());
        txtcpf.setDocument(new UpperCaseDocument());
        txtemail.setDocument(new UpperCaseDocument());
        txtnome.setDocument(new UpperCaseDocument());
        txtlogradouro.setDocument(new UpperCaseDocument());
        txtcidade.setDocument(new UpperCaseDocument());
        txtbairro.setDocument(new UpperCaseDocument());
        txtlogin.setDocument(new UpperCaseDocument());
        txtnome.setDocument(new UpperCaseDocument());
        txttelefone.setDocument(new UpperCaseDocument());
    }

    public void carregaFuncionario() {

        DefaultTableModel tabela = ((DefaultTableModel) tabelafuncionario.getModel());                 //o getModel() é responsável por pegar o modelo da tabela criada (colunas, linhas e nome da tabela)
        tabela.setRowCount(0);                                                                  //ajusta a quantidade de linhas para zero
        ResultSet resultados = gerenciaFuncionario.consultaFuncionarioNome(txtnomepesquisa.getText());
        Object dados[] = new Object[3];                                                         //cria um array de tamanho 3 correspondente à quantidade de campos da tabela (são 3 campos: codigo, nome e telefone)
        try {//Irá tentar executar o acesso aos resultados
            while (resultados.next()) {
                dados[0] = resultados.getInt("matricula"); //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                dados[1] = resultados.getString("nome");          //guarda no bloco 0 o valor do campo idContato
                dados[2] = resultados.getString("cargo");
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
    }

    public boolean validaCampos() {
        if (txtbairro.getText().equals("") || txtcargo.getText().equals("") || txtcelular.getText().equals("") || txtcidade.getText().equals("")
                || txtconfirmasenha.getText().equals("") || txtconfirmasenha.getText().equals("") || cpf.equals("") || txtemail.getText().equals("")
                || txtlogin.getText().equals("") || txtlogradouro.getText().equals("") || txtmatricula.getText().equals("") || txtnome.getText().equals("")
                || txtnumero.getText().equals("") || txtsalario.getText().equals("") || txtsenha.getText().equals("") || txttelefone.getText().equals("")) {
            status = true;
        }
        return status;
    }

    public void setaCampos() {
        resultado = gerenciaFuncionario.getFunc(Integer.parseInt(matricula));
        try {
            while (resultado.next()) {
                txtbairro.setText(resultado.getString("bairro"));
                txtcargo.setText(resultado.getString("cargo"));
                txtcelular.setText(resultado.getString("celular"));
                txtcidade.setText(resultado.getString("cidade"));
                txtconfirmasenha.setText(resultado.getString("senha"));
                txtcpf.setText(resultado.getString("cpf"));
                txtemail.setText(resultado.getString("email"));
                txtlogin.setText(resultado.getString("login"));
                txtlogradouro.setText(resultado.getString("logradouro"));
                txtmatricula.setText(resultado.getString("matricula"));
                txtnome.setText(resultado.getString("nome"));
                txtnumero.setText(resultado.getString("numero"));
                txtsalario.setText(resultado.getString("salario"));
                txtsenha.setText(resultado.getString("senha"));
                txttelefone.setText(resultado.getString("telefone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getResult(ResultSet resultado){
        try {
            while (resultado.next()) {
                txtbairro.setText(resultado.getString("bairro"));
                txtcargo.setText(resultado.getString("cargo"));
                txtcelular.setText(resultado.getString("celular"));
                txtcidade.setText(resultado.getString("cidade"));
                txtconfirmasenha.setText(resultado.getString("senha"));
                txtcpf.setText(resultado.getString("cpf"));
                txtemail.setText(resultado.getString("email"));
                txtlogin.setText(resultado.getString("login"));
                txtlogradouro.setText(resultado.getString("logradouro"));
                txtmatricula.setText(resultado.getString("matricula"));
                txtnome.setText(resultado.getString("nome"));
                txtnumero.setText(resultado.getString("numero"));
                txtsalario.setText(resultado.getString("salario"));
                txtsenha.setText(resultado.getString("senha"));
                txttelefone.setText(resultado.getString("telefone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
