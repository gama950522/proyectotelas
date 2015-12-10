package mx.com.telas.uttt.view.proveedor;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import mx.com.telas.uttt.control.controller.CtrlContacto;
import mx.com.telas.uttt.control.controller.CtrlProveedor;
import mx.com.telas.uttt.data.conexion.Conexion;
import mx.com.telas.uttt.data.entity.Proveedor;

/**
 *
 * @author AlexisGasga
 */
public class FrmProveedorPrincipal extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloProveedores;
    private FrmProveedorManager frmProvManager;
    private Proveedor proveedor;
    private Frame parent;
    private Connection connection;
    
    public FrmProveedorPrincipal(Frame parent) {
        initComponents();
        initData();
        this.parent = parent;
    }

    private void initData(){
        connection = getConnection();
        createTable();
        setTable();
    }
    
    private Connection getConnection(){
        try {
            return Conexion.getConexion();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FrmProveedorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    private void createTable(){
        createTableProveedor();
    }
    
    private void setTable(){
        setTableProveedor();
    }
    
    private void createTableProveedor(){
        String[] head = {"Object","idProveedor","idEmpresa","Proveedor", "Razaon social","RFC","Gerente", "webSite","email","contacto"};
        Object[][] body = {};
        modeloProveedores = new DefaultTableModel(body, head);
        tblProveedores.setModel(modeloProveedores);
        hideColumnsProveedor();
    }
    
    private void hideColumnsProveedor(){
        try {
            tblProveedores.getColumnModel().getColumn(0).setMinWidth(0);
            tblProveedores.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
            tblProveedores.getColumnModel().getColumn(1).setMinWidth(0);
            tblProveedores.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblProveedores.getColumnModel().getColumn(1).setMaxWidth(0);
            tblProveedores.getColumnModel().getColumn(2).setMinWidth(0);
            tblProveedores.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblProveedores.getColumnModel().getColumn(2).setMaxWidth(0);
            tblProveedores.getColumnModel().getColumn(5).setMinWidth(0);
            tblProveedores.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblProveedores.getColumnModel().getColumn(5).setMaxWidth(0);
            tblProveedores.getColumnModel().getColumn(6).setMinWidth(0);
            tblProveedores.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblProveedores.getColumnModel().getColumn(6).setMaxWidth(0);
            tblProveedores.getColumnModel().getColumn(7).setMinWidth(0);
            tblProveedores.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblProveedores.getColumnModel().getColumn(7).setMaxWidth(0);
            tblProveedores.getColumnModel().getColumn(8).setMinWidth(0);
            tblProveedores.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblProveedores.getColumnModel().getColumn(8).setMaxWidth(0);
            tblProveedores.getColumnModel().getColumn(9).setMinWidth(0);
            tblProveedores.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblProveedores.getColumnModel().getColumn(9).setMaxWidth(0);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    private void setTableProveedor(){
        try {
            cleanTable();
            CtrlProveedor ctrlProveedor = new CtrlProveedor(connection);
            CtrlContacto ctrlContacto = new CtrlContacto(connection);
            List<Object> listaProveedores = ctrlProveedor.find();
            Object fila[] = new Object[tblProveedores.getColumnCount()];
            for (int i = 0; i < listaProveedores.size(); i++) {
                Proveedor temp = (Proveedor)listaProveedores.get(i);
                fila[0] = temp; 
                fila[1] = temp.getIdProveedor(); 
                fila[2] = temp.getIdEmpresa(); 
                fila[3] = temp.getIdEmpresa().getReferencia(); 
                fila[4] = temp.getIdEmpresa().getRazonSocial(); 
                fila[5] = temp.getIdEmpresa().getRfc(); 
                fila[6] = temp.getIdEmpresa().getGerenteGeneral();  
                fila[7] = temp.getIdEmpresa().getWebSite(); 
                fila[8] = temp.getIdEmpresa().getEmail(); 
                          temp.setContacto(ctrlContacto.find(temp));
                fila[9] = temp.getContacto();
                modeloProveedores.addRow(fila);
            }
            tblProveedores.setModel(modeloProveedores);
            if(tblProveedores.getRowCount() > 0){
                tblProveedores.setRowSelectionInterval(0, 0);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    private void cleanTable(){
        try {
            for (int i = 0; i < tblProveedores.getRowCount(); i++) {
                modeloProveedores.removeRow(i);
                i -= 1;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void setInformation(Proveedor proveedor){
        try {
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("R G I S T R  O S    D E   P R O V E E D O R E S");

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros"));

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/list-add-16.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/edit-16.png"))); // NOI18N
        btnEdit.setText("Actualizar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/delete.png"))); // NOI18N
        btnRemove.setText("Borrar");

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/list.png"))); // NOI18N
        btnReport.setText("Informe");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447219501_search.png"))); // NOI18N

        tblProveedores.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse){
                tblProveedoresValueChanged(lse);
            }
        });
        jScrollPane1.setViewportView(tblProveedores);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("3");

        jLabel4.setText("Numero de registros:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnRemove)
                    .addComponent(btnReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)))
        );

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jToolBar2.setFloatable(false);
        jToolBar2.setBorderPainted(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/refresh.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 218, Short.MAX_VALUE)))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        try {
            frmProvManager = new FrmProveedorManager(parent, true);
            frmProvManager.mostrar();
            setTableProveedor();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            frmProvManager = new FrmProveedorManager(parent, true, proveedor);
            frmProvManager.mostrar();
            setTableProveedor();
        } catch (Exception ex) {
            throw ex;
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblProveedoresValueChanged(ListSelectionEvent lse){
        try {
            if (tblProveedores.getSelectedRow() != -1) {
                int row = tblProveedores.getSelectedRow();
                proveedor = (Proveedor)tblProveedores.getValueAt(row, 0);
                setInformation(proveedor);
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tblProveedores;
    // End of variables declaration//GEN-END:variables
}
