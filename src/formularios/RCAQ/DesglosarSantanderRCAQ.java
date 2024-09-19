package formularios.RCAQ;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DesglosarSantanderRCAQ extends javax.swing.JInternalFrame {

    DefaultTableModel pt = new DefaultTableModel();

    public DesglosarSantanderRCAQ() {
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
        setTitle("Desglosar TRX Santander Chile");

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
            String S_SEGMENT = tramaCompleta.substring(236, 244);
            String S_SALE_PLAN_DESCRIPTION = tramaCompleta.substring(244, 304);
            String N_ID_TRADEMARK = tramaCompleta.substring(304, 305);
            String N_PRODUCT_TYPE = tramaCompleta.substring(305, 306);
            String S_CARDHOLDER_IP_ADDRESS = tramaCompleta.substring(306, 345);
            String F_TIP_AMOUNT = tramaCompleta.substring(345, 360);
            String F_OTHER_AMOUNT = tramaCompleta.substring(360, 375);
            String N_TRANSACTION_PROFILE = tramaCompleta.substring(375, 377);
            String S_BIN = tramaCompleta.substring(377, 385);
            String N_BIN = tramaCompleta.substring(377, 385);
            String S_ENCRYPTED_PAN = tramaCompleta.substring(385, 404);

            pt.addRow(new Object[]{"N_MTI", "Tipo de mensaje", N_MTI});
            pt.addRow(new Object[]{"S_PAN", "Número de Tarjeta", S_PAN});
            pt.addRow(new Object[]{"F_AMOUNT_TRANSACTION", "Monto de la Transacción", F_AMOUNT_TRANSACTION});
            pt.addRow(new Object[]{"F_AMOUNT_CARDHOLDER_BILLING", "Valor de la transacción en la moneda de origen", F_AMOUNT_CARDHOLDER_BILLING});
            pt.addRow(new Object[]{"D_TRANSMISSION_DATE_AND_TIME", "Fecha de la Transacción", D_TRANSMISSION_DATE_AND_TIME});
            pt.addRow(new Object[]{"N_TRANSMISSION_DATE_AND_TIME", "Fecha de la Transacción formato numérico", N_TRANSMISSION_DATE_AND_TIME});
            pt.addRow(new Object[]{"N_CONV_RATE_CARDHOLDER_BILLING", "Tasa de conversión, facturación del titular de la tarjeta", N_CONV_RATE_CARDHOLDER_BILLING});
            pt.addRow(new Object[]{"N_EXT_MSG_TRACE_NUMBER", "Número de Transacción", N_EXT_MSG_TRACE_NUMBER});
            pt.addRow(new Object[]{"N_CARD_EXPIRES_DATE", "Fecha expiración tarjeta ", N_CARD_EXPIRES_DATE});
            pt.addRow(new Object[]{"N_MERCHANT_TYPE", "Código categoría comercio - MCC", N_MERCHANT_TYPE});
            pt.addRow(new Object[]{"N_ACQ_INSTITUTION_COUNTRY_CODE", "Código de país adquirente", N_ACQ_INSTITUTION_COUNTRY_CODE});
            pt.addRow(new Object[]{"N_ENTRY_MODE", "Modo de Entrada y Capacidad de Pin", N_ENTRY_MODE});
            pt.addRow(new Object[]{"N_PAN_AND_DATE_ENTRY_MODE_CODE", "Modo de Entrada", N_PAN_AND_DATE_ENTRY_MODE_CODE});
            pt.addRow(new Object[]{"S_PIN_ENTRY_CAPABILITY", "Capacidad del POS de entrada de PIN", S_PIN_ENTRY_CAPABILITY});
            pt.addRow(new Object[]{"N_POINT_OF_SERV_COND_CODE", "Código de Condición de punto de servicio", N_POINT_OF_SERV_COND_CODE});
            pt.addRow(new Object[]{"N_ACQUIRING_INST_ID_CODE", "Código de la red de Origen", N_ACQUIRING_INST_ID_CODE});
            pt.addRow(new Object[]{"N_ACQUIRING_INSTITUTION_ID", "Institución adquirente", N_ACQUIRING_INSTITUTION_ID});
            pt.addRow(new Object[]{"S_AUTH_CODE", "Código de autorización", S_AUTH_CODE});
            pt.addRow(new Object[]{"S_RESPONSE_CODE", "Código de motivo de respuesta", S_RESPONSE_CODE});
            pt.addRow(new Object[]{"S_TERMINAL_ID", "Identificacion del terminal", S_TERMINAL_ID});
            pt.addRow(new Object[]{"S_CARD_ACCEPT_EXT_ID_CODE", "Identificador de comercio", S_CARD_ACCEPT_EXT_ID_CODE});
            pt.addRow(new Object[]{"S_MERCHANT_LEGAL_NAME", "Nombre Legal del Comercio", S_MERCHANT_LEGAL_NAME});
            pt.addRow(new Object[]{"S_MERCHANT_CITY", "Ciudad Comercio", S_MERCHANT_CITY});
            pt.addRow(new Object[]{"S_MERCHANT_COUNTRY", "Pais Comercio", S_MERCHANT_COUNTRY});
            pt.addRow(new Object[]{"S_MERCHANT_BRANCH_STATE_CODE", "Region Comercio", S_MERCHANT_BRANCH_STATE_CODE});
            pt.addRow(new Object[]{"N_CURRENCY_CODE_TRANSACTION", "Código Moneda de origen", N_CURRENCY_CODE_TRANSACTION});
            pt.addRow(new Object[]{"N_CURRENCY_CARDHOLDER_BILLING", "Código de Moneda", N_CURRENCY_CARDHOLDER_BILLING});
            pt.addRow(new Object[]{"S_PCODE", "Código de Procesamiento", S_PCODE});
            pt.addRow(new Object[]{"N_ISSUER_COUNTRY_CODE", "Código de país emisor", N_ISSUER_COUNTRY_CODE});
            pt.addRow(new Object[]{"S_ELECT_COMMERCE_INDICATORS", "Indicador electrónico de seguridad", S_ELECT_COMMERCE_INDICATORS});
            pt.addRow(new Object[]{"S_CAPTURE_CHANNEL_INDICATOR", "Indicador de canal de captura", S_CAPTURE_CHANNEL_INDICATOR});
            pt.addRow(new Object[]{"N_UTC_DATE_AND_TIME", "Fecha de la transacción unificada en el horario UTC (numérico)", N_UTC_DATE_AND_TIME});
            pt.addRow(new Object[]{"D_UTC_DATE_AND_TIME", "Fecha de la transacción unificada en el horario UTC", D_UTC_DATE_AND_TIME});
            pt.addRow(new Object[]{"D_ORIG_TRXS", "Fecha de origen de la transacción", D_ORIG_TRXS});
            pt.addRow(new Object[]{"N_ORIG_TRXS", "Fecha de origen de la transacción (numérico)", N_ORIG_TRXS});
            pt.addRow(new Object[]{"S_SEGMENT", "Segmento de comercio", S_SEGMENT});
            pt.addRow(new Object[]{"S_SALE_PLAN_DESCRIPTION", "Plan de Venta", S_SALE_PLAN_DESCRIPTION});
            pt.addRow(new Object[]{"N_ID_TRADEMARK", "Marca", N_ID_TRADEMARK});
            pt.addRow(new Object[]{"N_PRODUCT_TYPE", "Producto", N_PRODUCT_TYPE});
            pt.addRow(new Object[]{"S_CARDHOLDER_IP_ADDRESS", "Ip de la transacción no presencial", S_CARDHOLDER_IP_ADDRESS});
            pt.addRow(new Object[]{"F_TIP_AMOUNT", "Monto de propina", F_TIP_AMOUNT});
            pt.addRow(new Object[]{"F_OTHER_AMOUNT", "Monto de vuelto", F_OTHER_AMOUNT});
            pt.addRow(new Object[]{"N_TRANSACTION_PROFILE", "Tipo de Transacción", N_TRANSACTION_PROFILE});
            pt.addRow(new Object[]{"S_BIN", "Bin de la Tarjeta alfanumérico", S_BIN});
            pt.addRow(new Object[]{"N_BIN", "Bin de la Tarjeta", N_BIN});
            pt.addRow(new Object[]{"S_ENCRYPTED_PAN", "Numero de Tarjeta Encriptado", S_ENCRYPTED_PAN});
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
