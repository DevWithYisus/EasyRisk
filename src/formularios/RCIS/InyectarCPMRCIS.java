package formularios.RCIS;

import formularios.RCIN.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.DecimalFormat;
import java.util.Calendar;

import java.util.Formatter;
import javax.swing.JOptionPane;

public class InyectarCPMRCIS extends javax.swing.JInternalFrame {

    //sin comentarios
    String tramaCompraClasica = "01005556072478982145   ;000000000020000;000000000020000;20240712;145837;000000000000000000000100326115601148490100999654     125557000MTF TEST        ABC123TESTMTF19Merchant name         Merchant cityME   4844840100004840013395620103          000000000000007351800000000000000000000                                                                                                                                                                                                                                                          000000000000                   ";
    String[] desglorarCompraClasica = tramaCompraClasica.split(";");
    String valorCompraClasica = desglorarCompraClasica[1];
    String valor2CompraClasica = desglorarCompraClasica[2];
    String fechaCompraClasica = desglorarCompraClasica[3];
    String horaCompraClasica = desglorarCompraClasica[4];

    String tramaCompraOro = "01005556070854656609   ;000000000012000;000000000012000;20240717;151646;000000000000000000000100333680601148490100999654     125671000MTF TEST        ABC123TESTMTF19Merchant name         Merchant cityME   4844840100004840013395626503          000000000000007314300000000000000000000                                                                                                                                                                                                                                                          000000000000                   ";
    String[] desglorarCompraOro = tramaCompraOro.split(";");
    String valorCompraOro = desglorarCompraOro[1];
    String valor2CompraOro = desglorarCompraOro[2];
    String fechaCompraOro = desglorarCompraOro[3];
    String horaCompraOro = desglorarCompraOro[4];

    String tramaCompraMujer = "01005556071346799625   ;000000000025000;000000000025000;20240717;155853;000000000000000000000100324447601048490200009685     12568600012345678        ID-Code-C000001Merchant name         Merchant cityME   4844840100004840013395626395          000000000000007306800000000000000000000                                                                                                                                                                                                                                                          000000000000                   ";
    String[] desglorarCompraMujer = tramaCompraMujer.split(";");
    String valorCompraMujer = desglorarCompraMujer[1];
    String valor2CompraMujer = desglorarCompraMujer[2];
    String fechaCompraMujer = desglorarCompraMujer[3];
    String horaCompraMujer = desglorarCompraMujer[4];

