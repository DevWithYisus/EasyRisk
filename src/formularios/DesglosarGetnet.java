package formularios;

import javax.swing.table.DefaultTableModel;

public class DesglosarGetnet extends javax.swing.JInternalFrame {

    DefaultTableModel pt = new DefaultTableModel();

    public DesglosarGetnet() {
        initComponents();

        String[] columnas = {"TAG", "NOMBRE", "VALOR"};

        pt.setColumnIdentifiers(columnas);

        tablaTrama.setModel(pt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaTrama = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTrama = new javax.swing.JTable();
        lblHercules = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaHercules = new javax.swing.JTextArea();
        lblPutty = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaPutty = new javax.swing.JTextArea();
        lblPuerto = new javax.swing.JLabel();
        lblHexa = new javax.swing.JLabel();
        cajaHexa = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnDesglosar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        comboPuerto = new javax.swing.JComboBox<>();
        cajaIp = new javax.swing.JTextField();
        cajaPuerto = new javax.swing.JTextField();
        lblPuerto1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Desglosar TRX Getnet ");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingrese La Trama");

        areaTrama.setColumns(20);
        areaTrama.setRows(5);
        jScrollPane3.setViewportView(areaTrama);

        tablaTrama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tablaTrama);

        lblHercules.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHercules.setForeground(new java.awt.Color(0, 0, 0));
        lblHercules.setText("Trama Hercules");

        areaHercules.setColumns(20);
        areaHercules.setLineWrap(true);
        areaHercules.setRows(5);
        jScrollPane2.setViewportView(areaHercules);

        lblPutty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPutty.setForeground(new java.awt.Color(0, 0, 0));
        lblPutty.setText("Trama Putty");

        areaPutty.setColumns(20);
        areaPutty.setLineWrap(true);
        areaPutty.setRows(5);
        jScrollPane4.setViewportView(areaPutty);

        lblPuerto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuerto.setForeground(new java.awt.Color(0, 0, 0));
        lblPuerto.setText("Puerto:");

        lblHexa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHexa.setForeground(new java.awt.Color(0, 0, 0));
        lblHexa.setText("Valor Hexadecimal:");

        cajaHexa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cajaHexa.setForeground(new java.awt.Color(0, 0, 0));

