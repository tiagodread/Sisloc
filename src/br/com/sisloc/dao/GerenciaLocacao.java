package br.com.sisloc.dao;

import br.com.sisloc.control.Conexao;
import br.com.sisloc.model.Item;
import br.com.sisloc.model.Locacao;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tiago
 */
public class GerenciaLocacao {

    private String sql;
    private ResultSet res;
    private Conexao conexao = new Conexao();

    public ResultSet carregaIdLocacao() {
        sql = "SELECT count(*) as quantidade FROM locacao";
        res = conexao.executarConsulta(sql);
        return res;
    }

    public ResultSet carregaIdItem(String idLocacao) {
        sql = "SELECT count(*) as quantidade FROM item WHERE locacao_idlocacao = " + idLocacao;
        res = conexao.executarConsulta(sql);
        return res;
    }

    public void gravaLocacao(Locacao locacao, Item item) {
        sql = "INSERT INTO locacao VALUES ('" + locacao.getId() + "', '" + locacao.getIdCliente() + "', '" + locacao.getIdFuncResp() + "')";
        conexao.executarSql(sql);

        sql = "INSERT INTO item VALUES ('" + item.getIdLocacao() + "','" + item.getIdProduto() + "','" + item.getIdItem() + "','" + item.getQuantidade() + "','" + item.getQt_dias() + "','" + item.getDataInicio() + "','" + item.getDataFim() + "')";
        conexao.executarSql(sql);
    }

    public void inserirItens(Item item) {
        sql = "INSERT INTO item VALUES ('" + item.getIdLocacao() + "','" + item.getIdProduto() + "','" + item.getIdItem() + "','" + item.getQuantidade() + "','" + item.getQt_dias() + "','" + item.getDataInicio() + "','" + item.getDataFim() + "')";
        conexao.executarSql(sql);
    }

    public ResultSet consultaLocacao(String id) {
        sql = "SELECT * FROM locacao WHERE idlocacao like '" + id + "'";
        res = conexao.executarConsulta(sql);
        return res;
    }

    public ResultSet carregaItens(String id) {
        sql = "select i.iditem, i.idproduto, p.nome, i.quantidade, i.qt_dias from item i, produto p where i.idproduto = p.idproduto and i.locacao_idlocacao =" + id;
        res = conexao.executarConsulta(sql);
        return res;
    }

    public void retiraEstoque(int idproduto, int quantidade) {
        sql = "UPDATE produto SET quantidade = quantidade -" + quantidade + " where idproduto = " + idproduto;
        conexao.executarSql(sql);
    }

    public void devolveEstoque(String idProduto, String quantidade) {
        sql = "UPDATE produto SET quantidade = quantidade +" + quantidade + " where idproduto = " + idProduto;
        conexao.executarSql(sql);
    }

    public void excluiItem(String idLocacao, String idItem) {
        sql = "DELETE FROM item WHERE locacao_idlocacao = " + idLocacao + " AND iditem = " + idItem;
        conexao.executarSql(sql);
    }

    public void excluiLocacao(String idLocacao) {
        sql = "DELETE FROM locacao WHERE idlocacao = " + idLocacao;
        conexao.executarSql(sql);
    }

    public void devolveEstoque(ArrayList ids, ArrayList quant) {

        for (int i = 0; i < ids.size(); i++) {
                sql = "update produto set quantidade = quantidade + " + quant.get(i) + " where idproduto = " + ids.get(i);
                conexao.executarSql(sql);
        }
    }
}
