package br.com.sisloc.dao;

import br.com.sisloc.control.Conexao;
import br.com.sisloc.model.Fornecedor;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class GerenciaFornecedor {

    private Conexao conexao = new Conexao();
    private String sql;
    private ResultSet res;

    public void cadastraFornecedor(Fornecedor fornecedor) {
        sql = "INSERT INTO fornecedor VALUES ('" + fornecedor.getCnpj() + "', '" + fornecedor.getRazaosocial() + "', '" + fornecedor.getTelefone() + "',"
                + "'" + fornecedor.getLogradouro() + "','" + fornecedor.getNumero() + "','" + fornecedor.getBairro() + "','" + fornecedor.getCidade() + "',"
                + "'" + fornecedor.getUf() + "','" + fornecedor.getEmail() + "','" + fornecedor.getDescricao() + "')";
        conexao.executarSql(sql);
        JOptionPane.showMessageDialog(null, "Fornecador cadastrado!");
    }

    public ResultSet consultaFornecedor(String cnpj) {
        sql = "SELECT cnpj,nome,telefone,logradouro,numero,bairro,cidade,uf,email,descricao FROM fornecedor WHERE cnpj = '" + cnpj + "'";
        ResultSet res = conexao.executarConsulta(sql);
        return res;
    }

    public void excluiFornecedor(String cnpj) {
        sql = "DELETE FROM fornecedor WHERE cnpj = '" + cnpj + "'";
        conexao.executarSql(sql);
    }

    public void alteraFornecedor(Fornecedor fornecedor) {
        sql = "UPDATE fornecedor SET cnpj='" + fornecedor.getCnpj() + "', nome='" + fornecedor.getRazaosocial() + "', telefone='" + fornecedor.getTelefone() + "',"
                + "logradouro = '" + fornecedor.getLogradouro() + "', numero ='" + fornecedor.getNumero() + "', bairro='" + fornecedor.getBairro() + "', cidade='" + fornecedor.getCidade() + "',"
                + "uf='" + fornecedor.getUf() + "',email='" + fornecedor.getEmail() + "',descricao='" + fornecedor.getDescricao() + "' WHERE cnpj = '" + fornecedor.getCnpj() + "'";
        conexao.executarSql(sql);
    }

    public ResultSet getTodosFornecedor(String nome) {
        sql = "select * from fornecedor where nome like '%" + nome + "%'";
        res = conexao.executarConsulta(sql);
        return res;
    }

}
