package View;
import Controller.SQLiteConnection;

public class relatorio extends javax.swing.JFrame {
    public relatorio() {
        initComponents();
        SQLiteConnection conexao = new SQLiteConnection();
        int[] qtdEstoque = conexao.qtdEstoque();
        qtdArroz.setText(Integer.toString(qtdEstoque[0]));
        qtdFeijao.setText(Integer.toString(qtdEstoque[1]));
        qtdCafe.setText(Integer.toString(qtdEstoque[2]));
        qtdSal.setText(Integer.toString(qtdEstoque[3]));
        qtdMacarrao.setText(Integer.toString(qtdEstoque[4]));
        qtdOleo.setText(Integer.toString(qtdEstoque[5]));
        qtdAcucar.setText(Integer.toString(qtdEstoque[6]));
        qtdBiscoito.setText(Integer.toString(qtdEstoque[7]));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        qtdArroz = new javax.swing.JLabel();
        qtdFeijao = new javax.swing.JLabel();
        qtdCafe = new javax.swing.JLabel();
        qtdSal = new javax.swing.JLabel();
        qtdMacarrao = new javax.swing.JLabel();
        qtdOleo = new javax.swing.JLabel();
        qtdAcucar = new javax.swing.JLabel();
        qtdBiscoito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("Relatório");

        qtdArroz.setText("0");

        qtdFeijao.setText("0");

        qtdCafe.setText("0");

        qtdSal.setText("0");

        qtdMacarrao.setText("0");

        qtdOleo.setText("0");

        qtdAcucar.setText("0");

        qtdBiscoito.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(qtdArroz)
                        .addGap(18, 18, 18)
                        .addComponent(qtdFeijao)
                        .addGap(18, 18, 18)
                        .addComponent(qtdCafe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdSal)
                        .addGap(18, 18, 18)
                        .addComponent(qtdMacarrao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdOleo)
                        .addGap(18, 18, 18)
                        .addComponent(qtdAcucar)
                        .addGap(18, 18, 18)
                        .addComponent(qtdBiscoito)
                        .addGap(199, 199, 199))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdArroz)
                    .addComponent(qtdFeijao)
                    .addComponent(qtdCafe)
                    .addComponent(qtdSal)
                    .addComponent(qtdMacarrao)
                    .addComponent(qtdOleo)
                    .addComponent(qtdAcucar)
                    .addComponent(qtdBiscoito))
                .addContainerGap(376, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel qtdAcucar;
    private javax.swing.JLabel qtdArroz;
    private javax.swing.JLabel qtdBiscoito;
    private javax.swing.JLabel qtdCafe;
    private javax.swing.JLabel qtdFeijao;
    private javax.swing.JLabel qtdMacarrao;
    private javax.swing.JLabel qtdOleo;
    private javax.swing.JLabel qtdSal;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
