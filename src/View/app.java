package View;

public class app extends javax.swing.JFrame {

    public app() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        doadorButton = new javax.swing.JButton();
        destButton = new javax.swing.JButton();
        relatorioButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLabel.setText("Doações");

        doadorButton.setText("Cadastrar doador");
        doadorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doadorButtonMouseClicked(evt);
            }
        });

        destButton.setText("Cadastrar destinatário");
        destButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destButtonMouseClicked(evt);
            }
        });

        relatorioButton.setText("Relatório");
        relatorioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatorioButtonMouseClicked(evt);
            }
        });

        voltarButton.setText("Sair");
        voltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(doadorButton)
                        .addGap(68, 68, 68)
                        .addComponent(destButton)
                        .addGap(68, 68, 68)
                        .addComponent(relatorioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(tituloLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(voltarButton)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(voltarButton)
                .addGap(46, 46, 46)
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doadorButton)
                    .addComponent(destButton)
                    .addComponent(relatorioButton))
                .addGap(156, 156, 156))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doadorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doadorButtonMouseClicked
        this.setVisible(false);
        new doacao().setVisible(true);
    }//GEN-LAST:event_doadorButtonMouseClicked

    private void destButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destButtonMouseClicked
        this.setVisible(false);
        new receptor().setVisible(true);
    }//GEN-LAST:event_destButtonMouseClicked

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void relatorioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioButtonMouseClicked
        this.setVisible(false);
        new relatorio().setVisible(true);
    }//GEN-LAST:event_relatorioButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton destButton;
    private javax.swing.JButton doadorButton;
    private javax.swing.JButton relatorioButton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
