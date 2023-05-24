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

public class alterar extends javax.swing.JFrame {
    private String tabela = "Doador";
    
    public alterar() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        destinatarioPanel = new javax.swing.JPanel();
        nome_abrigo = new javax.swing.JTextField();
        email_abrigo = new javax.swing.JTextField();
        quant_pessoas_abrigo = new javax.swing.JTextField();
        cep_abrigo = new javax.swing.JTextField();
        log_abrigo = new javax.swing.JTextField();
        num_abrigo = new javax.swing.JTextField();
        bairro_abrigo = new javax.swing.JTextField();
        uf_abrigo = new javax.swing.JTextField();
        cnpj_abrigo = new javax.swing.JFormattedTextField();
        telefone_abrigo = new javax.swing.JFormattedTextField();
        cestaPanel = new javax.swing.JPanel();
        qtd_arroz_cesta = new javax.swing.JTextField();
        qtd_feijao_cesta = new javax.swing.JTextField();
        qtd_cafe_cesta = new javax.swing.JTextField();
        qtd_sal_cesta = new javax.swing.JTextField();
        qtd_macarrao_cesta = new javax.swing.JTextField();
        qtd_oleo_cesta = new javax.swing.JTextField();
        qtd_acucar_cesta = new javax.swing.JTextField();
        qtd_biscoito_cesta = new javax.swing.JTextField();
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
        doacaoPanel = new javax.swing.JPanel();
        cod_doador = new javax.swing.JTextField();
        cod_cesta = new javax.swing.JTextField();
        cod_abrigo = new javax.swing.JTextField();
        data_doacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alterar dados");

        jLabel2.setText("Alterar");

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

        jLabel3.setText("Nome");

        jLabel4.setText("Telefone");

        jLabel5.setText("Email");

        jLabel6.setText("Cep");

        jLabel7.setText("Logradouro");

        jLabel8.setText("Número");

        jLabel9.setText("Bairro");

        jLabel10.setText("UF");

        jLabel11.setText("CPF");

