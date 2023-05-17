package View;
import Controller.Doador;
import Controller.Estoque;
import Controller.SQLiteConnection;

import java.util.Date;

public class doacao extends javax.swing.JFrame {
    public doacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salLabel = new javax.swing.JLabel();
        salText = new javax.swing.JTextField();
        arrozLabel = new javax.swing.JLabel();
        arrozText = new javax.swing.JTextField();
        feijaoLabel = new javax.swing.JLabel();
        feijaoText = new javax.swing.JTextField();
        macarraoLabel = new javax.swing.JLabel();
        macarraoText = new javax.swing.JTextField();
        cafeText = new javax.swing.JTextField();
        cafeLabel = new javax.swing.JLabel();
        oleoLabel = new javax.swing.JLabel();
        oleoText = new javax.swing.JTextField();
        acucarLabel = new javax.swing.JLabel();
        acucarText = new javax.swing.JTextField();
        biscoitoLabel = new javax.swing.JLabel();
        biscoitoText = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        sobrenomeText = new javax.swing.JTextField();
        sobrenomeLabel = new javax.swing.JLabel();
        cepText = new javax.swing.JTextField();
        cepLabel = new javax.swing.JLabel();
        logradouroLabel = new javax.swing.JLabel();
        logradouroText = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroText = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroText = new javax.swing.JTextField();
        ufLabel = new javax.swing.JLabel();
        ufText = new javax.swing.JTextField();
        telefoneLabel = new javax.swing.JLabel();
        telefoneText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        pessoaComboBox = new javax.swing.JComboBox<>();
        cpfCnpjText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salLabel.setText("Sal");

        salText.setText("jTextField1");

        arrozLabel.setText("Arroz");

        arrozText.setText("jTextField1");

        feijaoLabel.setText("Feijão");

        feijaoText.setText("jTextField1");

        macarraoLabel.setText("Macarrao");

        macarraoText.setText("jTextField1");

        cafeText.setText("jTextField1");

        cafeLabel.setText("Café");

        oleoLabel.setText("Óleo");

