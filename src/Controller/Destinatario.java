package Controller;

public class Destinatario extends Usuario {
    int qtdPessoas;
    long CNPJ;
    
    public int getQtdPessoas(){
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }
    
    public long getCNPJ(){
        return CNPJ;
    }
    public void setCNPJ(long CNPJ){
        this.CNPJ = CNPJ;
    }
}
