package formularios.RCAQ;

import formularios.DesglosarGetnet;
import formularios.DesglosarSantander;
import formularios.InicioApp;
import formularios.RCIN.ConvertirASCIIRCIN;
import formularios.RCIN.VentanaRCIN;
import formularios.RCIS.VentanaRCIS;
import java.awt.Image;
import java.awt.Toolkit;


public class VentanaRCAQ extends javax.swing.JFrame {

    
    public VentanaRCAQ() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        menuCompleto = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        opInicio = new javax.swing.JMenuItem();
        opEmisor = new javax.swing.JMenuItem();
        opRCIS = new javax.swing.JMenuItem();
        menuInyectar = new javax.swing.JMenu();
        opGetnet = new javax.swing.JMenuItem();
        opSantander = new javax.swing.JMenuItem();
        menuConvertir = new javax.swing.JMenu();
        opASCII = new javax.swing.JMenuItem();
        menuDesglosar = new javax.swing.JMenu();
        opDesglosarGetnet = new javax.swing.JMenuItem();
        opDesglosarSantander = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RCAQ");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1300, 700));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N

        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        menuArchivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuArchivo.setText("Opciones");
        menuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        opInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        opInicio.setText("Volver Inicio");
        opInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInicioActionPerformed(evt);
            }
        });
        menuArchivo.add(opInicio);

        opEmisor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opEmisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emisor.png"))); // NOI18N
        opEmisor.setText("Cambiar a RCIN");
        opEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEmisorActionPerformed(evt);
            }
        });
        menuArchivo.add(opEmisor);

        opRCIS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opRCIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emisor.png"))); // NOI18N
        opRCIS.setText("Cambiar a RCIS");
        opRCIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRCISActionPerformed(evt);
            }
        });
        menuArchivo.add(opRCIS);

        menuCompleto.add(menuArchivo);

        menuInyectar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuInyectar.setText("Generar Tramas");
        menuInyectar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        opGetnet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opGetnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/getnet.png"))); // NOI18N
        opGetnet.setText("GetNet");
        opGetnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGetnetActionPerformed(evt);
            }
        });
        menuInyectar.add(opGetnet);

        opSantander.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opSantander.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sumup.png"))); // NOI18N
        opSantander.setText("Santander Chile");
        opSantander.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSantanderActionPerformed(evt);
            }
        });
        menuInyectar.add(opSantander);

        menuCompleto.add(menuInyectar);

        menuConvertir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuConvertir.setText("Convertir Tramas ");
        menuConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConvertir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        menuDesglosar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuDesglosar.setText("Desglosar Tramas");
        menuDesglosar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        opDesglosarGetnet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opDesglosarGetnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/getnet.png"))); // NOI18N
        opDesglosarGetnet.setText("GetNet");
        opDesglosarGetnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDesglosarGetnetActionPerformed(evt);
            }
        });
        menuDesglosar.add(opDesglosarGetnet);

        opDesglosarSantander.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opDesglosarSantander.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sumup.png"))); // NOI18N
        opDesglosarSantander.setText("Santander Chile");
        opDesglosarSantander.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDesglosarSantanderActionPerformed(evt);
            }
        });
        menuDesglosar.add(opDesglosarSantander);

        menuCompleto.add(menuDesglosar);

        setJMenuBar(menuCompleto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opSantanderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSantanderActionPerformed
        InyectarSantanderRCAQ inyectarSantanderRCAQ = new InyectarSantanderRCAQ();
        escritorio.add(inyectarSantanderRCAQ);
        inyectarSantanderRCAQ.setVisible(true);
    }//GEN-LAST:event_opSantanderActionPerformed

    private void opDesglosarSantanderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDesglosarSantanderActionPerformed
        DesglosarSantander desSantander = new DesglosarSantander();
        escritorio.add(desSantander);
        desSantander.setVisible(true);
    }//GEN-LAST:event_opDesglosarSantanderActionPerformed

    private void opInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInicioActionPerformed
        // TODO add your handling code here:
        InicioApp ventanaInicio = new InicioApp();
        ventanaInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_opInicioActionPerformed

    private void opGetnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGetnetActionPerformed
        InyectarGetnetRCAQ inyectarGetnetRCAQ = new InyectarGetnetRCAQ();
        escritorio.add(inyectarGetnetRCAQ);
        inyectarGetnetRCAQ.setVisible(true); 
    }//GEN-LAST:event_opGetnetActionPerformed

    private void opDesglosarGetnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDesglosarGetnetActionPerformed
        DesglosarGetnet desGetnet = new DesglosarGetnet();
        escritorio.add(desGetnet);
        desGetnet.setVisible(true);
    }//GEN-LAST:event_opDesglosarGetnetActionPerformed

    private void opEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEmisorActionPerformed
        VentanaRCIN ventanaRCIN =  new VentanaRCIN();
        ventanaRCIN.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_opEmisorActionPerformed

    private void opRCISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRCISActionPerformed
        VentanaRCIS ventanaRCIS = new VentanaRCIS();
        this.dispose();
        ventanaRCIS.setVisible(true);
    }//GEN-LAST:event_opRCISActionPerformed

    private void opASCIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opASCIIActionPerformed
        ConvertirASCIIRCAQ convertirASCIIRCAQ = new ConvertirASCIIRCAQ();
        escritorio.add(convertirASCIIRCAQ);
        convertirASCIIRCAQ.setVisible(true);
    }//GEN-LAST:event_opASCIIActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRCAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRCAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRCAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRCAQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRCAQ().setVisible(true);
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
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuCompleto;
    private javax.swing.JMenu menuConvertir;
    private javax.swing.JMenu menuDesglosar;
    private javax.swing.JMenu menuInyectar;
    private javax.swing.JMenuItem opASCII;
    private javax.swing.JMenuItem opDesglosarGetnet;
    private javax.swing.JMenuItem opDesglosarSantander;
    private javax.swing.JMenuItem opEmisor;
    private javax.swing.JMenuItem opGetnet;
    private javax.swing.JMenuItem opInicio;
    private javax.swing.JMenuItem opRCIS;
    private javax.swing.JMenuItem opSantander;
    // End of variables declaration//GEN-END:variables
}
