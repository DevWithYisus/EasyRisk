package formularios.RCIN;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Calendar;

import java.util.Formatter;
import javax.swing.JOptionPane;

public class InyectarBpprRCIN extends javax.swing.JInternalFrame {

    //ATHM P2P
    String tramaP2P = "ISO0160000530220F23CC4410EF080900000000002000008160215020146065689402;000000000012345;0913;010101;00527214413107150000071560110110006999999134001      70561000MOBILE01        ATHM           CONOCO-------------------CHATTANOOGA--US2500000000000000000000000008400112& 0000500112! RE00008 50099   ! BM00036 R002402020402020  StoreMGV7877599999! 0300006 000N00! 2400010 P 00331001012ATHMCER3+000090107081030012";
    String[] desglorarP2P = tramaP2P.split(";");
    String valorP2P = desglorarP2P[1];
    String fechaP2P = desglorarP2P[2];
    String horaP2P = desglorarP2P[3];

    //ATHM P2B
    String tramaP2B = "ISO0160000530220F23CE40006E080000000004000004008164549516047289272400;000000000000400;0909;112400;061956181908082602  0826601184001162936200MOBILE01        MOBILE01       ATH MOVIL 9394999997/---CHATTANOOGA--   840                                          043001018212591470748035720002003TAA003004R2020011                                 ";
    String[] desglorarP2B = tramaP2B.split(";");
    String valorP2B = desglorarP2B[1];
    String fechaP2B = desglorarP2B[2];
    String horaP2B = desglorarP2B[3];

    /*
    //ATHM REFOUND
    String tramaRefound = "";
    String[] desglorarRefound = tramaRefound.split(";");
    String valorRefound = desglorarRefound[1];
    String fechaRefound = desglorarRefound[2];
    String horaRefound = desglorarRefound[3];
     */
    //ATHM QR CODE POS
    String tramaQrCode = "ISO0260000530220F238C4C10EE180160000000006000008160215020118816176002;000000000000175;0712;204736;002866164738071207135999011000208215020110000000002931930100023463240        4549102872786  ATHM SAN JUAN         SAN JUAN     PR PR0274549102872786      01000001840016BPPRCER3+000000 01000936     668& 0000600668! RE00008 00000   ! SM00516 05120000000000                                                                                                                                                                                                                                                          10000000000100001                                                                                                                                                                                                                                           ! BM00036 P103000000000000                    ! 0400020  84000000001        ! C000026         00936             0906027104300012P HOSTB24 12";
    String[] desglorarQrCode = tramaQrCode.split(";");
    String valorQrCode = desglorarQrCode[1];
    String fechaQrCode = desglorarQrCode[2];
    String horaQrCode = desglorarQrCode[3];

    /*
    //ATHM QR REFOUND
    String tramaQrRefound = "";
    String[] desglorarQrRefound = tramaQrRefound.split(";");
    String valorQrRefound = desglorarQrRefound[1];
    String fechaQrRefound = desglorarQrRefound[2];
    String horaQrRefound = desglorarQrRefound[3];
     */
    //ATHM COMPRA POS 02150
    String tramaCompraRegular = "ISO0260000530220F23CC48006E180000000000000004000160215020101160468000;000000000002000;0620;185249;07071314524906201201061753100210060984600HATHMIGRATE01   318022651992                                           027318022651992       53100001840043001018212585430137777081002003OAA003004                                                                                                                                                                                                                           ";
    String[] desglorarCompraRegular = tramaCompraRegular.split(";");
    String valorCompraRegular = desglorarCompraRegular[1];
    String fechaCompraRegular = desglorarCompraRegular[2];
    String horaCompraRegular = desglorarCompraRegular[3];

    //ATHM COMPRA POS 4549
    String tramaCompraInter = "ISO0260000530220F23CC48006E180000000000000004000164549525103855815000;000000000001500;0702;141628;06098610162807020901070259990210000000000RefunRev        CARD ACCEPTOR  ACQUIRER NAME        CITY NAME          027CARD ACCEPTOR      59990001840043001018212586689788035063002003OAA003004                                                                                                                                                                                                                           ";
    String[] desglorarCompraInter = tramaCompraInter.split(";");
    String valorCompraInter = desglorarCompraInter[1];
    String fechaCompraInter = desglorarCompraInter[2];
    String horaCompraInter = desglorarCompraInter[3];

