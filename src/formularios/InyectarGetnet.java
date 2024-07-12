package formularios;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Calendar;

import java.util.Formatter;
import javax.swing.JOptionPane;

public class InyectarGetnet extends javax.swing.JInternalFrame {

    /*
    Definicion de variables y se parte la trama en los campos de
    los valores, fecha, hora, cod autorizador, para ser reemplazados mas adelante
     */
    String trama = "02005413337946130029   ;000000000000888;000000000000059;20230725;165333;600664410000456825126051858801000000002448410838300 N0103G02        000000000000008Súcursal POSÑ         Chacras De BeUY SA858978000000056   2023072519533300000000000000541333001000000000210029             ";
    //02005158454679135850   ;000000000004800;000000000004800;20230725;041300;000000000000363224094722858051000000002448400000091 N0103G02        000000000000008Súcursal POSÑ         Chacras De BeUY SA858000000000858   2023031320184800000000000000515845991000000000185850             515845111000000367055850
    String[] desglorar = trama.split(";");
    String valor = desglorar[1];
    String valor2 = desglorar[2];
    String fecha = desglorar[3];
    String hora = desglorar[4];

    public InyectarGetnet() {
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
        cajaPuerto = new javax.swing.JTextField();
        cajaIp = new javax.swing.JTextField();
        cajaHexa = new javax.swing.JTextField();
        lblHexa = new javax.swing.JLabel();
        lblPuerto1 = new javax.swing.JLabel();
        lblPuerto = new javax.swing.JLabel();
        btnCopiarHercules = new javax.swing.JButton();
        btnCopiarPutty = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Inyectar TRX Getnet");
        setMaximumSize(new java.awt.Dimension(950, 620));
        setMinimumSize(new java.awt.Dimension(950, 620));
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

        comboPuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RCAQ CERT01", "RCAQ CERT02" }));

        lblValor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor2.setText("Instancia/Ambiente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFecha)
                                        .addGap(35, 35, 35)
                                        .addComponent(cajaFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblValor1)
                                            .addComponent(lblValor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cajaValor)
                                            .addComponent(cajaTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHora)
                                    .addComponent(lblValor2))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                    .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFecha)
                        .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora)
                            .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(cajaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor2)
                    .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor1)
                    .addComponent(cajaTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertir)
                    .addComponent(btnGenerar)
                    .addComponent(btnLimpiar))
                .addGap(0, 13, Short.MAX_VALUE))
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

        cajaHexa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblHexa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHexa.setText("Valor Hexadecimal:");

        lblPuerto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuerto1.setText("IP:");

        lblPuerto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuerto.setText("Puerto:");

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
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHercules)
                        .addGap(309, 309, 309)
                        .addComponent(btnCopiarHercules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPutty)
                        .addGap(323, 323, 323)
                        .addComponent(btnCopiarPutty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPuerto1)
                        .addGap(28, 28, 28)
                        .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(lblPuerto)
                        .addGap(28, 28, 28)
                        .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(lblHexa)
                        .addGap(18, 18, 18)
                        .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuerto)
                    .addComponent(cajaIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuerto1)
                    .addComponent(cajaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHexa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHercules)
                    .addComponent(btnCopiarHercules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPutty)
                    .addComponent(btnCopiarPutty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        try {
            /*
            Switch para determinar la ip y el puerto dependiendo
            de la opcion que se escoja en la ventana
             */


 /*
            Creacion de objeto tipo Formatter para extraer de la caja de texto
            la fecha en formato AAAAMMDD
             */
            Formatter obj = new Formatter();
            Calendar calendario = cajaFecha.getCalendar();
            int dia = calendario.get(Calendar.DATE);
            int mes = calendario.get(Calendar.MONTH) + 1;
            int año = calendario.get(Calendar.YEAR);
            String mesCompleto = String.valueOf(obj.format("%02d", mes));
            String diaCompleto = String.valueOf(obj.format("%02d", dia));
            fecha = año + "" + diaCompleto;

            /*
            Creacion de objeto tipo Formatter para extraer de la caja de texto
            la hora, minutos y segundos
             */
            obj = new Formatter();
            int horas = cajaHora.getValue();
            String horaCompleto = String.valueOf(obj.format("%02d", horas));
            int min = cajaMinuto.getValue();
            String minCompleto = String.valueOf(obj.format("%02d", min));
            int seg = cajaSegundo.getValue();
            String segCompleto = String.valueOf(obj.format("%02d", seg));
            hora = segCompleto + "";

            /*
            Proceso para extraer el valor indicado en la caja de texto,
            teniendo en cuenta que el valor se debe colocar con coma (,)
             */
            String dataValor = cajaValor.getText().trim();
            String[] valores = dataValor.split(",");
            String monto = valores[0];
            String decimal = valores[1];
            dataValor = valores[0] + valores[1];

            // Se hace parseo para cambiar el tipo de datos de entero a String
            int numero = Integer.parseInt(dataValor);

            /* Cracion de objeto para tomar el valor indicado en la linea de arriba y llenar
            con ceros (0) a la izquierda para completar la longitud de la trama
             */
            obj = new Formatter();
            String montoTotal = String.valueOf(obj.format("%015d", numero));
            valor = montoTotal;
            valor2 = montoTotal;

            /*
            funcion para tomar el valor de la longitud de la trama y convertirlo a
            hexadecimal
             */
            int decimales = 273;
            String hexadecimal = Integer.toHexString(decimales);
            cajaHexa.setText("0" + hexadecimal);

            /*
            Proceso para partir el valor hexadecimal en dos
             */
            String[] nuevoHexa = hexadecimal.split("");
            String hexa1 = "0" + nuevoHexa[0];
            String hexa2 = nuevoHexa[1] + nuevoHexa[2];

            //int autorizadorCodigo = (int) (Math.random() * 999998 + 1);

            //codAutotizador = Integer.toString(autorizadorCodigo);

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

            //System.out.println(codAutotizador);
            areaPutty.setText("(echo -n -e \"\\x" + hexa1 + "\\x" + hexa2 + desglorar[0] + valor + valor2 + fecha + hora + desglorar[5] + "\"; sleep 5) | timeout 5 nc localhost " + cajaPuerto.getText());
            //areaPutty.setText("(echo -n -e \"\\x" + hexa1 + "\\x" + hexa2 + desglorar[0] + valor + valor2 + fecha + hora + desglorar[5] + codAutotizador + desglorar[7] + "\"; sleep 5) | timeout 5 nc localhost " + cajaPuerto.getText());

            
            areaHercules.setText(desglorar[0] + valor + valor2 + fecha + hora + desglorar[5]);
            //areaHercules.setText(desglorar[0] + valor + valor2 + fecha + hora + desglorar[5] + codAutotizador + desglorar[7]);

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
        cajaPuerto.setText("");
        cajaIp.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed

        try {

            
            String tramaCompleta = areaTrama.getText();

            String parteInicio = tramaCompleta.substring(0, 10);
            String S_PAN = tramaCompleta.substring(10, 16);
            String parteMedio = tramaCompleta.substring(16, 23);
            String montoTrx = tramaCompleta.substring(23, 38);
            String fechaTrx = tramaCompleta.substring(53, 67);
            String parteFinal = tramaCompleta.substring(67, tramaCompleta.length());

            Formatter obj = new Formatter();
            Calendar calendario = cajaFecha.getCalendar();
            int dia = calendario.get(Calendar.DATE);
            int mes = calendario.get(Calendar.MONTH) + 1;
            int año = calendario.get(Calendar.YEAR);
            String mesCompleto = String.valueOf(obj.format("%02d", mes));
            String diaCompleto = String.valueOf(obj.format("%02d", dia));
            fecha = año + "" + diaCompleto;

            obj = new Formatter();
            int horas = cajaHora.getValue();
            String horaCompleto = String.valueOf(obj.format("%02d", horas));
            int min = cajaMinuto.getValue();
            String minCompleto = String.valueOf(obj.format("%02d", min));
            int seg = cajaSegundo.getValue();
            String segCompleto = String.valueOf(obj.format("%02d", seg));
            hora = segCompleto + "";

            String dataValor = cajaValor.getText().trim();
            String[] valores = dataValor.split(",");

            dataValor = valores[0] + valores[1];

            int numero = Integer.parseInt(dataValor);

            // dejar la longitud exacta para la trama
            obj = new Formatter();
            String montoTotal = String.valueOf(obj.format("%015d", numero));
            valor = montoTotal;
            valor2 = montoTotal;

            S_PAN = cajaTarjeta.getText().trim();
            
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

            areaHercules.setText(parteInicio + S_PAN + parteMedio + valor + valor2 + fecha + hora + parteFinal);

            String longitud = areaTrama.getText();
            System.out.println(longitud.length());
            int decimales = longitud.length();
            String hexadecimal = Integer.toHexString(decimales);
            cajaHexa.setText("0" + hexadecimal);
            String[] nuevoHexa = hexadecimal.split("");
            String hexa1 = "0" + nuevoHexa[0];
            String hexa2 = nuevoHexa[1] + nuevoHexa[2];

            areaPutty.setText("(echo -n -e \"\\x" + hexa1 + "\\x" + hexa2 + parteInicio + S_PAN + parteMedio + valor + valor2 + fecha + hora + parteFinal + "\"; sleep 5) | timeout 5 nc localhost " + cajaPuerto.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los datos",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnCopiarPuttyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarPuttyActionPerformed
        String alert = areaPutty.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection textoSeleccionado = new StringSelection(alert);

        clip.setContents(textoSeleccionado, null);
    }//GEN-LAST:event_btnCopiarPuttyActionPerformed

    private void btnCopiarHerculesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarHerculesActionPerformed
        String alert = areaHercules.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection textoSeleccionado = new StringSelection(alert);

        clip.setContents(textoSeleccionado, null);
    }//GEN-LAST:event_btnCopiarHerculesActionPerformed

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
