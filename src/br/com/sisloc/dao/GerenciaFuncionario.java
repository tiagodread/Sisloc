package br.com.sisloc.dao;

import br.com.sisloc.control.Conexao;
import br.com.sisloc.model.Funcionario;
import java.sql.ResultSet;

/**
 *
 * @author Tiago
 */
public class GerenciaFuncionario {

    private Conexao conexao = new Conexao();
    private String sql;
    private ResultSet res;

    public void cadastraFuncionario(Funcionario funcionario) {
        sql = "INSERT INTO funcionario VALUES ('" + funcionario.getMatricula() + "','" + funcionario.getCpf() + "',"
                + "'" + funcionario.getNome() + "','" + funcionario.getLogradouro() + "','" + funcionario.getNumero() + "',"
                + "'" + funcionario.getBairro() + "','" + funcionario.getCidade() + "','" + funcionario.getUf() + "',"
                + "'" + funcionario.getTelefone() + "','" + funcionario.getCelular() + "','" + funcionario.getEmail() + "',"
                + "'" + funcionario.getCargo() + "','" + funcionario.getSalario() + "','" + funcionario.getLogin() + "',"
                + "'" + funcionario.getSenha() + "')";
        conexao.executarSql(sql);
    }

    public ResultSet consultaFuncionarioCPF(String cpf) {
        sql = "SELECT cpf FROM funcionario WHERE cpf = '" + cpf + "'";
        res = conexao.executarConsulta(sql);
        return res;
    }

    public ResultSet consultaFuncionarioNome(String nome) {
        sql = "select * from funcionario where nome like '%" + nome + "%'";
        res = conexao.executarConsulta(sql);
        return res;
    }

    public ResultSet getFunc(int matr) {
        sql = "SELECT * FROM funcionario WHERE matricula = '" + matr + "'";
        res = conexao.executarConsulta(sql);
        return res;
    }

    public ResultSet consultaFuncionarioMatricula(int matricula) {
        sql = "SELECT matricula FROM funcionario WHERE matricula = '" + matricula + "'";
        res = conexao.executarConsulta(sql);
        return res;
    }

    public void editarFuncionario(int matricula, Funcionario funcionario) {
        sql = "UPDATE FUNCIONARIO SET cpf = '" + funcionario.getCpf() + "', nome = '" + funcionario.getNome() + "',"
                + "logradouro = '" + funcionario.getLogradouro() + "', numero = '" + funcionario.getNumero() + "',"
                + "bairro = '" + funcionario.getBairro() + "', cidade = '" + funcionario.getCidade() + "',"
                + "uf = '" + funcionario.getUf() + "', telefone = '" + funcionario.getTelefone() + "',"
                + "celular = '" + funcionario.getCelular() + "', email = '" + funcionario.getEmail() + "',"
                + "cargo = '" + funcionario.getCargo() + "', salario = '" + funcionario.getSalario() + "',"
                + "login = '" + funcionario.getLogin() + "', senha = '" + funcionario.getSenha() + "'"
                + " WHERE matricula = " + matricula;
        conexao.executarSql(sql);
    }

}