    //ATHM RETIRO ATM 02150
    String tramaRetiroRegular = "ISO0160000530220F23CE40006E080000000004000004008160215020121953539012;000000000001000;0717;175122;007150135122071704010717601163090101344800HATHPBLOS07     HATHPBLOS07    KMART 7752      YAUCOSAN JUAN     PR    840                                          043001018212587998682318532002003OAA003004    001                                                                                                                                                                                                       ";
    String[] desglorarRetiroRegular = tramaRetiroRegular.split(";");
    String valorRetiroRegular = desglorarRetiroRegular[1];
    String fechaRetiroRegular = desglorarRetiroRegular[2];
    String horaRetiroRegular = desglorarRetiroRegular[3];

    //ATHM RETIRO ATM 4549
    String tramaRetiroInter = "ISO0160000530220F23CE40006E080000000004000004008164549516004667213012;000000000002000;0708;192719;072280152719070808010708601163005100000000PR01004         PR01004        LAB EVERTEC          SAN JUAN     PR    840                                          043001018212587226839366008002003R A003004    001                                                                                                                                                                                                       ";
    String[] desglorarRetiroInter = tramaRetiroInter.split(";");
    String valorRetiroInter = desglorarRetiroInter[1];
    String fechaRetiroInter = desglorarRetiroInter[2];
    String horaRetiroInter = desglorarRetiroInter[3];

