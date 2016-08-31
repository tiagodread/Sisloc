/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisloc.view;

import br.com.sisloc.control.Conexao;
import javax.swing.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo
 */
public class Principal extends javax.swing.JFrame {

    CadastroCliente cadastrocliente;
    CadastroFornecedor cadastrofornecedor;
    CadastroLocacao cadastrolocacao;
    CadastroProduto cadastroproduto;
    EditarCliente editarcliente;
    ProcurarCliente procurarcliente;
    EditarFornecedor editarfornecedor;
    ProcurarFornecedor procurarfornecedor;
    EditarLocacao editarlocacao;
    ProcurarLocacao procurarlocacao;
    EditarProduto editarproduto;
    ProcurarProduto procurarproduto;
    CadastroFuncionario cadastrofuncionario;
    EditarFuncionario editarfuncionario;
    ProcurarFuncionario procurarfuncionario;
    ConteudoAjuda conteudoajuda;
    Sobre sobre = new Sobre();
    Conexao con = new Conexao();

    public Principal(int id_funcionario) {
        initComponents();
        this.setIconImage(new ImageIcon("..\\Sisloc\\src\\br\\com\\sisloc\\image\\icon_sisloc.jpg").getImage());
        setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        cadastrolocacao = new CadastroLocacao(id_funcionario);
    }

    public Principal() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pndesktop = new javax.swing.JDesktopPane();
        lbicone = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuarquivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        sair = new javax.swing.JMenuItem();
        menucliente = new javax.swing.JMenu();
        subnovocliente = new javax.swing.JMenuItem();
        subeditarcliente = new javax.swing.JMenuItem();
        subprocurarcliente = new javax.swing.JMenuItem();
        menufornecedor = new javax.swing.JMenu();
        subnovofornecedor = new javax.swing.JMenuItem();
        subeditarfornecedor = new javax.swing.JMenuItem();
        subprocurarfornecedor = new javax.swing.JMenuItem();
        menulocacao = new javax.swing.JMenu();
        subnovalocacao = new javax.swing.JMenuItem();
        subeditarlocacao = new javax.swing.JMenuItem();
        subprocurarlocacao = new javax.swing.JMenuItem();
        menuproduto = new javax.swing.JMenu();
        subnovoproduto = new javax.swing.JMenuItem();
        subeditarproduto = new javax.swing.JMenuItem();
        subprocurarproduto = new javax.swing.JMenuItem();
        menufuncionario = new javax.swing.JMenu();
        subnovofuncionario = new javax.swing.JMenuItem();
        subeditarfuncionario = new javax.swing.JMenuItem();
        subprocurarfuncionario = new javax.swing.JMenuItem();
        menurelatorio = new javax.swing.JMenu();
        subrelatoriocliente = new javax.swing.JMenuItem();
        subrelatoriofornecedor = new javax.swing.JMenuItem();
        subrelatoriofuncionario = new javax.swing.JMenuItem();
        subrelatoriolocacao = new javax.swing.JMenuItem();
        subrelatorioproduto = new javax.swing.JMenuItem();
        menuajuda = new javax.swing.JMenu();
        subconteudoajuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        subsobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Locação de Container - SISLOC");
        setBackground(new java.awt.Color(153, 204, 255));

        pndesktop.setBackground(new java.awt.Color(255, 255, 255));
        pndesktop.setForeground(new java.awt.Color(255, 255, 255));

        lbicone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/background.jpg"))); // NOI18N

