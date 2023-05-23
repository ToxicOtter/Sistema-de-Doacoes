package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

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
            pstmt.setLong(3, dest.getTelefone());
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
                pstmt.setLong(2, doador.getTelefone());               
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
                pstmt.setLong(2, doador.getTelefone());               
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
    public String insertEstoque(Estoque estoque){
        String sqlEstoque = "INSERT INTO Estoque (mov_estoque, qtd_arroz_estoque, qtd_feijao_estoque, qtd_cafe_estoque, qtd_sal_estoque, qtd_macarrao_estoque,qtd_oleo_estoque, qtd_acucar_estoque,qtd_biscoito_estoque, data_mov_estoque) VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlEstoque)) {
            pstmt.setString(1, estoque.getMovimento());
            pstmt.setInt(2, estoque.getQtdArroz());
            pstmt.setInt(3, estoque.getQtdFeijao());
            pstmt.setInt(4, estoque.getQtdCafe());
            pstmt.setInt(5, estoque.getQtdSal());
            pstmt.setInt(6, estoque.getQtdMacarrao());
            pstmt.setInt(7, estoque.getQtdOleo());
            pstmt.setInt(8, estoque.getQtdAcucar());
            pstmt.setInt(9, estoque.getQtdBiscoito());
            pstmt.setString(10, estoque.getData());
            pstmt.executeUpdate();
            
            return "Done";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return (e.getMessage());
        }
    }
    public int[] qtdEstoque(){
        int[] qtd = new int[8];
        String sqlQtdEntrada = "SELECT SUM(qtd_arroz_estoque) AS arroz, SUM(qtd_feijao_estoque) AS feijao, SUM(qtd_cafe_estoque) AS cafe, SUM(qtd_sal_estoque) AS sal, SUM(qtd_macarrao_estoque) AS macarrao, SUM(qtd_oleo_estoque) AS oleo, SUM(qtd_acucar_estoque) AS acucar, SUM(qtd_biscoito_estoque) AS biscoito FROM Estoque WHERE mov_estoque = 'Entrada'";
        String sqlQtdSaida = "SELECT SUM(qtd_arroz_estoque) AS arroz, SUM(qtd_feijao_estoque) AS feijao, SUM(qtd_cafe_estoque) AS cafe, SUM(qtd_sal_estoque) AS sal, SUM(qtd_macarrao_estoque) AS macarrao, SUM(qtd_oleo_estoque) AS oleo, SUM(qtd_acucar_estoque) AS acucar, SUM(qtd_biscoito_estoque) AS biscoito FROM Estoque WHERE mov_estoque = 'Saida'";
        
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsEntrada = stmt.executeQuery(sqlQtdEntrada)){
            while(rsEntrada.next()){
                qtd[0] = rsEntrada.getInt("arroz");
                qtd[1] = rsEntrada.getInt("feijao");
                qtd[2] = rsEntrada.getInt("cafe");
                qtd[3] = rsEntrada.getInt("sal");
                qtd[4] = rsEntrada.getInt("macarrao");
                qtd[5] = rsEntrada.getInt("oleo");
                qtd[6] = rsEntrada.getInt("acucar");
                qtd[7] = rsEntrada.getInt("biscoito");
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlQtdSaida)){
            while(rsSaida.next()){
                qtd[0] = qtd[0] - rsSaida.getInt("arroz");
                qtd[1] = qtd[1] - rsSaida.getInt("feijao");
                qtd[2] = qtd[2] - rsSaida.getInt("cafe");
                qtd[3] = qtd[3] - rsSaida.getInt("sal");
                qtd[4] = qtd[4] - rsSaida.getInt("macarrao");
                qtd[5] = qtd[5] - rsSaida.getInt("oleo");
                qtd[6] = qtd[6] - rsSaida.getInt("acucar");
                qtd[7] = qtd[7] - rsSaida.getInt("biscoito");
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return qtd;
    }
}
