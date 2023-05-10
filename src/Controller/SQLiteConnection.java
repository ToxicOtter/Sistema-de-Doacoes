package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnection {
    Connection connection = null;
        
    public String connect(){
        String valor = "";
        
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:APS_db.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // Espera só por 30 segundos para conectar
            
            ResultSet rs = statement.executeQuery("SELECT * FROM Abrigo");
            while(rs.next()) {
                // Ler os dados inseridos
                //System.out.println("CHAVE  : " + rs.getInt("cod_abrigo"));
                //System.out.println("NOME : " + rs.getString("nome_abrigo"));
                valor = "NOME : " + rs.getString("nome_abrigo");
            }
        } catch(SQLException e){
            //System.err.println(e.getMessage());
            valor = e.getMessage();
        }
        finally {
            try {
                if(connection != null){
                    connection.close();
                }
            } catch(SQLException e) {
                // Falhou também para fechar o arquivo
                System.err.println(e.getMessage());
                valor = e.getMessage();
            }
        }
        return valor;
    }
}