        javax.swing.GroupLayout pndesktopLayout = new javax.swing.GroupLayout(pndesktop);
        pndesktop.setLayout(pndesktopLayout);
        pndesktopLayout.setHorizontalGroup(
            pndesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pndesktopLayout.createSequentialGroup()
                .addGap(0, 348, Short.MAX_VALUE)
                .addComponent(lbicone))
        );
        pndesktopLayout.setVerticalGroup(
            pndesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pndesktopLayout.createSequentialGroup()
                .addGap(0, 278, Short.MAX_VALUE)
                .addComponent(lbicone, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pndesktop.setLayer(lbicone, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuarquivo.setText("Arquivo");
        menuarquivo.add(jSeparator1);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        menuarquivo.add(sair);

        jMenuBar1.add(menuarquivo);

        menucliente.setText("Cliente");

        subnovocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/new.png"))); // NOI18N
        subnovocliente.setText("Novo Cliente");
        subnovocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subnovoclienteActionPerformed(evt);
            }
        });
        menucliente.add(subnovocliente);

        subeditarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/edit.png"))); // NOI18N
        subeditarcliente.setText("Editar Cliente");
        subeditarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subeditarclienteActionPerformed(evt);
            }
        });
        menucliente.add(subeditarcliente);

        subprocurarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/search.png"))); // NOI18N
        subprocurarcliente.setText("Procurar Cliente");
        subprocurarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subprocurarclienteActionPerformed(evt);
            }
        });
        menucliente.add(subprocurarcliente);

        jMenuBar1.add(menucliente);

        menufornecedor.setText("Fornecedor");

        subnovofornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/new.png"))); // NOI18N
        subnovofornecedor.setText("Novo Fornecedor");
        subnovofornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subnovofornecedorActionPerformed(evt);
            }
        });
        menufornecedor.add(subnovofornecedor);

        subeditarfornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/edit.png"))); // NOI18N
        subeditarfornecedor.setText("Editar Fornecedor");
        subeditarfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subeditarfornecedorActionPerformed(evt);
            }
        });
        menufornecedor.add(subeditarfornecedor);

        subprocurarfornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/search.png"))); // NOI18N
        subprocurarfornecedor.setText("Procurar Fornecedor");
        subprocurarfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subprocurarfornecedorActionPerformed(evt);
            }
        });
        menufornecedor.add(subprocurarfornecedor);

        jMenuBar1.add(menufornecedor);

        menulocacao.setText("Locação");

        subnovalocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/new.png"))); // NOI18N
        subnovalocacao.setText("Nova Locação");
        subnovalocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subnovalocacaoActionPerformed(evt);
            }
        });
        menulocacao.add(subnovalocacao);

        subeditarlocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/edit.png"))); // NOI18N
        subeditarlocacao.setText("Editar Locação");
        subeditarlocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subeditarlocacaoActionPerformed(evt);
            }
        });
        menulocacao.add(subeditarlocacao);

        subprocurarlocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/search.png"))); // NOI18N
        subprocurarlocacao.setText("Procurar Locação");
        subprocurarlocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subprocurarlocacaoActionPerformed(evt);
            }
        });
        menulocacao.add(subprocurarlocacao);

        jMenuBar1.add(menulocacao);

        menuproduto.setText("Produto");

        subnovoproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/new.png"))); // NOI18N
        subnovoproduto.setText("Novo Produto");
        subnovoproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subnovoprodutoActionPerformed(evt);
            }
        });
        menuproduto.add(subnovoproduto);

        subeditarproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/edit.png"))); // NOI18N
        subeditarproduto.setText("Editar Produto");
        subeditarproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subeditarprodutoActionPerformed(evt);
            }
        });
        menuproduto.add(subeditarproduto);

        subprocurarproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/search.png"))); // NOI18N
        subprocurarproduto.setText("Procurar Produto");
        subprocurarproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subprocurarprodutoActionPerformed(evt);
            }
        });
        menuproduto.add(subprocurarproduto);

        jMenuBar1.add(menuproduto);

        menufuncionario.setText("Funcionário");

        subnovofuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/new.png"))); // NOI18N
        subnovofuncionario.setText("Novo Funcionário");
        subnovofuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subnovofuncionarioActionPerformed(evt);
            }
        });
        menufuncionario.add(subnovofuncionario);

        subeditarfuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/edit.png"))); // NOI18N
        subeditarfuncionario.setText("Editar Funcionário");
        subeditarfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subeditarfuncionarioActionPerformed(evt);
            }
        });
        menufuncionario.add(subeditarfuncionario);

        subprocurarfuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/search.png"))); // NOI18N
        subprocurarfuncionario.setText("Procurar Funcionário");
        subprocurarfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subprocurarfuncionarioActionPerformed(evt);
            }
        });
        menufuncionario.add(subprocurarfuncionario);

        jMenuBar1.add(menufuncionario);

        menurelatorio.setText("Relatório");

        subrelatoriocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/funcionario.png"))); // NOI18N
        subrelatoriocliente.setText("Gerar Relatório Clientes");
        subrelatoriocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subrelatorioclienteActionPerformed(evt);
            }
        });
        menurelatorio.add(subrelatoriocliente);

        subrelatoriofornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/produto.png"))); // NOI18N
        subrelatoriofornecedor.setText("Gerar Relatório Fornecedores");
        subrelatoriofornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subrelatoriofornecedorActionPerformed(evt);
            }
        });
        menurelatorio.add(subrelatoriofornecedor);

        subrelatoriofuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/funcionario.png"))); // NOI18N
        subrelatoriofuncionario.setText("Gerar Relatório Funcionários");
        subrelatoriofuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subrelatoriofuncionarioActionPerformed(evt);
            }
        });
        menurelatorio.add(subrelatoriofuncionario);

        subrelatoriolocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/locacao.png"))); // NOI18N
        subrelatoriolocacao.setText("Gerar Relatório Locações");
        subrelatoriolocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subrelatoriolocacaoActionPerformed(evt);
            }
        });
        menurelatorio.add(subrelatoriolocacao);

        subrelatorioproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/locacao.png"))); // NOI18N
        subrelatorioproduto.setText("Gerar Relatório Produtos");
        subrelatorioproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subrelatorioprodutoActionPerformed(evt);
            }
        });
        menurelatorio.add(subrelatorioproduto);

        jMenuBar1.add(menurelatorio);

        menuajuda.setText("Ajuda");

        subconteudoajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisloc/image/help.png"))); // NOI18N
        subconteudoajuda.setText("Conteúdo de Ajuda");
        subconteudoajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subconteudoajudaActionPerformed(evt);
            }
        });
        menuajuda.add(subconteudoajuda);
        menuajuda.add(jSeparator2);

        subsobre.setText("Sobre");
        subsobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsobreActionPerformed(evt);
            }
        });
        menuajuda.add(subsobre);

        jMenuBar1.add(menuajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pndesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pndesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void subnovoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subnovoclienteActionPerformed
        cadastrocliente = new CadastroCliente();
        pndesktop.add(cadastrocliente);
        cadastrocliente.setVisible(true);
        cadastrocliente.setPosicao();
    }//GEN-LAST:event_subnovoclienteActionPerformed

    private void subeditarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subeditarclienteActionPerformed
        editarcliente = new EditarCliente();
        pndesktop.add(editarcliente);
        editarcliente.setVisible(true);
        editarcliente.setPosicao();
    }//GEN-LAST:event_subeditarclienteActionPerformed

    private void subprocurarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subprocurarclienteActionPerformed
        procurarcliente = new ProcurarCliente();
        pndesktop.add(procurarcliente);
        procurarcliente.setVisible(true);
        procurarcliente.setPosicao();
    }//GEN-LAST:event_subprocurarclienteActionPerformed

    private void subnovofornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subnovofornecedorActionPerformed
        cadastrofornecedor = new CadastroFornecedor();
        pndesktop.add(cadastrofornecedor);
        cadastrofornecedor.setVisible(true);
        cadastrofornecedor.setPosicao();
    }//GEN-LAST:event_subnovofornecedorActionPerformed

    private void subeditarfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subeditarfornecedorActionPerformed
        editarfornecedor = new EditarFornecedor();
        pndesktop.add(editarfornecedor);
        editarfornecedor.setVisible(true);
        editarfornecedor.setPosicao();
    }//GEN-LAST:event_subeditarfornecedorActionPerformed

    private void subprocurarfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subprocurarfornecedorActionPerformed
        procurarfornecedor = new ProcurarFornecedor();
        pndesktop.add(procurarfornecedor);
        procurarfornecedor.setVisible(true);
        procurarfornecedor.setPosicao();
    }//GEN-LAST:event_subprocurarfornecedorActionPerformed

    private void subnovalocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subnovalocacaoActionPerformed
        pndesktop.add(cadastrolocacao);
        cadastrolocacao.setVisible(true);
        cadastrolocacao.setPosicao();
    }//GEN-LAST:event_subnovalocacaoActionPerformed

    private void subeditarlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subeditarlocacaoActionPerformed
        editarlocacao = new EditarLocacao();
        pndesktop.add(editarlocacao);
        editarlocacao.setVisible(true);
    }//GEN-LAST:event_subeditarlocacaoActionPerformed

    private void subprocurarlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subprocurarlocacaoActionPerformed
        procurarlocacao = new ProcurarLocacao();
        pndesktop.add(procurarlocacao);
        procurarlocacao.setPosicao();
        procurarlocacao.setVisible(true);
    }//GEN-LAST:event_subprocurarlocacaoActionPerformed

    private void subnovoprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subnovoprodutoActionPerformed
        cadastroproduto = new CadastroProduto();
        pndesktop.add(cadastroproduto);
        cadastroproduto.setVisible(true);
        cadastroproduto.setPosicao();
    }//GEN-LAST:event_subnovoprodutoActionPerformed

    private void subeditarprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subeditarprodutoActionPerformed
        editarproduto = new EditarProduto();
        pndesktop.add(editarproduto);
        editarproduto.setVisible(true);
        editarproduto.setPosicao();
    }//GEN-LAST:event_subeditarprodutoActionPerformed

    private void subprocurarprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subprocurarprodutoActionPerformed
        procurarproduto = new ProcurarProduto();
        pndesktop.add(procurarproduto);
        procurarproduto.setPosicao();
        procurarproduto.setVisible(true);
    }//GEN-LAST:event_subprocurarprodutoActionPerformed

    private void subnovofuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subnovofuncionarioActionPerformed
        cadastrofuncionario = new CadastroFuncionario();
        pndesktop.add(cadastrofuncionario);
        cadastrofuncionario.setVisible(true);
        cadastrofuncionario.setPosicao();
    }//GEN-LAST:event_subnovofuncionarioActionPerformed

    private void subeditarfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subeditarfuncionarioActionPerformed
        editarfuncionario = new EditarFuncionario();
        pndesktop.add(editarfuncionario);
        editarfuncionario.setPosicao();
        editarfuncionario.setVisible(true);
    }//GEN-LAST:event_subeditarfuncionarioActionPerformed

    private void subprocurarfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subprocurarfuncionarioActionPerformed
        procurarfuncionario = new ProcurarFuncionario();
        pndesktop.add(procurarfuncionario);
        procurarfuncionario.setPosicao();
        procurarfuncionario.setVisible(true);
    }//GEN-LAST:event_subprocurarfuncionarioActionPerformed

    private void subrelatorioclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subrelatorioclienteActionPerformed
        relatorioCliente();
    }//GEN-LAST:event_subrelatorioclienteActionPerformed

    private void subrelatoriofornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subrelatoriofornecedorActionPerformed
        relatorioFornecedor();
    }//GEN-LAST:event_subrelatoriofornecedorActionPerformed

    private void subrelatoriofuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subrelatoriofuncionarioActionPerformed
        relatorioFuncionario();
    }//GEN-LAST:event_subrelatoriofuncionarioActionPerformed

    private void subrelatoriolocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subrelatoriolocacaoActionPerformed
        relatorioLocacao();
    }//GEN-LAST:event_subrelatoriolocacaoActionPerformed

    private void subrelatorioprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subrelatorioprodutoActionPerformed
        relatorioProduto();
    }//GEN-LAST:event_subrelatorioprodutoActionPerformed

    private void subconteudoajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subconteudoajudaActionPerformed
        conteudoajuda = new ConteudoAjuda();
        pndesktop.add(conteudoajuda);
        conteudoajuda.setVisible(true);
    }//GEN-LAST:event_subconteudoajudaActionPerformed

    private void subsobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsobreActionPerformed
        sobre = new Sobre();
        pndesktop.add(sobre);
        sobre.setPosicao();
        sobre.setVisible(true);
    }//GEN-LAST:event_subsobreActionPerformed

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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lbicone;
    private javax.swing.JMenu menuajuda;
    private javax.swing.JMenu menuarquivo;
    private javax.swing.JMenu menucliente;
    private javax.swing.JMenu menufornecedor;
    private javax.swing.JMenu menufuncionario;
    private javax.swing.JMenu menulocacao;
    private javax.swing.JMenu menuproduto;
    private javax.swing.JMenu menurelatorio;
    protected static javax.swing.JDesktopPane pndesktop;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem subconteudoajuda;
    private javax.swing.JMenuItem subeditarcliente;
    private javax.swing.JMenuItem subeditarfornecedor;
    private javax.swing.JMenuItem subeditarfuncionario;
    private javax.swing.JMenuItem subeditarlocacao;
    private javax.swing.JMenuItem subeditarproduto;
    private javax.swing.JMenuItem subnovalocacao;
    private javax.swing.JMenuItem subnovocliente;
    private javax.swing.JMenuItem subnovofornecedor;
    private javax.swing.JMenuItem subnovofuncionario;
    private javax.swing.JMenuItem subnovoproduto;
    private javax.swing.JMenuItem subprocurarcliente;
    private javax.swing.JMenuItem subprocurarfornecedor;
    private javax.swing.JMenuItem subprocurarfuncionario;
    private javax.swing.JMenuItem subprocurarlocacao;
    private javax.swing.JMenuItem subprocurarproduto;
    private javax.swing.JMenuItem subrelatoriocliente;
    private javax.swing.JMenuItem subrelatoriofornecedor;
    private javax.swing.JMenuItem subrelatoriofuncionario;
    private javax.swing.JMenuItem subrelatoriolocacao;
    private javax.swing.JMenuItem subrelatorioproduto;
    private javax.swing.JMenuItem subsobre;
    // End of variables declaration//GEN-END:variables

    public void relatorioProduto() {
        String sql = "select nome,quantidade,valor_unitario from produto;";
        ResultSet result;
        String texto;
        int num;
        float num2;
        result = con.executarConsulta(sql);

        int res = JOptionPane.showConfirmDialog(null, "Deseja gerar o relatório de produtos?");
        if (res == 0) {
            Document document = new Document(PageSize.A4);

            try {
                PdfWriter.getInstance(document, new FileOutputStream("relatórios\\Produtos.pdf"));//Gera o relatório em PDF no local informado(OBS: favor informar o endereço para que seja gerado o pdf corretamente).
                document.open();
                document.addAuthor("Sisloc");
                Image img = Image.getInstance("src\\br\\com\\sisloc\\image\\logo.png");
                img.setAlignment(Element.ALIGN_CENTER);
                document.add(img);
                document.add(new Paragraph("Produtos" + "\n\n"));
                PdfPTable table = new PdfPTable(new float[]{0.6f, 0.2f, 0.2f});
                table.setWidthPercentage(100f);
                table.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.getDefaultCell().setHorizontalAlignment(Paragraph.ALIGN_CENTER);
                table.addCell("Produto");
                table.addCell("Quantidade");
                table.addCell("Valor Unitário");
                while (result.next()) {
                    texto = result.getString("nome");
                    table.addCell(texto);
                    num = result.getInt("quantidade");
                    table.addCell(String.valueOf(num));
                    num2 = result.getFloat("valor_unitario");
                    table.addCell(String.valueOf(num2));
                }//WHILE

                document.add(table);

            } catch (DocumentException de) {
                System.err.println(de.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.close();
        }//IF

    }

    public void relatorioLocacao() {
        String sql = "select item.locacao_idlocacao,produto.nome,item.data_inicio,"
                + "item.data_fim from produto,item where item.idproduto=produto.idproduto order by item.locacao_idlocacao asc;";
        ResultSet result;
        String texto;
        int num;
        result = con.executarConsulta(sql);

        int res = JOptionPane.showConfirmDialog(null, "Deseja gerar o relatório de locações?");
        if (res == 0) {
            Document document = new Document(PageSize.A4);

            try {
                PdfWriter.getInstance(document, new FileOutputStream("relatórios\\Locações.pdf"));//Gera o relatório em PDF no local informado(OBS: favor informar o endereço para que seja gerado o pdf corretamente).
                document.open();
                document.addAuthor("Sisloc");
                Image img = Image.getInstance("src\\br\\com\\sisloc\\image\\logo.png");
                img.setAlignment(Element.ALIGN_CENTER);
                document.add(img);
                document.add(new Paragraph("Locações" + "\n\n"));
                PdfPTable table = new PdfPTable(new float[]{0.1f, 0.5f, 0.2f, 0.2f});
                table.setWidthPercentage(100f);
                table.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.getDefaultCell().setHorizontalAlignment(Paragraph.ALIGN_CENTER);
                table.addCell("ID");
                table.addCell("Produto");
                table.addCell("Data Início");
                table.addCell("Data Fim");
                while (result.next()) {
                    num = result.getInt("item.locacao_idlocacao");
                    table.addCell(String.valueOf(num));
                    texto = result.getString("produto.nome");
                    table.addCell(texto);
                    texto = result.getString("item.data_inicio");
                    table.addCell(texto);
                    texto = result.getString("item.data_fim");
                    table.addCell(texto);
                }//WHILE

                document.add(table);
                sql = "select count(*) from locacao";
                result = con.executarConsulta(sql);
                result.next();
                document.add(new Paragraph("   "));//pula linha improvisado
                document.add(new Paragraph("   "));//pula linha improvisado
                document.add(new Paragraph("Total de locações ativas: " + result.getInt("count(*)")));

            } catch (DocumentException de) {
                System.err.println(de.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.close();
        }//IF
    }

    public void relatorioFuncionario() {
        String sql = "select nome,cidade,telefone,email from funcionario;";
        ResultSet result;
        String texto;
        result = con.executarConsulta(sql);

        int res = JOptionPane.showConfirmDialog(null, "Deseja gerar o relatório de funcionários?");
        if (res == 0) {
            Document document = new Document(PageSize.A4);

            try {
                PdfWriter.getInstance(document, new FileOutputStream("relatórios\\Funcionários.pdf"));//Gera o relatório em PDF no local informado(OBS: favor informar o endereço para que seja gerado o pdf corretamente).
                document.open();
                document.addAuthor("Sisloc");
                Image img = Image.getInstance("src\\br\\com\\sisloc\\image\\logo.png");
                img.setAlignment(Element.ALIGN_CENTER);
                document.add(img);
                document.add(new Paragraph("Funcionários" + "\n\n"));
                PdfPTable table = new PdfPTable(new float[]{0.3f, 0.2f, 0.2f, 0.3f});
                table.setWidthPercentage(100f);
                table.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.getDefaultCell().setHorizontalAlignment(Paragraph.ALIGN_CENTER);
                table.addCell("Nome");
                table.addCell("Cidade");
                table.addCell("Telefone");
                table.addCell("Email");
                while (result.next()) {
                    texto = result.getString("nome");
                    table.addCell(texto);
                    texto = result.getString("cidade");
                    table.addCell(texto);
                    texto = result.getString("telefone");
                    table.addCell(texto);
                    texto = result.getString("email");
                    table.addCell(texto);
                }//WHILE

                document.add(table);

            } catch (DocumentException de) {
                System.err.println(de.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.close();
        }//IF
    }

    public void relatorioCliente() {
        String sql = "select nome,cidade,telefone,email from cliente;";
        ResultSet result;
        String texto;
        int num;
        result = con.executarConsulta(sql);

        int res = JOptionPane.showConfirmDialog(null, "Deseja gerar o relatório de clientes?");
        if (res == 0) {
            Document document = new Document(PageSize.A4);

            try {
                PdfWriter.getInstance(document, new FileOutputStream("relatórios\\Clientes.pdf"));//Gera o relatório em PDF no local informado(OBS: favor informar o endereço para que seja gerado o pdf corretamente).
                document.open();
                document.addAuthor("Sisloc");
                Image img = Image.getInstance("src\\br\\com\\sisloc\\image\\logo.png");
                img.setAlignment(Element.ALIGN_CENTER);
                document.add(img);
                document.add(new Paragraph("Clientes" + "\n\n"));
                PdfPTable table = new PdfPTable(new float[]{0.3f, 0.2f, 0.2f, 0.3f});
                table.setWidthPercentage(100f);
                table.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.getDefaultCell().setHorizontalAlignment(Paragraph.ALIGN_CENTER);
                table.addCell("Nome");
                table.addCell("Cidade");
                table.addCell("Telefone");
                table.addCell("Email");
                while (result.next()) {
                    texto = result.getString("nome");
                    table.addCell(texto);
                    texto = result.getString("cidade");
                    table.addCell(texto);
                    texto = result.getString("telefone");
                    table.addCell(texto);
                    texto = result.getString("email");
                    table.addCell(texto);
                }//WHILE

                document.add(table);

            } catch (DocumentException de) {
                System.err.println(de.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.close();
        }//IF

    }

    public void relatorioFornecedor() {
        String sql = "select nome,cidade,telefone,email from fornecedor;";
        ResultSet result;
        String texto;
        result = con.executarConsulta(sql);

        int res = JOptionPane.showConfirmDialog(null, "Deseja gerar o relatório de fornecedores?");
        if (res == 0) {
            Document document = new Document(PageSize.A4);

            try {
                PdfWriter.getInstance(document, new FileOutputStream("relatórios\\Fornecedores.pdf"));//Gera o relatório em PDF no local informado(OBS: favor informar o endereço para que seja gerado o pdf corretamente).
                document.open();
                document.addAuthor("Sisloc");
                Image img = Image.getInstance("src\\br\\com\\sisloc\\image\\logo.png");
                img.setAlignment(Element.ALIGN_CENTER);
                document.add(img);
                document.add(new Paragraph("Fornecedores" + "\n\n"));
                PdfPTable table = new PdfPTable(new float[]{0.3f, 0.2f, 0.2f, 0.3f});
                table.setWidthPercentage(100f);
                table.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.getDefaultCell().setHorizontalAlignment(Paragraph.ALIGN_CENTER);
                table.addCell("Nome");
                table.addCell("Cidade");
                table.addCell("Telefone");
                table.addCell("Email");
                while (result.next()) {
                    texto = result.getString("nome");
                    table.addCell(texto);
                    texto = result.getString("cidade");
                    table.addCell(texto);
                    texto = result.getString("telefone");
                    table.addCell(texto);
                    texto = result.getString("email");
                    table.addCell(texto);
                }//WHILE

                document.add(table);

            } catch (DocumentException de) {
                System.err.println(de.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.close();
        }//IF
    }
}
