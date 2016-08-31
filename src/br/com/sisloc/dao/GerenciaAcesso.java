package br.com.sisloc.dao;

import br.com.sisloc.control.Conexao;
import java.sql.ResultSet;

/**
 *
 * @author Tiago
 */
public class GerenciaAcesso {
    
    private Conexao conexao = new Conexao();
    private ResultSet res;
    private String sql;
    
    
    public ResultSet verificaLogin(String login,String senha){
        sql = "SELECT * FROM funcionario WHERE login = '"+login+"' AND senha = '"+senha+"'";
        res = conexao.executarConsulta(sql);
        return res;
    }
    
}
