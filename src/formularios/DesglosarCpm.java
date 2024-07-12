
package formularios;

import javax.swing.table.DefaultTableModel;

public class DesglosarCpm extends javax.swing.JInternalFrame {

    DefaultTableModel pt = new DefaultTableModel();

    public DesglosarCpm() {
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
        setTitle("Desglosar TRX CPM");

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
                cajaIp.setText("Pendiente");
                cajaPuerto.setText("Pendiente");
                break;
            case 1:
                cajaIp.setText("Pendiente");
                cajaPuerto.setText("Pendiente");
                break;
            case 2:
                cajaIp.setText("Pendiente");
                cajaPuerto.setText("Pendiente");
                break;
            case 3:
                cajaIp.setText("Pendiente");
                cajaPuerto.setText("Pendiente");
                break;
        }

        String[] rTrama = new String[38];
        for (int i = 0; i < tablaTrama.getRowCount(); i++) {

            rTrama[i] = tablaTrama.getValueAt(i, 2).toString();
        }

        areaHercules.setText(rTrama[0] + rTrama[1] + rTrama[2] + rTrama[3] + rTrama[4] + rTrama[6]
                + rTrama[7] + rTrama[8] + rTrama[9] + rTrama[10] + rTrama[11] + rTrama[12] + rTrama[13] + rTrama[14]
                + rTrama[15] + rTrama[16] + rTrama[17] + rTrama[19] + rTrama[21] + rTrama[22]
                + rTrama[23] + rTrama[24] + rTrama[25] + rTrama[26] + rTrama[27] + rTrama[28] + rTrama[29] + rTrama[30]
                + rTrama[31] + rTrama[32] + rTrama[33] + rTrama[34] + rTrama[36]);

        String longitud = areaTrama.getText();
        System.out.println(longitud.length());
        int decimales = longitud.length();
        String hexadecimal = Integer.toHexString(decimales);
        cajaHexa.setText("0" + hexadecimal + "0000");
        String[] nuevoHexa = hexadecimal.split("");
        String hexa1 = "0" + nuevoHexa[0];
        String hexa2 = nuevoHexa[1] + nuevoHexa[2];

        areaPutty.setText("(echo -n -e \"\\x" + hexa1 + "\\x" + hexa2 + "\\x00" + "\\x00" + rTrama[0] + rTrama[1] + rTrama[2] + rTrama[3] + rTrama[4] + rTrama[6]
                + rTrama[7] + rTrama[8] + rTrama[9] + rTrama[10] + rTrama[11] + rTrama[12] + rTrama[13] + rTrama[14]
                + rTrama[15] + rTrama[16] + rTrama[17] + rTrama[19] + rTrama[21] + rTrama[22]
                + rTrama[23] + rTrama[24] + rTrama[25] + rTrama[26] + rTrama[27] + rTrama[28] + rTrama[29] + rTrama[30]
                + rTrama[31] + rTrama[32] + rTrama[33] + rTrama[34] + rTrama[36] + "\"; sleep 5) | timeout 5 nc localhost " + cajaPuerto.getText());
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnDesglosarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesglosarActionPerformed

        String tramaCompleta = areaTrama.getText();

        String N_MTI = tramaCompleta.substring(0, 4);
        String S_PAN = tramaCompleta.substring(4, 23);
        String F_AMOUNT_TRANSACTION = tramaCompleta.substring(23, 38);
        String F_AMOUNT_CARDHOLDER_BILLING = tramaCompleta.substring(38, 53);
        String D_TRANSMISSION_DATE_AND_TIME = tramaCompleta.substring(53, 67);
        String N_TRANSMISSION_DATE_AND_TIME = tramaCompleta.substring(53, 67);
        String S_FILL_N_DATE = tramaCompleta.substring(67, 81);
        String N_CONV_RATE_CARDHOLER = tramaCompleta.substring(81, 91);
        String N_EXT_MSG_TRACE_NUMBER = tramaCompleta.substring(91, 97);
        String N_MERCHANT_TYPE = tramaCompleta.substring(97, 101);
        String N_ACQ_INSTITUTION_COUNTRY_CODE = tramaCompleta.substring(101, 104);
        String N_ENTRY_MODE = tramaCompleta.substring(104, 107);
        String N_POINT_OF_SERV_COND_CODE = tramaCompleta.substring(107, 109);
        String S_ACQUIRING_INST_ID_CODE = tramaCompleta.substring(109, 120);
        String S_AUTH_CODE = tramaCompleta.substring(120, 126);
        String S_RESPONSE_CODE = tramaCompleta.substring(126, 129);
        String S_TERMINAL_ID = tramaCompleta.substring(129, 145);
        String S_CARD_ACCEPT_EXT_ID_CODE = tramaCompleta.substring(145, 160);
        String S_MERCHANT_NAME_AND_LOCATION = tramaCompleta.substring(149, 189);
        String S_MERCHANT_LEGAL_NAME = tramaCompleta.substring(160, 182);
        String S_MERCHANT_LEGAL_NAME_NEW = tramaCompleta.substring(160, 200);
        String S_MERCHANT_CITY = tramaCompleta.substring(182, 195);
        String S_MERCHANT_COUNTRY = tramaCompleta.substring(195, 197);
        String S_MERCHANT_BRANCH_STATE_CODE = tramaCompleta.substring(197, 200);
        String N_CURRENCY_CODE_TRANSACTION = tramaCompleta.substring(200, 203);
        String N_CURRENCY_CARDHOLDER_BILLING = tramaCompleta.substring(203, 206);
        String S_PCODE = tramaCompleta.substring(206, 212);
        String S_ISSUER_COUNTRY = tramaCompleta.substring(212, 215);
        String N_DOCUMENT_TYPE = tramaCompleta.substring(215, 218);
        String S_CUSTOMER_ID = tramaCompleta.substring(218, 238);
        String N_ID_ACCOUNT = tramaCompleta.substring(238, 257);
        String MEDIO = tramaCompleta.substring(257, 539);
        String S_ENCRYPTED_PAN = tramaCompleta.substring(539, 558);
        String N_ID_ISSUER_PRODUCT = tramaCompleta.substring(558, 563);
        String N_BIN = tramaCompleta.substring(563, 571);
        String S_BIN = tramaCompleta.substring(563, 571);
        String NO_APLICA = tramaCompleta.substring(571, tramaCompleta.length());

