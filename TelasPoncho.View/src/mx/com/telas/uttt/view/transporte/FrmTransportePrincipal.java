package mx.com.telas.uttt.view.transporte;

import java.awt.Frame;
import java.sql.Connection;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import mx.com.telas.uttt.control.controller.CtrlTrasnporte;
import mx.com.telas.uttt.data.conexion.Conexion;
import mx.com.telas.uttt.data.entity.Transporte;

/**
 *
 * @author Alexis Gasga
 */
public class FrmTransportePrincipal extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTrasporte;
    private Connection connection;
    private final Frame parent;

    public FrmTransportePrincipal(Frame parent) {
        initComponents();
        initData();
        this.parent=parent;
    }

    private void initData() {
        try {
            connection = Conexion.getConexion();
            createTable();
            setTable_Transporte();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void createTable() {
        try {
            String[] head = {"Object","idTransporte","idCaracteristica","idEmpleado(Operador)","Agencia","Año","Velocidad","UnidadVel","Matricula","Peso", "UnidadPeso","capasidad","UnidadCap","activo","disponible","rutas"};
            Object[][] body = {};
            modeloTrasporte = new DefaultTableModel(body, head);
            tblTransporte.setModel(modeloTrasporte);
            hideColumns_Transporte();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void hideColumns_Transporte() {
        try {
            tblTransporte.getColumnModel().getColumn(0).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(0).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(1).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(1).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(2).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(2).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(3).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(3).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(5).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(5).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(6).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(6).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(7).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(7).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(9).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(9).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(10).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(10).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(11).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(11).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(12).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(12).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(12).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(13).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(13).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(13).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(14).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(14).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(14).setMaxWidth(0);
            
            tblTransporte.getColumnModel().getColumn(15).setMinWidth(0);
            tblTransporte.getColumnModel().getColumn(15).setPreferredWidth(0);
            tblTransporte.getColumnModel().getColumn(15).setMaxWidth(0);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransporte = new javax.swing.JTable();
        lblNumRegistros = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblApaterno = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAmaterno = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblNumControl = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        lblAgencia = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Medio de transporte");

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Truck-65.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        tblTransporte.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse){
                tblTransporteValueChanged(lse);
            }
        });
        jScrollPane2.setViewportView(tblTransporte);

        lblNumRegistros.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNumRegistros.setText("[...]");

        jLabel3.setText("Numero de registros:");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447403066_plus.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/edit-16.png"))); // NOI18N
        btnEdit.setText("Modificar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/delete.png"))); // NOI18N
        jButton3.setText("Eliminar");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/list.png"))); // NOI18N
        jButton4.setText("jButton4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447219501_search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumRegistros))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumRegistros)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Bill-50.png"))); // NOI18N
        jLabel2.setText("[ Informe del transporte ]");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Driver-32.png"))); // NOI18N
        jLabel6.setText("[ Datos del conductor ]");

        jLabel7.setText("Nombre(s):");

        lblNombre.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNombre.setText("[...]");

        jLabel9.setText("Apellido paterno:");

        lblApaterno.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblApaterno.setText("[...]");

        jLabel11.setText("Apellido materno:");

        lblAmaterno.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAmaterno.setText("[...]");

        jLabel13.setText("Num. de control");

        lblNumControl.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        lblNumControl.setText("[...]");

        jLabel15.setText("Agencia:");

        lblAgencia.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAgencia.setText("[...]");

        jLabel17.setText("Maticula:");

        lblMatricula.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblMatricula.setText("[...]");

        jLabel19.setText("Modelo:");

        lblModelo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblModelo.setText("[...]");

        jLabel21.setText("Velocidad:");

        lblVelocidad.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblVelocidad.setText("[...]");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(lblNombre))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(lblApaterno))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmaterno)
                                    .addComponent(jLabel11)))
                            .addComponent(jLabel13)
                            .addComponent(lblNumControl)
                            .addComponent(jLabel6)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(lblAgencia))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(lblMatricula))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(lblModelo))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVelocidad)
                                    .addComponent(jLabel21))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAgencia)
                            .addComponent(lblMatricula)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblVelocidad))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblModelo))))
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumControl)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblApaterno)
                    .addComponent(lblAmaterno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("T R A N S P O R T E");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            FrmTransporteManager frmTransporteManager = new FrmTransporteManager(parent, true);
            frmTransporteManager.setVisible(true);
            setTable_Transporte();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            if(tblTransporte.getSelectedRow() != -1){
                Transporte temp = (Transporte)tblTransporte.getValueAt(tblTransporte.getSelectedRow(), 0);
                FrmTransporteManager frmTM = new FrmTransporteManager(parent, true, temp);
                frmTM.setVisible(true);
                setTable_Transporte();
            }
        }catch(Exception ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblTransporteValueChanged(ListSelectionEvent lse){
        try {
            int row = tblTransporte.getSelectedRow();
            Transporte temp = (Transporte)tblTransporte.getValueAt(row, 0);
            setLabelInformation(temp);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    private void setLabelInformation(Transporte transporte) {
        try {
            lblAgencia.setText(transporte.getAgencia());
            lblMatricula.setText(transporte.getMatricula());
            lblModelo.setText(transporte.getIdCaracteristica().getModelo() + " " + transporte.getYear());
            lblVelocidad.setText(transporte.getVelocidad() + " " + transporte.getUnidadVelocidad());
            lblNumControl.setText(transporte.getIdEmpleado().getNumControl());
            lblNombre.setText(transporte.getIdEmpleado().getIdPersona().getNombre());
            lblApaterno.setText(transporte.getIdEmpleado().getIdPersona().getaPareno());
            lblAmaterno.setText(transporte.getIdEmpleado().getIdPersona().getaMaterno());
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    private void setTable_Transporte() {
        try {
            cleanTable_Transporte();
            CtrlTrasnporte ctrlTrasporte = new CtrlTrasnporte(connection);
            List<Object> lstTransporte = ctrlTrasporte.find();
            Object[] row = new Object[tblTransporte.getColumnCount()];
            for (int i = 0; i < lstTransporte.size(); i++) {
                Transporte temp = (Transporte) lstTransporte.get(i);
                row[0] = temp;
                row[1] = temp.getIdTransporte();
                row[2] = temp.getIdCaracteristica();
                row[3] = temp.getIdEmpleado();
                row[4] = temp.getAgencia();
                row[5] = temp.getYear();
                row[6] = temp.getVelocidad();
                row[7] = temp.getUnidadVelocidad();
                row[8] = temp.getMatricula();
                row[9] = temp.getPeso();
                row[10] = temp.getUnidadPeso();
                row[11] = temp.getCapasidad();
                row[12] = temp.getUnidadCapasidad();
                row[13] = temp.getActivo();
                row[14] = temp.getDisponible();
                row[15] = temp.getTieneRutas();
                modeloTrasporte.addRow(row);
            }
            tblTransporte.setModel(modeloTrasporte);
            if (tblTransporte.getRowCount() > 0) {
                tblTransporte.setRowSelectionInterval(0, 0);
                lblNumRegistros.setText(String.valueOf(tblTransporte.getRowCount()));
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void cleanTable_Transporte(){
        try {
            for (int i = 0; i < tblTransporte.getRowCount(); i++) {
            modeloTrasporte.removeRow(i);
            i -= 1;
        }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblAmaterno;
    private javax.swing.JLabel lblApaterno;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumControl;
    private javax.swing.JLabel lblNumRegistros;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JTable tblTransporte;
    // End of variables declaration//GEN-END:variables
}
