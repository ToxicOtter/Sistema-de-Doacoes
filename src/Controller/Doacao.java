package Controller;

public class Doacao extends Usuario {
    // atributos adicionais
    private char tipoItem;
    private int quantItem;
    
    // getters e setters adicionais
    public char getTipoItem() {
        return tipoItem;
    }
    
    public void setTipoItem(char tipoItem) {
        this.tipoItem = tipoItem;
    }
    
    public int getQuantItem() {
        return quantItem;
    }
    
    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }
    
    // método específico
    public void getCNPJ0() {
        // implementação do método getCNPJ0
        // exibe os dois primeiros dígitos do CNPJ do doador associado a esta doação
    }
}
