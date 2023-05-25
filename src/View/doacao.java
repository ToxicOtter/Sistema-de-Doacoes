package View;
import Controller.CepAPIIntegration;
import Controller.Doador;
import Controller.Estoque;
import Controller.SQLiteConnection;

import java.util.Date;

public class doacao extends javax.swing.JFrame {
    public doacao() {
        initComponents();
        retornoLabel.setVisible(false);
        Date d = new Date();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        enviarButton = new javax.swing.JButton();
        retornoLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        salLabel = new javax.swing.JLabel();
        salText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        arrozLabel = new javax.swing.JLabel();
        arrozText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        feijaoLabel = new javax.swing.JLabel();
        feijaoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        macarraoLabel = new javax.swing.JLabel();
        macarraoText = new javax.swing.JTextField();
        cafeLabel = new javax.swing.JLabel();
        cafeText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        oleoText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        acucarLabel = new javax.swing.JLabel();
        acucarText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        biscoitoLabel = new javax.swing.JLabel();
        biscoitoText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        oleoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        sobrenomeText = new javax.swing.JTextField();
        sobrenomeLabel = new javax.swing.JLabel();
        cepText = new javax.swing.JFormattedTextField();
        cepLabel = new javax.swing.JLabel();
        logradouroLabel = new javax.swing.JLabel();
        logradouroText = new javax.swing.JTextField();
        bairroText = new javax.swing.JTextField();
        numeroText = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        ufLabel = new javax.swing.JLabel();
        numeroLabel = new javax.swing.JLabel();
        ufText = new javax.swing.JComboBox<>();
        telefoneText = new javax.swing.JFormattedTextField();
        telefoneLabel = new javax.swing.JLabel();
        pessoaComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cpfText = new javax.swing.JFormattedTextField();
        cnpjText = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        enviarButton.setText("Enviar");
        enviarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarButtonMouseClicked(evt);
            }
        });

        retornoLabel.setText("Resposta");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Cadastro de Doação");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), null));

        salLabel.setText("Sal");

        salText.setText("0");
        salText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salTextKeyTyped(evt);
            }
        });

        jLabel4.setText("1kg");

        arrozLabel.setText("Arroz");

        arrozText.setText("0");
        arrozText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                arrozTextKeyTyped(evt);
            }
        });

        jLabel8.setText("1kg");

        feijaoLabel.setText("Feijão");

        feijaoText.setText("0");
        feijaoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                feijaoTextKeyTyped(evt);
            }
        });

        jLabel5.setText("1kg");

        jLabel10.setText("1 pacote (opcional)");

        macarraoLabel.setText("Macarrao");

        macarraoText.setText("0");
        macarraoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                macarraoTextKeyTyped(evt);
            }
        });

        cafeLabel.setText("Café");

        cafeText.setText("0");
        cafeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cafeTextKeyTyped(evt);
            }
        });

        jLabel9.setText("500g");

        oleoText.setText("0");
        oleoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oleoTextKeyTyped(evt);
            }
        });

        jLabel6.setText("1L");

        acucarLabel.setText("Açúcar");

        acucarText.setText("0");
        acucarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                acucarTextKeyTyped(evt);
            }
        });

        jLabel7.setText("1kg");

        biscoitoLabel.setText("Biscoito");

        biscoitoText.setText("0");
        biscoitoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                biscoitoTextKeyTyped(evt);
            }
        });

        jLabel11.setText("1 pacote (opcional)");

        oleoLabel.setText("Óleo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arrozLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(feijaoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(macarraoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(salText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrozText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(feijaoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(macarraoText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cafeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oleoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acucarLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(biscoitoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(oleoText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(acucarText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(biscoitoText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cafeText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(salLabel)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(salText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cafeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(cafeLabel)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(arrozLabel)
                                    .addComponent(arrozText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(feijaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(feijaoLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(macarraoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(macarraoLabel)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(biscoitoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(biscoitoLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(acucarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acucarLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(oleoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(oleoLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nomeLabel.setText("Nome");

        sobrenomeLabel.setText("Sobrenome");

        try {
            cepText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cepTextFocusLost(evt);
            }
        });

        cepLabel.setText("CEP");

        logradouroLabel.setText("Logradouro");

        logradouroText.setEnabled(false);

        bairroText.setEnabled(false);

        numeroText.setText("0");
        numeroText.setEnabled(false);
        numeroText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTextKeyTyped(evt);
            }
        });

        bairroLabel.setText("Bairro");

        ufLabel.setText("UF");

        numeroLabel.setText("Número");

        ufText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        ufText.setEnabled(false);

        try {
            telefoneText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        telefoneLabel.setText("Telefone");

        pessoaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física", "Jurídica" }));
        pessoaComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pessoaComboBoxItemStateChanged(evt);
            }
        });

        jLabel3.setText("Tipo");

        jLabel1.setText("CPF");

        try {
            cpfText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cnpjText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpjText.setEnabled(false);

        jLabel2.setText("CNPJ");

        emailLabel.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sobrenomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(46, 46, 46)
                                            .addComponent(cepLabel)
                                            .addGap(225, 225, 225)
                                            .addComponent(logradouroLabel))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(numeroLabel)
                                            .addGap(206, 206, 206)
                                            .addComponent(bairroLabel)
                                            .addGap(187, 187, 187)
                                            .addComponent(ufLabel))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(73, 73, 73)
                                            .addComponent(nomeLabel)
                                            .addGap(246, 246, 246)
                                            .addComponent(sobrenomeLabel))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(pessoaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cnpjText))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ufText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(212, 212, 212))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(telefoneLabel)
                                    .addGap(265, 265, 265)
                                    .addComponent(emailLabel)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(numeroText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(bairroText, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logradouroText, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(sobrenomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepLabel)
                    .addComponent(logradouroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroLabel)
                    .addComponent(ufLabel)
                    .addComponent(numeroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ufText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bairroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(numeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneLabel)
                            .addComponent(emailLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pessoaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(retornoLabel)
                    .addComponent(enviarButton))
                .addGap(312, 312, 312))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(voltarButton)
                        .addGap(530, 530, 530)
                        .addComponent(sairButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton)
                    .addComponent(sairButton))
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornoLabel)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        this.setVisible(false);
        app telaPrincipal = new app();
        telaPrincipal.pack();
        telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void sairButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_sairButtonMouseClicked

    private void enviarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarButtonMouseClicked
        if (verificador() == "Foi"){
            Doador doador = new Doador();
            Estoque estoque = new Estoque();
            Date d = new Date();
        
            doador.setNome(nomeText.getText());
            doador.setCep(Integer.parseInt((cepText.getText()).replaceAll("-","")));
            doador.setLogradouro(logradouroText.getText());
            doador.setNumero(Integer.parseInt(numeroText.getText()));
            doador.setBairro(bairroText.getText());
            doador.setUf(ufText.getSelectedItem().toString());
            doador.setTelefone(Long.parseLong((telefoneText.getText()).replaceAll("[()-]", "")));
            doador.setEmail(emailText.getText());
            if (pessoaComboBox.getSelectedItem() == "Física"){
                doador.setTipoDoador(true);
                doador.setCpfCnpj(Long.parseLong(cpfText.getText().replaceAll("[.-]","")));
            } else {
                doador.setTipoDoador(false);
                doador.setCpfCnpj(Long.parseLong(cnpjText.getText().replaceAll("[./-]","")));
            }
        
            SQLiteConnection cnDoador = new SQLiteConnection();
            String res = cnDoador.insertDoador(doador);
        
            if (res == "Done"){
                System.out.println("Foi");
            } else {
                System.out.println("Erro interno, tente mais tarde!");
            }
        
            estoque.setMovimento("Entrada");
            estoque.setQtdArroz(Integer.parseInt(arrozText.getText().trim()));
            estoque.setQtdFeijao(Integer.parseInt(feijaoText.getText().trim()));
            estoque.setQtdCafe(Integer.parseInt(cafeText.getText().trim()));
            estoque.setQtdSal(Integer.parseInt(salText.getText().trim()));
            estoque.setQtdMacarrao(Integer.parseInt(macarraoText.getText().trim()));
            estoque.setQtdOleo(Integer.parseInt(oleoText.getText().trim()));
            estoque.setQtdAcucar(Integer.parseInt(acucarText.getText().trim()));
            estoque.setQtdBiscoito(Integer.parseInt(biscoitoText.getText().trim()));
            estoque.setData(d.toString());
        
            String resEstoque = cnDoador.insertEstoque(estoque);
        
            if (resEstoque == "Done" && res == "Done") {
                telaSucesso sucesso = new telaSucesso("Doação cadastrada com sucesso!");
                sucesso.defineStatus();
                sucesso.pack();
                sucesso.setLocationRelativeTo(null);
                sucesso.setVisible(true);
            } else {
                System.out.println("Erro interno no cadastro, tente mais tarde!");
                telaSucesso sucesso = new telaSucesso("Doação cadastrada com sucesso!");
                sucesso.defineStatus();
                sucesso.pack();
                sucesso.setLocationRelativeTo(null);
                sucesso.setVisible(true);
            }
        }
    }//GEN-LAST:event_enviarButtonMouseClicked

    private String verificador(){
        String status = "Foi";
        if(nomeText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha o nome.");
            retornoLabel.setVisible(true);
            status = "Falha";
        } else if(sobrenomeText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha o sobrenome.");
            retornoLabel.setVisible(true);
            status = "Falha";
        } else if(cepText.getText().replaceAll("-","").trim() == ""){
            retornoLabel.setText("Preencha o CEP.");
            retornoLabel.setVisible(true);
            status = "Falha";
        } else if(logradouroText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha o Logradouro.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(numeroText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha o Numero do endereço.");
            retornoLabel.setVisible(true);
            status = "Falha"; 
        }else if(bairroText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha o Bairro.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(telefoneText.getText().replaceAll("[()-]","").trim() == ""){
            retornoLabel.setText("Preencha o Telefone.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(!emailText.getText().contains("@")){
            retornoLabel.setText("Preencha o email corretamente.");
            retornoLabel.setVisible(true);
            status = "Falha";
        } else if (pessoaComboBox.getSelectedItem() == "Física") {
            if (cpfText.getText().replaceAll("[.-]", "").trim() == "") {
                retornoLabel.setText("Preencha o CPF.");
                retornoLabel.setVisible(true);
                status = "Falha";
            }
        } else if (pessoaComboBox.getSelectedItem() == "Jurídica") {
            if (cnpjText.getText().replaceAll("[./-]", "").trim() == "") {
                retornoLabel.setText("Preencha o CNPJ.");
                retornoLabel.setVisible(true);
                status = "Falha";
            }
        }else if(salText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha a quantidade de sal, mesmo que seja 0.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(arrozText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha a quantidade de arroz, mesmo que seja 0.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(feijaoText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha a quantidade de feijão, mesmo que seja 0.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(macarraoText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha a quantidade de macarrão, mesmo que seja 0.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(cafeText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha a quantidade de café, mesmo que seja 0.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(oleoText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha a quantidade de óleo, mesmo que seja 0.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(acucarText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha a quantidade de açúcar, mesmo que seja 0.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }else if(biscoitoText.getText().trim().isEmpty()){
            retornoLabel.setText("Preencha a quantidade de biscoito, mesmo que seja 0.");
            retornoLabel.setVisible(true);
            status = "Falha";
        }
        return status;
    }
    
    private void cepTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cepTextFocusLost
        String cep = (cepText.getText()).replaceAll("-", "");
        if (cep.trim() == "" || cep.trim().length() < 8) {
            retornoLabel.setText("Preencha corretamente o CPF para o autopreenchimento.");
            retornoLabel.setVisible(true);
        } else {
            try {
                CepAPIIntegration endereco = CepAPIIntegration.getCep(cep);
                logradouroText.setText(endereco.getLogradouro());
                bairroText.setText(endereco.getBairro());
                ufText.setSelectedItem(endereco.getUf());

                logradouroText.setEnabled(true);
                bairroText.setEnabled(true);
                ufText.setEnabled(true);
                numeroText.setEnabled(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_cepTextFocusLost

    private void pessoaComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pessoaComboBoxItemStateChanged
        if(pessoaComboBox.getSelectedItem()=="Física"){
            cpfText.setEnabled(true);
            cnpjText.setEnabled(false);
        } else {
            cpfText.setEnabled(false);
            cnpjText.setEnabled(true);
        }
    }//GEN-LAST:event_pessoaComboBoxItemStateChanged

    private void salTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_salTextKeyTyped

    private void arrozTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arrozTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_arrozTextKeyTyped

    private void feijaoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feijaoTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_feijaoTextKeyTyped

    private void macarraoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_macarraoTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_macarraoTextKeyTyped

    private void cafeTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cafeTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_cafeTextKeyTyped

    private void oleoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oleoTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_oleoTextKeyTyped

    private void acucarTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acucarTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_acucarTextKeyTyped

    private void biscoitoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_biscoitoTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_biscoitoTextKeyTyped

    private void numeroTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTextKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_numeroTextKeyTyped

    public static void main(String args[]) {
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
    private javax.swing.JFormattedTextField cepText;
    private javax.swing.JFormattedTextField cnpjText;
    private javax.swing.JFormattedTextField cpfText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton enviarButton;
    private javax.swing.JLabel feijaoLabel;
    private javax.swing.JTextField feijaoText;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JLabel retornoLabel;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel salLabel;
    private javax.swing.JTextField salText;
    private javax.swing.JLabel sobrenomeLabel;
    private javax.swing.JTextField sobrenomeText;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JFormattedTextField telefoneText;
    private javax.swing.JLabel ufLabel;
    private javax.swing.JComboBox<String> ufText;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
