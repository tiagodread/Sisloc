/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisloc.view;

import br.com.sisloc.dao.GerenciaCliente;
import br.com.sisloc.dao.GerenciaLocacao;
import br.com.sisloc.dao.GerenciaProduto;
import br.com.sisloc.model.Item;
import br.com.sisloc.model.Locacao;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo
 */
public final class CadastroLocacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroLocacao
     */
    private String cnpj, cpf, id_produto, id_item, quantidade, cod_produto;
    private ResultSet resultados;
    private int id_cliente, id_funcionario, id_itemm = 0, quant_disp = 0;
    private final GerenciaCliente gerenciaCliente = new GerenciaCliente();
    private final GerenciaProduto gerenciaProduto = new GerenciaProduto();
    private final GerenciaLocacao gerenciaLocacao = new GerenciaLocacao();
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private boolean status = false;
    private ArrayList<Integer> lIds = new ArrayList<>();
    private ArrayList<Integer> lquant = new ArrayList<>();
    
    
    public CadastroLocacao(int funcLogado) {
        initComponents();
        carregaProdutos();
        carregaId();
        this.id_funcionario = funcLogado;
    }

    public static void main(String arg[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLocacao().setVisible(true);

            }
        });
    }

    private CadastroLocacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtproduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbprodutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btaddproduto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtquantidade = new javax.swing.JFormattedTextField();
        cbdatatermino = new com.toedter.calendar.JDateChooser();
        cbdatainicio = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        rbfisica = new javax.swing.JRadioButton();
        rbjuridica = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JFormattedTextField();
        txtcpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        btpesquisar = new javax.swing.JButton();
        lbnomecliente = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbitem = new javax.swing.JTable();
        btfecharlocacao = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Locação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/icon_sisloc.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localizar produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pesquisar:");

        txtproduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprodutoKeyReleased(evt);
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
                {null, null, null, null}
            },
            new String [] {
                "Cod.", "Nome", "Quantidade Disp.", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Quantidade:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Data de início:");

        btaddproduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btaddproduto.setText("Adicionar produto");
        btaddproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddprodutoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Limpar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Data de término:");

        txtquantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        cbdatainicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbdatainicioFocusLost(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtproduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtquantidade))
                            .addComponent(btaddproduto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbdatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbdatatermino, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addComponent(cbdatatermino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbdatainicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaddproduto)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localizar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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

        txtcpf.setEditable(false);
        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nome:");

        btpesquisar.setText("Pesquisar");
        btpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesquisarActionPerformed(evt);
            }
        });

        lbnomecliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbnomecliente.setForeground(new java.awt.Color(255, 0, 0));

        txtid.setEditable(false);

        jLabel6.setText("Id:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbnomecliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btpesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rbjuridica)
                        .addGap(10, 10, 10)
                        .addComponent(rbfisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbfisica)
                            .addComponent(rbjuridica)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbnomecliente)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedido de Locação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tbitem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idItem", "CodProduto", "Nome", "Quantidade", "Qtd. Dias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
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
        tbitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbitemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbitem);
        if (tbitem.getColumnModel().getColumnCount() > 0) {
            tbitem.getColumnModel().getColumn(3).setResizable(false);
            tbitem.getColumnModel().getColumn(4).setResizable(false);
        }

        btfecharlocacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btfecharlocacao.setText("Fechar Locação");
        btfecharlocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfecharlocacaoActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Remover Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btfecharlocacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btfecharlocacao)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbfisicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbfisicaMouseClicked
        txtcnpj.setText("");
        txtcnpj.setEditable(false);
        txtcpf.setEditable(true);
        txtcpf.requestFocus();
        lbnomecliente.setText(null);
    }//GEN-LAST:event_rbfisicaMouseClicked

    private void rbjuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbjuridicaMouseClicked
        txtcpf.setText("");
        txtcpf.setEditable(false);
        txtcnpj.setEditable(true);
        txtcnpj.requestFocus();
        lbnomecliente.setText(null);
    }//GEN-LAST:event_rbjuridicaMouseClicked

    private void rbjuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjuridicaActionPerformed

    }//GEN-LAST:event_rbjuridicaActionPerformed

    private void rbjuridicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbjuridicaKeyPressed

    }//GEN-LAST:event_rbjuridicaKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        excluiLocacao();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparDados();
        carregaProdutos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesquisarActionPerformed
        getIdItem();
        replace();
        if (rbfisica.isSelected()) {

            resultados = gerenciaCliente.consultaClienteCpf(cpf);
            try {
                if (!resultados.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "Cliente não cadastrado, tente novamente.");
                    txtcpf.setText("");
                }
                while (resultados.next()) {
                    lbnomecliente.setText(resultados.getString("nome"));
                    id_cliente = resultados.getInt("idcliente");
                }

            } catch (SQLException ex) {
                Logger.getLogger(GerenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rbjuridica.isSelected()) {
            resultados = gerenciaCliente.consultaClienteCnpj(cnpj);
            try {
                if (!resultados.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "Cliente não cadastrado, tente novamente.");
                    txtcnpj.setText(null);
                }
                while (resultados.next()) {
                    id_cliente = resultados.getInt("idcliente");
                    lbnomecliente.setText(resultados.getString("nome"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(GerenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btpesquisarActionPerformed

    private void txtprodutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodutoKeyReleased
        carregaProdutos();
    }//GEN-LAST:event_txtprodutoKeyReleased

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        excluiLocacao();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btaddprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddprodutoActionPerformed
        replace();
        getIdItem();
        if (validaCampos() == true && validaTabela() == true) {
            if (validaData() == true) {
                if (Integer.parseInt(txtquantidade.getText()) > quant_disp) {
                    JOptionPane.showMessageDialog(null, "Quantidade indisponível em estoque!");
                } else {
                    String datainicio, datafim;
                    datainicio = df.format(cbdatainicio.getDate());
                    datafim = df.format(cbdatatermino.getDate());

                    long fim = cbdatatermino.getDate().getTime();
                    long inicio = cbdatainicio.getDate().getTime();
                    long diferenca = (int) ((fim - inicio) / 86400000L);
                    String d = String.valueOf(diferenca);
                    int diff = Integer.parseInt(d);
                    resultados = gerenciaLocacao.consultaLocacao(txtid.getText());
                    try {
                        if (!resultados.isBeforeFirst()) {
                            Locacao locacao = new Locacao(Integer.parseInt(txtid.getText()), id_funcionario, id_cliente);
                            Item item = new Item(Integer.parseInt(txtid.getText()), Integer.parseInt(id_produto), Integer.parseInt(txtquantidade.getText()), diff, id_itemm, datainicio, datafim);
                            gerenciaLocacao.gravaLocacao(locacao, item);
                            gerenciaLocacao.retiraEstoque(Integer.parseInt(id_produto), Integer.parseInt(txtquantidade.getText()));
                            carregaItens();
                            carregaProdutos();
                            cbdatainicio.setDate(null);
                            cbdatatermino.setDate(null);
                            getIdItem();
                            lIds.add(Integer.parseInt(id_produto));
                            lquant.add(Integer.parseInt(txtquantidade.getText()));
                            txtquantidade.setText("");
                        } else {
                            Item item = new Item(Integer.parseInt(txtid.getText()), Integer.parseInt(id_produto), Integer.parseInt(txtquantidade.getText()), diff, id_itemm, datainicio, datafim);
                            gerenciaLocacao.inserirItens(item);
                            gerenciaLocacao.retiraEstoque(Integer.parseInt(id_produto), Integer.parseInt(txtquantidade.getText()));
                            carregaItens();
                            carregaProdutos();
                            cbdatainicio.setDate(null);
                            cbdatatermino.setDate(null);
                            getIdItem();
                            lIds.add(Integer.parseInt(id_produto));
                            lquant.add(Integer.parseInt(txtquantidade.getText()));
                            txtquantidade.setText("");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }
    }//GEN-LAST:event_btaddprodutoActionPerformed

    private void tbprodutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbprodutosMouseClicked
        if (evt.getClickCount() == 1) {
            int linha = tbprodutos.getSelectedRow();
            id_produto = tbprodutos.getValueAt(linha, 0).toString();
            quant_disp = Integer.parseInt(tbprodutos.getValueAt(linha, 2).toString());
            System.out.println(quant_disp);
        }
    }//GEN-LAST:event_tbprodutosMouseClicked

    private void btfecharlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfecharlocacaoActionPerformed
        carregaId();
        carregaItens();
        limparDados();
    }//GEN-LAST:event_btfecharlocacaoActionPerformed

    private void tbitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbitemMouseClicked
        if (evt.getClickCount() == 1) {
            int linha = tbitem.getSelectedRow();
            id_item = tbitem.getValueAt(linha, 0).toString();
            quantidade = tbitem.getValueAt(linha, 3).toString();
            cod_produto = tbitem.getValueAt(linha, 1).toString();
        }
    }//GEN-LAST:event_tbitemMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gerenciaLocacao.excluiItem(txtid.getText(), id_item);
        gerenciaLocacao.devolveEstoque(cod_produto, quantidade);
        carregaItens();
        carregaProdutos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbdatainicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbdatainicioFocusLost

    }//GEN-LAST:event_cbdatainicioFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaddproduto;
    private javax.swing.JButton btfecharlocacao;
    private javax.swing.JButton btpesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser cbdatainicio;
    private com.toedter.calendar.JDateChooser cbdatatermino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbnomecliente;
    private javax.swing.JRadioButton rbfisica;
    private javax.swing.JRadioButton rbjuridica;
    private javax.swing.JTable tbitem;
    private javax.swing.JTable tbprodutos;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtproduto;
    private javax.swing.JFormattedTextField txtquantidade;
    // End of variables declaration//GEN-END:variables

    public void limparDados() {
        buttonGroup1.clearSelection();
        txtcnpj.setText("");
        txtcpf.setText("");
        cbdatainicio.setDate(null);
        cbdatatermino.setDate(null);
        txtproduto.setText("");
        txtquantidade.setText("");
        lbnomecliente.setText(null);
    }

    public void replace() {
        cnpj = txtcnpj.getText();
        cnpj = cnpj.replace(".", "");
        cnpj = cnpj.replace("/", "");
        cnpj = cnpj.replace("-", "");

        cpf = txtcpf.getText();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
    }

    public void carregaProdutos() {

        DefaultTableModel tabela = ((DefaultTableModel) tbprodutos.getModel());                 //o getModel() é responsável por pegar o modelo da tabela criada (colunas, linhas e nome da tabela)
        tabela.setRowCount(0);                                                                  //ajusta a quantidade de linhas para zero
        ResultSet resultados = gerenciaProduto.getTodosProdutos(txtproduto.getText());                              //cria a variável resultados que irá guardar os resultados da consulta
        Object dados[] = new Object[4];                                                         //cria um array de tamanho 3 correspondente à quantidade de campos da tabela (são 3 campos: codigo, nome e telefone)
        try {//Irá tentar executar o acesso aos resultados
            while (resultados.next()) {                             //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                dados[0] = resultados.getInt("idproduto");          //guarda no bloco 0 o valor do campo idContato
                dados[1] = resultados.getString("nome");
                dados[2] = resultados.getInt("quantidade");
                dados[3] = resultados.getString("descricao");
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

    public void carregaId() {
        int id = 0;
        resultados = gerenciaLocacao.carregaIdLocacao();
        try {
            while (resultados.next()) {
                id = resultados.getInt("quantidade");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtid.setText(String.valueOf(id + 1));
    }

    public boolean validaData() {
        Date datainicio = cbdatainicio.getDate();
        Date datafim = cbdatatermino.getDate();
        Date datahoje = new Date();
        try {
            datainicio = df.parse(df.format(datainicio));
            datafim = df.parse(df.format(datafim));
            datahoje = df.parse(df.format(datahoje));

            System.out.println(datainicio);
            if (datafim.compareTo(datainicio) > 0) {
                status = true;
            } else {
                status = false;
                JOptionPane.showMessageDialog(null, "Data inválida!");
            }
        } catch (ParseException ex) {
            Logger.getLogger(exemplodata.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public void carregaItens() {

        DefaultTableModel tabela = ((DefaultTableModel) tbitem.getModel());                 //o getModel() é responsável por pegar o modelo da tabela criada (colunas, linhas e nome da tabela)
        tabela.setRowCount(0);                                                                  //ajusta a quantidade de linhas para zero
        ResultSet resultados = gerenciaLocacao.carregaItens(txtid.getText());
        Object dados[] = new Object[5];                                                         //cria um array de tamanho 3 correspondente à quantidade de campos da tabela (são 3 campos: codigo, nome e telefone)
        try {//Irá tentar executar o acesso aos resultados
            while (resultados.next()) {
                dados[0] = resultados.getInt("iditem"); //Enquanto houver um próximo resultado, ele irá iniciar o laço de repetição
                dados[1] = resultados.getInt("idproduto");          //guarda no bloco 0 o valor do campo idContato
                dados[2] = resultados.getString("nome");
                dados[3] = resultados.getInt("quantidade");
                dados[4] = resultados.getInt("qt_dias");
                tabela.addRow(dados);                                   //adiciona na tabela uma linha com os dados captados através da variável resultados
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validaCampos() {
        boolean status = false;
        if (rbfisica.isSelected()) {
            if (cpf.equals("") || txtquantidade.getText().equals("")
                    || cbdatainicio.getDate() == null || cbdatatermino.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            } else {
                status = true;
            }
        }

        if (rbjuridica.isSelected()) {
            if (cnpj.equals("") || txtquantidade.getText().equals("")
                    || cbdatainicio.getDate() == null || cbdatatermino.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            } else {
                status = true;
            }
        }
        return status;
    }

    public boolean validaTabela() {
        if (tbprodutos.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!");
            return false;
        } else {
            return true;
        }
    }

    public void getIdItem() {
        resultados = gerenciaLocacao.carregaIdItem(txtid.getText());
        try {
            while (resultados.next()) {
                id_itemm = resultados.getInt("quantidade") + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluiLocacao() {
        int res = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?\n Se você sair agora sua locacao será cancelada!");
        if (res == 0) {
            gerenciaLocacao.devolveEstoque(lIds, lquant);
            carregaProdutos();
            dispose();
            limparDados();
            gerenciaLocacao.excluiLocacao(txtid.getText());
            carregaItens();
        } else {
        }
    }
    

}
