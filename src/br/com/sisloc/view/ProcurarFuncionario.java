/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisloc.view;

import br.com.sisloc.control.UpperCaseDocument;
import br.com.sisloc.dao.GerenciaFuncionario;
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
public final class ProcurarFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProcurarFuncionario
     */
    
    private GerenciaFuncionario gerenciaFuncionario = new GerenciaFuncionario();
    public ProcurarFuncionario() {
        initComponents();
        txtnome.setDocument(new UpperCaseDocument());
        carregaFuncionario();
    }

    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcurarFuncionario().setVisible(true);
                
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbrg = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        btprocurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelafuncionario = new javax.swing.JTable();
        btcancelar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Procurar Funcionário");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(560, 390));

        lbrg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbrg.setText("Nome:");

        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomeKeyReleased(evt);
            }
        });

        btprocurar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btprocurar.setText("Procurar");

        tabelafuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Cargo", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        btcancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbrg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btprocurar)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btcancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbrg)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btprocurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btcancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
       dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tabelafuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelafuncionarioMouseClicked
      
    }//GEN-LAST:event_tabelafuncionarioMouseClicked

    private void txtnomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyReleased
       carregaFuncionario();
    }//GEN-LAST:event_txtnomeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btprocurar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbrg;
    private javax.swing.JTable tabelafuncionario;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables


      public void carregaFuncionario() {

        DefaultTableModel tabela = ((DefaultTableModel) tabelafuncionario.getModel());                 //o getModel() é responsável por pegar o modelo da tabela criada (colunas, linhas e nome da tabela)
        tabela.setRowCount(0);                                                                  //ajusta a quantidade de linhas para zero
        ResultSet resultados = gerenciaFuncionario.consultaFuncionarioNome(txtnome.getText());
        Object dados[] = new Object[4];                                                         //cria um array de tamanho 3 correspondente à quantidade de campos da tabela (são 3 campos: codigo, nome e telefone)
        try {//Irá tentar executar o acesso aos resultados
            while (resultados.next()) {
                dados[0] = resultados.getInt("matricula"); //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                dados[1] = resultados.getString("nome");          //guarda no bloco 0 o valor do campo idContato
                dados[2] = resultados.getString("cargo");
                dados[3] = resultados.getString("telefone");
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