    public InyectarCPMRCIS() {
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
        btnGenerar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cajaFecha = new com.toedter.calendar.JDateChooser();
        cajaHora = new com.toedter.components.JSpinField();
        cajaMinuto = new com.toedter.components.JSpinField();
        cajaSegundo = new com.toedter.components.JSpinField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboPuerto = new javax.swing.JComboBox<>();
        lblInstancia = new javax.swing.JLabel();
        lblTipoTrx = new javax.swing.JLabel();
        comboTipoTrx = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblHercules = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaHercules = new javax.swing.JTextArea();
        cajaIp = new javax.swing.JTextField();
        cajaPuerto = new javax.swing.JTextField();
        lblHexa = new javax.swing.JLabel();
        cajaHexa = new javax.swing.JTextField();
        lblPuerto1 = new javax.swing.JLabel();
        lblPuerto = new javax.swing.JLabel();
        btnCopiarHercules = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Generar Tramas CPM - RCIS");
        setMaximumSize(new java.awt.Dimension(950, 475));
        setMinimumSize(new java.awt.Dimension(950, 475));
        setPreferredSize(new java.awt.Dimension(950, 475));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setText("Fecha De La Transaccion:");

        lblHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHora.setText("Hora De La Transacci�n:");

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor.setText("Valor De La Transacci�n:");

        cajaValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cajaValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaValorActionPerformed(evt);
            }
        });
        cajaValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaValorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaValorKeyTyped(evt);
            }
        });

        btnGenerar.setBackground(new java.awt.Color(255, 102, 51));
        btnGenerar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerar.setText("Generar Trama");
        btnGenerar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 102, 51));
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

        comboPuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RCIS - CERT01", "RCIS - CERT02" }));
        comboPuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPuertoActionPerformed(evt);
            }
        });

        lblInstancia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInstancia.setText("Instancia/Ambiente:");

        lblTipoTrx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoTrx.setText("Tipo De Transacci�n:");

        comboTipoTrx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opci�n", "Compra - Tarjeta Clasica", "Compra - Tarjeta Oro", "Compra - Tarjeta Mujer Coop" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addGap(33, 33, 33)
                        .addComponent(cajaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lblInstancia)
                        .addGap(47, 47, 47)
                        .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addGap(33, 33, 33)
                                .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTipoTrx)
                                .addGap(58, 58, 58)
                                .addComponent(comboTipoTrx, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHora)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cajaMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cajaSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)))))))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha)
                    .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblHora)
                                .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajaMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajaSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValor)
                        .addComponent(cajaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblInstancia)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoTrx)
                    .addComponent(comboTipoTrx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar)
                    .addComponent(btnLimpiar))
                .addGap(32, 32, 32))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        lblHercules.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHercules.setText("Trama Hercules");

        areaHercules.setColumns(20);
        areaHercules.setLineWrap(true);
        areaHercules.setRows(5);
        jScrollPane1.setViewportView(areaHercules);

        lblHexa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHexa.setText("Valor Hexadecimal:");

        cajaHexa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblPuerto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuerto1.setText("IP:");

        lblPuerto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuerto.setText("Puerto:");

        btnCopiarHercules.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarHercules.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portapapeles.png"))); // NOI18N
        btnCopiarHercules.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarHercules.setMaximumSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules.setMinimumSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules.setPreferredSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarHerculesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPuerto1)
                        .addGap(37, 37, 37)
                        .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPuerto)
                        .addGap(18, 18, 18)
                        .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lblHexa)
                        .addGap(18, 18, 18)
                        .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCopiarHercules, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320)
                        .addComponent(lblHercules)
                        .addGap(340, 340, 340))
                    .addComponent(jScrollPane1))
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuerto)
                    .addComponent(lblHexa)
                    .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuerto1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHercules)
                    .addComponent(btnCopiarHercules, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        try {

            Formatter obj = new Formatter();
            Calendar calendario = cajaFecha.getCalendar();
            int dia = calendario.get(Calendar.DATE);
            int mes = calendario.get(Calendar.MONTH) + 1;
            int a�o = calendario.get(Calendar.YEAR);
            String mesCompleto = String.valueOf(obj.format("%02d", mes));
            String diaCompleto = String.valueOf(obj.format("%02d", dia));
            fechaCompraClasica = a�o + "" + diaCompleto;
            fechaCompraOro = a�o + "" + diaCompleto;
            fechaCompraMujer = a�o + "" + diaCompleto;

            obj = new Formatter();
            int horas = cajaHora.getValue();
            String horaCompleto = String.valueOf(obj.format("%02d", horas));
            int min = cajaMinuto.getValue();
            String minCompleto = String.valueOf(obj.format("%02d", min));
            int seg = cajaSegundo.getValue();
            String segCompleto = String.valueOf(obj.format("%02d", seg));
            horaCompraClasica = segCompleto + "";
            horaCompraOro = segCompleto + "";
            horaCompraMujer = segCompleto + "";
            //areaTrama.setText(dataHora);

            // dejar el valor sin la coma
            String dataValor = cajaValor.getText().trim();
            String[] valores = dataValor.split(",");
            String monto = valores[0];
            String decimal = valores[1];

            dataValor = valores[0] + valores[1];

            int numero = Integer.parseInt(dataValor);

            // dejar la longitud exacta para la trama
            obj = new Formatter();
            String montoTotal = String.valueOf(obj.format("%015d", numero));
            valorCompraClasica = montoTotal;
            valor2CompraClasica = montoTotal;
            valorCompraOro = montoTotal;
            valor2CompraOro = montoTotal;
            valorCompraMujer = montoTotal;
            valor2CompraMujer = montoTotal;

            switch (comboPuerto.getSelectedIndex()) {
                case 0:
                    cajaIp.setText("10.195.16.7");
                    cajaPuerto.setText("6080");
                    break;
                case 1:
                    cajaIp.setText("10.195.16.22");
                    cajaPuerto.setText("6080");
                    break;
            }

            switch (comboTipoTrx.getSelectedIndex()) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de transacci�n");
                    break;
                case 1:
                    int decimalesClasica = 558;
                    String hexadecimalClasica = Integer.toHexString(decimalesClasica);
                    cajaHexa.setText("0" + hexadecimalClasica);

                    areaHercules.setText(desglorarCompraClasica[0] + valorCompraClasica + valor2CompraClasica + fechaCompraClasica + horaCompraClasica + desglorarCompraClasica[5]);
                    break;
                case 2:
                    int decimalesOro = 558;
                    String hexadecimalOro = Integer.toHexString(decimalesOro);
                    cajaHexa.setText("0" + hexadecimalOro);

                    areaHercules.setText(desglorarCompraOro[0] + valorCompraOro + valor2CompraOro + fechaCompraOro + horaCompraOro + desglorarCompraOro[5]);
                    break;
                case 3:
                    int decimalesMujer = 558;
                    String hexadecimalMujer = Integer.toHexString(decimalesMujer);
                    cajaHexa.setText("0" + hexadecimalMujer);

                    areaHercules.setText(desglorarCompraMujer[0] + valorCompraMujer + valor2CompraMujer + fechaCompraMujer + horaCompraMujer + desglorarCompraMujer[5]);
                    break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe completar Fecha, Hora, Tipo y Monto de la transacci�n",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

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
        comboTipoTrx.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCopiarHerculesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarHerculesActionPerformed

        String alert = areaHercules.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection textoSeleccionado = new StringSelection(alert);

        clip.setContents(textoSeleccionado, null);

        //JOptionPane.showMessageDialog(null, "�Texto Copiado!");
    }//GEN-LAST:event_btnCopiarHerculesActionPerformed

    private void comboPuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPuertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPuertoActionPerformed

    private void cajaValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaValorActionPerformed

    }//GEN-LAST:event_cajaValorActionPerformed

    private void cajaValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaValorKeyTyped

    }//GEN-LAST:event_cajaValorKeyTyped

    private void cajaValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaValorKeyReleased
        /*
        DecimalFormat df = new DecimalFormat("###,###.##");
 
        if (!cajaValor.getText().isEmpty()) {
            Double numero;
            String num = cajaValor.getText();
            String numeracion = num.replace(".", "");
            numero = Double.valueOf(numeracion);
            cajaValor.setText(df.format(numero));
        }else{
            cajaValor.setText("0");
        }
         */

    }//GEN-LAST:event_cajaValorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaHercules;
    private javax.swing.JButton btnCopiarHercules;
    private javax.swing.JButton btnGenerar;
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
    private javax.swing.JComboBox<String> comboTipoTrx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHercules;
    private javax.swing.JLabel lblHexa;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblInstancia;
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblPuerto1;
    private javax.swing.JLabel lblTipoTrx;
    private javax.swing.JLabel lblValor;
    // End of variables declaration//GEN-END:variables
}
