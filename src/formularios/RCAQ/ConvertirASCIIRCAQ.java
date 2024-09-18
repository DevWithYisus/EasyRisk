package formularios.RCAQ;

import formularios.RCIN.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Calendar;

import java.util.Formatter;
import javax.swing.JOptionPane;

public class ConvertirASCIIRCAQ extends javax.swing.JInternalFrame {

    public ConvertirASCIIRCAQ() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        cajaValor = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cajaFecha = new com.toedter.calendar.JDateChooser();
        cajaHora = new com.toedter.components.JSpinField();
        cajaMinuto = new com.toedter.components.JSpinField();
        cajaSegundo = new com.toedter.components.JSpinField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboPuerto = new javax.swing.JComboBox<>();
        lblValor2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTrama = new javax.swing.JTextArea();
        lblHercules1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaHercules = new javax.swing.JTextArea();
        lblHercules = new javax.swing.JLabel();
        lblPuerto1 = new javax.swing.JLabel();
        cajaIp = new javax.swing.JTextField();
        cajaPuerto = new javax.swing.JTextField();
        lblPuerto = new javax.swing.JLabel();
        lblHexa = new javax.swing.JLabel();
        cajaHexa = new javax.swing.JTextField();
        btnCopiarHercules1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Convertir Tramas ASCII - RCAQ");
        setMaximumSize(new java.awt.Dimension(950, 600));
        setMinimumSize(new java.awt.Dimension(950, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setText("Fecha De La Transaccion:");

        lblHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHora.setText("Hora De La Transacción:");

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor.setText("Valor De La Transacción:");

        cajaValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnConvertir.setBackground(new java.awt.Color(255, 102, 0));
        btnConvertir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConvertir.setText("Convertir Trama");
        btnConvertir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 102, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cajaHora.setMaximum(23);
        cajaHora.setMinimum(0);

        cajaMinuto.setMaximum(59);
        cajaMinuto.setMinimum(0);

        cajaSegundo.setMaximum(59);
        cajaSegundo.setMinimum(0);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Horas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Minutos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Segundos");

        comboPuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RCAQ - CERT01", "RCAQ - CERT02" }));

        lblValor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor2.setText("Instancia/Ambiente:");

        areaTrama.setColumns(20);
        areaTrama.setRows(5);
        jScrollPane2.setViewportView(areaTrama);

        lblHercules1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHercules1.setText("Ingrese una trama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(lblHercules1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor)
                            .addComponent(lblFecha))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(29, 29, 29))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHora)
                                        .addGap(18, 18, 18)
                                        .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cajaMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cajaSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor2)
                                .addGap(47, 47, 47)
                                .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblHercules1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora)
                            .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha))
                        .addGap(2, 2, 2)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValor)
                        .addComponent(cajaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValor2)
                        .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConvertir)
                    .addComponent(btnLimpiar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        areaHercules.setColumns(20);
        areaHercules.setLineWrap(true);
        areaHercules.setRows(5);
        jScrollPane1.setViewportView(areaHercules);

        lblHercules.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHercules.setText("Trama Hercules");

        lblPuerto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuerto1.setText("IP:");

        lblPuerto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuerto.setText("Puerto:");

        lblHexa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHexa.setText("Valor Hexadecimal:");

        cajaHexa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnCopiarHercules1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarHercules1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portapapeles.png"))); // NOI18N
        btnCopiarHercules1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarHercules1.setMaximumSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules1.setMinimumSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules1.setPreferredSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarHercules1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCopiarHercules1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326)
                        .addComponent(lblHercules))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblPuerto1)
                            .addGap(38, 38, 38)
                            .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(84, 84, 84)
                            .addComponent(lblPuerto)
                            .addGap(28, 28, 28)
                            .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(lblHexa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuerto1)
                    .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHexa)
                    .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuerto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHercules)
                    .addComponent(btnCopiarHercules1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed

        try {

            String tramaCompleta = areaTrama.getText();

            if (tramaCompleta.length() <= 25) {
                JOptionPane.showMessageDialog(null, "Ingrese una trama para convertir");
            }

            String mti = tramaCompleta.substring(0, 4);
            String encriptado = tramaCompleta.substring(10,18);
            String bin = tramaCompleta.substring(377, 385);
            String tarjeta = tramaCompleta.substring(16, 23);
            String parteFinal = tramaCompleta.substring(67, tramaCompleta.length());

            Formatter obj = new Formatter();
            Calendar calendario = cajaFecha.getCalendar();
            int dia = calendario.get(Calendar.DATE);
            int mes = calendario.get(Calendar.MONTH) + 1;
            int año = calendario.get(Calendar.YEAR);
            String mesCompleto = String.valueOf(obj.format("%02d", mes));
            String diaCompleto = String.valueOf(obj.format("%02d", dia));
            String fecha = año + "" + diaCompleto;

            obj = new Formatter();
            int horas = cajaHora.getValue();
            String horaCompleto = String.valueOf(obj.format("%02d", horas));
            int min = cajaMinuto.getValue();
            String minCompleto = String.valueOf(obj.format("%02d", min));
            int seg = cajaSegundo.getValue();
            String segCompleto = String.valueOf(obj.format("%02d", seg));
            String hora = segCompleto + "";

            String dataValor = cajaValor.getText().trim();
            String[] valores = dataValor.split(",");

            dataValor = valores[0] + valores[1];

            int numero = Integer.parseInt(dataValor);

            // dejar la longitud exacta para la trama
            obj = new Formatter();
            String montoTotal = String.valueOf(obj.format("%015d", numero));
            String valor = montoTotal;
            String valor2 = montoTotal;

            switch (comboPuerto.getSelectedIndex()) {
                case 0:
                    cajaIp.setText("10.195.16.7");
                    cajaPuerto.setText("6100");
                    break;
                case 1:
                    cajaIp.setText("10.195.16.22");
                    cajaPuerto.setText("6080");
                    break;
            }
            
            if (encriptado.equals("********")) {
                tarjeta = tramaCompleta.substring(18, 23);
                areaHercules.setText(mti + bin + "123456" +  tarjeta + valor + valor2 + fecha + hora + parteFinal);
            }else {
                areaHercules.setText(mti + bin + "1234" +  tarjeta + valor + valor2 + fecha + hora + parteFinal);
            }

            

            String longitud = areaHercules.getText();
            System.out.println(longitud.length());
            int decimales = longitud.length();
            String hexadecimal = Integer.toHexString(decimales);
            cajaHexa.setText("0" + hexadecimal);
            String[] nuevoHexa = hexadecimal.split("");
            String hexa1 = "0" + nuevoHexa[0];
            String hexa2 = nuevoHexa[1] + nuevoHexa[2];

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los datos",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cajaFecha.setDate(null);
        cajaValor.setText("");
        cajaHora.setValue(0);
        cajaMinuto.setValue(0);
        cajaSegundo.setValue(0);
        cajaHexa.setText("");
        areaHercules.setText("");
        cajaIp.setText("");
        cajaPuerto.setText("");
        comboPuerto.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCopiarHercules1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarHercules1ActionPerformed

        String alert = areaHercules.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection textoSeleccionado = new StringSelection(alert);

        clip.setContents(textoSeleccionado, null);

        //JOptionPane.showMessageDialog(null, "¡Texto Copiado!");
    }//GEN-LAST:event_btnCopiarHercules1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaHercules;
    private javax.swing.JTextArea areaTrama;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnCopiarHercules1;
    private javax.swing.JButton btnLimpiar;
    private com.toedter.calendar.JDateChooser cajaFecha;
    private javax.swing.JTextField cajaHexa;
    private com.toedter.components.JSpinField cajaHora;
    private javax.swing.JTextField cajaIp;
    private com.toedter.components.JSpinField cajaMinuto;
    private javax.swing.JTextField cajaPuerto;
    private com.toedter.components.JSpinField cajaSegundo;
    private javax.swing.JTextField cajaValor;
    private javax.swing.JComboBox<String> comboPuerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHercules;
    private javax.swing.JLabel lblHercules1;
    private javax.swing.JLabel lblHexa;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblPuerto1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor2;
    // End of variables declaration//GEN-END:variables
}
