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
    
    public String insert(Destinatario dest){
        String sql = "INSERT INTO Abrigo (nome_abrigo, cnpj_abrigo, telefone_abrigo, email_abrigo,quant_pessoas_abrigo,cep_abrigo,log_abrigo,num_abrigo,bairro_abrigo,uf_abrigo) VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
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
}
