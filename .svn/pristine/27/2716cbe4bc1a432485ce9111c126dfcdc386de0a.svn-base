package br.com.sisloc.dao;

import br.com.sisloc.control.Conexao;
import br.com.sisloc.model.Produto;
import java.sql.ResultSet;

/**
 *
 * @author Tiago
 */
public class GerenciaProduto {

    private String sql;
    private final Conexao conexao = new Conexao();
    private ResultSet res;

    public GerenciaProduto() {
    }

    public void cadastraProduto(Produto produto) {
        System.out.println(produto.getCnpjFornecedor());
        sql = "INSERT INTO produto VALUES (null,'" + produto.getNome() + "','" + produto.getQuantidade() + "','" + produto.getValorUnitario() + "',"
                + "'" + produto.getDescricao() + "','" + produto.getCnpjFornecedor() + "')";
        conexao.executarSql(sql);
    }

    public ResultSet getTodosProdutos(String nomeProduto) {
        sql = "select * from produto where nome like '%" + nomeProduto + "%'";
        res = conexao.executarConsulta(sql);
        return res;
    }

    public ResultSet carregaId() {
        sql = "SELECT count(*) as quantidade FROM produto";
        res = conexao.executarConsulta(sql);
        return res;
    }

    public ResultSet getprodutoId(int idProduto) {
        sql = "SELECT * FROM produto WHERE idproduto = " + idProduto;
        res = conexao.executarConsulta(sql);
        return res;
    }

    public void editarProduto(int idProduto, Produto produto) {
        sql = "UPDATE produto set nome = '" + produto.getNome() + "',quantidade = '" + produto.getQuantidade() + "',valor_unitario = '" + produto.getValorUnitario() + "',"
                + "descricao = '" + produto.getDescricao() + "',fornecedor_cnpj = '" + produto.getCnpjFornecedor() + "' WHERE idproduto = " + idProduto;
        conexao.executarSql(sql);
    }

    public void excluiProduto(int idproduto) {
        sql = "DELETE FROM produto WHERE idproduto = " + idproduto;
        conexao.executarSql(sql);
    }

    public ResultSet verificaItemAlocado(int idProduto) {
        sql = "SELECT * FROM item WHERE idproduto = " + idProduto;
        res = conexao.executarConsulta(sql);
        return res;
    }

}
