package formularios.RCIN;

import formularios.DesglosarCpm;
import formularios.DesglosarSumup;
import formularios.InicioApp;
import formularios.InyectarBppr;
import formularios.InyectarCpm;
import formularios.VentanaAdquirente;
import java.awt.Image;
import java.awt.Toolkit;

public class VentanaRCIN extends javax.swing.JFrame {

    public VentanaRCIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        menuCompleto = new javax.swing.JMenuBar();
        menuRCIS = new javax.swing.JMenu();
        opInicio = new javax.swing.JMenuItem();
        opRCAQ = new javax.swing.JMenuItem();
        opRCIS = new javax.swing.JMenuItem();
        menuInyectar = new javax.swing.JMenu();
        opSumup = new javax.swing.JMenuItem();
        opCpm = new javax.swing.JMenuItem();
        opBppr = new javax.swing.JMenuItem();
        opBancoop = new javax.swing.JMenuItem();
        opSears = new javax.swing.JMenuItem();
        opPaySmart = new javax.swing.JMenuItem();
        menuConvertir = new javax.swing.JMenu();
        opISO = new javax.swing.JMenuItem();
        opASCII = new javax.swing.JMenuItem();
        menuDesglosar = new javax.swing.JMenu();
        opDesglosarSumup = new javax.swing.JMenuItem();
        opDesglosarCpm = new javax.swing.JMenuItem();
        opDesglosarSears = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RCIN");
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1300, 700));

        escritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N

        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        menuRCIS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuRCIS.setText("Opciones ");
        menuRCIS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRCIS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        opInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        opInicio.setText("Volver al Inicio");
        opInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInicioActionPerformed(evt);
            }
        });
        menuRCIS.add(opInicio);

        opRCAQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opRCAQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adquirente.png"))); // NOI18N
        opRCAQ.setText("Cambiar a RCAQ");
        opRCAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRCAQActionPerformed(evt);
            }
        });
        menuRCIS.add(opRCAQ);

        opRCIS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opRCIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emisor.png"))); // NOI18N
        opRCIS.setText("Cambiar a RCIS");
        opRCIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRCISActionPerformed(evt);
            }
        });
        menuRCIS.add(opRCIS);

        menuCompleto.add(menuRCIS);

        menuInyectar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuInyectar.setText("Generar Tramas ");
        menuInyectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuInyectar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        opSumup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opSumup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sumup.png"))); // NOI18N
        opSumup.setText("Sumup");
        opSumup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSumupActionPerformed(evt);
            }
        });
        menuInyectar.add(opSumup);

        opCpm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opCpm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cpm.png"))); // NOI18N
        opCpm.setText("CPM");
        opCpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCpmActionPerformed(evt);
            }
        });
        menuInyectar.add(opCpm);

        opBppr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opBppr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bppr.png"))); // NOI18N
        opBppr.setText("BPPR");
        opBppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBpprActionPerformed(evt);
            }
        });
        menuInyectar.add(opBppr);

        opBancoop.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opBancoop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bppr.png"))); // NOI18N
        opBancoop.setText("Bancoop");
        opBancoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBancoopActionPerformed(evt);
            }
        });
        menuInyectar.add(opBancoop);

        opSears.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opSears.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sumup.png"))); // NOI18N
        opSears.setText("Sears");
        menuInyectar.add(opSears);

        opPaySmart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opPaySmart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paysmart.png"))); // NOI18N
        opPaySmart.setText("PaySmart");
        menuInyectar.add(opPaySmart);

        menuCompleto.add(menuInyectar);

        menuConvertir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuConvertir.setText("Convertir Tramas ");
        menuConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConvertir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        opISO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opISO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iso.png"))); // NOI18N
        opISO.setText("ISO");
        opISO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opISOActionPerformed(evt);
            }
        });
        menuConvertir.add(opISO);

        opASCII.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opASCII.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ascii.png"))); // NOI18N
        opASCII.setText("ASCII");
        opASCII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opASCIIActionPerformed(evt);
            }
        });
        menuConvertir.add(opASCII);

        menuCompleto.add(menuConvertir);

        menuDesglosar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuDesglosar.setText("Desglosar Tramas ");
        menuDesglosar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuDesglosar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        opDesglosarSumup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opDesglosarSumup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sumup.png"))); // NOI18N
        opDesglosarSumup.setText("Sumup");
        opDesglosarSumup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDesglosarSumupActionPerformed(evt);
            }
        });
        menuDesglosar.add(opDesglosarSumup);

        opDesglosarCpm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opDesglosarCpm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cpm.png"))); // NOI18N
        opDesglosarCpm.setText("CPM");
        opDesglosarCpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDesglosarCpmActionPerformed(evt);
            }
        });
        menuDesglosar.add(opDesglosarCpm);

        opDesglosarSears.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opDesglosarSears.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sumup.png"))); // NOI18N
        opDesglosarSears.setText("Sears");
        menuDesglosar.add(opDesglosarSears);

        menuCompleto.add(menuDesglosar);

        setJMenuBar(menuCompleto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opCpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCpmActionPerformed
        InyectarCpm ventanaCpm = new InyectarCpm();
        escritorio.add(ventanaCpm);
        ventanaCpm.setVisible(true);
    }//GEN-LAST:event_opCpmActionPerformed

    private void opDesglosarCpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDesglosarCpmActionPerformed
        DesglosarCpm desCpm =  new DesglosarCpm();
        escritorio.add(desCpm);
        desCpm.setVisible(true);
    }//GEN-LAST:event_opDesglosarCpmActionPerformed

    private void opInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInicioActionPerformed
        InicioApp ventanaInicio = new InicioApp();
        ventanaInicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_opInicioActionPerformed

    private void opSumupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSumupActionPerformed
        InyectarSumupRCIN ventanaSumup = new InyectarSumupRCIN();
        escritorio.add(ventanaSumup);
        ventanaSumup.setVisible(true);
    }//GEN-LAST:event_opSumupActionPerformed

    private void opDesglosarSumupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDesglosarSumupActionPerformed
        DesglosarSumup desSumup =  new DesglosarSumup();
        escritorio.add(desSumup);
        desSumup.setVisible(true);
    }//GEN-LAST:event_opDesglosarSumupActionPerformed

    private void opRCAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRCAQActionPerformed
        VentanaAdquirente ventanaAdquirente = new VentanaAdquirente();
        ventanaAdquirente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_opRCAQActionPerformed

    private void opBpprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBpprActionPerformed
        InyectarBppr ventanaBppr = new InyectarBppr();
        escritorio.add(ventanaBppr);
        ventanaBppr.setVisible(true);
    }//GEN-LAST:event_opBpprActionPerformed

    private void opISOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opISOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opISOActionPerformed

    private void opASCIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opASCIIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opASCIIActionPerformed

    private void opRCISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRCISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opRCISActionPerformed

    private void opBancoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBancoopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opBancoopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRCIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRCIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRCIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRCIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRCIN().setVisible(true);
            }
        });
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logoEvertec.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar menuCompleto;
    private javax.swing.JMenu menuConvertir;
    private javax.swing.JMenu menuDesglosar;
    private javax.swing.JMenu menuInyectar;
    private javax.swing.JMenu menuRCIS;
    private javax.swing.JMenuItem opASCII;
    private javax.swing.JMenuItem opBancoop;
    private javax.swing.JMenuItem opBppr;
    private javax.swing.JMenuItem opCpm;
    private javax.swing.JMenuItem opDesglosarCpm;
    private javax.swing.JMenuItem opDesglosarSears;
    private javax.swing.JMenuItem opDesglosarSumup;
    private javax.swing.JMenuItem opISO;
    private javax.swing.JMenuItem opInicio;
    private javax.swing.JMenuItem opPaySmart;
    private javax.swing.JMenuItem opRCAQ;
    private javax.swing.JMenuItem opRCIS;
    private javax.swing.JMenuItem opSears;
    private javax.swing.JMenuItem opSumup;
    // End of variables declaration//GEN-END:variables
}
