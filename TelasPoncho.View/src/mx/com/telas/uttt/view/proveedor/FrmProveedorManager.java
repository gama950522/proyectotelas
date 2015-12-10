package mx.com.telas.uttt.view.proveedor;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import mx.com.telas.uttt.control.controller.CtrlContacto;
import mx.com.telas.uttt.control.controller.CtrlDireccion;
import mx.com.telas.uttt.control.controller.CtrlEmpresa;
import mx.com.telas.uttt.control.controller.CtrlEstado;
import mx.com.telas.uttt.control.controller.CtrlLocalidad;
import mx.com.telas.uttt.control.controller.CtrlMunicipio;
import mx.com.telas.uttt.control.controller.CtrlProveedor;
import mx.com.telas.uttt.control.controller.CtrlTelefono;
import mx.com.telas.uttt.data.conexion.Conexion;
import mx.com.telas.uttt.data.entity.Contacto;
import mx.com.telas.uttt.data.entity.Direccion;
import mx.com.telas.uttt.data.entity.Empresa;
import mx.com.telas.uttt.data.entity.Estado;
import mx.com.telas.uttt.data.entity.Localidad;
import mx.com.telas.uttt.data.entity.Municipio;
import mx.com.telas.uttt.data.entity.Proveedor;
import mx.com.telas.uttt.data.entity.Telefono;

/**
 *
 * @author AlexisGasga
 */
public class FrmProveedorManager extends javax.swing.JDialog {

    private Proveedor proveedorGlobal;
    private DefaultTableModel modeloDireccion;
    private DefaultTableModel modeloTelefono;
    private Connection connection;
    private Direccion direccion;
    private Telefono telefono;
    private Date referencia = Date.valueOf(LocalDate.now());

    public FrmProveedorManager(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initData(null);
    }

    public FrmProveedorManager(java.awt.Frame parent, boolean modal, Proveedor proveedor) {
        super(parent, modal);
        initComponents();
        initData(proveedor);
    }

