package formularios.RCIN;

import formularios.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DesglosarPAYERCIN extends javax.swing.JInternalFrame {

    DefaultTableModel pt = new DefaultTableModel();

    public DesglosarPAYERCIN() {
        initComponents();

        String[] columnas = {"TAG", "DESCRIPCIÓN", "VALOR"};

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
        btnDesglosar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Desglosar TRX PAYE (CPM,SUMUP,SEARS)");

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(22, 22, 22))))
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
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        areaTrama.setText("");
        for (int i = 0; i < tablaTrama.getRowCount(); i++) {
            pt.removeRow(i);
            i -= 1;
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDesglosarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesglosarActionPerformed

        try {
            String tramaCompleta = areaTrama.getText();

            String N_MTI = tramaCompleta.substring(0, 4);
            String S_ENCRYPTED_PAN = tramaCompleta.substring(4, 23);
            String N_ID_ISSUER_PRODUCT = tramaCompleta.substring(23, 28);
            String N_BIN = tramaCompleta.substring(28, 36);
            String S_BIN = tramaCompleta.substring(28, 36);
            String S_PAN = tramaCompleta.substring(36, 55);
            String F_AMOUNT_TRANSACTION = tramaCompleta.substring(55, 70);
            String F_AMOUNT_CARDHOLDER_BILLING = tramaCompleta.substring(70, 85);
            String D_TRANSMISSION_DATE_AND_TIME = tramaCompleta.substring(85, 99);
            String N_TRANSMISSION_DATE_AND_TIME = tramaCompleta.substring(85, 99);
            String N_CONV_RATE_CARDHOLDER_BILLING = tramaCompleta.substring(113, 123);
            String N_EXT_MSG_TRACE_NUMBER = tramaCompleta.substring(123, 129);
            String N_MERCHANT_TYPE = tramaCompleta.substring(129, 133);
            String N_ACQ_INSTITUTION_COUNTRY_CODE = tramaCompleta.substring(133, 136);
            String N_PAN_AND_DATE_ENTRY_MODE_CODE = tramaCompleta.substring(136, 138);
            String N_ENTRY_MODE = tramaCompleta.substring(136, 139);
            String S_PIN_ENTRY_CAPABILITY = tramaCompleta.substring(138, 139);
            String N_POINT_OF_SERV_COND_CODE = tramaCompleta.substring(139, 141);
            String N_ACQUIRING_INST_ID_CODE = tramaCompleta.substring(141, 152);
            String S_AUTH_CODE = tramaCompleta.substring(152, 158);
            String S_RESPONSE_CODE = tramaCompleta.substring(158, 161);
            String S_TERMINAL_ID = tramaCompleta.substring(161, 177);
            String S_CARD_ACCEPT_EXT_ID_CODE = tramaCompleta.substring(177, 192);
            String S_MERCHANT_NAME_AND_LOCATION = tramaCompleta.substring(181, 221);
            String S_MERCHANT_LEGAL_NAME = tramaCompleta.substring(192, 214);
            String S_MERCHANT_LEGAL_NAME_NEW = tramaCompleta.substring(192, 214);
            String S_MERCHANT_CITY = tramaCompleta.substring(214, 227);
            String S_MERCHANT_COUNTRY = tramaCompleta.substring(227, 229);
            String S_MERCHANT_BRANCH_STATE_CODE = tramaCompleta.substring(229, 232);
            String N_CURRENCY_CODE_TRANSACTION = tramaCompleta.substring(232, 235);
            String N_CURRENCY_CARDHOLDER_BILLING = tramaCompleta.substring(235, 238);
            String S_PCODE = tramaCompleta.substring(238, 244);
            String S_ISSUER_COUNTRY = tramaCompleta.substring(244, 247);
            String N_DOCUMENT_TYPE = tramaCompleta.substring(247, 250);
            String S_CUSTOMER_ID = tramaCompleta.substring(250, 270);
            String N_ID_ACCOUNT = tramaCompleta.substring(270, 289);
            String N_ISS_FIRST_EVAL_RULE_ID = tramaCompleta.substring(289, 309);
            String S_ISS_FIRST_EVAL_RULE_DESCRIPTION = tramaCompleta.substring(309, 559);
            String S_RISK_RESPONSE_CODE = tramaCompleta.substring(559, 563);
            String N_RISK_SCORE = tramaCompleta.substring(563, 571);
            String S_MASTERCARD_RISK_SCORE = tramaCompleta.substring(571, 574);
            String S_MASTERCARD_RISK_SCORE_REASON_CODE = tramaCompleta.substring(574, 576);
            String S_MASTERCARD_RISK_RULE_ADJUSTED_SCORE = tramaCompleta.substring(576, 579);
            String S_MASTERCARD_RULE_REASON_CODE_1 = tramaCompleta.substring(579, 581);
            String S_MASTERCARD_RULE_REASON_CODE_2 = tramaCompleta.substring(581, 583);
            String S_ECI = tramaCompleta.substring(583, 585);
            String N_MC_OBS_SERVICE = tramaCompleta.substring(585, 587);
            String S_MC_OBS_RESULT = tramaCompleta.substring(587, 588);

            pt.addRow(new Object[]{"N_MTI", "Tipo de mensaje", N_MTI});
            pt.addRow(new Object[]{"S_ENCRYPTED_PAN", "Numero de Tarjeta Encriptado", S_ENCRYPTED_PAN});
            pt.addRow(new Object[]{"N_ID_ISSUER_PRODUCT", "Id Producto", N_ID_ISSUER_PRODUCT});
            pt.addRow(new Object[]{"N_BIN", "Bin de la Tarjeta", N_BIN});
            pt.addRow(new Object[]{"S_BIN", "Bin de la Tarjeta alfanumérico", S_BIN});
            pt.addRow(new Object[]{"S_PAN", "Número de Tarjeta", S_PAN});
            pt.addRow(new Object[]{"F_AMOUNT_TRANSACTION", "Valor de la transacción en la moneda de origen", F_AMOUNT_TRANSACTION});
            pt.addRow(new Object[]{"F_AMOUNT_CARDHOLDER_BILLING", "Monto de la Transacción", F_AMOUNT_CARDHOLDER_BILLING});
            pt.addRow(new Object[]{"D_TRANSMISSION_DATE_AND_TIME", "Fecha de la Transacción", D_TRANSMISSION_DATE_AND_TIME});
            pt.addRow(new Object[]{"N_TRANSMISSION_DATE_AND_TIME", "Fecha de la Transacción formato numérico", N_TRANSMISSION_DATE_AND_TIME});
            pt.addRow(new Object[]{"N_CONV_RATE_CARDHOLDER_BILLING", "Tasa de conversión, facturación del titular de la tarjeta", N_CONV_RATE_CARDHOLDER_BILLING});
            pt.addRow(new Object[]{"N_EXT_MSG_TRACE_NUMBER", "Número de Transacción", N_EXT_MSG_TRACE_NUMBER});
            pt.addRow(new Object[]{"N_MERCHANT_TYPE", "Código categoría comercio - MCC", N_MERCHANT_TYPE});
            pt.addRow(new Object[]{"N_ACQ_INSTITUTION_COUNTRY_CODE", "Código de país adquirente", N_ACQ_INSTITUTION_COUNTRY_CODE});
            pt.addRow(new Object[]{"N_PAN_AND_DATE_ENTRY_MODE_CODE", "Modo de Entrada", N_PAN_AND_DATE_ENTRY_MODE_CODE});
            pt.addRow(new Object[]{"N_ENTRY_MODE", "Modo de Entrada y Capacidad de Pin", N_ENTRY_MODE});
            pt.addRow(new Object[]{"S_PIN_ENTRY_CAPABILITY", "Capacidad del POS de entrada de PIN", S_PIN_ENTRY_CAPABILITY});
            pt.addRow(new Object[]{"N_POINT_OF_SERV_COND_CODE", "Código de Condición de punto de servicio", N_POINT_OF_SERV_COND_CODE});
            pt.addRow(new Object[]{"N_ACQUIRING_INST_ID_CODE", "Código de la red de Origen", N_ACQUIRING_INST_ID_CODE});
            pt.addRow(new Object[]{"S_AUTH_CODE", "Código de autorización", S_AUTH_CODE});
            pt.addRow(new Object[]{"S_RESPONSE_CODE", "Código de motivo de respuesta", S_RESPONSE_CODE});
            pt.addRow(new Object[]{"S_TERMINAL_ID", "Identificacion del terminal", S_TERMINAL_ID});
            pt.addRow(new Object[]{"S_CARD_ACCEPT_EXT_ID_CODE", "Identificador de comercio", S_CARD_ACCEPT_EXT_ID_CODE});
            pt.addRow(new Object[]{"S_MERCHANT_NAME_AND_LOCATION", "Nombre y Localización del Comercio", S_MERCHANT_NAME_AND_LOCATION});
            pt.addRow(new Object[]{"S_MERCHANT_LEGAL_NAME", "Nombre del comercio", S_MERCHANT_LEGAL_NAME});
            pt.addRow(new Object[]{"S_MERCHANT_LEGAL_NAME_NEW", "Nombre del comercio", S_MERCHANT_LEGAL_NAME_NEW});
            pt.addRow(new Object[]{"S_MERCHANT_CITY", "Ciudad comercio", S_MERCHANT_CITY});
            pt.addRow(new Object[]{"S_MERCHANT_COUNTRY", "País comercio", S_MERCHANT_COUNTRY});
            pt.addRow(new Object[]{"S_MERCHANT_BRANCH_STATE_CODE", "Region Comercio", S_MERCHANT_BRANCH_STATE_CODE});
            pt.addRow(new Object[]{"N_CURRENCY_CODE_TRANSACTION", "Código Moneda de origen", N_CURRENCY_CODE_TRANSACTION});
            pt.addRow(new Object[]{"N_CURRENCY_CARDHOLDER_BILLING", "Código de Moneda", N_CURRENCY_CARDHOLDER_BILLING});
            pt.addRow(new Object[]{"S_PCODE", "Código de procesamiento", S_PCODE});
            pt.addRow(new Object[]{"S_ISSUER_COUNTRY", "Pais del emisor", S_ISSUER_COUNTRY});
            pt.addRow(new Object[]{"N_DOCUMENT_TYPE", "Tipo de Identificación", N_DOCUMENT_TYPE});
            pt.addRow(new Object[]{"S_CUSTOMER_ID", "Id Cliente Externo", S_CUSTOMER_ID});
            pt.addRow(new Object[]{"N_ID_ACCOUNT", "Número de cuenta", N_ID_ACCOUNT});
            pt.addRow(new Object[]{"N_ISS_FIRST_EVAL_RULE_ID", "Id de la Regla RT", N_ISS_FIRST_EVAL_RULE_ID});
            pt.addRow(new Object[]{"S_ISS_FIRST_EVAL_RULE_DESCRIPTION", "Descripción de la Regla RT", S_ISS_FIRST_EVAL_RULE_DESCRIPTION});
            pt.addRow(new Object[]{"S_RISK_RESPONSE_CODE", "Código de respuesta RT", S_RISK_RESPONSE_CODE});
            pt.addRow(new Object[]{"N_RISK_SCORE", "Score RT", N_RISK_SCORE});
            pt.addRow(new Object[]{"S_MASTERCARD_RISK_SCORE", "Mastercard Fraud Score", S_MASTERCARD_RISK_SCORE});
            pt.addRow(new Object[]{"S_MASTERCARD_RISK_SCORE_REASON_CODE", "Mastercard Score Reason Code", S_MASTERCARD_RISK_SCORE_REASON_CODE});
            pt.addRow(new Object[]{"S_MASTERCARD_RISK_RULE_ADJUSTED_SCORE", "Mastercard Rule Adjusted Score", S_MASTERCARD_RISK_RULE_ADJUSTED_SCORE});
            pt.addRow(new Object[]{"S_MASTERCARD_RULE_REASON_CODE_1", "Mastercard Rule Reason Code 1", S_MASTERCARD_RULE_REASON_CODE_1});
            pt.addRow(new Object[]{"S_MASTERCARD_RULE_REASON_CODE_2", "Mastercard Rule Reason Code 2", S_MASTERCARD_RULE_REASON_CODE_2});
            pt.addRow(new Object[]{"S_ECI", "Indicador de comercio - Token EC", S_ECI});
            pt.addRow(new Object[]{"N_MC_OBS_SERVICE", "Mastercard OBS Service", N_MC_OBS_SERVICE});
            pt.addRow(new Object[]{"S_MC_OBS_RESULT", "Mastercard OBS Result", S_MC_OBS_RESULT});

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique la trama ingresada");
        }


    }//GEN-LAST:event_btnDesglosarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTrama;
    private javax.swing.JButton btnDesglosar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaTrama;
    // End of variables declaration//GEN-END:variables
}
