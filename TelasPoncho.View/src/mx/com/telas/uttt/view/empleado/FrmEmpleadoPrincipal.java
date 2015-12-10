package mx.com.telas.uttt.view.empleado;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import mx.com.telas.uttt.control.controller.CtrlCuenta;
import mx.com.telas.uttt.control.controller.CtrlDepartamento;
import mx.com.telas.uttt.control.controller.CtrlDireccion;
import mx.com.telas.uttt.control.controller.CtrlEmpleado;
import mx.com.telas.uttt.control.controller.CtrlPersona;
import mx.com.telas.uttt.control.controller.CtrlTelefono;
import mx.com.telas.uttt.control.controller.CtrlTurno;
import mx.com.telas.uttt.data.conexion.Conexion;
import mx.com.telas.uttt.data.entity.Departamento;
import mx.com.telas.uttt.data.entity.Empleado;
import mx.com.telas.uttt.data.entity.Turno;

/**
 *
 * @author AlexisGasga
 */
public class FrmEmpleadoPrincipal extends javax.swing.JInternalFrame {

    private static FrmEmpleadoPrincipal instance;
    private DefaultTableModel modeloEmpleados;
    private DefaultTableModel modeloDepartamento;
    private DefaultTableModel modeloTurnos;
    private Empleado empleado;
    private Connection connection;
    private String nombreEmpleado ="";
    private Frame parent;
    private Departamento idDepartamento;
    private Turno idTurno;
    