    public void mostrar() {
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInforation = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtDirectorGeneral = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox();
        cmbMunicipio = new javax.swing.JComboBox();
        cmbLocalidad = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtNumInterior = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNumExterior = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDirecciones = new javax.swing.JTable();
        btnGuardarSucursal = new javax.swing.JButton();
        btnEliminarDireccion = new javax.swing.JButton();
        txtCalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiarDireccion = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cmbTipoTelefono = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTelefonos = new javax.swing.JTable();
        btnGuardarTelefono = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnEliminarTelefono = new javax.swing.JButton();
        btnLimpiarTelefono = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtWebSite = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proveedores");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Organization-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblInforation.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblInforation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInforation.setText("[ N U E V O ]");

        jLabel3.setText("Razón social:");

        jLabel4.setText("Director General:");

        jTabbedPane1.setBackground(new java.awt.Color(241, 241, 241));

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));

        jLabel5.setText("Estado:");

        jLabel6.setText("Municipio:");

        jLabel7.setText("Localidad:");

        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });

        cmbMunicipio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMunicipioItemStateChanged(evt);
            }
        });

        jLabel8.setText("Num. Interior:");

        jLabel9.setText("Num. Exterior:");

        jLabel10.setText("CP:");

        tblDirecciones.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse){
                tblDireccionesValueChanged(lse);
            }
        });
        jScrollPane5.setViewportView(tblDirecciones);

        btnGuardarSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447403077_ok.png"))); // NOI18N
        btnGuardarSucursal.setText("Guardar");
        btnGuardarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSucursalActionPerformed(evt);
            }
        });

        btnEliminarDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/delete.png"))); // NOI18N
        btnEliminarDireccion.setText("Borrar");
        btnEliminarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDireccionActionPerformed(evt);
            }
        });

        jLabel2.setText("Calle:");

        btnLimpiarDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/edit-clear.png"))); // NOI18N
        btnLimpiarDireccion.setText("Limpiar");
        btnLimpiarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGuardarSucursal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarDireccion))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbLocalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCalle)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(txtNumExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoPostal)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarSucursal)
                    .addComponent(btnEliminarDireccion)
                    .addComponent(btnLimpiarDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sucursales", jPanel3);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));

        jLabel12.setText("Teléfono");

        cmbTipoTelefono.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Selecciona ---", "Movil", "Fijo" }));

        jLabel13.setText("Descripción:");

        tblTelefonos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse){
                tblTelefonosValueChanged(lse);
            }
        });
        jScrollPane4.setViewportView(tblTelefonos);

        btnGuardarTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447403077_ok.png"))); // NOI18N
        btnGuardarTelefono.setText("Guardar");
        btnGuardarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTelefonoActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo:");

        btnEliminarTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/delete.png"))); // NOI18N
        btnEliminarTelefono.setText("Borrar");

        btnLimpiarTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/edit-clear.png"))); // NOI18N
        btnLimpiarTelefono.setText("Limpiar");
        btnLimpiarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33)
                        .addComponent(txtTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescripcion))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnGuardarTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTelefono)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarTelefono)
                    .addComponent(btnEliminarTelefono)
                    .addComponent(btnLimpiarTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Telefonos de contacto", jPanel4);

        jLabel15.setText("RFC:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/cross.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/disk.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel16.setText("Sitio web:");

        jLabel14.setText("Correo electrónico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInforation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRfc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWebSite, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRazonSocial)
                            .addComponent(txtDirectorGeneral)
                            .addComponent(txtEmail))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInforation, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDirectorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtWebSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //De preferencia poner el commit() aqui
        try {
            if (guardar()) {
                dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
        try {
            if (!cmbEstado.getSelectedItem().equals(" --- Selecciona --- ")) {
                cmbMunicipio.removeAllItems();
                cmbLocalidad.removeAllItems();
                Estado idEstado = (Estado) cmbEstado.getSelectedItem();
                setComboBoxMunicipio(idEstado);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void cmbMunicipioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMunicipioItemStateChanged
        try {
            if (cmbMunicipio.getItemAt(0) != null) {
                if (!cmbMunicipio.getSelectedItem().equals(" --- Selecciona --- ")) {
                    cmbLocalidad.removeAllItems();
                    Municipio idMunicipio = (Municipio) cmbMunicipio.getSelectedItem();
                    setComboBoxLocalidad(idMunicipio);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "cmbMunicipioItemStateChanged(java.awt.event.ItemEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbMunicipioItemStateChanged

    private void btnGuardarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSucursalActionPerformed
        try {
            if (direccion != null) {
                updateRow();
            } else {
                newRow(getNewDireccion());
            }
            cleanDireccion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "btnGuardarSucursalActionPerformed(java.awt.event.ActionEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarSucursalActionPerformed

    private void btnEliminarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDireccionActionPerformed
        try {
            int row = tblDirecciones.getSelectedRow();
            removeRow(row);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "btnEliminarDireccionActionPerformed(java.awt.event.ActionEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarDireccionActionPerformed

    private void btnLimpiarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDireccionActionPerformed
        try {
            cleanDireccion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "btnLimpiarActionPerformed(java.awt.event.ActionEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLimpiarDireccionActionPerformed

    private void btnGuardarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTelefonoActionPerformed
        try {
            if (telefono != null) {
                updateRow();
            } else {
                newRow(getNewTelefono());
            }
            cleanTelefono();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnGuardarTelefonoActionPerformed

    private void btnLimpiarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTelefonoActionPerformed
        try {
            cleanTelefono();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnLimpiarTelefonoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //De preferencia poner el rolback() aqui
        try {
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblDireccionesValueChanged(ListSelectionEvent lse) {
        try {
            if (tblDirecciones.getSelectedRow() != -1) {
                int row = tblDirecciones.getSelectedRow();
                direccion = (Direccion) tblDirecciones.getValueAt(row, 1);
                setDireccion(direccion);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "tblDireccionesValueChanged(ListSelectionEvent lse)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void tblTelefonosValueChanged(ListSelectionEvent lse) {
        try {
            if (tblTelefonos.getSelectedRow() != -1) {
                int row = tblTelefonos.getSelectedRow();
                telefono = (Telefono) tblTelefonos.getValueAt(row, 1);
                setTelefono(telefono);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "tblDireccionesValueChanged(ListSelectionEvent lse)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setDireccion(Direccion direccion) {
        try {
            cmbEstado.setSelectedItem(direccion.getIdLocalidad().getIdMunicipio().getIdEstado());
            cmbMunicipio.setSelectedItem(direccion.getIdLocalidad().getIdMunicipio());
            cmbLocalidad.setSelectedItem(direccion.getIdLocalidad());
            txtCalle.setText(direccion.getCalle());
            txtNumExterior.setText(direccion.getNumExterior());
            txtNumInterior.setText(direccion.getNumInterior());
            txtCodigoPostal.setText(direccion.getCodigoPostal());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "setDireccion(Direccion direccion)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setTelefono(Telefono telefono) {
        try {
            txtTelefono.setText(telefono.getNumero());
            cmbTipoTelefono.setSelectedItem(telefono.getTipo());
            txtDescripcion.setText(telefono.getDescripcion());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "setTelefono(Telefono telefono)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cleanDireccion() {
        try {
            direccion = null;
            cmbEstado.setSelectedItem(cmbEstado.getItemAt(0));
            cmbMunicipio.removeAllItems();
            cmbLocalidad.removeAllItems();
            txtCalle.setText("");
            txtNumExterior.setText("");
            txtNumInterior.setText("");
            txtCodigoPostal.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "cleanDireccion()\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }

    private void cleanTelefono() {
        try {
            telefono = null;
            txtTelefono.setText("");
            cmbTipoTelefono.setSelectedIndex(0);
            txtDescripcion.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "cleanTelefono()\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }

    }

    //<editor-fold defaultstate="collapsed" desc="Main & declaracion de componentes">
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
//            java.util.logging.Logger.getLogger(FrmProveedorManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmProveedorManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmProveedorManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmProveedorManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                FrmProveedorManager dialog = new FrmProveedorManager(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEliminarDireccion;
    private javax.swing.JButton btnEliminarTelefono;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarSucursal;
    private javax.swing.JButton btnGuardarTelefono;
    private javax.swing.JButton btnLimpiarDireccion;
    private javax.swing.JButton btnLimpiarTelefono;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JComboBox cmbLocalidad;
    private javax.swing.JComboBox cmbMunicipio;
    private javax.swing.JComboBox cmbTipoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblInforation;
    private javax.swing.JTable tblDirecciones;
    private javax.swing.JTable tblTelefonos;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDirectorGeneral;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNumExterior;
    private javax.swing.JTextField txtNumInterior;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtWebSite;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

    private void newRow(Direccion direccion) {
        Object fila[] = new Object[tblDirecciones.getColumnCount()];
        fila[1] = direccion;
        fila[2] = direccion.getIdDireccion();
        fila[3] = direccion.getIdLocalidad().getIdMunicipio().getIdEstado().getEstado();
        fila[4] = direccion.getIdLocalidad().getIdMunicipio().getNombre();
        fila[5] = direccion.getIdLocalidad().getNombre();
        fila[6] = direccion.getCalle();
        fila[7] = direccion.getNumInterior();
        fila[8] = direccion.getNumExterior();
        fila[9] = direccion.getCodigoPostal();
        modeloDireccion.addRow(fila);
        tblDirecciones.setModel(modeloDireccion);
    }

    private void newRow(Telefono telefono) {
        Object fila[] = new Object[tblTelefonos.getColumnCount()];
        fila[1] = telefono;
        fila[2] = telefono.getIdTelefono();
        fila[3] = telefono.getNumero();
        fila[4] = telefono.getTipo();
        fila[5] = telefono.getDescripcion();
        modeloTelefono.addRow(fila);
        tblTelefonos.setModel(modeloTelefono);
    }

    private void updateRow() {
        int row = tblDirecciones.getSelectedRow();
        modeloDireccion.setValueAt(cmbEstado.getSelectedItem(), row, 3);
        modeloDireccion.setValueAt(cmbMunicipio.getSelectedItem(), row, 4);
        modeloDireccion.setValueAt(cmbLocalidad.getSelectedItem(), row, 5);
        modeloDireccion.setValueAt(txtCalle.getText().trim(), row, 6);
        modeloDireccion.setValueAt(txtNumInterior.getText().trim(), row, 7);
        modeloDireccion.setValueAt(txtNumExterior.getText().trim(), row, 8);
        modeloDireccion.setValueAt(txtCodigoPostal.getText().trim(), row, 9);
        tblDirecciones.setModel(modeloDireccion);
    }

    private void removeRow(int row) {

    }

    private Direccion getNewDireccion() {
        Direccion direccionTemp = null;
        try {
            direccionTemp = new Direccion();
            direccionTemp.setIdLocalidad((Localidad) cmbLocalidad.getSelectedItem());
            direccionTemp.setCalle(txtCalle.getText().trim());
            direccionTemp.setNumExterior(txtNumExterior.getText().trim());
            direccionTemp.setNumInterior(txtNumInterior.getText().trim());
            direccionTemp.setCodigoPostal(txtCodigoPostal.getText().trim());
            return direccionTemp;
        } catch (Exception ex) {
            return direccionTemp;
        }
    }

    private Telefono getNewTelefono() {
        Telefono telefonoTemp = null;
        try {
            telefonoTemp = new Telefono();
            telefonoTemp.setNumero(txtTelefono.getText().trim());
            telefonoTemp.setTipo(cmbTipoTelefono.getSelectedItem().toString());
            telefonoTemp.setDescripcion(txtDescripcion.getText().trim());
            return telefonoTemp;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Proveedor manager\ngetNewTelefono()" + ex);
            System.out.println(ex);
            return telefonoTemp;
        }
    }

    private void initData(Proveedor proveedor) {
        try {
            lblInforation.setText((proveedor == null) ? "[ N U E V O ]" : "[ M O D I F I C A N D O   I N F O R M A C I Ó N ]");
            proveedorGlobal = proveedor;
            connection = getConnection();
            createTable();
            setComboBox();
            if (proveedor != null) {
                setContacto(proveedor);
                setTextBox(proveedor);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private Connection getConnection() {
        try {
            return Conexion.getConexion();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            return null;
        }
    }

    private void setContacto(Proveedor proveedor) {
        try {
            setTable(proveedor);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    private void setTable(Proveedor proveedor){
        try {
            setTableDireccion(proveedor);
            setTableTelefono(proveedor);
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void setTableDireccion(Proveedor proveedor) {
        try {
            Object fila[] = new Object[tblDirecciones.getColumnCount()];
            List<Object> lstContacto = proveedor.getContacto();
            for (int i = 0; i < lstContacto.size(); i++) {
                Contacto temp = (Contacto) lstContacto.get(i);
                if (temp.getIdDireccion()!= null) {
                    fila[0] = temp;
                    fila[1] = temp.getIdDireccion();
                    fila[2] = temp.getIdDireccion().getIdDireccion();
                    fila[3] = temp.getIdDireccion().getIdLocalidad().getIdMunicipio().getIdEstado().getEstado();
                    fila[4] = temp.getIdDireccion().getIdLocalidad().getIdMunicipio().getNombre();
                    fila[5] = temp.getIdDireccion().getIdLocalidad().getNombre();
                    fila[6] = temp.getIdDireccion().getCalle();
                    fila[7] = temp.getIdDireccion().getNumInterior();
                    fila[8] = temp.getIdDireccion().getNumExterior();
                    fila[9] = temp.getIdDireccion().getCodigoPostal();
                    modeloDireccion.addRow(fila);
                }
            }
            tblDirecciones.setModel(modeloDireccion);
            if (tblDirecciones.getRowCount() > 0) {
                tblDirecciones.setRowSelectionInterval(0, 0);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void setTableTelefono(Proveedor proveedor) {
        try {
            Object fila[] = new Object[tblTelefonos.getColumnCount()];
            List<Object> lstContacto = proveedor.getContacto();
            for (int i = 0; i < lstContacto.size(); i++) {
                Contacto temp = (Contacto) lstContacto.get(i);
                if(temp.getIdTelefono() != null){
                    fila[0] = temp;
                    fila[1] = temp.getIdTelefono();
                    fila[2] = temp.getIdTelefono().getIdTelefono();
                    fila[3] = temp.getIdTelefono().getNumero();
                    fila[4] = temp.getIdTelefono().getTipo();
                    fila[5] = temp.getIdTelefono().getDescripcion();
                    modeloTelefono.addRow(fila);
                }
            }
            tblTelefonos.setModel(modeloTelefono);
            if (tblTelefonos.getRowCount() > 0) {
                tblTelefonos.setRowSelectionInterval(0, 0);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void setTextBox(Proveedor proveedor) {
        try {
            txtRazonSocial.setText(proveedor.getIdEmpresa().getRazonSocial());
            txtDirectorGeneral.setText(proveedor.getIdEmpresa().getGerenteGeneral());
            txtRfc.setText(proveedor.getIdEmpresa().getRfc());
            txtWebSite.setText(proveedor.getIdEmpresa().getWebSite());
            txtEmail.setText(proveedor.getIdEmpresa().getEmail());
            //txtCalle.setText();
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void setComboBox() {
        try {
            setComboBoxEstado();
            //if (proveedor != null) {
            //    cmbTipoTelefono.remove(0);
            //    cmbTipoTelefono.setSelectedItem(null);//OJO AQUI
            //}
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void setComboBoxEstado() {
        try {
            CtrlEstado ctrlEstado = new CtrlEstado(connection);
            List<Object> listaEstados = ctrlEstado.find();
            cmbEstado.addItem(" --- Selecciona --- ");
            for (int i = 0; i < listaEstados.size(); i++) {
                Estado temp = (Estado) listaEstados.get(i);
                cmbEstado.addItem(temp);
            }
//            if (proveedor != null) {
//                cmbEstado.setSelectedItem(empleado.getIdDireccion().getIdEstado());
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "getComboBoxEstado(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }

    private void setComboBoxMunicipio(Estado idEstado) {
        try {
            CtrlMunicipio ctrlMunicipio = new CtrlMunicipio(connection);
            List<Object> listaMunicipios = ctrlMunicipio.find(idEstado);
            cmbMunicipio.addItem(" --- Selecciona --- ");
            for (int i = 0; i < listaMunicipios.size(); i++) {
                Municipio temp = (Municipio) listaMunicipios.get(i);
                cmbMunicipio.addItem(temp);
            }
//            if (empleadoGlobal != null) {
//                cmbMunicipio.setSelectedItem(empleadoGlobal.getIdDireccion().getIdMunicipio());
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "setComboBoxMunicipio(Estado idEstado)", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }

    private void setComboBoxLocalidad(Municipio idMunicipio) {
        try {
            CtrlLocalidad ctrlLocalidad = new CtrlLocalidad(connection);
            List<Object> listaLocalidad = ctrlLocalidad.find(idMunicipio);
            cmbLocalidad.addItem(" --- Selecciona --- ");
            for (int i = 0; i < listaLocalidad.size(); i++) {
                Localidad temp = (Localidad) listaLocalidad.get(i);
                cmbLocalidad.addItem(temp);
            }
//            if (empleadoGlobal != null) {
//                cmbLocalidad.setSelectedItem(empleadoGlobal.getIdDireccion().getIdLocalidad());
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "setComboBoxLocalidad(Municipio idMunicipio)", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }

    private Boolean guardar() {
        try {
            if (proveedorGlobal == null) {
                return add();
            } else {
                return edit();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
            return false;
        }
    }

    private boolean add() {
        Proveedor proveedor = (proveedorGlobal == null) ? new Proveedor() : proveedorGlobal;
        Empresa empresa;
        try {
            connection.setAutoCommit(false);
            CtrlEmpresa ctrlEmpresa = new CtrlEmpresa(connection);
            CtrlProveedor ctrlProveedor = new CtrlProveedor(connection);
            CtrlContacto ctrlContacto = new CtrlContacto(connection);
            if (ctrlEmpresa.add(getEmpresa())) {
                empresa = (Empresa) ctrlEmpresa.getLastField();
                proveedor.setIdEmpresa(empresa);
                if (ctrlProveedor.add(proveedor)) {
                    proveedor = (Proveedor) ctrlProveedor.getLastField();
                    List<Object> lstContacto = getListaContacto(proveedor);
                    if (lstContacto != null) {
                        for (int i = 0; i < lstContacto.size(); i++) {
                            Contacto contacto = (Contacto) lstContacto.get(i);
                            if (!ctrlContacto.add(contacto)) {
                                connection.rollback();
                                return false;
                            }
                        }
                        connection.commit();
                        return true;
                    }
                }
            }
            connection.rollback();
            return false;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
            return false;
        }
    }

    

    private boolean edit() {
        try {
            connection.setAutoCommit(false);
            CtrlEmpresa ctrlEmpresa = new CtrlEmpresa(connection);
            if(ctrlEmpresa.edit(getEmpresa())){
                if (updateContacto()) {
                    JOptionPane.showMessageDialog(this, "La información de actualizó exitosamente", getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    connection.commit();
                    return true;
                }
            }
            connection.rollback();
            return false;
        } catch (Exception ex) {
            System.out.println( "Proveedor Manager\nedit()"  + ex);
            return false;
        }
    }
    
    private List<Object> getListaContacto(Proveedor proveedor) {
        CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
        CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
        List<Object> lstContacto = null;
        try {
            List<Direccion> lstDireccion = getDireccion();
            List<Telefono> lstTelefono = getTelefono();
            int limite = (lstDireccion.size() > lstTelefono.size()) ? lstDireccion.size() : lstTelefono.size();
            lstContacto = new ArrayList<>();
            for (int i = 0; i < limite; i++) {
                Contacto contacto = new Contacto();
                contacto.setIdProveedor(proveedor);
                Direccion tempDir = lstDireccion.get(i);
                if (!ctrlDireccion.add(tempDir)) {
                    return null;
                }
                contacto.setIdDireccion((Direccion) ctrlDireccion.getLastField());
                Telefono tempTel = lstTelefono.get(i);
                if (!ctrlTelefono.add(tempTel)) {
                    return null;
                }
                contacto.setIdTelefono((Telefono) ctrlTelefono.getLastField());
                lstContacto.add(contacto);
            }
            return lstContacto;
        } catch (Exception ex) {
            throw ex;
            //return lstContacto;
        }
    }

    private boolean updateContacto(){
        CtrlDireccion ctrlDireccion = new CtrlDireccion(connection);
        CtrlTelefono ctrlTelefono = new CtrlTelefono(connection);
        CtrlContacto ctrlContacto = new CtrlContacto(connection);
        Contacto contacto = null;
        boolean flagDir = false, flagTel = false;
        try {
            List<Direccion> lstDireccion = getDireccion();
            List<Telefono> lstTelefono = getTelefono();
            int limite = (lstDireccion.size() > lstTelefono.size()) ? lstDireccion.size() : lstTelefono.size();
            if (limite > 0) {
                for (int i = 0; i < limite; i++) {
                    if(lstDireccion.size() <= limite && i < lstDireccion.size()){
                        Direccion tempDir = lstDireccion.get(i);
                        if (tempDir.getIdDireccion() != null) {
                            if (!ctrlDireccion.edit(tempDir)) { return false; }
                        } else {
                            if (!ctrlDireccion.add(tempDir)) { return false; }
                            flagDir = true;
                        }
                    }
                    if(lstTelefono.size() <= limite && i < lstTelefono.size()){
                        Telefono tempTel = lstTelefono.get(i);
                        if (tempTel.getIdTelefono() != null) {
                            if (!ctrlTelefono.edit(tempTel)) { return false; }
                        } else {
                            if (!ctrlTelefono.add(tempTel)) { return false; }
                            flagTel = true;
                        }
                    }
                    if(flagDir && flagTel){
                        contacto = new Contacto();
                        contacto.setIdProveedor(proveedorGlobal);
                        contacto.setIdDireccion((Direccion) ctrlDireccion.getLastField());
                        contacto.setIdTelefono((Telefono)ctrlTelefono.getLastField());
                        ctrlContacto.add(contacto);
                    }else if(flagDir && !flagTel){
                        contacto = new Contacto();
                        contacto.setIdProveedor(proveedorGlobal);
                        contacto.setIdDireccion((Direccion) ctrlDireccion.getLastField());
                        ctrlContacto.add(contacto);
                    }else if (!flagDir && flagTel){
                        contacto = new Contacto();
                        contacto.setIdProveedor(proveedorGlobal);
                        contacto.setIdTelefono((Telefono)ctrlTelefono.getLastField());
                        ctrlContacto.add(contacto);
                    }
                    flagDir = false; flagTel = false;
                }
                return true;
            }
            return false;
        } catch (Exception ex) {
            System.out.println("Proveedor Manager/ngetListaContacto" + ex);
            return false;
        }
    }
    
    private void createTable() {
        try {
            createTableDireccion();
            createTableTelefono();
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void createTableDireccion() {
        try {
            String[] head = {"ObjectCont", "ObjectDir","idDireccion", "Estado", "Municipio", "Localidad", "Calle", "Num. Interior", "Num. Exterior", "CP"};
            Object[][] body = {};
            modeloDireccion = new DefaultTableModel(body, head);
            tblDirecciones.setModel(modeloDireccion);
            hideColumnsDireccion();
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void hideColumnsDireccion() {
        try {
            tblDirecciones.getColumnModel().getColumn(0).setMinWidth(0);
            tblDirecciones.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblDirecciones.getColumnModel().getColumn(0).setMaxWidth(0);
            tblDirecciones.getColumnModel().getColumn(1).setMinWidth(0);
            tblDirecciones.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblDirecciones.getColumnModel().getColumn(1).setMaxWidth(0);
            tblDirecciones.getColumnModel().getColumn(2).setMinWidth(0);
            tblDirecciones.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblDirecciones.getColumnModel().getColumn(2).setMaxWidth(0);
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void createTableTelefono() {
        try {
            String[] head = {"ObjectCont", "ObjectTel", "idTlefono", "Numero", "Tipo", "Descripcion"};
            Object[][] body = {};
            modeloTelefono = new DefaultTableModel(body, head);
            tblTelefonos.setModel(modeloTelefono);
            hideColumnsTelefono();
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void hideColumnsTelefono() {
        try {

        } catch (Exception ex) {
            throw ex;
        }
    }

    private Empresa getEmpresa() {
        Empresa empresa = (proveedorGlobal == null) ? new Empresa() : proveedorGlobal.getIdEmpresa();
        try {
            empresa.setRazonSocial(txtRazonSocial.getText().trim());
            empresa.setRfc(txtRfc.getText().trim());
            empresa.setGerenteGeneral(txtDirectorGeneral.getText().trim());
            empresa.setEmail(txtEmail.getText().trim());
            if (empresa.getIdEmpresa() == null) { empresa.setReferencia("PROV" + String.valueOf(referencia.getTime())); }
            empresa.setWebSite(txtWebSite.getText().trim());
            return empresa;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
            throw ex;
        }
    }

    private List<Direccion> getDireccion() {
        List<Direccion> listaDireccion = null;
        try {
            if (tblDirecciones.getRowCount() > 0) {
                listaDireccion = new ArrayList<>();
                for (int i = 0; i < tblDirecciones.getRowCount(); i++) {
                    Direccion dirTemp = (Direccion) tblDirecciones.getValueAt(i, 1);
                    listaDireccion.add(dirTemp);
                }
            }
            return listaDireccion;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
            return listaDireccion;
        }
    }

    private List<Telefono> getTelefono() {
        List<Telefono> listaTelefono = null;
        try {
            if (tblTelefonos.getRowCount() > 0) {
                listaTelefono = new ArrayList<>();
                for (int i = 0; i < tblTelefonos.getRowCount(); i++) {
                    Telefono telTemp = (Telefono) tblTelefonos.getValueAt(i, 1);
                    listaTelefono.add(telTemp);
                }
            }
            return listaTelefono;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
            return listaTelefono;
        }
    }

}
