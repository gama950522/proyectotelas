package mx.com.telas.uttt.view.empleado;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.com.telas.uttt.control.controller.CtrlCuenta;
import mx.com.telas.uttt.control.controller.CtrlDireccion;
import mx.com.telas.uttt.control.controller.CtrlEmpleado;
import mx.com.telas.uttt.control.controller.CtrlEstado;
import mx.com.telas.uttt.control.controller.CtrlLocalidad;
import mx.com.telas.uttt.control.controller.CtrlMunicipio;
import mx.com.telas.uttt.control.controller.CtrlPersona;
import mx.com.telas.uttt.control.controller.CtrlPuesto;
import mx.com.telas.uttt.control.controller.CtrlTelefono;
import mx.com.telas.uttt.control.controller.CtrlTurno;
import mx.com.telas.uttt.control.validacion.ValEmpleado;
import mx.com.telas.uttt.data.conexion.Conexion;
import mx.com.telas.uttt.data.entity.Cuenta;
import mx.com.telas.uttt.data.entity.Direccion;
import mx.com.telas.uttt.data.entity.Empleado;
import mx.com.telas.uttt.data.entity.Estado;
import mx.com.telas.uttt.data.entity.Localidad;
import mx.com.telas.uttt.data.entity.Municipio;
import mx.com.telas.uttt.data.entity.Persona;
import mx.com.telas.uttt.data.entity.Puesto;
import mx.com.telas.uttt.data.entity.Telefono;
import mx.com.telas.uttt.data.entity.Turno;

/**
 *
 * @author AlexisGasga
 */
public class FrmEmpleadoManager extends javax.swing.JDialog {

    private Connection conexion;
    private Empleado empleadoGlobal;
    private Date fechaRefistro = Date.valueOf(LocalDate.now());

    public FrmEmpleadoManager(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initData(null);

    }

    public FrmEmpleadoManager(Frame parent, boolean modal, Empleado empleado) {
        super(parent, modal);
        initComponents();
        initData(empleado);
    }

//    @Override
//    public void show() {
//        try {
//            //setVisible(true);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "show()\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSexo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAMaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbEstadoCivil = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        dteFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNumInterior = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNumExterior = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox();
        cmbLocalidad = new javax.swing.JComboBox();
        cmbMunicipio = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtTipoTel = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        cmbPuesto = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        cmbEscolaridad = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        pnlDetallePuestoTurno = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblInformacion = new javax.swing.JLabel();
        imgImformacion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de personal");
        setResizable(false);

        jScrollPane1.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447386410_businessman.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("[ N U E V O ]");
        lblTitle.setToolTipText("");

        jTabbedPane1.setBackground(new java.awt.Color(241, 241, 241));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setAutoscrolls(true);

        jScrollPane2.setBorder(null);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido paterno: ");

        jLabel6.setText("Apellido materno:");

        jLabel7.setText("Edad:");

