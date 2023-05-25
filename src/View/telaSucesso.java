package View;
import View.app;

public class telaSucesso extends javax.swing.JFrame {
    private String texto = "Sucesso!";
    
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public telaSucesso() {
        initComponents();
    }
    
    public telaSucesso(String texto) {
        initComponents();
        setTexto(texto);
    }
    
    public void defineStatus(){
        titleLabel.setText(getTexto());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        inicioButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Sucesso");

        inicioButton.setText("Tela Inicial");
        inicioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioButtonMouseClicked(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairButtonMouseClicked(evt);
            }
        });

        voltarButton.setText("Voltar");
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
                .addGap(175, 175, 175)
                .addComponent(titleLabel)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairButton)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioButton)
                    .addComponent(sairButton)
                    .addComponent(voltarButton))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioButtonMouseClicked
        app inicio = new app();
        inicio.setVisible(true);
    }//GEN-LAST:event_inicioButtonMouseClicked

    private void sairButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_sairButtonMouseClicked

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_voltarButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSucesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicioButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables

}
