package Controller;

public class Doador extends Usuario {
    // atributos adicionais
    private boolean tipoDoador;
    private long cpfCnpj;
    
    // getters e setters adicionais
    public boolean getTipoDoador() {
        return tipoDoador;
    }
    
    public void setTipoDoador(boolean tipoDoador) {
        this.tipoDoador = tipoDoador;
    }
    
    public long getCpfCnpj() {
        return cpfCnpj;
    }
    
    public void setCpfCnpj(long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    
    // método específico
    public void fazDoacao() {
        // implementação do método fazDoacao
        // registra uma doação feita pelo doador
    }
}
