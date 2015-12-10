package mx.com.telas.uttt.view.index;

import com.sun.awt.AWTUtilities;
import javax.swing.JProgressBar;

/**
 *
 * @author AlexisGasga
 */
public class SplashsScreen extends javax.swing.JFrame implements Runnable {

    public SplashsScreen() {
        Transparencia();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 420, 30));

        jScrollPane1.setBorder(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/splash@2x.gif"))); // NOI18N
        jScrollPane1.setViewportView(jLabel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Hilo(jProgressBar1).start();
    }//GEN-LAST:event_formWindowOpened

    @Override
    public void run() {
        try {
            setVisible(true);
            Thread.sleep(6000);
            dispose();
            FrmLogin Logeo = FrmLogin.getInstance();
            Logeo.setVisible(true);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private class Hilo extends Thread {

        private int num = 0;
        private JProgressBar progessBar;

        Hilo(JProgressBar Barra) {
            this.progessBar = Barra;
        }

        private void llenarBarra() {

            if (progessBar.getValue() <= 100) {
                num += 1;
                progessBar.setValue(num);
                progessBar.setStringPainted(true);
            } else {
                progessBar.setValue(0);
            }

        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(55);
                    llenarBarra();
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    private void Transparencia() {
        setUndecorated(true);
            AWTUtilities.setWindowOpaque(this, false);
    }

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
            java.util.logging.Logger.getLogger(SplashsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Thread(new SplashsScreen()).start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