        jLabel12.setText("CNPJ");

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
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
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
                .addContainerGap()
                .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel3)
                        .addComponent(nome_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(doadorPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(doadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(telefone_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addContainerGap(16, Short.MAX_VALUE))
        );

        nome_abrigo.setText("jTextField1");

        email_abrigo.setText("jTextField1");

        quant_pessoas_abrigo.setText("jTextField1");

        cep_abrigo.setText("jTextField1");

        log_abrigo.setText("jTextField1");

        num_abrigo.setText("jTextField1");

        bairro_abrigo.setText("jTextField1");

        uf_abrigo.setText("jTextField1");

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

        javax.swing.GroupLayout destinatarioPanelLayout = new javax.swing.GroupLayout(destinatarioPanel);
        destinatarioPanel.setLayout(destinatarioPanelLayout);
        destinatarioPanelLayout.setHorizontalGroup(
            destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinatarioPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(uf_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bairro_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(log_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cep_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quant_pessoas_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nome_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(email_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cnpj_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone_abrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        destinatarioPanelLayout.setVerticalGroup(
            destinatarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinatarioPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nome_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnpj_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefone_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quant_pessoas_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cep_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairro_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uf_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        qtd_arroz_cesta.setText("jTextField1");

        qtd_feijao_cesta.setText("jTextField1");

        qtd_cafe_cesta.setText("jTextField1");

        qtd_sal_cesta.setText("jTextField1");

        qtd_macarrao_cesta.setText("jTextField1");

        qtd_oleo_cesta.setText("jTextField1");

        qtd_acucar_cesta.setText("jTextField1");

        qtd_biscoito_cesta.setText("jTextField1");

        javax.swing.GroupLayout cestaPanelLayout = new javax.swing.GroupLayout(cestaPanel);
        cestaPanel.setLayout(cestaPanelLayout);
        cestaPanelLayout.setHorizontalGroup(
            cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cestaPanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtd_macarrao_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_sal_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_cafe_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cestaPanelLayout.createSequentialGroup()
                        .addComponent(qtd_feijao_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtd_biscoito_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cestaPanelLayout.createSequentialGroup()
                        .addComponent(qtd_arroz_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtd_acucar_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cestaPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(qtd_oleo_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        cestaPanelLayout.setVerticalGroup(
            cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cestaPanelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(qtd_oleo_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtd_arroz_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_acucar_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cestaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtd_feijao_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_biscoito_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtd_cafe_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtd_sal_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtd_macarrao_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        mov_estoque.setText("jTextField1");

        qtd_arroz_estoque.setText("jTextField1");

        qtd_feijao_estoque.setText("jTextField1");

        qtd_cafe_estoque.setText("jTextField1");

        qtd_sal_estoque.setText("jTextField1");

        qtd_macarrao_estoque.setText("jTextField1");

        qtd_oleo_estoque.setText("jTextField1");

        qtd_acucar_estoque.setText("jTextField1");

        qtd_biscoito_estoque.setText("jTextField1");

        data_mov_estoque.setText("jTextField1");

        javax.swing.GroupLayout estoquePanelLayout = new javax.swing.GroupLayout(estoquePanel);
        estoquePanel.setLayout(estoquePanelLayout);
        estoquePanelLayout.setHorizontalGroup(
            estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estoquePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtd_macarrao_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_sal_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(estoquePanelLayout.createSequentialGroup()
                        .addComponent(qtd_cafe_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(data_mov_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(estoquePanelLayout.createSequentialGroup()
                        .addComponent(qtd_feijao_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtd_biscoito_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(estoquePanelLayout.createSequentialGroup()
                        .addComponent(qtd_arroz_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtd_acucar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(estoquePanelLayout.createSequentialGroup()
                        .addComponent(mov_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtd_oleo_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        estoquePanelLayout.setVerticalGroup(
            estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estoquePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mov_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_oleo_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtd_arroz_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_acucar_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtd_feijao_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_biscoito_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estoquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtd_cafe_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_mov_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtd_sal_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtd_macarrao_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        cod_doador.setText("jTextField1");

        cod_cesta.setText("jTextField1");

        cod_abrigo.setText("jTextField1");

        data_doacao.setText("jTextField1");

        javax.swing.GroupLayout doacaoPanelLayout = new javax.swing.GroupLayout(doacaoPanel);
        doacaoPanel.setLayout(doacaoPanelLayout);
        doacaoPanelLayout.setHorizontalGroup(
            doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doacaoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_doacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        doacaoPanelLayout.setVerticalGroup(
            doacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doacaoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cod_doador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cod_cesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cod_abrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data_doacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nomeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doacaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addComponent(deleteButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(updateButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(destinatarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(191, 191, 191)
                                        .addComponent(estoquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cestaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(doacaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cestaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton)
                            .addComponent(updateButton))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estoquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(doadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(102, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(destinatarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))))
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
                        cnpj_abrigo.setText(Integer.toString(rsSaida.getInt("cnpj_abrigo")));
                        telefone_abrigo.setText(Integer.toString(rsSaida.getInt("telefone_abrigo")));
                        email_abrigo.setText(rsSaida.getString("email_abrigo"));
                        quant_pessoas_abrigo.setText(Integer.toString(rsSaida.getInt("quant_pessoas_abrigo")));
                        cep_abrigo.setText(Integer.toString(rsSaida.getInt("cep_abrigo")));
                        log_abrigo.setText(rsSaida.getString("log_abrigo"));
                        num_abrigo.setText(Integer.toString(rsSaida.getInt("num_abrigo")));
                        bairro_abrigo.setText(rsSaida.getString("bairro_abrigo"));
                        uf_abrigo.setText(rsSaida.getString("uf_abrigo")); 
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
                        cod_doador.setText(Integer.toString(rsSaida.getInt("cod_doador")));
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
        String selection = table.getModel().getValueAt(row, 0).toString();
        String sqlUpdate = "";
        switch(getTabela()){
            case "Abrigo":
                sqlUpdate = "UPDATE Abrigo SET nome_abrigo = ?, cnpj_abrigo = ?, telefone_abrigo = ?, email_abrigo = ?, quant_pessoas_abrigo = ?,cep_abrigo = ?, log_abrigo = ?, num_abrigo = ?, bairro_abrigo = ?, uf_abrigo = ? WHERE cod_abrigo = " + selection;
                try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {
                    pstmt.setString(1, nome_abrigo.getText());
                    pstmt.setLong(2, Long.parseLong(cnpj_abrigo.getText()));
                    pstmt.setLong(3, Long.parseLong(telefone_abrigo.getText()));
                    pstmt.setString(4, email_abrigo.getText());
                    pstmt.setInt(5, Integer.parseInt(quant_pessoas_abrigo.getText()));
                    pstmt.setInt(6, Integer.parseInt(cep_abrigo.getText()));
                    pstmt.setString(7, log_doador.getText());
                    pstmt.setInt(8, Integer.parseInt(num_doador.getText()));
                    pstmt.setString(9, bairro_doador.getText());
                    pstmt.setString(10, uf_doador.getSelectedItem().toString());
                    pstmt.executeUpdate();
                    select();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Doador":
                sqlUpdate = "UPDATE Doador SET nome_doador = ?, telefone_doador = ?, email_doador = ?, cep_doador = ?, log_doador = ?, num_doador = ?, bairro_doador = ?, uf_doador = ?, cpf_doador = ?, cnpj_doador = ? WHERE cod_doador = " + selection;
                try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {
                    pstmt.setString(1, nome_doador.getText());
                    pstmt.setLong(2, Long.parseLong(telefone_doador.getText()));
                    pstmt.setString(3, email_doador.getText());
                    pstmt.setInt(4, Integer.parseInt(cep_doador.getText()));
                    pstmt.setString(5, log_doador.getText());
                    pstmt.setInt(6, Integer.parseInt(num_doador.getText()));
                    pstmt.setString(7, bairro_doador.getText());
                    pstmt.setString(8, uf_doador.getSelectedItem().toString());
                    pstmt.setLong(9, Long.parseLong(cpf_doador.getText()));
                    pstmt.setLong(10, Long.parseLong(cnpj_doador.getText()));
                    pstmt.executeUpdate();
                    select();
                } catch (SQLException e) {
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
                    select();
                } catch (SQLException e) {
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
                    select();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Doacao":
                sqlUpdate = "UPDATE Doacao SET cod_doador = ?, cod_cesta = ?, cod_abrigo = ?, data_doacao = ? WHERE cod_doacao = " + selection;
                try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {
                    pstmt.setInt(1, Integer.parseInt(cod_doador.getText()));
                    pstmt.setInt(2, Integer.parseInt(cod_cesta.getText()));
                    pstmt.setInt(3, Integer.parseInt(cod_abrigo.getText()));
                    pstmt.setString(4,data_doacao.getText());
                    pstmt.executeUpdate();
                    select();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Valor inesperado!");
                break;
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        int row = table.getSelectedRow();
        String selection = table.getModel().getValueAt(row, 0).toString();
        String sqlDelete = "";
        switch(getTabela()){
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
            select();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void nomeTabelaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nomeTabelaItemStateChanged
        switch(String.valueOf(nomeTabela.getSelectedItem())){
            case "Destinatário":
                setTabela("Abrigo");
                break;
            case "Doador":
                setTabela("Doador");
                break;
            case "Estoque":
                setTabela("Estoque");
                break;
            case "Cestas":
                setTabela("Cesta");
                break;
            case "Doação":
                setTabela("Doacao");
                break;
            default:
                System.out.println("Valor inesperado!");
                break;
        }
        
        select();
    }//GEN-LAST:event_nomeTabelaItemStateChanged

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
    private javax.swing.JTextField cep_abrigo;
    private javax.swing.JFormattedTextField cep_doador;
    private javax.swing.JPanel cestaPanel;
    private javax.swing.JFormattedTextField cnpj_abrigo;
    private javax.swing.JFormattedTextField cnpj_doador;
    private javax.swing.JTextField cod_abrigo;
    private javax.swing.JTextField cod_cesta;
    private javax.swing.JTextField cod_doador;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField uf_abrigo;
    private javax.swing.JComboBox<String> uf_doador;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
