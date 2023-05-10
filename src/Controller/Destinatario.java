package Controller;

public class Destinatario extends Usuario {
    int qtdPessoas;
    int CNPJ;
    
    public int getQtdPessoas(){
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }
    
    public int getCNPJ(){
        return CNPJ;
    }
    public void setCNPJ(int CNPJ){
        this.CNPJ = CNPJ;
    }
}