        pt.addRow(new Object[]{"N_MTI", "Prueba", N_MTI});
        pt.addRow(new Object[]{"S_PAN", "Prueba", S_PAN});
        pt.addRow(new Object[]{"F_AMOUNT_TRANSACTION", "Prueba", F_AMOUNT_TRANSACTION});
        pt.addRow(new Object[]{"F_AMOUNT_CARDHOLDER_BILLING", "Prueba", F_AMOUNT_CARDHOLDER_BILLING});
        pt.addRow(new Object[]{"D_TRANSMISSION_DATE_AND_TIME", "Prueba", D_TRANSMISSION_DATE_AND_TIME});
        pt.addRow(new Object[]{"N_TRANSMISSION_DATE_AND_TIME", "Prueba", N_TRANSMISSION_DATE_AND_TIME});
        pt.addRow(new Object[]{"S_FILL_N_DATE", "Prueba", S_FILL_N_DATE});
        pt.addRow(new Object[]{"N_CONV_RATE_CARDHOLER", "Prueba", N_CONV_RATE_CARDHOLER});
        pt.addRow(new Object[]{"N_EXT_MSG_TRACE_NUMBER", "Prueba", N_EXT_MSG_TRACE_NUMBER});
        pt.addRow(new Object[]{"N_MERCHANT_TYPE", "Prueba", N_MERCHANT_TYPE});
        pt.addRow(new Object[]{"N_ACQ_INSTITUTION_COUNTRY_CODE", "Prueba", N_ACQ_INSTITUTION_COUNTRY_CODE});
        pt.addRow(new Object[]{"N_ENTRY_MODE", "Prueba", N_ENTRY_MODE});
        pt.addRow(new Object[]{"N_POINT_OF_SERV_COND_CODE", "Prueba", N_POINT_OF_SERV_COND_CODE});
        pt.addRow(new Object[]{"S_ACQUIRING_INST_ID_CODE", "Prueba", S_ACQUIRING_INST_ID_CODE});
        pt.addRow(new Object[]{"S_AUTH_CODE", "Prueba", S_AUTH_CODE});
        pt.addRow(new Object[]{"S_RESPONSE_CODE", "Prueba", S_RESPONSE_CODE});
        pt.addRow(new Object[]{"S_TERMINAL_ID", "Prueba", S_TERMINAL_ID});
        pt.addRow(new Object[]{"S_CARD_ACCEPT_EXT_ID_CODE", "Prueba", S_CARD_ACCEPT_EXT_ID_CODE});
        pt.addRow(new Object[]{"S_MERCHANT_NAME_AND_LOCATION", "Prueba", S_MERCHANT_NAME_AND_LOCATION});
        pt.addRow(new Object[]{"S_MERCHANT_LEGAL_NAME", "Prueba", S_MERCHANT_LEGAL_NAME});
        pt.addRow(new Object[]{"S_MERCHANT_LEGAL_NAME_NEW", "Prueba", S_MERCHANT_LEGAL_NAME_NEW});
        pt.addRow(new Object[]{"S_MERCHANT_CITY", "Prueba", S_MERCHANT_CITY});
        pt.addRow(new Object[]{"S_MERCHANT_COUNTRY", "Prueba", S_MERCHANT_COUNTRY});
        pt.addRow(new Object[]{"S_MERCHANT_BRANCH_STATE_CODE", "Prueba", S_MERCHANT_BRANCH_STATE_CODE});
        pt.addRow(new Object[]{"N_CURRENCY_CODE_TRANSACTION", "Prueba", N_CURRENCY_CODE_TRANSACTION});
        pt.addRow(new Object[]{"N_CURRENCY_CARDHOLDER_BILLING", "Prueba", N_CURRENCY_CARDHOLDER_BILLING});
        pt.addRow(new Object[]{"S_PCODE", "Prueba", S_PCODE});
        pt.addRow(new Object[]{"S_ISSUER_COUNTRY", "Prueba", S_ISSUER_COUNTRY});
        pt.addRow(new Object[]{"N_DOCUMENT_TYPE", "Prueba", N_DOCUMENT_TYPE});
        pt.addRow(new Object[]{"S_CUSTOMER_ID", "Prueba", S_CUSTOMER_ID});
        pt.addRow(new Object[]{"N_ID_ACCOUNT", "Prueba", N_ID_ACCOUNT});
        pt.addRow(new Object[]{"MEDIO", "Prueba", MEDIO});
        pt.addRow(new Object[]{"S_ENCRYPTED_PAN", "Prueba", S_ENCRYPTED_PAN});
        pt.addRow(new Object[]{"N_ID_ISSUER_PRODUCT", "Prueba", N_ID_ISSUER_PRODUCT});
        pt.addRow(new Object[]{"N_BIN", "Prueba", N_BIN});
        pt.addRow(new Object[]{"S_BIN", "Prueba", S_BIN});
        pt.addRow(new Object[]{"NO_APLICA", "Prueba", NO_APLICA});


    }//GEN-LAST:event_btnDesglosarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        areaTrama.setText("");
        areaHercules.setText("");
        areaPutty.setText("");
        cajaHexa.setText("");
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
