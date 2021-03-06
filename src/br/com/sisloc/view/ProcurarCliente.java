/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisloc.view;

import br.com.sisloc.dao.GerenciaCliente;
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
public final class ProcurarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProcurarProduto
     */
    
    private final GerenciaCliente gerenciaCliente = new GerenciaCliente();
    private EditarCliente editarCliente = new EditarCliente();
    private int id_cliente;
    ResultSet result;
    
    public ProcurarCliente() {
        initComponents();
        procuraCliente();
    }

    public static void main(String arg[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcurarCliente().setVisible(true);

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Procurar Cliente");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(665, 470));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procurar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");

        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomeKeyReleased(evt);
            }
        });

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "CNPJ", "CPF", "Nome", "Cidade", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbclientes.getTableHeader().setReorderingAllowed(false);
        tbclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbclientes);
        if (tbclientes.getColumnModel().getColumnCount() > 0) {
            tbclientes.getColumnModel().getColumn(0).setPreferredWidth(8);
            tbclientes.getColumnModel().getColumn(3).setPreferredWidth(200);
            tbclientes.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnome)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyReleased
        procuraCliente();
    }//GEN-LAST:event_txtnomeKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbclientesMouseClicked
        if (evt.getClickCount() == 1) {
            int linha = tbclientes.getSelectedRow();
            id_cliente = Integer.parseInt(tbclientes.getValueAt(linha, 0).toString());
        }
        System.out.println(String.valueOf(id_cliente));
        
    }//GEN-LAST:event_tbclientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables

    public void procuraCliente() {
        DefaultTableModel tabela = ((DefaultTableModel) tbclientes.getModel());                 //o getModel() é responsável por pegar o modelo da tabela criada (colunas, linhas e nome da tabela)
        tabela.setRowCount(0);                                                                  //ajusta a quantidade de linhas para zero
        ResultSet resultados = gerenciaCliente.getTodosClientes(txtnome.getText());                              //cria a variável resultados que irá guardar os resultados da consulta
        Object dados[] = new Object[6];                                                         //cria um array de tamanho 3 correspondente à quantidade de campos da tabela (são 3 campos: codigo, nome e telefone)
        try {//Irá tentar executar o acesso aos resultados
            while (resultados.next()) {                             //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                dados[0] = resultados.getInt("idcliente");          //guarda no bloco 0 o valor do campo idContato
                dados[1] = resultados.getString("cnpj");
                dados[2] = resultados.getString("cpf");
                dados[3] = resultados.getString("nome");
                dados[4] = resultados.getString("cidade");
                dados[5] = resultados.getString("telefone");
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
}
