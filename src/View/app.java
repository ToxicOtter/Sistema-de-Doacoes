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
        alterarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(690, 450));
        setResizable(false);

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tituloLabel.setText("Gerenciador de Doações");

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

        alterarButton.setText("Alterar Dados");
        alterarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doadorButton)
                        .addGap(18, 18, 18)
                        .addComponent(destButton)
                        .addGap(18, 18, 18)
                        .addComponent(relatorioButton)
                        .addGap(18, 18, 18)
                        .addComponent(alterarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(tituloLabel)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton)
                .addGap(72, 72, 72)
                .addComponent(tituloLabel)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doadorButton)
                    .addComponent(destButton)
                    .addComponent(relatorioButton)
                    .addComponent(alterarButton))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doadorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doadorButtonMouseClicked
        this.setVisible(false);
        doacao doaTela = new doacao();
        doaTela.pack();
        doaTela.setLocationRelativeTo(null);
        doaTela.setVisible(true);
    }//GEN-LAST:event_doadorButtonMouseClicked

    private void destButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destButtonMouseClicked
        this.setVisible(false);
        receptor recTela = new receptor();
        recTela.pack();
        recTela.setLocationRelativeTo(null);
        recTela.setVisible(true);
    }//GEN-LAST:event_destButtonMouseClicked

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void relatorioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioButtonMouseClicked
        this.setVisible(false);
        relatorio relTela = new relatorio();
        relTela.pack();
        relTela.setLocationRelativeTo(null);
        relTela.setVisible(true);
    }//GEN-LAST:event_relatorioButtonMouseClicked

    private void alterarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarButtonMouseClicked
        this.setVisible(false);
        alterar altTela = new alterar();
        altTela.pack();
        altTela.setLocationRelativeTo(null);
        altTela.setVisible(true);
    }//GEN-LAST:event_alterarButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                app tela = new app();
                tela.pack();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JButton destButton;
    private javax.swing.JButton doadorButton;
    private javax.swing.JButton relatorioButton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
