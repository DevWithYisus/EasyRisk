
package formularios.RCIN;

import formularios.*;
import javax.swing.table.DefaultTableModel;

public class DesglosarCpmRCIN extends javax.swing.JInternalFrame {

    DefaultTableModel pt = new DefaultTableModel();

    public DesglosarCpmRCIN() {
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
        btnDesglosar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
