package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import View.telaSucesso;

public class alterar extends javax.swing.JFrame {
    private String tabela = "Doador";
    
    public alterar() {
        initComponents();
        destinatarioPanel.setVisible(false);
        doadorPanel.setVisible(true);
        estoquePanel.setVisible(false);
        cestaPanel.setVisible(false);
        doacaoPanel.setVisible(false);
        select();
    }
    
    public void setTabela(String tabela){
        this.tabela = tabela;
    }
    
    public String getTabela(){
        return tabela;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTabela = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        doadorPanel = new javax.swing.JPanel();
        nome_doador = new javax.swing.JTextField();
        email_doador = new javax.swing.JTextField();
        log_doador = new javax.swing.JTextField();
        num_doador = new javax.swing.JTextField();
        bairro_doador = new javax.swing.JTextField();
        cep_doador = new javax.swing.JFormattedTextField();
        telefone_doador = new javax.swing.JFormattedTextField();
        cpf_doador = new javax.swing.JFormattedTextField();
        cnpj_doador = new javax.swing.JFormattedTextField();
        uf_doador = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        destinatarioPanel = new javax.swing.JPanel();
        nome_abrigo = new javax.swing.JTextField();
        email_abrigo = new javax.swing.JTextField();
        quant_pessoas_abrigo = new javax.swing.JTextField();
        log_abrigo = new javax.swing.JTextField();
        num_abrigo = new javax.swing.JTextField();
        bairro_abrigo = new javax.swing.JTextField();
        cnpj_abrigo = new javax.swing.JFormattedTextField();
        telefone_abrigo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cep_abrigo = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        uf_abrigo = new javax.swing.JComboBox<>();
        cestaPanel = new javax.swing.JPanel();
        qtd_arroz_cesta = new javax.swing.JTextField();
        qtd_feijao_cesta = new javax.swing.JTextField();
        qtd_cafe_cesta = new javax.swing.JTextField();
        qtd_sal_cesta = new javax.swing.JTextField();
        qtd_macarrao_cesta = new javax.swing.JTextField();
        qtd_oleo_cesta = new javax.swing.JTextField();
        qtd_acucar_cesta = new javax.swing.JTextField();
        qtd_biscoito_cesta = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        estoquePanel = new javax.swing.JPanel();
        mov_estoque = new javax.swing.JTextField();
        qtd_arroz_estoque = new javax.swing.JTextField();
        qtd_feijao_estoque = new javax.swing.JTextField();
        qtd_cafe_estoque = new javax.swing.JTextField();
        qtd_sal_estoque = new javax.swing.JTextField();
        qtd_macarrao_estoque = new javax.swing.JTextField();
        qtd_oleo_estoque = new javax.swing.JTextField();
        qtd_acucar_estoque = new javax.swing.JTextField();
        qtd_biscoito_estoque = new javax.swing.JTextField();
        data_mov_estoque = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        doacaoPanel = new javax.swing.JPanel();
        cod_cesta = new javax.swing.JTextField();
        cod_abrigo = new javax.swing.JTextField();
        data_doacao = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Alterar dados");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Selecionar tabela");

