package formularios;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Calendar;

import java.util.Formatter;
import javax.swing.JOptionPane;

public class InyectarBppr extends javax.swing.JInternalFrame {

    String trama = "ISO0160000530220F23CC4000EE08000000000000000000C164549515204605314402;000000000003700;0424;110300;045436163313120623021206601101100000002809922050500SIMDBL01        ATHM           BANCO POPULAR         SAN JUAN     PR PR8400011076& 0000300076! RE00008 00000   ! BM00036 R00240202040202078722137407877599999";
    String[] desglorar = trama.split(";");
    String valor = desglorar[1];
    String fecha = desglorar[2];
    String hora = desglorar[3];

    public InyectarBppr() {
        initComponents();
        cajaTarjeta.disable();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        areaTrama = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        cajaTarjeta = new javax.swing.JTextField();
        comboPuerto = new javax.swing.JComboBox<>();
        lblValor2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaPutty = new javax.swing.JTextArea();
        lblPutty = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaHercules = new javax.swing.JTextArea();
        lblHercules = new javax.swing.JLabel();
        lblPuerto1 = new javax.swing.JLabel();
        cajaIp = new javax.swing.JTextField();
        cajaPuerto = new javax.swing.JTextField();
        lblPuerto = new javax.swing.JLabel();
        lblHexa = new javax.swing.JLabel();
        cajaHexa = new javax.swing.JTextField();
        btnCopiarHercules = new javax.swing.JButton();
        btnCopiarPutty = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Generar TRX BPPR");
        setMaximumSize(new java.awt.Dimension(950, 600));
        setMinimumSize(new java.awt.Dimension(950, 600));
        setPreferredSize(new java.awt.Dimension(950, 620));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setText("Fecha De La Transaccion:");

        lblHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHora.setText("Hora De La Transacción:");

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor.setText("Valor De La Transacción:");

        cajaValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnGenerar.setBackground(new java.awt.Color(255, 102, 0));
        btnGenerar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerar.setText("Generar Tramas");
        btnGenerar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
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

        areaTrama.setColumns(20);
        areaTrama.setRows(5);
        jScrollPane3.setViewportView(areaTrama);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese La Trama");

        btnConvertir.setBackground(new java.awt.Color(255, 102, 0));
        btnConvertir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConvertir.setText("Convertir Trama");
        btnConvertir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        lblValor1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor1.setText("Numero de la tarjeta");

        cajaTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cajaTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaTarjetaKeyTyped(evt);
            }
        });

        comboPuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RCIN - CERT01", "RCIS - CERT01", "RCIN - CERT02", "RCIS - CERT02" }));

        lblValor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor2.setText("Instancia/Ambiente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(193, 193, 193)
                                    .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblFecha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor1)
                                .addGap(55, 55, 55)
                                .addComponent(cajaTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValor)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(193, 193, 193)
                                    .addComponent(cajaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52)
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
                                    .addComponent(cajaSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor2)
                                .addGap(47, 47, 47)
                                .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(cajaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor2)
                            .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor1)
                    .addComponent(cajaTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertir)
                    .addComponent(btnGenerar)
                    .addComponent(btnLimpiar))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        areaPutty.setColumns(20);
        areaPutty.setLineWrap(true);
        areaPutty.setRows(5);
        jScrollPane2.setViewportView(areaPutty);

        lblPutty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPutty.setText("Trama Putty");

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

        btnCopiarHercules.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarHercules.setText("Copiar");
        btnCopiarHercules.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarHercules.setMaximumSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules.setMinimumSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules.setPreferredSize(new java.awt.Dimension(50, 25));
        btnCopiarHercules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarHerculesActionPerformed(evt);
            }
        });

        btnCopiarPutty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarPutty.setText("Copiar");
        btnCopiarPutty.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarPutty.setMaximumSize(new java.awt.Dimension(50, 25));
        btnCopiarPutty.setMinimumSize(new java.awt.Dimension(50, 25));
        btnCopiarPutty.setPreferredSize(new java.awt.Dimension(50, 25));
        btnCopiarPutty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarPuttyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblPutty)
                                    .addGap(293, 293, 293)
                                    .addComponent(btnCopiarPutty, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblHercules)
                                    .addGap(282, 282, 282)
                                    .addComponent(btnCopiarHercules, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31))
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPuerto1)
                        .addGap(28, 28, 28)
                        .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(lblPuerto)
                        .addGap(28, 28, 28)
                        .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblHexa)
                                .addGap(119, 119, 119)))
                        .addGap(23, 23, 23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuerto1)
                    .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuerto)
                    .addComponent(lblHexa)
                    .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopiarHercules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHercules))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopiarPutty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPutty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        try {

            Formatter obj = new Formatter();
            Calendar calendario = cajaFecha.getCalendar();
            int dia = calendario.get(Calendar.DATE);
            int mes = calendario.get(Calendar.MONTH) + 1;
            int año = calendario.get(Calendar.YEAR);
            String mesCompleto = String.valueOf(obj.format("%02d", mes));
            String diaCompleto = String.valueOf(obj.format("%02d", dia));
            fecha = diaCompleto;

            obj = new Formatter();
            int horas = cajaHora.getValue();
            String horaCompleto = String.valueOf(obj.format("%02d", horas));
            int min = cajaMinuto.getValue();
            String minCompleto = String.valueOf(obj.format("%02d", min));
            int seg = cajaSegundo.getValue();
            String segCompleto = String.valueOf(obj.format("%02d", seg));
            hora = segCompleto + "";
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
            valor = montoTotal;

            int decimales = 302;
            String hexadecimal = Integer.toHexString(decimales);
            cajaHexa.setText("0" + hexadecimal + "0000");
            String[] nuevoHexa = hexadecimal.split("");
            String hexa1 = "0" + nuevoHexa[0];
            String hexa2 = nuevoHexa[1] + nuevoHexa[2];
            
            switch (comboPuerto.getSelectedIndex()) {
            case 0:
                    cajaIp.setText("10.195.16.7");
                    cajaPuerto.setText("6110");
                    break;
                case 1:
                    cajaIp.setText("10.195.16.7");
                    cajaPuerto.setText("6050");
                    break;
                case 2:
                    cajaIp.setText("10.195.16.22");
                    cajaPuerto.setText("6110");
                    break;
                case 3:
                    cajaIp.setText("10.195.16.22");
                    cajaPuerto.setText("6050");
                    break;
        }

            areaPutty.setText("(echo -n -e \"\\x" + hexa1 + "\\x" + hexa2 + "\\x00" + "\\x00" + desglorar[0] + valor + fecha + hora + desglorar[4] + "\"; sleep 5) | timeout 5 nc localhost " + cajaPuerto.getText());

            areaHercules.setText(desglorar[0] + valor + fecha + hora + desglorar[4]);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe completar Fecha, Hora y Monto de la transacción",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cajaFecha.setDate(null);
        cajaValor.setText("");
        cajaTarjeta.setText("");
        cajaHora.setValue(0);
        cajaMinuto.setValue(0);
        cajaSegundo.setValue(0);
        cajaHexa.setText("");
        areaPutty.setText("");
        areaHercules.setText("");
        cajaIp.setText("");
        cajaPuerto.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed

        try {
            String tramaCompleta = areaTrama.getText();

            String parteInicio = tramaCompleta.substring(0, 69);
            String parteFinal = tramaCompleta.substring(94, tramaCompleta.length());

            Formatter obj = new Formatter();
            Calendar calendario = cajaFecha.getCalendar();
            int dia = calendario.get(Calendar.DATE);
            int mes = calendario.get(Calendar.MONTH) + 1;
            int año = calendario.get(Calendar.YEAR);
            String mesCompleto = String.valueOf(obj.format("%02d", mes));
            String diaCompleto = String.valueOf(obj.format("%02d", dia));
            fecha = diaCompleto;

            obj = new Formatter();
            int horas = cajaHora.getValue();
            String horaCompleto = String.valueOf(obj.format("%02d", horas));
            int min = cajaMinuto.getValue();
            String minCompleto = String.valueOf(obj.format("%02d", min));
            int seg = cajaSegundo.getValue();
            String segCompleto = String.valueOf(obj.format("%02d", seg));
            hora = segCompleto + "";

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
            valor = montoTotal;

            //S_PAN = cajaTarjeta.getText().trim();

            switch (comboPuerto.getSelectedIndex()) {
                case 0:
                    cajaIp.setText("10.195.16.7");
                    cajaPuerto.setText("6110");
                    break;
                case 1:
                    cajaIp.setText("10.195.16.7");
                    cajaPuerto.setText("6050");
                    break;
                case 2:
                    cajaIp.setText("10.195.16.22");
                    cajaPuerto.setText("6110");
                    break;
                case 3:
                    cajaIp.setText("10.195.16.22");
                    cajaPuerto.setText("6050");
                    break;
            }

            areaHercules.setText(parteInicio + valor + fecha + hora + parteFinal);

            String longitud = areaTrama.getText();
            System.out.println(longitud.length());
            int decimales = longitud.length();
            String hexadecimal = Integer.toHexString(decimales);
            cajaHexa.setText("0" + hexadecimal + "0000");
            String[] nuevoHexa = hexadecimal.split("");
            String hexa1 = "0" + nuevoHexa[0];
            String hexa2 = nuevoHexa[1] + nuevoHexa[2];

            areaPutty.setText("(echo -n -e \"\\x" + hexa1 + "\\x" + hexa2 + parteInicio + valor + fecha + hora + parteFinal + "\"; sleep 5) | timeout 5 nc localhost " + cajaPuerto.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnConvertirActionPerformed

    private void cajaTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTarjetaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (cajaTarjeta.getText().trim().length() == 6) {
            evt.consume();
        }
    }//GEN-LAST:event_cajaTarjetaKeyTyped

    private void btnCopiarHerculesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarHerculesActionPerformed

        String alert = areaHercules.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection textoSeleccionado = new StringSelection(alert);

        clip.setContents(textoSeleccionado, null);

        //JOptionPane.showMessageDialog(null, "¡Texto Copiado!");
    }//GEN-LAST:event_btnCopiarHerculesActionPerformed

    private void btnCopiarPuttyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarPuttyActionPerformed

        String alert = areaPutty.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection textoSeleccionado = new StringSelection(alert);

        clip.setContents(textoSeleccionado, null);

        //JOptionPane.showMessageDialog(null, "¡Texto Copiado!");
    }//GEN-LAST:event_btnCopiarPuttyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaHercules;
    private javax.swing.JTextArea areaPutty;
    private javax.swing.JTextArea areaTrama;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnCopiarHercules;
    private javax.swing.JButton btnCopiarPutty;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private com.toedter.calendar.JDateChooser cajaFecha;
    private javax.swing.JTextField cajaHexa;
    private com.toedter.components.JSpinField cajaHora;
    private javax.swing.JTextField cajaIp;
    private com.toedter.components.JSpinField cajaMinuto;
    private javax.swing.JTextField cajaPuerto;
    private com.toedter.components.JSpinField cajaSegundo;
    private javax.swing.JTextField cajaTarjeta;
    private javax.swing.JTextField cajaValor;
    private javax.swing.JComboBox<String> comboPuerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHercules;
    private javax.swing.JLabel lblHexa;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblPuerto1;
    private javax.swing.JLabel lblPutty;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    // End of variables declaration//GEN-END:variables
}