        jLabel8.setText("Estado civil: ");

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " --- Selecciona ---", "Casado(a)", "Soltero(a)" }));

        jLabel9.setText("Nacimiento: ");

        dteFechaNacimiento.setBackground(new java.awt.Color(241, 241, 241));

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12))); // NOI18N

        jLabel10.setText("Entidad federativa:");

        jLabel11.setText("Municipio:");

        jLabel12.setText("Localidad:");

        jLabel13.setText("Calle:");

        jLabel14.setText("Numero interior:");

        jLabel15.setText("Numero exterior:");

        jLabel16.setText("Codigo postal:");

        jLabel18.setText("Telefono:");

        jLabel19.setText("Email:");

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

        jLabel2.setText("Tipo:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtNumInterior, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumExterior, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                            .addComponent(txtCalle)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addContainerGap())
                            .addComponent(cmbLocalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTipoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail)))))
            .addComponent(jSeparator2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNumInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtNumExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12))); // NOI18N

        btnSexo.add(rbtnMasculino);
        rbtnMasculino.setText("Masculino");

        btnSexo.add(rbtnFemenino);
        rbtnFemenino.setText("Femenino");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMasculino)
                    .addComponent(rbtnFemenino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(rbtnMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(rbtnFemenino))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(dteFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNombre)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtAPaterno)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dteFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        jTabbedPane1.addTab("Datos personales", jScrollPane2);

        jScrollPane3.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));

        jLabel23.setText("CURP:");

        jLabel24.setText("RFC:");

        jLabel25.setText("Emai:");

        cmbPuesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPuestoItemStateChanged(evt);
            }
        });

        jLabel26.setText("Puesto:");

        jLabel27.setText("Turno:");

        cmbTurno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTurnoItemStateChanged(evt);
            }
        });

        jLabel28.setText("Escolaridad:");

        cmbEscolaridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Selecciona ---", "No estudió", "Primaria", "Primaria trunca", "Secundaria", "Secundaria trunca", "Bachillerato/Preparatoria", "Bachillerato/Preparatoria trunca", "Universidad", "Universidad trunca" }));

        pnlDetallePuestoTurno.setBackground(new java.awt.Color(241, 241, 241));
        pnlDetallePuestoTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        javax.swing.GroupLayout pnlDetallePuestoTurnoLayout = new javax.swing.GroupLayout(pnlDetallePuestoTurno);
        pnlDetallePuestoTurno.setLayout(pnlDetallePuestoTurnoLayout);
        pnlDetallePuestoTurnoLayout.setHorizontalGroup(
            pnlDetallePuestoTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlDetallePuestoTurnoLayout.setVerticalGroup(
            pnlDetallePuestoTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguridad"));

        jLabel22.setText("Contraseña:");

        jLabel29.setText("Confirmar contraseña:");

        lblInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/UpgradeReport_Information.png"))); // NOI18N
        lblInformacion.setText("Las contraseñas coinsiden");

        imgImformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/UpgradeReport_Success.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblInformacion)
                .addContainerGap(571, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgImformacion))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgImformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)
                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblInformacion)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDetallePuestoTurno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel28))
                                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRfc)
                                    .addComponent(cmbEscolaridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(361, 361, 361)
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(cmbEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDetallePuestoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel3);

        jTabbedPane1.addTab("Información laboral", jScrollPane3);

        btnGuardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/disk.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447406840_cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            //if (isValido()) {
                if (guardar()) {
                    dispose();
                }
            //}
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "btnGuardarActionPerformed(java.awt.event.ActionEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
        try {
            if (!cmbEstado.getSelectedItem().equals(" --- Selecciona --- ")) {
                cmbMunicipio.removeAllItems();
                cmbLocalidad.removeAllItems();
                Estado idEstado = (Estado) cmbEstado.getSelectedItem();
                setComboBoxMunicipio(idEstado);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void cmbPuestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPuestoItemStateChanged
        try {
            setLabel(empleadoGlobal);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "cmbPuestoItemStateChanged(java.awt.event.ItemEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbPuestoItemStateChanged

    private void cmbTurnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTurnoItemStateChanged
        try {
            setLabel(empleadoGlobal);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "cmbTurnoItemStateChanged(java.awt.event.ItemEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbTurnoItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "btnCancelarActionPerformed(java.awt.event.ActionEvent evt)\n" + ex, getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void initData(Empleado empleado) {
        try {
            lblTitle.setText((empleado == null) ? "[ N U E V O ]" : "[ A C T U A L I Z A R   I N F O R M A C I O N ]");
            empleadoGlobal = empleado;
            getConnection();
            setTextBox(empleado);
            setComboBox(empleado);
            setLabel(empleado);
            setTable(empleado);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "initData(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void getConnection() {
        try {
            conexion = Conexion.getConexion();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FrmEmpleadoManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setTextBox(Empleado empleado) {
        try {
            if (empleado != null) {
                txtNombre.setText(empleado.getIdPersona().getNombre());
                txtAPaterno.setText(empleado.getIdPersona().getaPareno());
                txtAMaterno.setText(empleado.getIdPersona().getaMaterno());
                txtEdad.setText(empleado.getIdPersona().getEdad().toString());
                dteFechaNacimiento.setDate(empleado.getIdPersona().getFechaNacimiento());

                txtCalle.setText(empleado.getIdDireccion().getCalle());
                txtNumInterior.setText(empleado.getIdDireccion().getNumInterior());
                txtNumExterior.setText(empleado.getIdDireccion().getNumExterior());
                txtCodigoPostal.setText(empleado.getIdDireccion().getCodigoPostal());

                txtTelefono.setText(empleado.getIdTelefono().getNumero());
                txtTipoTel.setText(empleado.getIdTelefono().getTipo());

                //txtEmail.setText(empleado.getEmail().getCorreo());
                //txtDescripcion.setText(empleado.getEmail().getDescripcion());

                txtCurp.setText(empleado.getCurp());
                txtRfc.setText(empleado.getRfc());

                txtPassword.setText(empleado.getIdCuenta().getPassword());
                txtConfirmPassword.setText(empleado.getIdCuenta().getPassword());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "setTextBox(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setComboBox(Empleado empleado) {
        try {
            setComboBoxEstado(empleado);
            setComboBoxPuesto(empleado);
            setComboBoxTurno(empleado);
            if (empleado != null) {
                cmbEstadoCivil.setSelectedItem(empleado.getIdPersona().getEstadoCivil());
                cmbEscolaridad.setSelectedItem(empleado.getEscolaridad());
            } else {
                if (cmbPuesto.getSelectedIndex() > 0 && cmbTurno.getSelectedIndex() > 0) {
                    pnlDetallePuestoTurno.setVisible(true);
                } else {
                    pnlDetallePuestoTurno.setVisible(false);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "setComboBox(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }
    //<editor-fold defaultstate="collapsed" desc="setComboBox()">

    private void setComboBoxPuesto(Empleado empleado) {
        try {
            CtrlPuesto ctrlPuesto = new CtrlPuesto(conexion);
            List<Object> listaPuestos = ctrlPuesto.find();
            if (empleado == null) {
                cmbPuesto.addItem(" --- Selecciona --- ");
            }
            for (int i = 0; i < listaPuestos.size(); i++) {
                Puesto temp = (Puesto) listaPuestos.get(i);
                cmbPuesto.addItem(temp);
            }
            if (empleado != null) {
                cmbPuesto.setSelectedItem(empleado.getIdPuesto());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "getComboBoxPuesto(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }

    private void setComboBoxTurno(Empleado empleado) {
        try {
            CtrlTurno ctrlTurno = new CtrlTurno(conexion);
            List<Object> listaTurnos = ctrlTurno.find();
            if (empleado == null) {
                cmbTurno.addItem(" --- Selecciona --- ");
            }
            for (int i = 0; i < listaTurnos.size(); i++) {
                Turno temp = (Turno) listaTurnos.get(i);
                cmbTurno.addItem(temp);
            }
            if (empleado != null) {
                cmbTurno.setSelectedItem(empleado.getIdTurno());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "getComboBoxTurno(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }

    private void setComboBoxEstado(Empleado empleado) {
        try {
            CtrlEstado ctrlEstado = new CtrlEstado(conexion);
            List<Object> listaEstados = ctrlEstado.find();
            if (empleado == null) {
                cmbEstado.addItem(" --- Selecciona --- ");
            }
            for (int i = 0; i < listaEstados.size(); i++) {
                Estado temp = (Estado) listaEstados.get(i);
                cmbEstado.addItem(temp);
            }
            if (empleado != null) {
                cmbEstado.setSelectedItem(empleado.getIdDireccion().getIdLocalidad().getIdMunicipio().getIdEstado());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "getComboBoxEstado(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }

    private void setComboBoxMunicipio(Estado idEstado) {
        try {
            CtrlMunicipio ctrlMunicipio = new CtrlMunicipio(conexion);
            List<Object> listaMunicipios = ctrlMunicipio.find(idEstado);
            cmbMunicipio.addItem(" --- Selecciona --- ");
            for (int i = 0; i < listaMunicipios.size(); i++) {
                Municipio temp = (Municipio) listaMunicipios.get(i);
                cmbMunicipio.addItem(temp);
            }
            if (empleadoGlobal != null) {
                cmbMunicipio.setSelectedItem(empleadoGlobal.getIdDireccion().getIdLocalidad().getIdMunicipio());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "setComboBoxMunicipio(Estado idEstado)", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }

    private void setComboBoxLocalidad(Municipio idMunicipio) {
        try {
            CtrlLocalidad ctrlLocalidad = new CtrlLocalidad(conexion);
            List<Object> listaLocalidad = ctrlLocalidad.find(idMunicipio);
            cmbLocalidad.addItem(" --- Selecciona --- ");
            for (int i = 0; i < listaLocalidad.size(); i++) {
                Localidad temp = (Localidad) listaLocalidad.get(i);
                cmbLocalidad.addItem(temp);
            }
            if (empleadoGlobal != null) {
                cmbLocalidad.setSelectedItem(empleadoGlobal.getIdDireccion().getIdLocalidad());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, "setComboBoxLocalidad(Municipio idMunicipio)", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }
    //</editor-fold>

    private void setLabel(Empleado empleado) {
        try {
            if (empleado != null) {
                if (empleado.getIdPersona().getSexo().equals(rbtnFemenino.getText().trim())) {
                    rbtnFemenino.setSelected(true);
                } else {
                    rbtnMasculino.setSelected(true);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "setLabel(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setTable(Empleado empleado) {
        try {

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "setTable(Empleado empleado)", getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isValido() {
        try {
            ValEmpleado valEmpleado = new ValEmpleado(this, getEmpleado());
            return valEmpleado.isValid();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "isValido()", getTitle(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //<editor-fold defaultstate="collapsed" desc="getData()">
    private Persona getPersona() {
        Persona persona = (empleadoGlobal == null) ? new Persona() : empleadoGlobal.getIdPersona();
        persona.setNombre(txtNombre.getText().trim());
        persona.setaPareno(txtAPaterno.getText().trim());
        persona.setaMaterno(txtAMaterno.getText().trim());
        persona.setEdad(Integer.parseInt(txtEdad.getText().trim()));
        persona.setEstadoCivil(cmbEstadoCivil.getSelectedItem().toString());
        persona.setSexo((rbtnFemenino.isSelected()) ? "Femenino" : "Masculino");
            java.util.Date dateC = dteFechaNacimiento.getDate();
            long dC = dateC.getTime();
            java.sql.Date fechaC = new java.sql.Date(dC);
        persona.setFechaNacimiento(fechaC);
        return persona;
    }

    private Empleado getEmpleado() {
        Empleado empleado = (empleadoGlobal == null) ? new Empleado() : empleadoGlobal;
        empleado.setIdPuesto((Puesto) cmbPuesto.getSelectedItem());
        empleado.setIdTurno((Turno) cmbTurno.getSelectedItem());
        empleado.setCurp(txtCurp.getText().trim());
        empleado.setRfc(txtRfc.getText().trim());
        empleado.setEmail(txtEmail.getText().trim());
        empleado.setEscolaridadl(cmbEscolaridad.getSelectedItem().toString());
        return empleado;
    }

    private Cuenta getCuenta() {
        Cuenta cuenta = null;
        if (empleadoGlobal == null) {
            cuenta = new Cuenta();
            java.util.Date user = new java.util.Date();
            System.out.println(user.getTime());
            cuenta.setUsuario(String.valueOf(user.getTime()));
        } else {
            cuenta = empleadoGlobal.getIdCuenta();
        }
        cuenta.setPassword(txtPassword.getText().trim());
        return cuenta;
    }

    private Direccion getDireccion() {
        Direccion direccion = (empleadoGlobal == null) ? new Direccion() : empleadoGlobal.getIdDireccion();
        direccion.setIdLocalidad((Localidad) cmbLocalidad.getSelectedItem());
        direccion.setCalle(txtCalle.getText().trim());
        direccion.setNumInterior((txtNumInterior.getText().isEmpty()) ? null : txtNumInterior.getText().trim());
        direccion.setNumExterior((txtNumExterior.getText().isEmpty()) ? null : txtNumExterior.getText().trim());
        direccion.setCodigoPostal(txtCodigoPostal.getText().trim());
        return direccion;
    }

    private Telefono getTelefono() {
        Telefono telefono = (empleadoGlobal == null) ? new Telefono() : empleadoGlobal.getIdTelefono();
        telefono.setNumero(txtTelefono.getText().trim());
        telefono.setTipo(txtTipoTel.getText().trim());
        return telefono;
    }

    //private Email getEmail() {
        //Email email = (empleadoGlobal == null) ? new Email() : empleadoGlobal.getEmail();
        //email.setCorreo(txtEmail.getText().trim());
        //email.setDescripcion(txtDescripcion.getText().trim());
        //return email;
    //}
    //</editor-fold>

    private boolean guardar() {
        if (empleadoGlobal == null) {
            return agregar();
        } else {
            return moificar();
        }
    }
    //<editor-fold defaultstate="collapsed" desc="guardar()">

    private boolean agregar() {
        try {
            conexion.setAutoCommit(false);
            CtrlEmpleado ctrlEmpleado = new CtrlEmpleado(conexion);
            CtrlPersona ctrlPersona = new CtrlPersona(conexion);
            CtrlTelefono ctrlTelefono = new CtrlTelefono(conexion);
            CtrlCuenta ctrlCuenta = new CtrlCuenta(conexion);
            CtrlDireccion ctrlDireccion = new CtrlDireccion(conexion);
            if (ctrlPersona.add(getPersona()) && ctrlTelefono.add(getTelefono()) && ctrlCuenta.add(getCuenta()) && ctrlDireccion.add(getDireccion())) {
                System.out.println("agrego persona, telefono, cuenta y direccion");
                Empleado empleado = getEmpleado();
                empleado.setIdPersona((Persona) ctrlPersona.getLastField());
                empleado.setIdTelefono((Telefono) ctrlTelefono.getLastField());
                empleado.setIdCuenta((Cuenta) ctrlCuenta.getLastField());
                empleado.setIdDireccion((Direccion) ctrlDireccion.getLastField());
                empleado.setNumControl(empleado.getIdCuenta().getUsuario());
                empleado.setFechaRegistro(fechaRefistro);
                if (ctrlEmpleado.add(empleado)) {
                    System.err.println("agrego empleado");
                    conexion.commit();
                    JOptionPane.showMessageDialog(this, "¡La informacion fue guardada exitosamente!", getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    conexion.rollback();
                    return false;
                }
            } else {
                conexion.rollback();
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "agregar()", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
            return false;
        }
    }

    private boolean moificar() {
        try {
            CtrlEmpleado ctrlEmpleado = new CtrlEmpleado(conexion);
            CtrlPersona ctrlPersona = new CtrlPersona(conexion);
            CtrlTelefono ctrlTelefono = new CtrlTelefono(conexion);
            CtrlCuenta ctrlCuenta = new CtrlCuenta(conexion);
            CtrlDireccion ctrlDireccion = new CtrlDireccion(conexion);
            conexion.setAutoCommit(false);
            if (ctrlPersona.edit(getPersona()) && ctrlTelefono.edit(getTelefono()) && ctrlCuenta.edit(getCuenta()) && ctrlDireccion.edit(getDireccion())) {
                if (ctrlEmpleado.edit(getEmpleado())) {
                    conexion.commit();
                    JOptionPane.showMessageDialog(this, "¡La informacion fue actualizada exitosamente!", getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    conexion.rollback();
                    return false;
                }
            } else {
                conexion.rollback();
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "modificar()", getTitle(), JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
            return false;
        }

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="main & declaracion de componentes">
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
    //            java.util.logging.Logger.getLogger(FrmEmpleadoManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(FrmEmpleadoManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(FrmEmpleadoManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(FrmEmpleadoManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
    //        //</editor-fold>
    //        /* Create and display the dialog */
    //        java.awt.EventQueue.invokeLater(new Runnable() {
    //            public void run() {
    //                FrmEmpleadoManager dialog = new FrmEmpleadoManager(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup btnSexo;
    private javax.swing.JComboBox cmbEscolaridad;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JComboBox cmbEstadoCivil;
    private javax.swing.JComboBox cmbLocalidad;
    private javax.swing.JComboBox cmbMunicipio;
    private javax.swing.JComboBox cmbPuesto;
    private javax.swing.JComboBox cmbTurno;
    private com.toedter.calendar.JDateChooser dteFechaNacimiento;
    private javax.swing.JLabel imgImformacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlDetallePuestoTurno;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtAMaterno;
    private javax.swing.JTextField txtAPaterno;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumExterior;
    private javax.swing.JTextField txtNumInterior;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoTel;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

}
