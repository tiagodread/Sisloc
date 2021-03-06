package br.com.sisloc.model;

/**
 *
 * @author Guilherme
 */
public class Funcionario extends Pessoa{

    private int matricula;
    private String cpf;
    private String cargo;
    private float salario;
    private String login;
    private String senha;
    

    public Funcionario() {
    }

    public Funcionario(String cargo,String logradouro,String bairro,String cidade,String uf,int numero, float salario, String login, String senha, String cpf, String nome, String telefone, String celular, String email) {
        super(nome,telefone,celular,email,logradouro,bairro,cidade,uf,numero);
        this.cargo = cargo;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
    }
    
    public Funcionario(int matricula, String cargo,String logradouro,String bairro,String cidade,String uf,int numero, float salario, String login, String senha, String cpf, String nome, String telefone, String celular, String email) {
        super(nome,telefone,celular,email,logradouro,bairro,cidade,uf,numero);
        this.cargo = cargo;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
