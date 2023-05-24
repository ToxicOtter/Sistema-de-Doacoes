package View;
import Controller.SQLiteConnection;
import java.awt.BorderLayout;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

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
        showPieChart(qtdEstoque);
    }

    private DefaultPieDataset pieDataSet;
    private JFreeChart pieChart;
    private PiePlot piePlot;
    private ChartPanel chartPanel;
    
    public void showPieChart(int[] qtdEstoque){
        pieDataSet = new DefaultPieDataset();
        pieDataSet.setValue("Arroz", qtdEstoque[0]);
        pieDataSet.setValue("Feijão", qtdEstoque[1]);
        pieDataSet.setValue("Café", qtdEstoque[2]);
        pieDataSet.setValue("Sal", qtdEstoque[3]);
        pieDataSet.setValue("Macarrão", qtdEstoque[4]);
        pieDataSet.setValue("Óleo", qtdEstoque[5]);
        pieDataSet.setValue("Açúcar", qtdEstoque[6]);
        pieDataSet.setValue("Biscoito", qtdEstoque[7]);
        
        //create chart
        pieChart = ChartFactory.createPieChart("Volumetria em estoque", pieDataSet);
        piePlot = (PiePlot) pieChart.getPlot();
        chartPanel = new ChartPanel(pieChart);
        pieChartPanel.removeAll();
        pieChartPanel.add(chartPanel,BorderLayout.CENTER);
        chartPanel.validate();
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
        voltarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pieChartPanel = new javax.swing.JPanel();

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Feijao");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Arroz");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Café");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sal");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Macarrão");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Óleo");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Açúcar");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Biscoito");

        pieChartPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(voltarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(180, 180, 180)
                .addComponent(sairButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(qtdArroz)
                        .addGap(65, 65, 65)
                        .addComponent(qtdFeijao)
                        .addGap(65, 65, 65)
                        .addComponent(qtdCafe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qtdSal)
                        .addGap(70, 70, 70)
                        .addComponent(qtdMacarrao)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(qtdOleo)
                        .addGap(67, 67, 67)
                        .addComponent(qtdAcucar)
                        .addGap(77, 77, 77)
                        .addComponent(qtdBiscoito)
                        .addGap(71, 71, 71))))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(pieChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(voltarButton)
                            .addComponent(sairButton))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdArroz)
                    .addComponent(qtdFeijao)
                    .addComponent(qtdCafe)
                    .addComponent(qtdSal)
                    .addComponent(qtdMacarrao)
                    .addComponent(qtdOleo)
                    .addComponent(qtdAcucar)
                    .addComponent(qtdBiscoito))
                .addGap(33, 33, 33)
                .addComponent(pieChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        this.setVisible(false);
        new app().setVisible(true);
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void sairButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_sairButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pieChartPanel;
    private javax.swing.JLabel qtdAcucar;
    private javax.swing.JLabel qtdArroz;
    private javax.swing.JLabel qtdBiscoito;
    private javax.swing.JLabel qtdCafe;
    private javax.swing.JLabel qtdFeijao;
    private javax.swing.JLabel qtdMacarrao;
    private javax.swing.JLabel qtdOleo;
    private javax.swing.JLabel qtdSal;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
