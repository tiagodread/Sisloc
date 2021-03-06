package br.com.sisloc.model;

/**
 *
 * @author Guilherme
 */
public class Cliente extends Pessoa{
    
    
    private int id;
    private String tipoCliente;
    private String cnpj;
    private String cpf;

    public Cliente(String nome,String telefone,String celular,String email, String tipoCliente,String cpf,String logradouro,String bairro,String cidade,String uf,int numero,int a) {
        super(nome,telefone,celular,email,logradouro,bairro,cidade,uf,numero);
        this.tipoCliente = tipoCliente;  
        this.cpf = cpf;
    }
    
    public Cliente(String nome,String telefone,String celular,String email,String tipoCliente,String cnpj,String logradouro,String bairro,String cidade,String uf,int numero){
        super(nome,telefone,celular,email,logradouro,bairro,cidade,uf,numero);
        this.tipoCliente = tipoCliente;  
        this.cnpj = cnpj;
    }
    

    public Cliente() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tipoCliente
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
