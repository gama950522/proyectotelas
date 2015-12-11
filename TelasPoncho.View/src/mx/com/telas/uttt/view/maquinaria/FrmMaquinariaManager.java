package mx.com.telas.uttt.view.maquinaria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import mx.com.telas.uttt.control.controller.CtrlCaracteristica;
import mx.com.telas.uttt.control.controller.CtrlDepartamento;
import mx.com.telas.uttt.control.controller.CtrlMaquinaria;
import mx.com.telas.uttt.control.validacion.CtrlValidacion;
import mx.com.telas.uttt.data.conexion.Conexion;
import mx.com.telas.uttt.data.entity.Caracteristica;
import mx.com.telas.uttt.data.entity.Departamento;
import mx.com.telas.uttt.data.entity.Maquinaria;

/**
 *
 * @author Alexis Gasga
 */
public class FrmMaquinariaManager extends javax.swing.JDialog {

    private Maquinaria maquinaG;
    private Connection connection;

    public FrmMaquinariaManager(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initData(null);
    }

    public FrmMaquinariaManager(java.awt.Frame parent, boolean modal, Object maquina) {
        super(parent, modal);
        initComponents();
        initData(maquina);
    }

    private void initData(Object maquina) {
        try {
            maquinaG = (Maquinaria) maquina;
            connection = Conexion.getConexion();
            if (maquina != null) {
                setTextBox();
            }
            setComboBox();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        }
    }
    
    private void setTextBox(){
        try {
            txtModelo.setText(maquinaG.getIdCaracteristica().getModelo());//correjir
            txtSerial.setText(maquinaG.getIdCaracteristica().getNumSerie());
            txtCosto.setText(String.valueOf(maquinaG.getIdCaracteristica().getCosto()));
            txtFuncionamiento.setText(maquinaG.getFuncionamiento());
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    private void setComboBox(){
        try{
            setComboBox_Departamento();
            if(maquinaG!=null){
                cmbMarca.setSelectedItem(maquinaG.getIdCaracteristica().getMarca());
                cmbMoneda.setSelectedItem(maquinaG.getIdCaracteristica().getMoneda());
            }
        }catch(Exception ex){
            System.err.println(ex);
        }
    }
    
    private void setComboBox_Departamento(){
        try {
            CtrlDepartamento ctrlDep = new CtrlDepartamento(connection);
            List<Object> lstDepartamento = ctrlDep.find();
            if (maquinaG == null) {
                cmbDepartamento.addItem(" --- Selecciona --- ");
            }
            for (int i = 0; i < lstDepartamento.size(); i++) {
                Departamento temp = (Departamento) lstDepartamento.get(i);
                cmbDepartamento.addItem(temp);
            }
            if(maquinaG!= null){
                cmbDepartamento.setSelectedItem(maquinaG.getIdDepartamento());
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox();
        txtModelo = new javax.swing.JTextField();
        txtSerial = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        cmbMoneda = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFuncionamiento = new javax.swing.JTextArea();
        cmbDepartamento = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Deployment-64.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("M A Q U N A R I A");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("[ A C C I O N ]");

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));

        jLabel4.setText("Marca:");

        jLabel5.setText("Modelo:");

        jLabel6.setText("No. Serie:");

        jLabel7.setText("Costo:");

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " --- Selecciona ---", "Wanora Galga", "Elgin Brothers", "Dubied", "Seifer & Donner Galga", "Protti", "Knittax" }));

        txtModelo.setToolTipText("");

        txtSerial.setToolTipText("");

        txtCosto.setToolTipText("");

        cmbMoneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Moneda", "$(Pesos)", "$(Dólares)", "€(Euro)" }));

        jLabel10.setText("Funcionamiento:");

        txtFuncionamiento.setColumns(20);
        txtFuncionamiento.setRows(5);
        jScrollPane1.setViewportView(txtFuncionamiento);

        jLabel11.setText("Departamento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtModelo)
                            .addComponent(txtSerial)
                            .addComponent(cmbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if(save()){
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Algo no salió bien intentalo nuevamente", getTitle(), JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private Maquinaria getMaquina(){
        Maquinaria maquinaria = null;
        try {
            maquinaria = (maquinaG == null) ? new Maquinaria() : maquinaG;
            maquinaria.setFuncionamiento(txtFuncionamiento.getText().trim());
            maquinaria.setIdDepartamento((Departamento)cmbDepartamento.getSelectedItem());
            return maquinaria;
        } catch (Exception ex) {
            System.err.println(ex);
            return maquinaria;
        }
    }
    
    private Caracteristica getCaracteristica(){
        Caracteristica caracteristica = null;
        try {
            caracteristica = (maquinaG == null) ? new Caracteristica() : maquinaG.getIdCaracteristica();
            caracteristica.setMarca(cmbMarca.getSelectedItem().toString());
            caracteristica.setModelo(txtModelo.getText().trim());
            caracteristica.setNumSerie(txtSerial.getText().trim());
            caracteristica.setCosto(Double.parseDouble(txtCosto.getText().trim()));
            caracteristica.setMoneda(cmbMoneda.getSelectedItem().toString());
            return caracteristica;
        } catch (Exception ex) {
            System.err.println(ex);
            return caracteristica;
        }
    }
    
    private boolean save() {
        return (maquinaG == null) ? add() : edit();
    }

    private boolean add() {
        try {
            connection.setAutoCommit(false);
            CtrlMaquinaria ctrlMaquina = new CtrlMaquinaria(connection);
            CtrlCaracteristica ctrlCaract = new CtrlCaracteristica(connection);
            if(ctrlCaract.add(getCaracteristica())){
                Maquinaria temp = getMaquina();
                temp.setIdCaracteristica((Caracteristica) ctrlCaract.getLastField());
                if(ctrlMaquina.add(temp)){
                    JOptionPane.showMessageDialog(this, "La información se guardó correctamente", getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    connection.commit();
                    return true;
                }
            }
            connection.rollback();
            return false;
        } catch (Exception ex) {
            System.err.println(ex);
            return false;
        }
    }

    private boolean edit() {
        try {
            connection.setAutoCommit(false);
            CtrlMaquinaria ctrlMaquina = new CtrlMaquinaria(connection);
            CtrlCaracteristica ctrlCaract = new CtrlCaracteristica(connection);
            if(ctrlCaract.edit(getCaracteristica())){
                if(ctrlMaquina.edit(getMaquina())){
                    JOptionPane.showMessageDialog(this, "El registro fue actualizado exitosamente", getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    connection.commit();
                    return true;
                }
            }
            connection.rollback();
            return false;
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return false;
    }
    
    private boolean wasValid(){
        CtrlValidacion ctrlVal = new CtrlValidacion();
        return false;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Main & Components">
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmMaquinariaManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmMaquinariaManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmMaquinariaManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmMaquinariaManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                FrmMaquinariaManager dialog = new FrmMaquinariaManager(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbDepartamento;
    private javax.swing.JComboBox cmbMarca;
    private javax.swing.JComboBox cmbMoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextArea txtFuncionamiento;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}