        nomeTabela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doador", "Destinatário", "Estoque", "Cestas", "Doação" }));
        nomeTabela.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nomeTabelaItemStateChanged(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "cod_doador", "nome_doador", "telefone_doador", "email_doador", "cep_doador", "log_doador", "num_doador", "bairro_doador", "uf_doador", "cpf_doador", "cnpj_doador"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        deleteButton.setText("Excluir");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        updateButton.setText("Atualizar");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        doadorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        num_doador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_doadorKeyTyped(evt);
            }
        });

        try {
            cep_doador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefone_doador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpf_doador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cnpj_doador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpj_doador.setEnabled(false);

        uf_doador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        jLabel4.setText("Telefone");

        jLabel5.setText("Email");

        jLabel6.setText("Cep");

        jLabel7.setText("Logradouro");

        jLabel8.setText("Número");

        jLabel9.setText("Bairro");

        jLabel10.setText("UF");

        jLabel11.setText("CPF");

        jLabel12.setText("CNPJ");

        jLabel13.setText("Nome");

        javax.swing.GroupLayout doadorPanelLayout = new javax.swing.GroupLayout(doadorPanel);
        doadorPanel.setLayout(doadorPanelLayout);
        doadorPanelLayout.setHorizontalGroup(
            doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doadorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doadorPanelLayout.createSequentialGroup()
                        .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uf_doador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairro_doador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_doador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cep_doador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone_doador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_doador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_doador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(log_doador, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(doadorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cpf_doador, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doadorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cnpj_doador, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        doadorPanelLayout.setVerticalGroup(
            doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doadorPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(nome_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(telefone_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(email_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(cep_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(log_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(num_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(bairro_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(uf_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(cpf_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(cnpj_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        destinatarioPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        quant_pessoas_abrigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quant_pessoas_abrigoKeyTyped(evt);
            }
        });

        num_abrigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_abrigoKeyTyped(evt);
            }
        });

        try {
            cnpj_abrigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefone_abrigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Nome");

        jLabel14.setText("Telefone");

        jLabel15.setText("CNPJ");

        jLabel16.setText("Email");

        jLabel17.setText("Qtd Pessoas");

        try {
            cep_abrigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel18.setText("Cep");

        jLabel19.setText("Logradouro");

        jLabel20.setText("Número");

        jLabel22.setText("UF");

        jLabel21.setText("Bairro");

        uf_abrigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        javax.swing.GroupLayout destinatarioPanelLayout = new javax.swing.GroupLayout(destinatarioPanel);
        destinatarioPanel.setLayout(destinatarioPanelLayout);
        destinatarioPanelLayout.setHorizontalGroup(
            destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinatarioPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cep_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uf_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quant_pessoas_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        destinatarioPanelLayout.setVerticalGroup(
            destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinatarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(nome_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(cnpj_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(telefone_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(email_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17)
                    .addComponent(quant_pessoas_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(cep_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel19)
                    .addComponent(log_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(num_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bairro_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(uf_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cestaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        qtd_arroz_cesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_arroz_cestaKeyTyped(evt);
            }
        });

        qtd_feijao_cesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_feijao_cestaKeyTyped(evt);
            }
        });

        qtd_cafe_cesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_cafe_cestaKeyTyped(evt);
            }
        });

        qtd_sal_cesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_sal_cestaKeyTyped(evt);
            }
        });

        qtd_macarrao_cesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_macarrao_cestaKeyTyped(evt);
            }
        });

        qtd_oleo_cesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_oleo_cestaKeyTyped(evt);
            }
        });

        qtd_acucar_cesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_acucar_cestaKeyTyped(evt);
            }
        });

        qtd_biscoito_cesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_biscoito_cestaKeyTyped(evt);
            }
        });

        jLabel33.setText("Arroz");

        jLabel34.setText("Feijão");

        jLabel35.setText("Café");

        jLabel36.setText("Sal");

        jLabel37.setText("Macarrão");

        jLabel38.setText("Óleo");

        jLabel39.setText("Açúcar");

        jLabel40.setText("Biscoito");

        javax.swing.GroupLayout cestaPanelLayout = new javax.swing.GroupLayout(cestaPanel);
        cestaPanel.setLayout(cestaPanelLayout);
        cestaPanelLayout.setHorizontalGroup(
            cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cestaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtd_biscoito_cesta)
                    .addComponent(qtd_acucar_cesta)
                    .addComponent(qtd_oleo_cesta)
                    .addComponent(qtd_macarrao_cesta)
                    .addComponent(qtd_sal_cesta)
                    .addComponent(qtd_arroz_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_feijao_cesta)
                    .addComponent(qtd_cafe_cesta))
                .addContainerGap())
        );
        cestaPanelLayout.setVerticalGroup(
            cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cestaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel33)
                    .addComponent(qtd_arroz_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel34)
                    .addComponent(qtd_feijao_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel35)
                    .addComponent(qtd_cafe_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel36)
                    .addComponent(qtd_sal_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(qtd_macarrao_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qtd_oleo_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel39)
                    .addComponent(qtd_acucar_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel40)
                    .addComponent(qtd_biscoito_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        estoquePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        qtd_arroz_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_arroz_estoqueKeyTyped(evt);
            }
        });

        qtd_feijao_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_feijao_estoqueKeyTyped(evt);
            }
        });

        qtd_cafe_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_cafe_estoqueKeyTyped(evt);
            }
        });

        qtd_sal_estoque.setToolTipText("");
        qtd_sal_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_sal_estoqueKeyTyped(evt);
            }
        });

        qtd_macarrao_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_macarrao_estoqueKeyTyped(evt);
            }
        });

        qtd_oleo_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_oleo_estoqueKeyTyped(evt);
            }
        });

        qtd_acucar_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_acucar_estoqueKeyTyped(evt);
            }
        });

        qtd_biscoito_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_biscoito_estoqueKeyTyped(evt);
            }
        });

        data_mov_estoque.setEditable(false);

        jLabel23.setText("Status");

        jLabel24.setText("Arroz");

        jLabel25.setText("Feijão");

        jLabel26.setText("Café");

        jLabel27.setText("Sal");

        jLabel28.setText("Macarrão");

        jLabel29.setText("Óleo");

        jLabel30.setText("Açúcar");

        jLabel31.setText("Biscoito");

        jLabel32.setText("Data");

        javax.swing.GroupLayout estoquePanelLayout = new javax.swing.GroupLayout(estoquePanel);
        estoquePanel.setLayout(estoquePanelLayout);
        estoquePanelLayout.setHorizontalGroup(
            estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estoquePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_mov_estoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(qtd_acucar_estoque, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qtd_oleo_estoque, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qtd_macarrao_estoque, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qtd_sal_estoque, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qtd_cafe_estoque, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qtd_feijao_estoque, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qtd_arroz_estoque, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(mov_estoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addComponent(qtd_biscoito_estoque, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        estoquePanelLayout.setVerticalGroup(
            estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estoquePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel23)
                    .addComponent(mov_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel24)
                    .addComponent(qtd_arroz_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel25)
                    .addComponent(qtd_feijao_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel26)
                    .addComponent(qtd_cafe_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel27)
                    .addComponent(qtd_sal_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(qtd_macarrao_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel29)
                    .addComponent(qtd_oleo_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel30)
                    .addComponent(qtd_acucar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel31)
                    .addComponent(qtd_biscoito_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel32)
                    .addComponent(data_mov_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        doacaoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cod_cesta.setEditable(false);

        cod_abrigo.setEditable(false);

        jLabel42.setText("Nº Cesta");

        jLabel43.setText("Abrigo");

        jLabel44.setText("Data");

        javax.swing.GroupLayout doacaoPanelLayout = new javax.swing.GroupLayout(doacaoPanel);
        doacaoPanel.setLayout(doacaoPanelLayout);
        doacaoPanelLayout.setHorizontalGroup(
            doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doacaoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cod_cesta, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(cod_abrigo)
                    .addComponent(data_doacao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        doacaoPanelLayout.setVerticalGroup(
            doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doacaoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel42)
                    .addComponent(cod_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel43)
                    .addComponent(cod_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel44)
                    .addComponent(data_doacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Sair");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Voltar");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(doadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(destinatarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estoquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cestaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doacaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(470, 470, 470)
                                .addComponent(deleteButton)
                                .addGap(18, 18, 18)
                                .addComponent(updateButton)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nomeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destinatarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estoquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cestaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doacaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton)
                            .addComponent(updateButton))
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        String selection = table.getModel().getValueAt(row,0).toString();
        String sqlUpdate = "";
        switch(getTabela()){
            case "Abrigo":
                sqlUpdate = "SELECT * FROM Abrigo WHERE cod_abrigo = " + selection;
                try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlUpdate)) {
                    while (rsSaida.next()) {
                        nome_abrigo.setText(rsSaida.getString("nome_abrigo"));
                        cnpj_abrigo.setText(Long.toString(rsSaida.getLong("cnpj_abrigo")));
                        telefone_abrigo.setText(Long.toString(rsSaida.getLong("telefone_abrigo")));
                        email_abrigo.setText(rsSaida.getString("email_abrigo"));
                        quant_pessoas_abrigo.setText(Integer.toString(rsSaida.getInt("quant_pessoas_abrigo")));
                        cep_abrigo.setText(Integer.toString(rsSaida.getInt("cep_abrigo")));
                        log_abrigo.setText(rsSaida.getString("log_abrigo"));
                        num_abrigo.setText(Integer.toString(rsSaida.getInt("num_abrigo")));
                        bairro_abrigo.setText(rsSaida.getString("bairro_abrigo"));
                        uf_abrigo.setSelectedItem(rsSaida.getString("uf_abrigo")); 
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Doador":
                sqlUpdate = "SELECT * FROM Doador WHERE cod_doador = " + selection;
                try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlUpdate)) {
                    while (rsSaida.next()) {
                        nome_doador.setText(rsSaida.getString("nome_doador"));
                        telefone_doador.setText(Long.toString(rsSaida.getLong("telefone_doador")));
                        email_doador.setText(rsSaida.getString("email_doador"));
                        cep_doador.setText(Integer.toString(rsSaida.getInt("cep_doador")));
                        log_doador.setText(rsSaida.getString("log_doador"));
                        num_doador.setText(Integer.toString(rsSaida.getInt("num_doador")));
                        bairro_doador.setText(rsSaida.getString("bairro_doador"));
                        uf_doador.setSelectedItem(rsSaida.getString("uf_doador"));
                        cpf_doador.setText(Long.toString(rsSaida.getLong("cpf_doador")));
                        cnpj_doador.setText(Long.toString(rsSaida.getLong("cnpj_doador")));
                        if(rsSaida.getLong("cpf_doador") == 0){
                            cpf_doador.setEnabled(false);
                            cnpj_doador.setEnabled(true);
                        } else if (rsSaida.getLong("cnpj_doador") == 0){
                            cpf_doador.setEnabled(true);
                            cnpj_doador.setEnabled(false);
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Estoque":
                sqlUpdate = "SELECT * FROM Estoque WHERE cod_mov_estoque = " + selection;
                try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlUpdate)) {
                    while (rsSaida.next()) {
                        mov_estoque.setText(rsSaida.getString("mov_estoque"));
                        qtd_arroz_estoque.setText(Integer.toString(rsSaida.getInt("qtd_arroz_estoque")));
                        qtd_feijao_estoque.setText(Integer.toString(rsSaida.getInt("qtd_feijao_estoque")));
                        qtd_cafe_estoque.setText(Integer.toString(rsSaida.getInt("qtd_cafe_estoque")));
                        qtd_sal_estoque.setText(Integer.toString(rsSaida.getInt("qtd_sal_estoque")));
                        qtd_macarrao_estoque.setText(Integer.toString(rsSaida.getInt("qtd_macarrao_estoque")));
                        qtd_oleo_estoque.setText(Integer.toString(rsSaida.getInt("qtd_oleo_estoque")));
                        qtd_acucar_estoque.setText(Integer.toString(rsSaida.getInt("qtd_acucar_estoque")));
                        qtd_biscoito_estoque.setText(Integer.toString(rsSaida.getInt("qtd_biscoito_estoque")));
                        data_mov_estoque.setText(rsSaida.getString("data_mov_estoque"));
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Cesta":
                sqlUpdate = "SELECT * FROM Cesta WHERE cod_cesta = " + selection;
                try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlUpdate)) {
                    while (rsSaida.next()) {
                        qtd_arroz_cesta.setText(Integer.toString(rsSaida.getInt("qtd_arroz_cesta")));
                        qtd_feijao_cesta.setText(Integer.toString(rsSaida.getInt("qtd_feijao_cesta")));
                        qtd_cafe_cesta.setText(Integer.toString(rsSaida.getInt("qtd_cafe_cesta")));
                        qtd_sal_cesta.setText(Integer.toString(rsSaida.getInt("qtd_sal_cesta")));
                        qtd_macarrao_cesta.setText(Integer.toString(rsSaida.getInt("qtd_macarrao_cesta")));
                        qtd_oleo_cesta.setText(Integer.toString(rsSaida.getInt("qtd_oleo_cesta")));
                        qtd_acucar_cesta.setText(Integer.toString(rsSaida.getInt("qtd_acucar_cesta")));
                        qtd_biscoito_cesta.setText(Integer.toString(rsSaida.getInt("qtd_biscoito_cesta")));
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Doacao":
                sqlUpdate = "SELECT * FROM Doacao WHERE cod_cesta = " + selection;
                try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlUpdate)) {
                    while (rsSaida.next()) {
                        cod_cesta.setText(Integer.toString(rsSaida.getInt("cod_cesta")));
                        cod_abrigo.setText(Integer.toString(rsSaida.getInt("cod_abrigo")));
                        data_doacao.setText(Integer.toString(rsSaida.getInt("data_doacao")));
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Valor inesperado!");
                break;
        }
    }//GEN-LAST:event_tableMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        int row = table.getSelectedRow();
        if (row != -1) {
            String selection = table.getModel().getValueAt(row, 0).toString();
            String sqlUpdate = "";
            switch (getTabela()) {
                case "Abrigo":
                    sqlUpdate = "UPDATE Abrigo SET nome_abrigo = ?, cnpj_abrigo = ?, telefone_abrigo = ?, email_abrigo = ?, quant_pessoas_abrigo = ?,cep_abrigo = ?, log_abrigo = ?, num_abrigo = ?, bairro_abrigo = ?, uf_abrigo = ? WHERE cod_abrigo = " + selection;
                    try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {
                        pstmt.setString(1, nome_abrigo.getText());
                        pstmt.setLong(2, Long.parseLong(cnpj_abrigo.getText().replaceAll("[./-]", "").trim()));
                        pstmt.setLong(3, Long.parseLong(telefone_abrigo.getText().replaceAll("[()-]","").trim()));
                        pstmt.setString(4, email_abrigo.getText());
                        pstmt.setInt(5, Integer.parseInt(quant_pessoas_abrigo.getText()));
                        pstmt.setInt(6, Integer.parseInt(cep_abrigo.getText().replaceAll("-","").trim()));
                        pstmt.setString(7, log_abrigo.getText());
                        pstmt.setInt(8, Integer.parseInt(num_abrigo.getText()));
                        pstmt.setString(9, bairro_abrigo.getText());
                        pstmt.setString(10, uf_abrigo.getSelectedItem().toString());
                        pstmt.executeUpdate();
                        telaSucesso tela = new telaSucesso("Atualização registrada com sucesso!");
                        tela.defineStatus();
                        tela.setVisible(true);
                        select();
                    } catch (SQLException e) {
                        telaSucesso tela = new telaSucesso("Não foi possível atualizar o registro, tente novamente mais tarde.");
                        tela.defineStatus();
                        tela.setVisible(true);
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Doador":
                    sqlUpdate = "UPDATE Doador SET nome_doador = ?, telefone_doador = ?, email_doador = ?, cep_doador = ?, log_doador = ?, num_doador = ?, bairro_doador = ?, uf_doador = ?, cpf_doador = ?, cnpj_doador = ? WHERE cod_doador = " + selection;
                    try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {
                        pstmt.setString(1, nome_doador.getText());
                        pstmt.setLong(2, Long.parseLong(telefone_doador.getText().replaceAll("[()-]","").trim()));
                        pstmt.setString(3, email_doador.getText());
                        pstmt.setInt(4, Integer.parseInt(cep_doador.getText().replaceAll("-","").trim()));
                        pstmt.setString(5, log_doador.getText());
                        pstmt.setInt(6, Integer.parseInt(num_doador.getText()));
                        pstmt.setString(7, bairro_doador.getText());
                        pstmt.setString(8, uf_doador.getSelectedItem().toString());
                        if(cpf_doador.isEnabled()){
                            pstmt.setLong(9, Long.parseLong(cpf_doador.getText().replaceAll("[.-]","")));
                            pstmt.setLong(10, 0);
                        } else {
                            pstmt.setLong(9, 0);
                            pstmt.setLong(10, Long.parseLong(cnpj_doador.getText().replaceAll("[./-]","")));
                        }
                        pstmt.executeUpdate();
                        telaSucesso tela = new telaSucesso("Atualização registrada com sucesso!");
                        tela.defineStatus();
                        tela.setVisible(true);
                        select();
                    } catch (SQLException e) {
                        telaSucesso tela = new telaSucesso("Não foi possível atualizar o registro, tente novamente mais tarde.");
                        tela.defineStatus();
                        tela.setVisible(true);
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Estoque":
                    sqlUpdate = "UPDATE Estoque SET mov_estoque = ?, qtd_arroz_estoque = ?, qtd_feijao_estoque = ?, qtd_cafe_estoque = ?, qtd_sal_estoque = ?, qtd_macarrao_estoque = ?, qtd_oleo_estoque = ?, qtd_acucar_estoque = ?, qtd_biscoito_estoque = ?, data_mov_estoque = ? WHERE cod_mov_estoque = " + selection;
                    try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {
                        pstmt.setString(1, mov_estoque.getText());
                        pstmt.setInt(2, Integer.parseInt(qtd_arroz_estoque.getText()));
                        pstmt.setInt(3, Integer.parseInt(qtd_feijao_estoque.getText()));
                        pstmt.setInt(4, Integer.parseInt(qtd_cafe_estoque.getText()));
                        pstmt.setInt(5, Integer.parseInt(qtd_sal_estoque.getText()));
                        pstmt.setInt(6, Integer.parseInt(qtd_macarrao_estoque.getText()));
                        pstmt.setInt(7, Integer.parseInt(qtd_oleo_estoque.getText()));
                        pstmt.setInt(8, Integer.parseInt(qtd_acucar_estoque.getText()));
                        pstmt.setInt(9, Integer.parseInt(qtd_biscoito_estoque.getText()));
                        pstmt.setString(10, data_mov_estoque.getText());
                        pstmt.executeUpdate();
                        telaSucesso tela = new telaSucesso("Atualização registrada com sucesso!");
                        tela.defineStatus();
                        tela.setVisible(true);
                        select();
                    } catch (SQLException e) {
                        telaSucesso tela = new telaSucesso("Não foi possível atualizar o registro, tente novamente mais tarde.");
                        tela.defineStatus();
                        tela.setVisible(true);
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Cesta":
                    sqlUpdate = "UPDATE Cesta SET qtd_arroz_cesta = ?, qtd_feijao_cesta = ?, qtd_cafe_cesta = ?, qtd_sal_cesta = ?, qtd_macarrao_cesta = ?, qtd_oleo_cesta = ?, qtd_acucar_cesta = ?, qtd_biscoito_cesta = ? WHERE cod_cesta = " + selection;
                    try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {
                        pstmt.setInt(1, Integer.parseInt(qtd_arroz_cesta.getText()));
                        pstmt.setInt(2, Integer.parseInt(qtd_feijao_cesta.getText()));
                        pstmt.setInt(3, Integer.parseInt(qtd_cafe_cesta.getText()));
                        pstmt.setInt(4, Integer.parseInt(qtd_sal_cesta.getText()));
                        pstmt.setInt(5, Integer.parseInt(qtd_macarrao_cesta.getText()));
                        pstmt.setInt(6, Integer.parseInt(qtd_oleo_cesta.getText()));
                        pstmt.setInt(7, Integer.parseInt(qtd_acucar_cesta.getText()));
                        pstmt.setInt(8, Integer.parseInt(qtd_biscoito_cesta.getText()));
                        pstmt.executeUpdate();
                        telaSucesso tela = new telaSucesso("Atualização registrada com sucesso!");
                        tela.defineStatus();
                        tela.setVisible(true);
                        select();
                    } catch (SQLException e) {
                        telaSucesso tela = new telaSucesso("Não foi possível atualizar o registro, tente novamente mais tarde.");
                        tela.defineStatus();
                        tela.setVisible(true);
                        System.out.println(e.getMessage());
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Doacao":
                    sqlUpdate = "UPDATE Doacao SET cod_cesta = ?, cod_abrigo = ?, data_doacao = ? WHERE cod_doacao = " + selection;
                    try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {
                        pstmt.setInt(2, Integer.parseInt(cod_cesta.getText()));
                        pstmt.setInt(3, Integer.parseInt(cod_abrigo.getText()));
                        pstmt.setString(4, data_doacao.getText());
                        pstmt.executeUpdate();
                        telaSucesso tela = new telaSucesso("Atualização registrada com sucesso!");
                        tela.defineStatus();
                        tela.setVisible(true);
                        select();
                    } catch (SQLException e) {
                        telaSucesso tela = new telaSucesso("Não foi possível atualizar o registro, tente novamente mais tarde.");
                        tela.defineStatus();
                        tela.setVisible(true);
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Valor inesperado!");
                    break;
            }
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        int row = table.getSelectedRow();
        if (row != -1) {
            String selection = table.getModel().getValueAt(row, 0).toString();
            String sqlDelete = "";
            switch (getTabela()) {
                case "Abrigo":
                    sqlDelete = "DELETE FROM Abrigo WHERE cod_abrigo = " + selection;
                    break;
                case "Doador":
                    sqlDelete = "DELETE FROM Doador WHERE cod_doador = " + selection;
                    break;
                case "Estoque":
                    sqlDelete = "DELETE FROM Estoque WHERE cod_mov_estoque = " + selection;
                    break;
                case "Cesta":
                    sqlDelete = "DELETE FROM Cesta WHERE cod_cesta = " + selection;
                    break;
                case "Doacao":
                    sqlDelete = "DELETE FROM Doacao WHERE cod_doacao = " + selection;
                    break;
                default:
                    System.out.println("Valor inesperado!");
                    break;
            }

            try {
                Connection conn = this.connect();
                PreparedStatement stmt = conn.prepareStatement(sqlDelete);
                stmt.executeUpdate();
                telaSucesso tela = new telaSucesso("Registro deletado com sucesso!");
                tela.defineStatus();
                tela.setVisible(true);
                select();
            } catch (Exception e) {
                telaSucesso tela = new telaSucesso("Não foi possível deletar os dados, tente novamente mais tarde.");
                tela.defineStatus();
                tela.setVisible(true);
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void nomeTabelaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nomeTabelaItemStateChanged
        switch(String.valueOf(nomeTabela.getSelectedItem())){
            case "Destinatário":
                setTabela("Abrigo");
                destinatarioPanel.setVisible(true);
                doadorPanel.setVisible(false);
                estoquePanel.setVisible(false);
                cestaPanel.setVisible(false);
                doacaoPanel.setVisible(false);
                break;
            case "Doador":
                setTabela("Doador");
                destinatarioPanel.setVisible(false);
                doadorPanel.setVisible(true);
                estoquePanel.setVisible(false);
                cestaPanel.setVisible(false);
                doacaoPanel.setVisible(false);
                break;
            case "Estoque":
                setTabela("Estoque");
                destinatarioPanel.setVisible(false);
                doadorPanel.setVisible(false);
                estoquePanel.setVisible(true);
                cestaPanel.setVisible(false);
                doacaoPanel.setVisible(false);
                break;
            case "Cestas":
                setTabela("Cesta");
                destinatarioPanel.setVisible(false);
                doadorPanel.setVisible(false);
                estoquePanel.setVisible(false);
                cestaPanel.setVisible(true);
                doacaoPanel.setVisible(false);
                break;
            case "Doação":
                setTabela("Doacao");
                destinatarioPanel.setVisible(false);
                doadorPanel.setVisible(false);
                estoquePanel.setVisible(false);
                cestaPanel.setVisible(false);
                doacaoPanel.setVisible(true);
                break;
            default:
                System.out.println("Valor inesperado!");
                break;
        }
        select();
    }//GEN-LAST:event_nomeTabelaItemStateChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        new app().setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void num_doadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_doadorKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_num_doadorKeyTyped

    private void quant_pessoas_abrigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quant_pessoas_abrigoKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_quant_pessoas_abrigoKeyTyped

    private void num_abrigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_abrigoKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_num_abrigoKeyTyped

    private void qtd_arroz_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_arroz_estoqueKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_arroz_estoqueKeyTyped

    private void qtd_feijao_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_feijao_estoqueKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_feijao_estoqueKeyTyped

    private void qtd_cafe_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_cafe_estoqueKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_cafe_estoqueKeyTyped

    private void qtd_sal_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_sal_estoqueKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_sal_estoqueKeyTyped

    private void qtd_macarrao_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_macarrao_estoqueKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_macarrao_estoqueKeyTyped

    private void qtd_oleo_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_oleo_estoqueKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_oleo_estoqueKeyTyped

    private void qtd_acucar_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_acucar_estoqueKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_acucar_estoqueKeyTyped

    private void qtd_biscoito_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_biscoito_estoqueKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_biscoito_estoqueKeyTyped

    private void qtd_arroz_cestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_arroz_cestaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_arroz_cestaKeyTyped

    private void qtd_feijao_cestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_feijao_cestaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_feijao_cestaKeyTyped

    private void qtd_cafe_cestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_cafe_cestaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_cafe_cestaKeyTyped

    private void qtd_sal_cestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_sal_cestaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_sal_cestaKeyTyped

    private void qtd_macarrao_cestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_macarrao_cestaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_macarrao_cestaKeyTyped

    private void qtd_oleo_cestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_oleo_cestaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_oleo_cestaKeyTyped

    private void qtd_acucar_cestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_acucar_cestaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_acucar_cestaKeyTyped

    private void qtd_biscoito_cestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_biscoito_cestaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qtd_biscoito_cestaKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterar().setVisible(true);
            }
        });
    }
    
    private Connection connect(){
        String url = "jdbc:sqlite:APS_db.db";
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(url);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
    public void select(){
        String sqlSelect = "SELECT * FROM " + getTabela();
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rsSaida = stmt.executeQuery(sqlSelect)){
            table.setModel(buildTableModel(rsSaida));
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro_abrigo;
    private javax.swing.JTextField bairro_doador;
    private javax.swing.JFormattedTextField cep_abrigo;
    private javax.swing.JFormattedTextField cep_doador;
    private javax.swing.JPanel cestaPanel;
    private javax.swing.JFormattedTextField cnpj_abrigo;
    private javax.swing.JFormattedTextField cnpj_doador;
    private javax.swing.JTextField cod_abrigo;
    private javax.swing.JTextField cod_cesta;
    private javax.swing.JFormattedTextField cpf_doador;
    private javax.swing.JTextField data_doacao;
    private javax.swing.JTextField data_mov_estoque;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel destinatarioPanel;
    private javax.swing.JPanel doacaoPanel;
    private javax.swing.JPanel doadorPanel;
    private javax.swing.JTextField email_abrigo;
    private javax.swing.JTextField email_doador;
    private javax.swing.JPanel estoquePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField log_abrigo;
    private javax.swing.JTextField log_doador;
    private javax.swing.JTextField mov_estoque;
    private javax.swing.JComboBox<String> nomeTabela;
    private javax.swing.JTextField nome_abrigo;
    private javax.swing.JTextField nome_doador;
    private javax.swing.JTextField num_abrigo;
    private javax.swing.JTextField num_doador;
    private javax.swing.JTextField qtd_acucar_cesta;
    private javax.swing.JTextField qtd_acucar_estoque;
    private javax.swing.JTextField qtd_arroz_cesta;
    private javax.swing.JTextField qtd_arroz_estoque;
    private javax.swing.JTextField qtd_biscoito_cesta;
    private javax.swing.JTextField qtd_biscoito_estoque;
    private javax.swing.JTextField qtd_cafe_cesta;
    private javax.swing.JTextField qtd_cafe_estoque;
    private javax.swing.JTextField qtd_feijao_cesta;
    private javax.swing.JTextField qtd_feijao_estoque;
    private javax.swing.JTextField qtd_macarrao_cesta;
    private javax.swing.JTextField qtd_macarrao_estoque;
    private javax.swing.JTextField qtd_oleo_cesta;
    private javax.swing.JTextField qtd_oleo_estoque;
    private javax.swing.JTextField qtd_sal_cesta;
    private javax.swing.JTextField qtd_sal_estoque;
    private javax.swing.JTextField quant_pessoas_abrigo;
    private javax.swing.JTable table;
    private javax.swing.JFormattedTextField telefone_abrigo;
    private javax.swing.JFormattedTextField telefone_doador;
    private javax.swing.JComboBox<String> uf_abrigo;
    private javax.swing.JComboBox<String> uf_doador;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
