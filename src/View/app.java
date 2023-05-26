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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cestaButton = new javax.swing.JButton();
        cestaButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel1.setText("Cadastro usuarios");

        jLabel2.setText("Dados");

        cestaButton.setText("Cadastrar Cesta");
        cestaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cestaButtonMouseClicked(evt);
            }
        });

        cestaButton1.setText("Cadastrar Doação");
        cestaButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cestaButton1MouseClicked(evt);
            }
        });

        jLabel3.setText("Doação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(destButton)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(doadorButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alterarButton)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(relatorioButton)
                                        .addGap(11, 11, 11))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cestaButton)
                                    .addComponent(cestaButton1))
                                .addContainerGap(40, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(88, 88, 88))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tituloLabel)
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton)
                .addGap(74, 74, 74)
                .addComponent(tituloLabel)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(relatorioButton)
                        .addComponent(cestaButton))
                    .addComponent(doadorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destButton)
                    .addComponent(alterarButton)
                    .addComponent(cestaButton1))
                .addContainerGap(91, Short.MAX_VALUE))
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

    private void cestaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cestaButtonMouseClicked
        this.setVisible(false);
        cadCesta cesta = new cadCesta();
        cesta.pack();
        cesta.setLocationRelativeTo(null);
        cesta.setVisible(true);
    }//GEN-LAST:event_cestaButtonMouseClicked

    private void cestaButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cestaButton1MouseClicked
        this.setVisible(false);
        cadDoacao cesta = new cadDoacao();
        cesta.pack();
        cesta.setLocationRelativeTo(null);
        cesta.setVisible(true);
    }//GEN-LAST:event_cestaButton1MouseClicked

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
    private javax.swing.JButton cestaButton;
    private javax.swing.JButton cestaButton1;
    private javax.swing.JButton destButton;
    private javax.swing.JButton doadorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton relatorioButton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
