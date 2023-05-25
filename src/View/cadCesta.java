package View;

import Controller.SQLiteConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class cadCesta extends javax.swing.JFrame {
    public cadCesta() {
        initComponents();
        jLabel1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        criarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        criarButton.setText("Formar cesta");
        criarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criarButtonMouseClicked(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarButtonMouseClicked(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Cesta nº X criada com sucesso, com os alimetos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(criarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel1)))
                        .addGap(0, 164, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton)
                    .addComponent(sairButton))
                .addGap(200, 200, 200)
                .addComponent(criarButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        app telaP = new app();
        telaP.pack();
        telaP.setLocationRelativeTo(null);
        telaP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void sairButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_sairButtonMouseClicked

    private void criarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarButtonMouseClicked
        String sqlCesta = "INSERT INTO Cesta (qtd_arroz_cesta, qtd_feijao_cesta, qtd_cafe_cesta, qtd_sal_cesta, qtd_macarrao_cesta, qtd_oleo_cesta, qtd_acucar_cesta, qtd_biscoito_cesta, status) VALUES (?,?,?,?,?,?,?,?,?)";
        String sqlEstoque = "INSERT INTO Estoque (mov_estoque, qtd_arroz_estoque, qtd_feijao_estoque, qtd_cafe_estoque, qtd_sal_estoque, qtd_macarrao_estoque,qtd_oleo_estoque, qtd_acucar_estoque,qtd_biscoito_estoque, data_mov_estoque) VALUES(?,?,?,?,?,?,?,?,?,?)";
        Date d = new Date();
        
        SQLiteConnection conexao = new SQLiteConnection();
        int[] qtd = conexao.qtdEstoque();
        
        if(qtd[0]>=5 && qtd[1]>=2 && qtd[2]>=1 && qtd[3]>=1 && qtd[5]>=1 && qtd[6]>=1){
            try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlCesta)) {
                pstmt.setInt(1, 5);
                pstmt.setInt(2, 2);
                pstmt.setInt(3, 1);
                pstmt.setInt(4, 1);
                if(qtd[4]>=1){
                    pstmt.setInt(5, 1);   
                } else {
                    pstmt.setInt(5,0);
                }
                pstmt.setInt(6, 1);
                pstmt.setInt(7, 1);
                if(qtd[7]>=1){
                    pstmt.setInt(8, 1);   
                } else {
                    pstmt.setInt(8,0);
                }
                pstmt.setString(9, "Não atribuída");
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            
            try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlEstoque)) {
                pstmt.setString(1, "Saída");
                pstmt.setInt(2, 5);
                pstmt.setInt(3, 1);
                pstmt.setInt(4, 1);
                pstmt.setInt(5, 1);
                if(qtd[4]>=1){
                    pstmt.setInt(6, 1);   
                } else {
                    pstmt.setInt(6, 0);
                }
                pstmt.setInt(7, 1);
                pstmt.setInt(8, 1);
                if(qtd[7]>=1){
                    pstmt.setInt(9, 1);   
                } else {
                    pstmt.setInt(9, 0);
                }
                pstmt.setString(10, d.toString());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            jLabel1.setText("Cesta nº X criada com sucesso!");
            jLabel1.setVisible(true);
        } else{
            jLabel1.setText("Não foi possível criar a cesta, verifique a volumetria e tente novamente!");
            jLabel1.setVisible(true);
        }
    }//GEN-LAST:event_criarButtonMouseClicked

    private Connection connect() {
        String url = "jdbc:sqlite:APS_db.db";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadCesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