    public FrmEmpleadoPrincipal(Frame parent) {
        initComponents();
        initData();
        this.parent = parent;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTurnos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        lblNumRegistros = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnReport = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNumCuenta = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAPaterno = new javax.swing.JLabel();
        lblAMaterno = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblCurp = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblRfc = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblEscolaridad = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jToolBar2 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("EMPLEADOS");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447386410_businessman.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        tblDepartamentos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse){
                tblDepartamentosValueChanged(lse);
            }
        });
        jScrollPane2.setViewportView(tblDepartamentos);

        tblTurnos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse){
                tblTurnosValueChanged(lse);
            }
        });
        jScrollPane5.setViewportView(tblTurnos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros"));

        tblEmpleados.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse){
                tblRegistrosValueChanged(lse);
            }
        });
        jScrollPane3.setViewportView(tblEmpleados);

        lblNumRegistros.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNumRegistros.setText("2");

        jLabel3.setText("Número de registros:");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/list-add-16.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/edit-16.png"))); // NOI18N
        btnEdit.setText("Actualizar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/delete.png"))); // NOI18N
        btnDelete.setText("Borrar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447219501_search.png"))); // NOI18N

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/list.png"))); // NOI18N
        btnReport.setText("Informe");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumRegistros))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReport))
                            .addComponent(txtBusqueda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumRegistros)
                    .addComponent(jLabel3)))
        );

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Remove-Male-User.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        jLabel2.setText("Numero de empleado:");

        lblNumCuenta.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNumCuenta.setText("jLabel5");

        jScrollPane4.setBorder(null);

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));

        jLabel6.setText("Nombre:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setText("jLabel7");

        jLabel8.setText("Apellido paterno:");

        jLabel9.setText("Apellido materno:");

        lblAPaterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAPaterno.setText("jLabel10");

        lblAMaterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAMaterno.setText("jLabel11");

        jLabel10.setText("Edad:");

        lblEdad.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblEdad.setText("jLabel11");

        jLabel11.setText("Fecha de nacimiento:");

        lblFechaNacimiento.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblFechaNacimiento.setText("jLabel12");

        jLabel13.setText("Sexo:");

        lblSexo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblSexo.setText("jLabel14");

        jLabel15.setText("Estado civil:");

        lblEstadoCivil.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblEstadoCivil.setText("jLabel16");

        jLabel17.setText("CURP:");

        lblCurp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblCurp.setText("jLabel18");

        jLabel19.setText("RFC:");

        lblRfc.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblRfc.setText("jLabel18");

        jLabel12.setText("Turno:");

        lblTurno.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblTurno.setText("jLabel14");

        jLabel14.setText("Departamento:");

        lblDepartamento.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDepartamento.setText("jLabel16");

        jLabel16.setText("Escolaridad:");

        lblEscolaridad.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblEscolaridad.setText("jLabel18");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(lblCurp))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRfc)
                                    .addComponent(jLabel19)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(lblSexo))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(lblEstadoCivil))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(lblFechaNacimiento))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEscolaridad)
                                    .addComponent(jLabel16)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblNombre))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(lblAPaterno))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAMaterno)
                                    .addComponent(jLabel9))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(lblEdad)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(lblTurno))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepartamento)
                            .addComponent(jLabel14))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jLabel10))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblEdad))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAPaterno)
                            .addComponent(lblAMaterno)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel16)))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSexo)
                        .addComponent(lblEstadoCivil))
                    .addComponent(lblFechaNacimiento)
                    .addComponent(lblEscolaridad))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurp)
                    .addComponent(lblRfc))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurno)
                    .addComponent(lblDepartamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel7);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1441683259_pdf.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNumCuenta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator3)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumCuenta))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" R E G I S T R O   D E   E M P L E A D O S ");

        jToolBar2.setFloatable(false);
        jToolBar2.setBorderPainted(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447403049_synchronize.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        try{
            FrmEmpleadoManager frmEmpleadoM = new FrmEmpleadoManager(parent, true);
            frmEmpleadoM.setVisible(true);
            //frmEmpleadoM.show();
            //frmEmpleadoM.show(isIcon);
            setTableEmpleado();
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar el registro?", getTitle(), JOptionPane.YES_NO_OPTION);
            if(opcion == JOptionPane.YES_OPTION){
                if(removeField(empleado)){
                    JOptionPane.showMessageDialog(this, "Registro borrado exitosamente", getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    setTableEmpleado();
                }else{
                    JOptionPane.showMessageDialog(this, "Hubo un error mientras se trataba\nde eliminar el registro,\nintentelo más tarde!", getTitle(), JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch(Exception ex) {
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        try{
        instance = null;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            FrmEmpleadoManager frmEmpleadoM = new FrmEmpleadoManager(parent, true, empleado);
            frmEmpleadoM.setVisible(true);
            setTableEmpleado();
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
        //Obtiene a todos los empleados que en el nombre de la persona comience con al
        //select * from empleado where idPersona in (select idPersona from Persona where nombre like'al%');
        nombreEmpleado = txtBusqueda.getText().trim();
        setTableEmpleado();
        nombreEmpleado = "";
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblRegistrosValueChanged(ListSelectionEvent lse){
        if(tblEmpleados.getSelectedRow() != -1){
            int row = tblEmpleados.getSelectedRow();
            empleado = (Empleado)tblEmpleados.getValueAt(row, 0);
            setJLablelInformation(empleado);
        }
    }

    private void tblDepartamentosValueChanged(ListSelectionEvent lse){
        if(tblDepartamentos.getSelectedRow() > 0){
            int row = tblDepartamentos.getSelectedRow();
            idDepartamento = (Departamento)tblDepartamentos.getValueAt(row, 0);
        }else{
            idDepartamento = null;
        }
        setTableEmpleado();
    }

    private void tblTurnosValueChanged(ListSelectionEvent lse){
        if(tblTurnos.getSelectedRow() > 0){
            int row = tblTurnos.getSelectedRow();
            idTurno = (Turno)tblTurnos.getValueAt(row, 0);
        }else{
            idTurno = null;
        }
        setTableEmpleado();
    }
    
    private void setJLablelInformation(Empleado empleado){
        lblNumCuenta.setText(empleado.getNumControl());
        lblNombre.setText(empleado.getIdPersona().getNombre());
        lblAPaterno.setText(empleado.getIdPersona().getaPareno());
        lblAMaterno.setText(empleado.getIdPersona().getaMaterno());
        lblEdad.setText(empleado.getIdPersona().getEdad() + " Años");
        lblSexo.setText(empleado.getIdPersona().getSexo());
        lblEstadoCivil.setText(empleado.getIdPersona().getEstadoCivil());
        lblFechaNacimiento.setText(empleado.getIdPersona().getFechaNacimiento()+"");
        lblCurp.setText(empleado.getCurp());
        lblRfc.setText(empleado.getRfc());
        lblTurno.setText(empleado.getIdTurno().getTurno());
        lblDepartamento.setText(empleado.getIdPuesto().getIdDepartamento().getNombre());
        lblEscolaridad.setText(empleado.getEscolaridad());
    }
    
    private void initData(){
        connection = getConnection();
        createTable();
        setTeble();
    }
    
    private void createTable(){
        createTableEmpleado();
        createTableDeparatmento();
        createTableTurno();
    }
    
    private void setTeble(){
        setTableDepartamento();
        setTableTurno();
        setTableEmpleado();
    }
    
    private void setTableEmpleado(){
        cleanTable();
        CtrlEmpleado ctrlEmpleado = new CtrlEmpleado(connection);
        List<Object> listaEmpleados = ctrlEmpleado.find(nombreEmpleado, idDepartamento, idTurno);
        Object fila[] = new Object[tblEmpleados.getColumnCount()];
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado temp = (Empleado)listaEmpleados.get(i);
            fila[0] = temp;
            fila[1] = temp.getIdEmpleado();
            fila[2] = temp.getIdPersona();
            fila[3] = temp.getIdPuesto();
            fila[4] = temp.getIdTurno();
            fila[5] = temp.getIdDireccion();
            fila[6] = temp.getIdTelefono();
            fila[7] = temp.getEmail();
            fila[8] = temp.getIdCuenta();
            fila[9] = temp.getNumControl();
            fila[10] = temp.getCurp();
            fila[11] = temp.getRfc();
            fila[12] = temp.getEscolaridad();
            fila[13] = temp.getFechaRegistro();
            fila[14] = temp.getIdPersona().getNombre();
            fila[15] = temp.getIdPersona().getaPareno()+ " " + temp.getIdPersona().getaMaterno();
            modeloEmpleados.addRow(fila);
        }
        tblEmpleados.setModel(modeloEmpleados);
        if(tblEmpleados.getRowCount() > 0){
            tblEmpleados.setRowSelectionInterval(0, 0);
            lblNumRegistros.setText(String.valueOf(tblEmpleados.getRowCount()));
        }
    }
    
    private void setTableDepartamento(){
        CtrlDepartamento ctrlDepartamento = new CtrlDepartamento(connection);
        List<Object> listaDepartamentos = ctrlDepartamento.find();
        Object fila[] = new Object[tblDepartamentos.getColumnCount()];
        fila[3] = "Todos";
        modeloDepartamento.addRow(fila);
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            Departamento departamento = (Departamento)listaDepartamentos.get(i);
            fila[0] = departamento;
            fila[1] = departamento.getIdDepartamento();
            fila[2] = departamento.getIdJefe();
            fila[3] = departamento.getNombre();
            fila[4] = departamento.getFuncion();
            modeloDepartamento.addRow(fila);
        }
        tblDepartamentos.setModel(modeloDepartamento);
        if(tblDepartamentos.getRowCount() > 0){
            tblDepartamentos.setRowSelectionInterval(0, 0);
        }
        
    }
    
    private void setTableTurno(){
        CtrlTurno ctrlTurno = new CtrlTurno(connection);
        List<Object> listaTurnos = ctrlTurno.find();
        Object fila[] = new Object[tblTurnos.getColumnCount()];
        fila[2] = "Todos";
        modeloTurnos.addRow(fila);
        for (int i = 0; i < listaTurnos.size(); i++) {
            Turno turno = (Turno)listaTurnos.get(i);
            fila[0] = turno;
            fila[1] = turno.getIdTurno();
            fila[2] = turno.getTurno();
            fila[3] = turno.getHoraEntrada();
            fila[4] = turno.getHoraSalida();
            modeloTurnos.addRow(fila);
        }
        tblTurnos.setModel(modeloTurnos);
        if(tblTurnos.getRowCount() > 0){
            tblTurnos.setRowSelectionInterval(0, 0);
        }
        
    }

    private void cleanTable() {
        for (int i = 0; i < tblEmpleados.getRowCount(); i++) {
            modeloEmpleados.removeRow(i);
            i -= 1;
        }
    }
    
    private boolean removeField(Empleado empleado){
        try {
            CtrlEmpleado ctrlEmpleado = new CtrlEmpleado(connection);
            CtrlPersona ctrlPersona = new CtrlPersona(connection);
            CtrlCuenta ctrlCuenta = new CtrlCuenta(connection);
            CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
            CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
            //CtrlEmail ctrlEmail = new CtrlEmail(connection);
            connection.setAutoCommit(false);
            if(ctrlPersona.delete(empleado.getIdPersona().getIdPersona())
                    && ctrlCuenta.delete(empleado.getIdCuenta().getIdCuenta())
                    && ctrlDireccion.delete(empleado.getIdDireccion().getIdDireccion())
                    && ctrlTelefono.delete(empleado.getIdTelefono().getIdTelefono())
                    //&& ctrlEmail.delete(empleado.getEmail().getIdEmail())
                    && ctrlEmpleado.delete(empleado.getIdEmpleado())) {
                connection.commit();
                return true;
            }else{
                connection.rollback();
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmEmpleadoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    

    
    private Connection getConnection(){
        try {
            return Conexion.getConexion();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FrmEmpleadoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //<editor-fold defaultstate="collapsed" desc="createTable()">
    private void createTableEmpleado(){
        String[] head = {"Object","idEmpleado","idPersona","idPuesto","idTurno","idDireccion","idTelefono","idEmail","idCuenta","Num. Matrícula","CURP","RFC","Escolaridad","Fecha de Registro", "Nombre", "Apellidos"};
        Object[][] body = {};
        modeloEmpleados = new DefaultTableModel(body, head);
        tblEmpleados.setModel(modeloEmpleados);
        hideColumnsTblEmpleado();
    }
    
    private void createTableDeparatmento(){
        String[] head = {"Object","idDepartamento","idJefe","Departamento","Funcion"};
        Object[][] body = {};
        modeloDepartamento = new DefaultTableModel(body, head);
        tblDepartamentos.setModel(modeloDepartamento);
        hideColumnsTblDepartamento();
    }
    
    private void createTableTurno(){
        String[] head = {"Object","idTurno","Turno","Hora de entrada","Hora de salida"};
        Object[][] body = {};
        modeloTurnos = new DefaultTableModel(body, head);
        tblTurnos.setModel(modeloTurnos);
        hideColumnsTblTurno();
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="hideColumns()">
    private void hideColumnsTblEmpleado(){
        tblEmpleados.getColumnModel().getColumn(0).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(1).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(1).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(1).setMaxWidth(0);
      
        tblEmpleados.getColumnModel().getColumn(2).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(2).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(2).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(3).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(3).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(3).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(4).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(4).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(4).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(5).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(5).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(5).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(6).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(6).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(6).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(7).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(7).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(7).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(8).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(8).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(8).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(10).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(10).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(10).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(11).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(11).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(11).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(12).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(12).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(12).setMaxWidth(0);
        
        tblEmpleados.getColumnModel().getColumn(13).setMinWidth(0);
        tblEmpleados.getColumnModel().getColumn(13).setPreferredWidth(0);
        tblEmpleados.getColumnModel().getColumn(13).setMaxWidth(0);
    }
    
    private void hideColumnsTblDepartamento(){
        tblDepartamentos.getColumnModel().getColumn(0).setMinWidth(0);
        tblDepartamentos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblDepartamentos.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tblDepartamentos.getColumnModel().getColumn(1).setMinWidth(0);
        tblDepartamentos.getColumnModel().getColumn(1).setPreferredWidth(0);
        tblDepartamentos.getColumnModel().getColumn(1).setMaxWidth(0);
        
        tblDepartamentos.getColumnModel().getColumn(2).setMinWidth(0);
        tblDepartamentos.getColumnModel().getColumn(2).setPreferredWidth(0);
        tblDepartamentos.getColumnModel().getColumn(2).setMaxWidth(0);
        
        tblDepartamentos.getColumnModel().getColumn(4).setMinWidth(0);
        tblDepartamentos.getColumnModel().getColumn(4).setPreferredWidth(0);
        tblDepartamentos.getColumnModel().getColumn(4).setMaxWidth(0);
        
    }
    
    private void hideColumnsTblTurno(){
        tblTurnos.getColumnModel().getColumn(0).setMinWidth(0);
        tblTurnos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblTurnos.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tblTurnos.getColumnModel().getColumn(1).setMinWidth(0);
        tblTurnos.getColumnModel().getColumn(1).setPreferredWidth(0);
        tblTurnos.getColumnModel().getColumn(1).setMaxWidth(0);
        
        tblTurnos.getColumnModel().getColumn(3).setMinWidth(0);
        tblTurnos.getColumnModel().getColumn(3).setPreferredWidth(0);
        tblTurnos.getColumnModel().getColumn(3).setMaxWidth(0);
        
        tblTurnos.getColumnModel().getColumn(4).setMinWidth(0);
        tblTurnos.getColumnModel().getColumn(4).setPreferredWidth(0);
        tblTurnos.getColumnModel().getColumn(4).setMaxWidth(0);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Declaracion de controles">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblAMaterno;
    private javax.swing.JLabel lblAPaterno;
    private javax.swing.JLabel lblCurp;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEscolaridad;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumCuenta;
    private javax.swing.JLabel lblNumRegistros;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblTurnos;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
