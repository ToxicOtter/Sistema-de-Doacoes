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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salLabel = new javax.swing.JLabel();
        arrozLabel = new javax.swing.JLabel();
        feijaoLabel = new javax.swing.JLabel();
        macarraoLabel = new javax.swing.JLabel();
        cafeLabel = new javax.swing.JLabel();
        oleoLabel = new javax.swing.JLabel();
        acucarLabel = new javax.swing.JLabel();
        biscoitoLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        sobrenomeText = new javax.swing.JTextField();
        sobrenomeLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        logradouroLabel = new javax.swing.JLabel();
        logradouroText = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroText = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroText = new javax.swing.JTextField();
        ufLabel = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        pessoaComboBox = new javax.swing.JComboBox<>();
        cepText = new javax.swing.JFormattedTextField();
        telefoneText = new javax.swing.JFormattedTextField();
        ufText = new javax.swing.JComboBox<>();
        retornoLabel = new javax.swing.JLabel();
        cpfText = new javax.swing.JFormattedTextField();
        cnpjText = new javax.swing.JFormattedTextField();
        salText = new javax.swing.JFormattedTextField();
        arrozText = new javax.swing.JFormattedTextField();
        feijaoText = new javax.swing.JFormattedTextField();
        macarraoText = new javax.swing.JFormattedTextField();
        cafeText = new javax.swing.JFormattedTextField();
        oleoText = new javax.swing.JFormattedTextField();
        acucarText = new javax.swing.JFormattedTextField();
        biscoitoText = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salLabel.setText("Sal");

        arrozLabel.setText("Arroz");

        feijaoLabel.setText("Feijão");

        macarraoLabel.setText("Macarrao");

        cafeLabel.setText("Café");

        oleoLabel.setText("Óleo");

        acucarLabel.setText("Açúcar");

        biscoitoLabel.setText("Biscoito");

        nomeLabel.setText("Nome");

        sobrenomeLabel.setText("Sobrenome");

        cepLabel.setText("CEP");

        logradouroLabel.setText("Logradouro");

        logradouroText.setEnabled(false);

        numeroLabel.setText("Número");

        numeroText.setText("0");
        numeroText.setEnabled(false);

        bairroLabel.setText("Bairro");

        bairroText.setEnabled(false);

        ufLabel.setText("UF");

        telefoneLabel.setText("Telefone");

        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
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

        pessoaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física", "Jurídica" }));
        pessoaComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pessoaComboBoxItemStateChanged(evt);
            }
        });

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

        try {
            telefoneText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ufText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        ufText.setEnabled(false);

        retornoLabel.setText("jLabel1");

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

        try {
            salText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            arrozText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            feijaoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            macarraoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cafeText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            oleoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            acucarText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            biscoitoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(macarraoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(feijaoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arrozLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(salText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrozText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feijaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(macarraoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cafeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oleoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acucarLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(biscoitoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cafeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oleoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acucarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biscoitoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(retornoLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sobrenomeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cepLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ufLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bairroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numeroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(logradouroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(pessoaComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailText, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(logradouroText)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ufText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(telefoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(bairroText)
                                .addComponent(numeroText)
                                .addComponent(sobrenomeText)
                                .addComponent(nomeText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cnpjText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)))
                .addComponent(jButton2)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pessoaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnpjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cafeLabel)
                                    .addComponent(cafeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(oleoLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(oleoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(acucarLabel)
                                    .addComponent(acucarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(biscoitoLabel)
                                    .addComponent(biscoitoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arrozLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(feijaoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(macarraoLabel)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arrozText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feijaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(macarraoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addComponent(retornoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        new app().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (emailText.getText().contains("@")){
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
            System.out.println(doador.getTelefone());
        } else {
            retornoLabel.setText("E-mail inválido. Faça as alterações e tente novamente.");
            retornoLabel.setVisible(true);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void cepTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cepTextFocusLost
        String cep = (cepText.getText()).replaceAll("-", "");
        try{
            CepAPIIntegration endereco = CepAPIIntegration.getCep(cep);
            logradouroText.setText(endereco.getLogradouro());
            bairroText.setText(endereco.getBairro());
            ufText.setSelectedItem(endereco.getUf());
            
            logradouroText.setEnabled(true);
            bairroText.setEnabled(true);
            ufText.setEnabled(true);
            numeroText.setEnabled(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
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
    private javax.swing.JFormattedTextField acucarText;
    private javax.swing.JLabel arrozLabel;
    private javax.swing.JFormattedTextField arrozText;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField bairroText;
    private javax.swing.JLabel biscoitoLabel;
    private javax.swing.JFormattedTextField biscoitoText;
    private javax.swing.JLabel cafeLabel;
    private javax.swing.JFormattedTextField cafeText;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JFormattedTextField cepText;
    private javax.swing.JFormattedTextField cnpjText;
    private javax.swing.JFormattedTextField cpfText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel feijaoLabel;
    private javax.swing.JFormattedTextField feijaoText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel logradouroLabel;
    private javax.swing.JTextField logradouroText;
    private javax.swing.JLabel macarraoLabel;
    private javax.swing.JFormattedTextField macarraoText;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeText;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroText;
    private javax.swing.JLabel oleoLabel;
    private javax.swing.JFormattedTextField oleoText;
    private javax.swing.JComboBox<String> pessoaComboBox;
    private javax.swing.JLabel retornoLabel;
    private javax.swing.JLabel salLabel;
    private javax.swing.JFormattedTextField salText;
    private javax.swing.JLabel sobrenomeLabel;
    private javax.swing.JTextField sobrenomeText;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JFormattedTextField telefoneText;
    private javax.swing.JLabel ufLabel;
    private javax.swing.JComboBox<String> ufText;
    // End of variables declaration//GEN-END:variables
}
