package Model;
import View.app;

import Controller.SQLiteConnection;

public class Doacoes {
    public static void main(String[] args) {
        app tela = new app();
        tela.setVisible(true);
        
        SQLiteConnection conexao = new SQLiteConnection();
        System.out.println(conexao.connect());
    }
}