/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisloc.view;

import br.com.sisloc.control.Conexao;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo
 */
public class ProcurarLocacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProcurarLocacao
     */
    Conexao con = new Conexao();
    ResultSet resultados;

    public ProcurarLocacao() {
        initComponents();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcurarLocacao().setVisible(true);

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        rbfisica1 = new javax.swing.JRadioButton();
        rbjuridica1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JFormattedTextField();
        txtcpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Procurar Locação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 430));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localizar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(rbfisica1);
        rbfisica1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbfisica1.setText("Fisica");
        rbfisica1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbfisica1MouseClicked(evt);
            }
        });

        buttonGroup1.add(rbjuridica1);
        rbjuridica1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbjuridica1.setText("Juridica");
        rbjuridica1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbjuridica1MouseClicked(evt);
            }
        });
        rbjuridica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjuridica1ActionPerformed(evt);
            }
        });
        rbjuridica1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbjuridica1KeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("CNPJ:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("CPF:");

        txtcnpj.setEditable(false);
        try {
            txtcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcnpjKeyReleased(evt);
            }
        });

        txtcpf.setEditable(false);
        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nome:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbjuridica1)
                        .addGap(10, 10, 10)
                        .addComponent(rbfisica1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel4))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbfisica1)
                    .addComponent(rbjuridica1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "CPF / CNPJ Cliente", "Produto", "Data Início", "Data Fim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(8);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Cancelar");
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
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbfisica1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbfisica1MouseClicked
        txtcnpj.setText("");
        txtcnpj.setEditable(false);
        txtcpf.setEditable(true);
        txtcpf.requestFocus();
    }//GEN-LAST:event_rbfisica1MouseClicked

    private void rbjuridica1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbjuridica1MouseClicked
        txtcpf.setText("");
        txtcpf.setEditable(false);
        txtcnpj.setEditable(true);
        txtcnpj.requestFocus();
    }//GEN-LAST:event_rbjuridica1MouseClicked

    private void rbjuridica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjuridica1ActionPerformed

    }//GEN-LAST:event_rbjuridica1ActionPerformed

    private void rbjuridica1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbjuridica1KeyPressed

    }//GEN-LAST:event_rbjuridica1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcnpjKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnpjKeyReleased
        DefaultTableModel tabela = ((DefaultTableModel) jTable1.getModel());                 //o getModel() é responsável por pegar o modelo da tabela criada (colunas, linhas e nome da tabela)
        tabela.setRowCount(0);                                                                  //ajusta a quantidade de linhas para zero
        //ResultSet resultados =                               //cria a variável resultados que irá guardar os resultados da consulta
        Object dados[] = new Object[6];                                                         //cria um array de tamanho 3 correspondente à quantidade de campos da tabela (são 3 campos: codigo, nome e telefone)
        try {//Irá tentar executar o acesso aos resultados
            while (resultados.next()) {                             //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                dados[0] = resultados.getInt("idcliente");          //guarda no bloco 0 o valor do campo idContato
                dados[1] = resultados.getString("cnpj").replaceAll("null", " - ");
                dados[2] = resultados.getString("cpf").replaceAll("null", " - ");
                dados[3] = resultados.getString("nome");
                dados[4] = resultados.getString("cidade");
                dados[5] = resultados.getString("telefone");
                tabela.addRow(dados);                                   //adiciona na tabela uma linha com os dados captados através da variável resultados
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcnpjKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String cpf;
            cpf = txtcpf.getText();
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            int id;
            String sql = "select idcliente from cliente where cpf='" + cpf + "';";
            resultados = con.executarConsulta(sql);
            resultados.first();
            id = resultados.getInt("idcliente");

            sql = "select i.locacao_idlocacao,c.cpf,p.nome,i.data_inicio,i.data_fim from item i,cliente c,produto p,locacao l where c.idcliente = " + id + " and p.idproduto = i.idproduto";
            Object dados[] = new Object[5];
            DefaultTableModel tabela = ((DefaultTableModel) jTable1.getModel());
            tabela.setRowCount(0);
            resultados = con.executarConsulta(sql);

            while (resultados.next()) {                             //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                dados[0] = resultados.getInt("i.locacao_idlocacao");          //guarda no bloco 0 o valor do campo idContato
                dados[1] = resultados.getString("c.cpf").replaceAll("null", " - ");
                dados[2] = resultados.getString("p.nome").replaceAll("null", " - ");
                dados[3] = resultados.getString("i.data_inicio");
                dados[4] = resultados.getString("i.data_fim");
                tabela.addRow(dados);                                   //adiciona na tabela uma linha com os dados captados através da variável resultados
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbfisica1;
    private javax.swing.JRadioButton rbjuridica1;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JFormattedTextField txtcpf;
    // End of variables declaration//GEN-END:variables

    public void preencheTable() {

        if (rbfisica1.isSelected()) {
            String sql = "select item.locacao_idlocacao,cliente.cpf,produto.nome,item.data_inicio,item.data_fim from item,cliente,produto,locacao "
                    + "where cliente.cpf like '" + txtcpf.getText() + "' and produto.idproduto=item.idproduto";
            Object dados[] = new Object[5];
            DefaultTableModel tabela = ((DefaultTableModel) jTable1.getModel());
            tabela.setRowCount(0);
            resultados = con.executarConsulta(sql);
            try {//Irá tentar executar o acesso aos resultados
                while (resultados.next()) {                             //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                    dados[0] = resultados.getInt("item.locacao_idlocacao");          //guarda no bloco 0 o valor do campo idContato
                    dados[1] = resultados.getString("cliente.cpf").replaceAll("null", " - ");
                    dados[2] = resultados.getString("produto.nome").replaceAll("null", " - ");
                    dados[3] = resultados.getString("item.data_inicio");
                    dados[4] = resultados.getString("item.data_fim");
                    tabela.addRow(dados);                                   //adiciona na tabela uma linha com os dados captados através da variável resultados
                }
            } catch (SQLException ex) {
                Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(rbjuridica1.isSelected()){
            
        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
