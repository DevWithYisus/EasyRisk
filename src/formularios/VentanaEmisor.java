package formularios;

import java.awt.Image;
import java.awt.Toolkit;

public class VentanaEmisor extends javax.swing.JFrame {

    public VentanaEmisor() {
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
        menuInyectar = new javax.swing.JMenu();
        opSumup = new javax.swing.JMenuItem();
        opCpm = new javax.swing.JMenuItem();
        opBppr = new javax.swing.JMenuItem();
        menuDesglosar = new javax.swing.JMenu();
        opDesglosarSumup = new javax.swing.JMenuItem();
        opDesglosarCpm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RCIN/S");
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

        menuArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuArchivo.setText("Opciones...");
        menuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        opInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        opInicio.setText("Volver al Inicio");
        opInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInicioActionPerformed(evt);
            }
        });
        menuArchivo.add(opInicio);

        opEmisor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opEmisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adquirente.png"))); // NOI18N
        opEmisor.setText("Cambiar Adquirente");
        opEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEmisorActionPerformed(evt);
            }
        });
        menuArchivo.add(opEmisor);

        menuCompleto.add(menuArchivo);

        menuInyectar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuInyectar.setText("Generar Tramas...");
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

        menuCompleto.add(menuInyectar);

        menuDesglosar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuDesglosar.setText("Desglosar Tramas...");
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
        InyectarSumup ventanaSumup = new InyectarSumup();
        escritorio.add(ventanaSumup);
        ventanaSumup.setVisible(true);
    }//GEN-LAST:event_opSumupActionPerformed

    private void opDesglosarSumupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDesglosarSumupActionPerformed
        DesglosarSumup desSumup =  new DesglosarSumup();
        escritorio.add(desSumup);
        desSumup.setVisible(true);
    }//GEN-LAST:event_opDesglosarSumupActionPerformed

    private void opEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEmisorActionPerformed
        VentanaAdquirente ventanaAdquirente = new VentanaAdquirente();
        ventanaAdquirente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_opEmisorActionPerformed

    private void opBpprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBpprActionPerformed
        InyectarBppr ventanaBppr = new InyectarBppr();
        escritorio.add(ventanaBppr);
        ventanaBppr.setVisible(true);
    }//GEN-LAST:event_opBpprActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEmisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmisor().setVisible(true);
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
    private javax.swing.JMenu menuDesglosar;
    private javax.swing.JMenu menuInyectar;
    private javax.swing.JMenuItem opBppr;
    private javax.swing.JMenuItem opCpm;
    private javax.swing.JMenuItem opDesglosarCpm;
    private javax.swing.JMenuItem opDesglosarSumup;
    private javax.swing.JMenuItem opEmisor;
    private javax.swing.JMenuItem opInicio;
    private javax.swing.JMenuItem opSumup;
    // End of variables declaration//GEN-END:variables
}