    public InyectarBpprRCIN() {
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
        lblValor2 = new javax.swing.JLabel();
        lblTipoTrx = new javax.swing.JLabel();
        comboTipoTrx = new javax.swing.JComboBox<>();
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
        setTitle("Generar Tramas BPPR - RCIN");
        setMaximumSize(new java.awt.Dimension(950, 475));
        setMinimumSize(new java.awt.Dimension(950, 475));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 475));

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

        comboPuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RCIN - CERT01", "RCIN - CERT02" }));

        lblValor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor2.setText("Instancia/Ambiente:");

        lblTipoTrx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoTrx.setText("Tipo De Transacción:");

        comboTipoTrx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "ATHM - P2P", "ATHM - P2B", "ATHM - Refound", "ATHM - QR CODE POS", "ATHM - QR CODE POS Refound", "BPPR - Compra POS - BIN 02150", "BPPR - Compra POS - BIN 45495", "BPPR - Retiro ATM - BIN 02150", "BPPR - Retiro ATM - BIN 45495" }));
        comboTipoTrx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoTrxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipoTrx)
                        .addGap(18, 18, 18)
                        .addComponent(comboTipoTrx, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor2)
                                .addGap(47, 47, 47)
                                .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValor)
                                .addComponent(cajaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValor2)
                                .addComponent(comboPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addGap(86, 86, 86)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(btnLimpiar)
                    .addComponent(lblTipoTrx)
                    .addComponent(comboTipoTrx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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
                .addContainerGap()
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
            int año = calendario.get(Calendar.YEAR);
            String mesCompleto = String.valueOf(obj.format("%02d", mes));
            String diaCompleto = String.valueOf(obj.format("%02d", dia));
            fechaP2P = diaCompleto;
            fechaP2B = diaCompleto;
            //fechaRefound = diaCompleto;
            fechaQrCode = diaCompleto;
            //fechaQrRefound = diaCompleto;
            fechaCompraRegular = diaCompleto;
            fechaCompraInter = diaCompleto;
            fechaRetiroRegular = diaCompleto;
            fechaRetiroInter = diaCompleto;

            obj = new Formatter();
            int horas = cajaHora.getValue();
            String horaCompleto = String.valueOf(obj.format("%02d", horas));
            int min = cajaMinuto.getValue();
            String minCompleto = String.valueOf(obj.format("%02d", min));
            int seg = cajaSegundo.getValue();
            String segCompleto = String.valueOf(obj.format("%02d", seg));
            horaP2P = segCompleto + "";
            horaP2B = segCompleto + "";
            //horaRefound = segCompleto + "";
            horaQrCode = segCompleto + "";
            //horaQrRefound = segCompleto + "";
            horaCompraRegular = segCompleto + "";
            horaCompraInter = segCompleto + "";
            horaRetiroRegular = segCompleto + "";
            horaRetiroInter = segCompleto + "";
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
            valorP2P = montoTotal;
            valorP2B = montoTotal;
            //valorRefound = montoTotal;
            valorQrCode = montoTotal;
            //valorQrRefound = montoTotal;
            valorCompraRegular = montoTotal;
            valorCompraInter = montoTotal;
            valorRetiroRegular = montoTotal;
            valorRetiroInter = montoTotal;

            switch (comboPuerto.getSelectedIndex()) {
                case 0:
                    cajaIp.setText("10.195.16.7");
                    cajaPuerto.setText("6110");
                    break;
                case 1:
                    cajaIp.setText("10.195.16.22");
                    cajaPuerto.setText("6110");
                    break;
            }

            switch (comboTipoTrx.getSelectedIndex()) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de transacción");
                    break;
                case 1:

                    int decimalesP2P = 403;
                    String hexadecimalP2P = Integer.toHexString(decimalesP2P);
                    cajaHexa.setText("0" + hexadecimalP2P + "0000");

                    areaHercules.setText(desglorarP2P[0] + valorP2P + fechaP2P + horaP2P + desglorarP2P[4]);

                    break;
                case 2:

                    int decimalesP2B = 335;
                    String hexadecimalP2B = Integer.toHexString(decimalesP2B);
                    cajaHexa.setText("0" + hexadecimalP2B + "0000");

                    areaHercules.setText(desglorarP2B[0] + valorP2B + fechaP2B + horaP2B + desglorarP2B[4]);

                    break;
                case 3:

                    JOptionPane.showMessageDialog(null, "Tipo de mensaje no disponible");
                    /*
                    int decimalesRefound = 302;
                    String hexadecimalRefound = Integer.toHexString(decimalesRefound);
                    cajaHexa.setText("0" + hexadecimalRefound + "0000");

                    areaHercules.setText(desglorarRefound[0] + valorRefound + fechaRefound + horaRefound + desglorarRefound[4]);
                     */
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Tipo de mensaje no disponible");
                    /*
                    int decimalesQrCode = 991;
                    String hexadecimalQrCode = Integer.toHexString(decimalesQrCode);
                    cajaHexa.setText("0" + hexadecimalQrCode + "0000");

                    areaHercules.setText(desglorarQrCode[0] + valorQrCode + fechaQrCode + horaQrCode + desglorarQrCode[4]);
                     */
                    break;
                case 5:

                    JOptionPane.showMessageDialog(null, "Tipo de mensaje no disponible");

                    /*
                    int decimalesQrRefound = 991;
                    String hexadecimalQrRefound = Integer.toHexString(decimalesQrRefound);
                    cajaHexa.setText("0" + hexadecimalQrRefound + "0000");

                    areaHercules.setText(desglorarQrRefound[0] + valorQrRefound + fechaQrRefound + horaQrRefound + desglorarQrRefound[4]);
                     */
                    break;
                case 6:

                    int decimalesCompraRegular = 500;
                    String hexadecimalCompraRegular = Integer.toHexString(decimalesCompraRegular);
                    cajaHexa.setText("0" + hexadecimalCompraRegular + "0000");

                    areaHercules.setText(desglorarCompraRegular[0] + valorCompraRegular + fechaCompraRegular + horaCompraRegular + desglorarCompraRegular[4]);

                    break;
                case 7:

                    int decimalesCompraInter = 500;
                    String hexadecimalCompraInter = Integer.toHexString(decimalesCompraInter);
                    cajaHexa.setText("0" + hexadecimalCompraInter + "0000");

                    areaHercules.setText(desglorarCompraInter[0] + valorCompraInter + fechaCompraInter + horaCompraInter + desglorarCompraInter[4]);

                    break;
                case 8:

                    int decimalesRetiroRegular = 500;
                    String hexadecimalRetiroRegular = Integer.toHexString(decimalesRetiroRegular);
                    cajaHexa.setText("0" + hexadecimalRetiroRegular + "0000");

                    areaHercules.setText(desglorarRetiroRegular[0] + valorRetiroRegular + fechaRetiroRegular + horaRetiroRegular + desglorarRetiroRegular[4]);

                    break;
                case 9:

                    int decimalesRetiroInter = 302;
                    String hexadecimalRetiroInter = Integer.toHexString(decimalesRetiroInter);
                    cajaHexa.setText("0" + hexadecimalRetiroInter + "0000");

                    areaHercules.setText(desglorarRetiroInter[0] + valorRetiroInter + fechaRetiroInter + horaRetiroInter + desglorarRetiroInter[4]);

                    break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe completar Fecha, Hora y Monto de la transacción",
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

    private void btnCopiarHercules1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarHercules1ActionPerformed

        String alert = areaHercules.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection textoSeleccionado = new StringSelection(alert);

        clip.setContents(textoSeleccionado, null);

        //JOptionPane.showMessageDialog(null, "¡Texto Copiado!");
    }//GEN-LAST:event_btnCopiarHercules1ActionPerformed

    private void comboTipoTrxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoTrxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoTrxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaHercules;
    private javax.swing.JButton btnCopiarHercules1;
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
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblPuerto1;
    private javax.swing.JLabel lblTipoTrx;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor2;
    // End of variables declaration//GEN-END:variables
}
