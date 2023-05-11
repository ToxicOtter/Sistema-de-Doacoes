package Controller;



public abstract class Usuario {
    // atributos
    private String nome;
    private int telefone;
    private String senha;
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
    
    public int getTelefone() {
        return telefone;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
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
    
    // métodos
    public void get() {
        // implementação do método get
        // exibe os atributos do usuário
    }
    
    public void set() {
        // implementação do método set
        // atualiza os atributos do usuário com base nos valores informados
    }
    
    public void logar() {
        // implementação do método logar
        // verifica se o email e a senha informados são válidos
    }
    
    public char validar(String email, String senha) {
        // implementação do método validar
        // verifica se o email e a senha informados correspondem a um usuário cadastrado
        // retorna 'S' se forem válidos ou 'N' caso contrário
        return 'N';
    }
}