        oleoText.setText("jTextField1");
        oleoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oleoTextActionPerformed(evt);
            }
        });

        acucarLabel.setText("Açúcar");

        acucarText.setText("jTextField1");
        acucarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acucarTextActionPerformed(evt);
            }
        });

        biscoitoLabel.setText("Biscoito");

        biscoitoText.setText("jTextField1");
        biscoitoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biscoitoTextActionPerformed(evt);
            }
        });

        nomeLabel.setText("Nome");

        nomeText.setText("jTextField1");

        sobrenomeText.setText("jTextField1");

        sobrenomeLabel.setText("Sobrenome");

        cepText.setText("jTextField1");

        cepLabel.setText("CEP");

        logradouroLabel.setText("Logradouro");

        logradouroText.setText("jTextField1");

        numeroLabel.setText("Número");

        numeroText.setText("jTextField1");

        bairroLabel.setText("Bairro");

        bairroText.setText("jTextField1");

        ufLabel.setText("UF");

        ufText.setText("jTextField1");

        telefoneLabel.setText("Telefone");

        telefoneText.setText("jTextField1");

        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Enviar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        emailLabel.setText("Email");

        emailText.setText("jTextField1");

        pessoaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física", "Jurídica" }));

        cpfCnpjText.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(macarraoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(feijaoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arrozLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(salText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrozText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feijaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(macarraoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cafeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oleoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acucarLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(biscoitoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acucarText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cafeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oleoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biscoitoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sobrenomeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cepLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefoneLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ufLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bairroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(numeroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(logradouroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pessoaComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cpfCnpjText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroText, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logradouroText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobrenomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenomeLabel)
                    .addComponent(sobrenomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepLabel)
                    .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroLabel)
                    .addComponent(logradouroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel)
                    .addComponent(numeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroLabel)
                    .addComponent(bairroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ufLabel)
                    .addComponent(ufText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel)
                    .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pessoaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfCnpjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cafeLabel)
                            .addComponent(cafeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oleoLabel)
                            .addComponent(oleoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acucarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acucarLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(biscoitoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(biscoitoLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salLabel)
                            .addComponent(salText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arrozLabel)
                            .addComponent(arrozText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(feijaoLabel)
                            .addComponent(feijaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(macarraoLabel)
                            .addComponent(macarraoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75)
                .addComponent(jButton3)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oleoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oleoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oleoTextActionPerformed

    private void acucarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acucarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acucarTextActionPerformed

    private void biscoitoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biscoitoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biscoitoTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        new app().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Doador doador = new Doador();
        Estoque estoque = new Estoque();
        Date d = new Date();
        
        doador.setNome(nomeText.getText());
        doador.setCep(Integer.parseInt(cepText.getText()));
        doador.setLogradouro(logradouroText.getText());
        doador.setNumero(Integer.parseInt(numeroText.getText()));
        doador.setBairro(bairroText.getText());
        doador.setUf(ufText.getText());
        doador.setTelefone(Integer.parseInt(telefoneText.getText()));
        doador.setEmail(emailText.getText());
        doador.setCpfCnpj(Integer.parseInt(cpfCnpjText.getText()));
        if (pessoaComboBox.getSelectedItem() == "Física"){
            doador.setTipoDoador(true);
        } else {
            doador.setTipoDoador(false);
        }
        
        SQLiteConnection cnDoador = new SQLiteConnection();
        String res = cnDoador.insertDoador(doador);
        
        if (res == "Done"){
            System.out.println("Foi");
        } else {
            System.out.println("Erro interno, tente mais tarde!");
        }
        
        estoque.setMovimento("Entrada");
        estoque.setQtdArroz(Integer.parseInt(arrozText.getText()));
        estoque.setQtdFeijao(Integer.parseInt(feijaoText.getText()));
        estoque.setQtdCafe(Integer.parseInt(cafeText.getText()));
        estoque.setQtdSal(Integer.parseInt(salText.getText()));
        estoque.setQtdMacarrao(Integer.parseInt(macarraoText.getText()));
        estoque.setQtdOleo(Integer.parseInt(oleoText.getText()));
        estoque.setQtdAcucar(Integer.parseInt(acucarText.getText()));
        estoque.setQtdBiscoito(Integer.parseInt(biscoitoText.getText()));
        estoque.setData("Preciso vonverte a data");
        
        String resEstoque = cnDoador.insertEstoque(estoque);
        
        if (resEstoque == "Done"){
            System.out.println("Foi estoque");
        } else {
            System.out.println("Erro interno, tente mais tarde!");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(doacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acucarLabel;
    private javax.swing.JTextField acucarText;
    private javax.swing.JLabel arrozLabel;
    private javax.swing.JTextField arrozText;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField bairroText;
    private javax.swing.JLabel biscoitoLabel;
    private javax.swing.JTextField biscoitoText;
    private javax.swing.JLabel cafeLabel;
    private javax.swing.JTextField cafeText;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cepText;
    private javax.swing.JTextField cpfCnpjText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel feijaoLabel;
    private javax.swing.JTextField feijaoText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel logradouroLabel;
    private javax.swing.JTextField logradouroText;
    private javax.swing.JLabel macarraoLabel;
    private javax.swing.JTextField macarraoText;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeText;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroText;
    private javax.swing.JLabel oleoLabel;
    private javax.swing.JTextField oleoText;
    private javax.swing.JComboBox<String> pessoaComboBox;
    private javax.swing.JLabel salLabel;
    private javax.swing.JTextField salText;
    private javax.swing.JLabel sobrenomeLabel;
    private javax.swing.JTextField sobrenomeText;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneText;
    private javax.swing.JLabel ufLabel;
    private javax.swing.JTextField ufText;
    // End of variables declaration//GEN-END:variables
}
