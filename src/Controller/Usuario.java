package Controller;

public abstract class Usuario {
    // atributos
    private String nome;
    private long telefone;
    private String email;
    private int cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String uf;
    
    // getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public long getTelefone() {
        return telefone;
    }
    
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getCep() {
        return cep;
    }
    
    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getUf(){
        return uf;
    }
    
    public void setUf(String uf){
        this.uf = uf;
    }
}
