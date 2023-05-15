package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class SQLiteConnection {
    private Connection connect(){
        String url = "jdbc:sqlite:APS_db.db";
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(url);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
    public String insertAbrigo(Destinatario dest){
        String sqlAbrigo = "INSERT INTO Abrigo (nome_abrigo, cnpj_abrigo, telefone_abrigo, email_abrigo,quant_pessoas_abrigo,cep_abrigo,log_abrigo,num_abrigo,bairro_abrigo,uf_abrigo) VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlAbrigo)) {
            pstmt.setString(1, dest.getNome());
            pstmt.setInt(2, dest.getCNPJ());
            pstmt.setInt(3, dest.getTelefone());
            pstmt.setString(4, dest.getEmail());
            pstmt.setInt(5, dest.getQtdPessoas());
            pstmt.setInt(6, dest.getCep());
            pstmt.setString(7, dest.getLogradouro());
            pstmt.setInt(8, dest.getNumero());
            pstmt.setString(9, dest.getBairro());
            pstmt.setString(10, dest.getUf());
            pstmt.executeUpdate();
            
            return "Done";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return (e.getMessage());
        }
    }
    public String insertDoador(Doador doador){
        if(doador.getTipoDoador() == true){
            String sqlDoador = "INSERT INTO Doador (nome_doador, telefone_doador, email_doador,cep_doador,log_doador,num_doador,bairro_doador,uf_doador,cpf_doador) VALUES(?,?,?,?,?,?,?,?,?)";
            try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlDoador)) {
                pstmt.setString(1, doador.getNome());
                pstmt.setInt(2, doador.getTelefone());               
                pstmt.setString(3, doador.getEmail());
                pstmt.setInt(4, doador.getCep());
                pstmt.setString(5, doador.getLogradouro());
                pstmt.setInt(6, doador.getNumero());
                pstmt.setString(7, doador.getBairro());
                pstmt.setString(8, doador.getUf());
                pstmt.setInt(9, doador.getCpfCnpj());
                pstmt.executeUpdate();
                return "Done";
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return (e.getMessage());
            }
        } else {
            String sqlDoador = "INSERT INTO Doador (nome_doador, telefone_doador, email_doador,cep_doador,log_doador,num_doador,bairro_doador,uf_doador,cnpj_doador) VALUES(?,?,?,?,?,?,?,?,?)";
            try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlDoador)) {
                pstmt.setString(1, doador.getNome());
                pstmt.setInt(2, doador.getTelefone());               
                pstmt.setString(3, doador.getEmail());
                pstmt.setInt(4, doador.getCep());
                pstmt.setString(5, doador.getLogradouro());
                pstmt.setInt(6, doador.getNumero());
                pstmt.setString(7, doador.getBairro());
                pstmt.setString(8, doador.getUf());
                pstmt.setInt(9, doador.getCpfCnpj());
                pstmt.executeUpdate();
                return "Done";
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return (e.getMessage());
            }
        }
    }
}
