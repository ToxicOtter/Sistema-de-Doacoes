package View;

import Controller.SQLiteConnection;
import static View.alterar.buildTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class cadDoacao extends javax.swing.JFrame {
    public cadDoacao() {
        initComponents();
        selectCesta();
        selectAbrigo();
        jLabel1.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCesta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAbrigo = new javax.swing.JTable();
        cestaText = new javax.swing.JTextField();
        abrigoText = new javax.swing.JTextField();
        criarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableCesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCestaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCesta);

        tableAbrigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableAbrigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAbrigoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableAbrigo);

        cestaText.setEditable(false);

        abrigoText.setEditable(false);

        criarButton.setText("Criar Doação");
        criarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criarButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Doação criada com sucesso!");

        jLabel2.setText("Código da cesta");

        jLabel3.setText("Código do Abrigo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Atribuir Doação");

        jLabel5.setText("Selecione a cesta desejada:");

        jLabel6.setText("Selecione o destinatário desejado:");

        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(criarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cestaText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(abrigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(272, 272, 272)
                        .addComponent(jButton2)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel6)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addGap(56, 56, 56)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cestaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(criarButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableCestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCestaMouseClicked
        int rowCesta = tableCesta.getSelectedRow();
        String selectionCesta = tableCesta.getModel().getValueAt(rowCesta,0).toString();
        
        if(rowCesta != -1){
            cestaText.setText(selectionCesta);
        }
    }//GEN-LAST:event_tableCestaMouseClicked

    private void tableAbrigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAbrigoMouseClicked
        int rowAbrigo = tableAbrigo.getSelectedRow();
        String selectionAbrigo = tableAbrigo.getModel().getValueAt(rowAbrigo,0).toString();
        
        if(rowAbrigo != -1){
            abrigoText.setText(selectionAbrigo);
        }
    }//GEN-LAST:event_tableAbrigoMouseClicked

    private void criarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarButtonMouseClicked
        if(cestaText.getText().isEmpty() || abrigoText.getText().isEmpty()){
            jLabel1.setText("Selecione a cesta e o destinatário!");
            jLabel1.setVisible(true);
        } else {
            String sqlDoacao = "INSERT INTO Doacao (cod_cesta,cod_abrigo,data_doacao) VALUES (?,?,?)";
            Date d = new Date();

            try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlDoacao)) {
                pstmt.setInt(1, Integer.parseInt(cestaText.getText()));
                pstmt.setInt(2, Integer.parseInt(abrigoText.getText()));
                pstmt.setString(3, d.toString());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            jLabel1.setText("Doação realizada com sucesso!");
            jLabel1.setVisible(true);
            selectCesta();
            selectAbrigo();
        }
    }//GEN-LAST:event_criarButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        app telaP = new app();
        telaP.pack();
        telaP.setLocationRelativeTo(null);
        telaP.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadDoacao().setVisible(true);
            }
        });
    }

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
    
    public void selectCesta(){
        String sqlSelect = "SELECT * FROM Cesta WHERE status='Não atribuída'";
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlSelect)){
            tableCesta.setModel(buildTableModel(rsSaida));
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void selectAbrigo() {
        String sqlSelect = "SELECT * FROM Abrigo";
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlSelect)) {
            tableAbrigo.setModel(buildTableModel(rsSaida));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abrigoText;
    private javax.swing.JTextField cestaText;
    private javax.swing.JButton criarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAbrigo;
    private javax.swing.JTable tableCesta;
    // End of variables declaration//GEN-END:variables
}