        btnGenerar.setBackground(new java.awt.Color(255, 102, 0));
        btnGenerar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("Generar Tramas");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnDesglosar.setBackground(new java.awt.Color(255, 102, 0));
        btnDesglosar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDesglosar.setForeground(new java.awt.Color(0, 0, 0));
        btnDesglosar.setText("Desglosar Trama");
        btnDesglosar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesglosarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 102, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar Todo");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        comboPuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CERT01", "CERT02" }));

        lblPuerto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuerto1.setForeground(new java.awt.Color(0, 0, 0));
        lblPuerto1.setText("IP:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4)
                        .addGap(127, 127, 127)
                        .addComponent(btnDesglosar)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblHercules)
                                .addGap(405, 405, 405)))
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPuerto1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPuerto)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnGenerar)
                .addGap(74, 74, 74)
                .addComponent(lblHexa)
                .addGap(37, 37, 37)
                .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(lblPutty)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnDesglosar)
                    .addComponent(btnLimpiar))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHexa)
                        .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenerar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPuerto1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPuerto))))
                .addGap(7, 7, 7)
                .addComponent(lblHercules)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPutty)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        switch (comboPuerto.getSelectedIndex()) {
            case 0:
                cajaIp.setText("10.195.16.5");
                cajaPuerto.setText("6200");
                break;
            case 1:
                cajaIp.setText("10.195.16.23");
                cajaPuerto.setText("6200");
                break;
        }

        
        String[] rTrama = new String[39];
        for (int i = 0; i < tablaTrama.getRowCount(); i++) {

            rTrama[i] = tablaTrama.getValueAt(i, 2).toString();
        }

        areaHercules.setText(rTrama[0] + rTrama[1] + rTrama[2] + rTrama[3] + rTrama[4] + rTrama[6]
                + rTrama[7] + rTrama[8] + rTrama[9] + rTrama[10] + rTrama[11] + rTrama[14]
                + rTrama[15] + rTrama[17] + rTrama[18] + rTrama[19] + rTrama[20] + rTrama[21] + rTrama[22]
                + rTrama[23] + rTrama[24] + rTrama[25] + rTrama[26] + rTrama[27] + rTrama[28] + rTrama[29] + rTrama[30]
                + rTrama[31] + rTrama[33] + rTrama[35] + rTrama[37] + rTrama[38]);

        String longitud = areaTrama.getText();
        System.out.println(longitud.length());
        int decimales = longitud.length();
        String hexadecimal = Integer.toHexString(decimales);
        cajaHexa.setText("0" + hexadecimal);
        String[] nuevoHexa = hexadecimal.split("");
        String hexa1 = "0" + nuevoHexa[0];
        String hexa2 = nuevoHexa[1] + nuevoHexa[2];

        areaPutty.setText("(echo -n -e \"\\x" + hexa1 + "\\x" + hexa2 + rTrama[0] + rTrama[1] + rTrama[2] + rTrama[3] + rTrama[4] + rTrama[6]
                + rTrama[7] + rTrama[8] + rTrama[9] + rTrama[10] + rTrama[11] + rTrama[14]
                + rTrama[15] + rTrama[17] + rTrama[18] + rTrama[19] + rTrama[20] + rTrama[21] + rTrama[22]
                + rTrama[23] + rTrama[24] + rTrama[25] + rTrama[26] + rTrama[27] + rTrama[28] + rTrama[29] + rTrama[30]
                + rTrama[31] + rTrama[33] + rTrama[35] + rTrama[37] + rTrama[38] + "\"; sleep 5) | timeout 5 nc localhost " + cajaPuerto.getText());
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnDesglosarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesglosarActionPerformed

        String tramaCompleta = areaTrama.getText();

        String N_MTI = tramaCompleta.substring(0, 4);
        String S_PAN = tramaCompleta.substring(4, 23);
        String F_AMOUNT_TRANSACTION = tramaCompleta.substring(23, 38);
        String F_AMOUNT_CARDHOLDER_BILLING = tramaCompleta.substring(38, 53);
        String D_TRANSMISSION_DATE_AND_TIME = tramaCompleta.substring(53, 67);
        String N_TRANSMISSION_DATE_AND_TIME = tramaCompleta.substring(53, 67);
        String N_CONV_RATE_CARDHOLDER_BILLING = tramaCompleta.substring(67, 77);
        String N_EXT_MSG_TRACE_NUMBER = tramaCompleta.substring(77, 83);
        String N_CARD_EXPIRES_DATE = tramaCompleta.substring(83, 87);
        String N_MERCHANT_TYPE = tramaCompleta.substring(87, 91);
        String N_ACQ_INSTITUTION_COUNTRY_CODE = tramaCompleta.substring(91, 94);
        String N_ENTRY_MODE = tramaCompleta.substring(94, 97);
        String N_PAN_AND_DATE_ENTRY_MODE_CODE = tramaCompleta.substring(94, 96);
        String S_PIN_ENTRY_CAPABILITY = tramaCompleta.substring(96, 97);
        String N_POINT_OF_SERV_COND_CODE = tramaCompleta.substring(97, 99);
        String N_ACQUIRING_INST_ID_CODE = tramaCompleta.substring(99, 110);
        String N_ACQUIRING_INSTITUTION_ID = tramaCompleta.substring(99, 110);
        String S_AUTH_CODE = tramaCompleta.substring(110, 116);
        String S_RESPONSE_CODE = tramaCompleta.substring(116, 119);
        String S_TERMINAL_ID = tramaCompleta.substring(119, 135);
        String S_CARD_ACCEPT_EXT_ID_CODE = tramaCompleta.substring(135, 150);
        String S_MERCHANT_LEGAL_NAME = tramaCompleta.substring(150, 172);
        String S_MERCHANT_CITY = tramaCompleta.substring(172, 185);
        String S_MERCHANT_COUNTRY = tramaCompleta.substring(185, 187);
        String S_MERCHANT_BRANCH_STATE_CODE = tramaCompleta.substring(187, 190);
        String N_CURRENCY_CODE_TRANSACTION = tramaCompleta.substring(190, 193);
        String N_CURRENCY_CARDHOLDER_BILLING = tramaCompleta.substring(193, 196);
        String S_PCODE = tramaCompleta.substring(196, 202);
        String N_ISSUER_COUNTRY_CODE = tramaCompleta.substring(202, 205);
        String S_ELECT_COMMERCE_INDICATORS = tramaCompleta.substring(205, 206);
        String S_CAPTURE_CHANNEL_INDICATOR = tramaCompleta.substring(206, 208);
        String N_UTC_DATE_AND_TIME = tramaCompleta.substring(208, 222);
        String D_UTC_DATE_AND_TIME = tramaCompleta.substring(208, 222);
        String D_ORIG_TRXS = tramaCompleta.substring(222, 236);
        String N_ORIG_TRXS = tramaCompleta.substring(222, 236);
        String S_BIN = tramaCompleta.substring(236, 244);
        String N_BIN = tramaCompleta.substring(236, 244);
        String S_ENCRYPTED_PAN = tramaCompleta.substring(244, 263);
        String NO_APLICA = tramaCompleta.substring(263, tramaCompleta.length());

        pt.addRow(new Object[]{"N_MTI", "Prueba", N_MTI});
        pt.addRow(new Object[]{"S_PAN", "Prueba", S_PAN});
        pt.addRow(new Object[]{"F_AMOUNT_TRANSACTION", "Prueba", F_AMOUNT_TRANSACTION});
        pt.addRow(new Object[]{"F_AMOUNT_CARDHOLDER_BILLING", "Prueba", F_AMOUNT_CARDHOLDER_BILLING});
        pt.addRow(new Object[]{"D_TRANSMISSION_DATE_AND_TIME", "Prueba", D_TRANSMISSION_DATE_AND_TIME});
        pt.addRow(new Object[]{"N_TRANSMISSION_DATE_AND_TIME", "Prueba", N_TRANSMISSION_DATE_AND_TIME});
        pt.addRow(new Object[]{"N_CONV_RATE_CARDHOLDER_BILLING", "Prueba", N_CONV_RATE_CARDHOLDER_BILLING});
        pt.addRow(new Object[]{"N_EXT_MSG_TRACE_NUMBER", "Prueba", N_EXT_MSG_TRACE_NUMBER});
        pt.addRow(new Object[]{"N_CARD_EXPIRES_DATE", "Prueba", N_CARD_EXPIRES_DATE});
        pt.addRow(new Object[]{"N_MERCHANT_TYPE", "Prueba", N_MERCHANT_TYPE});
        pt.addRow(new Object[]{"N_ACQ_INSTITUTION_COUNTRY_CODE", "Prueba", N_ACQ_INSTITUTION_COUNTRY_CODE});
        pt.addRow(new Object[]{"N_ENTRY_MODE", "Prueba", N_ENTRY_MODE});
        pt.addRow(new Object[]{"N_PAN_AND_DATE_ENTRY_MODE_CODE", "Prueba", N_PAN_AND_DATE_ENTRY_MODE_CODE});
        pt.addRow(new Object[]{"S_PIN_ENTRY_CAPABILITY", "Prueba", S_PIN_ENTRY_CAPABILITY});
        pt.addRow(new Object[]{"N_POINT_OF_SERV_COND_CODE", "Prueba", N_POINT_OF_SERV_COND_CODE});
        pt.addRow(new Object[]{"N_ACQUIRING_INST_ID_CODE", "Prueba", N_ACQUIRING_INST_ID_CODE});
        pt.addRow(new Object[]{"N_ACQUIRING_INSTITUTION_ID", "Prueba", N_ACQUIRING_INSTITUTION_ID});
        pt.addRow(new Object[]{"S_AUTH_CODE", "Prueba", S_AUTH_CODE});
        pt.addRow(new Object[]{"S_RESPONSE_CODE", "Prueba", S_RESPONSE_CODE});
        pt.addRow(new Object[]{"S_TERMINAL_ID", "Prueba", S_TERMINAL_ID});
        pt.addRow(new Object[]{"S_CARD_ACCEPT_EXT_ID_CODE", "Prueba", S_CARD_ACCEPT_EXT_ID_CODE});
        pt.addRow(new Object[]{"S_MERCHANT_LEGAL_NAME", "Prueba", S_MERCHANT_LEGAL_NAME});
        pt.addRow(new Object[]{"S_MERCHANT_CITY", "Prueba", S_MERCHANT_CITY});
        pt.addRow(new Object[]{"S_MERCHANT_COUNTRY", "Prueba", S_MERCHANT_COUNTRY});
        pt.addRow(new Object[]{"S_MERCHANT_BRANCH_STATE_CODE", "Prueba", S_MERCHANT_BRANCH_STATE_CODE});
        pt.addRow(new Object[]{"N_CURRENCY_CODE_TRANSACTION", "Prueba", N_CURRENCY_CODE_TRANSACTION});
        pt.addRow(new Object[]{"N_CURRENCY_CARDHOLDER_BILLING", "Prueba", N_CURRENCY_CARDHOLDER_BILLING});
        pt.addRow(new Object[]{"S_PCODE", "Prueba", S_PCODE});
        pt.addRow(new Object[]{"N_ISSUER_COUNTRY_CODE", "Prueba", N_ISSUER_COUNTRY_CODE});
        pt.addRow(new Object[]{"S_ELECT_COMMERCE_INDICATORS", "Prueba", S_ELECT_COMMERCE_INDICATORS});
        pt.addRow(new Object[]{"S_CAPTURE_CHANNEL_INDICATOR", "Prueba", S_CAPTURE_CHANNEL_INDICATOR});
        pt.addRow(new Object[]{"N_UTC_DATE_AND_TIME", "Prueba", N_UTC_DATE_AND_TIME});
        pt.addRow(new Object[]{"D_UTC_DATE_AND_TIME", "Prueba", D_UTC_DATE_AND_TIME});
        pt.addRow(new Object[]{"D_ORIG_TRXS", "Prueba", D_ORIG_TRXS});
        pt.addRow(new Object[]{"N_ORIG_TRXS", "Prueba", N_ORIG_TRXS});
        pt.addRow(new Object[]{"S_BIN", "Prueba", S_BIN});
        pt.addRow(new Object[]{"N_BIN", "Prueba", N_BIN});
        pt.addRow(new Object[]{"S_ENCRYPTED_PAN", "Prueba", S_ENCRYPTED_PAN});
        pt.addRow(new Object[]{"NO_APLICA", "Prueba", NO_APLICA});


    }//GEN-LAST:event_btnDesglosarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        areaTrama.setText("");
        areaHercules.setText("");
        areaPutty.setText("");
        cajaHexa.setText("");
        cajaIp.setText("");
        cajaPuerto.setText("");
        for (int i = 0; i < tablaTrama.getRowCount(); i++) {
            pt.removeRow(i);
            i -= 1;
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaHercules;
    private javax.swing.JTextArea areaPutty;
    private javax.swing.JTextArea areaTrama;
    private javax.swing.JButton btnDesglosar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField cajaHexa;
    private javax.swing.JTextField cajaIp;
    private javax.swing.JTextField cajaPuerto;
    private javax.swing.JComboBox<String> comboPuerto;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHercules;
    private javax.swing.JLabel lblHexa;
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblPuerto1;
    private javax.swing.JLabel lblPutty;
    private javax.swing.JTable tablaTrama;
    // End of variables declaration//GEN-END:variables
}
