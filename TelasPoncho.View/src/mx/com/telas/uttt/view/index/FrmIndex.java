package mx.com.telas.uttt.view.index;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.telas.uttt.control.validacion.Login;
import mx.com.telas.uttt.view.empleado.FrmEmpleadoPrincipal;
import mx.com.telas.uttt.view.maquinaria.FrmMaquinariaPrincipal;
import mx.com.telas.uttt.view.proveedor.FrmProveedorPrincipal;
import mx.com.telas.uttt.view.stock.FrmStockPrincipal;
import mx.com.telas.uttt.view.transporte.FrmTransportePrincipal;

/**
 *
 * @author AlexisGasga
 */
public class FrmIndex extends javax.swing.JFrame implements Runnable {

    private String hora, minutos, segundos, ampm;
    private Calendar calendario;
    private Thread hilo;

    public FrmIndex() {
        initComponents();
        initData();
    }

    private void initData() {
        hilo = new Thread(this);
        hilo.start();
        setResizable(false);
        if(Login.getEmpleado()!= null){
            lblOperador.setText(Login.getEmpleado().getIdPersona().getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel5 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        lblOperador = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuEmpresa = new javax.swing.JMenu();
        mnuProveeores = new javax.swing.JMenuItem();
        mnuPersonal = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        desktopPane.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        jToolBar1.setFloatable(false);

        jLabel3.setText("Fecha:   ");
        jToolBar1.add(jLabel3);

        lblFecha.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447379235_calendar.png"))); // NOI18N
        lblFecha.setText("11 de Noviembre del 2015");
        jToolBar1.add(lblFecha);
        jToolBar1.add(jSeparator2);

        jLabel5.setText("   Hora:   ");
        jToolBar1.add(jLabel5);

        lblHora.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447378509_clock.png"))); // NOI18N
        lblHora.setText("04:14:16");
        jToolBar1.add(lblHora);
        jToolBar1.add(jSeparator5);

        jToolBar2.setFloatable(false);

        jLabel2.setText("Operador:   ");
        jToolBar2.add(jLabel2);

        lblOperador.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447382673_businessman.png"))); // NOI18N
        lblOperador.setText("root");
        jToolBar2.add(lblOperador);

        menuBar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        fileMenu.setMnemonic('f');
        fileMenu.setText("ARCHIVO");

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Cancel-16.png"))); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu2.setText("REGISTROS");

        mnuEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Organization-16.png"))); // NOI18N
        mnuEmpresa.setText("Empresas");

        mnuProveeores.setText("Proveedores");
        mnuProveeores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProveeoresActionPerformed(evt);
            }
        });
        mnuEmpresa.add(mnuProveeores);

        jMenu2.add(mnuEmpresa);

        mnuPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Worker-16.png"))); // NOI18N
        mnuPersonal.setText("Personal");
        mnuPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPersonalActionPerformed(evt);
            }
        });
        jMenu2.add(mnuPersonal);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Deployment-16.png"))); // NOI18N
        jMenuItem7.setText("Maquinaria");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Truck-16.png"))); // NOI18N
        jMenuItem8.setText("Medio de transporte");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        menuBar.add(jMenu2);

        jMenu4.setText("ALMACÉN");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Product-16.png"))); // NOI18N
        jMenuItem9.setText("Materia prima");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Polishing Cloth-16.png"))); // NOI18N
        jMenuItem10.setText("Producto terminado");
        jMenu4.add(jMenuItem10);

        jMenuItem3.setText("Entradas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        menuBar.add(jMenu4);

        jMenu5.setText("CUENTA");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Exit-16.png"))); // NOI18N
        jMenuItem11.setText("Cerrar sesion");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        menuBar.add(jMenu5);

        helpMenu.setMnemonic('h');
        helpMenu.setText("AYUDA");

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/UpgradeReport_Information.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(desktopPane)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        try {
            FrmStockPrincipal frmSP = new FrmStockPrincipal(this);
            if (!frmSP.isVisible()) {
                desktopPane.add(frmSP);
                frmSP.show();
            }
            frmSP.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmIndex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void mnuPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPersonalActionPerformed
        try {
            FrmEmpleadoPrincipal frmEmpleadoP = new FrmEmpleadoPrincipal(this);
            if (!frmEmpleadoP.isVisible()) {
                desktopPane.add(frmEmpleadoP);
            }
            frmEmpleadoP.show();
            frmEmpleadoP.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmIndex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuPersonalActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        
        cerrarSesion();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void mnuProveeoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProveeoresActionPerformed
        try {
            FrmProveedorPrincipal frmProvP = new FrmProveedorPrincipal(this);
            desktopPane.add(frmProvP);
            frmProvP.show();
            frmProvP.setMaximum(true);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_mnuProveeoresActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            FrmStockPrincipal frmStockP= new FrmStockPrincipal(this);
            desktopPane.add(frmStockP);
            frmStockP.show();
            frmStockP.setMaximum(true);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            FrmMaquinariaPrincipal fmp = new FrmMaquinariaPrincipal(this);
            desktopPane.add(fmp);
            fmp.show();
            fmp.setMaximum(true);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            FrmTransportePrincipal frmTP= new FrmTransportePrincipal(this);
            desktopPane.add(frmTP);
            frmTP.show();
            frmTP.setMaximum(true);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void cerrarSesion(){
        Login.setEmpleado(null);
        dispose();
        FrmLogin login = FrmLogin.getInstance();
        login.setVisible(true);
    }
    //<editor-fold defaultstate="collapsed" desc="main & declaracion de componentes">
//        public static void main(String args[]) {
//            /* Set the Nimbus look and feel */
//            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//             */
//            try {
//                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                    if ("Nimbus".equals(info.getName())) {
//                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                        break;
//                    }
//                }
//            } catch (ClassNotFoundException ex) {
//                java.util.logging.Logger.getLogger(FrmIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (InstantiationException ex) {
//                java.util.logging.Logger.getLogger(FrmIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                java.util.logging.Logger.getLogger(FrmIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//                java.util.logging.Logger.getLogger(FrmIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }
//            //</editor-fold>
//    
//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                @Override
//                public void run() {
//                    new FrmIndex().setVisible(true);
//                }
//            });
//        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblOperador;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuEmpresa;
    private javax.swing.JMenuItem mnuPersonal;
    private javax.swing.JMenuItem mnuProveeores;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == hilo) {
            calcula();
            lblHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            lblFecha.setText(calendario.get(Calendar.DAY_OF_MONTH) + "/" + calendario.get(Calendar.MONTH) + "/" + calendario.get(Calendar.YEAR));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    private void calcula() {
        calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
    

}
