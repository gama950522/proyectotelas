package mx.com.telas.uttt.view.transporte;

import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import mx.com.telas.uttt.control.controller.CtrlCaracteristica;
import mx.com.telas.uttt.control.controller.CtrlEmpleado;
import mx.com.telas.uttt.control.controller.CtrlTrasnporte;
import mx.com.telas.uttt.data.conexion.Conexion;
import mx.com.telas.uttt.data.entity.Caracteristica;
import mx.com.telas.uttt.data.entity.Empleado;
import mx.com.telas.uttt.data.entity.Transporte;

/**
 *
 * @author Alexis Gasga
 */
public class FrmTransporteManager extends javax.swing.JDialog {

    private Connection connection;
    private Transporte transporte;

    public FrmTransporteManager(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initData(null);
    }

    public FrmTransporteManager(java.awt.Frame parent, boolean modal, Transporte transporte) {
        super(parent, modal);
        initComponents();
        initData(transporte);
    }

    private void initData(Object transporte) {
        try {
            connection = Conexion.getConexion();
            this.transporte = (Transporte) transporte;
            if (transporte != null) {
                setTextBox();
                setCheckBox();
            }
            setComboBox();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void setTextBox() {
        try {
            txtYear.setText(String.valueOf(transporte.getYear()));
            txtVelocidad.setText(String.valueOf(transporte.getVelocidad()));
            txtMatricula.setText(transporte.getMatricula());
            txtNumSerie.setText(transporte.getIdCaracteristica().getNumSerie());
            txtCosto.setText(String.valueOf(transporte.getIdCaracteristica().getCosto()));
            txtPeso.setText(String.valueOf(transporte.getPeso()));
            txtCapasidad.setText(String.valueOf(transporte.getCapasidad()));
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void setCheckBox() {
        try {
            cbxActivo.setSelected(transporte.getActivo());
            cbxDisponible.setSelected(transporte.getDisponible());
            cbxRutas.setSelected(transporte.getTieneRutas());
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void setComboBox() {
        try {
            setComboBox_Empleado();
            if (transporte != null) {
                cmbAgencia.setSelectedItem(transporte.getAgencia());
                cmbMarca.setSelectedItem(transporte.getIdCaracteristica().getMarca());
                cmbModelo.setSelectedItem(transporte.getIdCaracteristica().getModelo());
                cmbVelocidad.setSelectedItem(transporte.getUnidadVelocidad());
                cmbCosto.setSelectedItem(transporte.getIdCaracteristica().getCosto());
                cmbPeso.setSelectedItem(transporte.getUnidadPeso());
                cmbCapasidad.setSelectedItem(transporte.getUnidadCapasidad());
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void setComboBox_Empleado() {
        try {
            CtrlEmpleado ctrlEmpleado = new CtrlEmpleado(connection);
            List<Object> lstConductores = ctrlEmpleado.findConductores();
            if (lstConductores != null) {
                if (transporte == null) {
                    cmbEncargado.addItem(" --- Selecciona --- ");
                }
                for (int i = 0; i < lstConductores.size(); i++) {
                    Empleado temp = (Empleado) lstConductores.get(i);
                    //String empleado = temp.getIdPersona().getNombre() + " " + temp.getIdPersona().getaPareno();
                    cmbEncargado.addItem(temp);
                }
                if (transporte != null) {
                    cmbEncargado.setSelectedItem(transporte.getIdEmpleado());
                }
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }   //Hacer el metodo de busqueda en la controladora

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNumSerie = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbAgencia = new javax.swing.JComboBox();
        cmbMarca = new javax.swing.JComboBox();
        txtVelocidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbModelo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbVelocidad = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        cmbCosto = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        cmbPeso = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtCapasidad = new javax.swing.JTextField();
        cmbCapasidad = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        cbxActivo = new javax.swing.JCheckBox();
        cbxDisponible = new javax.swing.JCheckBox();
        cbxRutas = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        cmbEncargado = new javax.swing.JComboBox();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblAccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Medios de transportes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 240, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Truck-65.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("R E G I S T R O S   D E    T R A N S P O  R T E ");

        jPanel2.setBackground(new java.awt.Color(241, 240, 240));

        jLabel3.setText("Marca:");

        jLabel4.setText("Matrícula");

        jLabel5.setText("Numero de serie");

        jLabel6.setText("Agencia:");

        cmbAgencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " --- Selecciona ---", "Nissan", "Chebrolet", "Ford", "Honda", "Renault", "kinguord", "Mercedes Bens", " " }));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Selecciona ---", "Spark", "Tsuru", "cvbcvb", "drerre", "treter", "dfgdfg", "345435" }));

        txtVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelocidadActionPerformed(evt);
            }
        });

        jLabel8.setText("Modelo:");

        cmbModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Selecciona ---", "T-568A", "T-568B", "T-Q69", "Dove", "Zest", "Caprice", " " }));

        jLabel9.setText("Año:");

        jLabel10.setText("Velocidad:");

        cmbVelocidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Selecciona ---", "km/h", "m/s" }));

        jLabel11.setText("Costo:");

        cmbCosto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Selecciona ---" }));

        jLabel12.setText("Peso:");

        cmbPeso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Selecciona ---" }));

        jLabel13.setText("Capasidad:");

        cmbCapasidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Selecciona ---" }));

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("cositas"));

        cbxActivo.setText("Activo");

        cbxDisponible.setText("Disponible");

        cbxRutas.setText("Tiene rutas por repartir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cbxActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxDisponible)
                .addContainerGap())
            .addComponent(cbxRutas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxActivo)
                    .addComponent(cbxDisponible))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxRutas)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel14.setText("Encargado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatricula)
                    .addComponent(txtNumSerie)
                    .addComponent(cmbAgencia, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVelocidad)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtYear)
                            .addComponent(cmbVelocidad, 0, 132, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapasidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbPeso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCosto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCapasidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbEncargado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmbVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCapasidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCapasidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/cross.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447403077_ok.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblAccion.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText("[ A C C I O N ]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelocidadActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtVelocidadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (save()) {
                dispose();
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private boolean save() {
        return (transporte == null) ? add() : edit();
    }

    private boolean add() {
        Transporte transporte = getTransporte();
        Caracteristica caracteristica = getCaracteristica();
        try {
            connection.setAutoCommit(false);
            CtrlTrasnporte ctrlTrasnporte = new CtrlTrasnporte(connection);
            CtrlCaracteristica ctrlCaracteristica = new CtrlCaracteristica(connection);
            if (ctrlCaracteristica.add(caracteristica)) {
                transporte.setIdCaracteristica((Caracteristica) ctrlCaracteristica.getLastField());
                if (ctrlTrasnporte.add(transporte)) {
                    JOptionPane.showMessageDialog(this, "La información se ha guardado correctamente", getTitle(), JOptionPane.INFORMATION_MESSAGE);
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
        Transporte transporte = getTransporte();
        Caracteristica caracteristica = getCaracteristica();
        try {
            connection.setAutoCommit(false);
            CtrlTrasnporte ctrlTrasnporte = new CtrlTrasnporte(connection);
            CtrlCaracteristica ctrlCaracteristica = new CtrlCaracteristica(connection);
            if (ctrlCaracteristica.edit(caracteristica)) {
                if (ctrlTrasnporte.edit(transporte)) {
                    JOptionPane.showMessageDialog(this, "La información se ha guardado correctamente", getTitle(), JOptionPane.INFORMATION_MESSAGE);
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

    private Transporte getTransporte() {
        Transporte transportee = null;
        try {
            transportee = (transporte == null) ? new Transporte() : transporte;
            transportee.setAgencia(cmbAgencia.getSelectedItem().toString());
            transportee.setYear(Integer.parseInt(txtYear.getText().trim()));
            transportee.setVelocidad(Double.parseDouble(txtVelocidad.getText().trim()));
            transportee.setUnidadVelocidad(cmbVelocidad.getSelectedItem().toString());
            transportee.setMatricula(txtMatricula.getText().trim());
            transportee.setPeso(Double.parseDouble(txtPeso.getText().trim()));
            transportee.setUnidadPeso(cmbPeso.getSelectedItem().toString());
            transportee.setCapasidad(Double.parseDouble(txtCapasidad.getText().trim()));
            transportee.setUnidadCapasidad(cmbCapasidad.getSelectedItem().toString());
            transportee.setIdEmpleado((Empleado) cmbEncargado.getSelectedItem());
            transportee.setActivo(cbxActivo.isSelected());
            transportee.setDisponible(cbxDisponible.isSelected());
            transportee.setTieneRutas(cbxRutas.isSelected());
            return transportee;
        } catch (Exception ex) {
            System.err.println(ex);
            return transportee;
        }
    }

    private Caracteristica getCaracteristica() {
        Caracteristica caracteristica = null;
        try {
            caracteristica = (transporte == null) ? new Caracteristica() : transporte.getIdCaracteristica();
            caracteristica.setMarca(cmbMarca.getSelectedItem().toString());
            caracteristica.setModelo(cmbModelo.getSelectedItem().toString());
            caracteristica.setNumSerie(txtNumSerie.getText().trim());
            caracteristica.setCosto(Double.parseDouble(txtCosto.getText().trim()));
            caracteristica.setMoneda(cmbCosto.getSelectedItem().toString());
            return caracteristica;
        } catch (Exception ex) {
            System.err.println(ex);
            return caracteristica;
        }
    }

    //<editor-fold defaultstate="collapsed" desc="Main & componentes">
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTransporteManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTransporteManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTransporteManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTransporteManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmTransporteManager dialog = new FrmTransporteManager(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox cbxActivo;
    private javax.swing.JCheckBox cbxDisponible;
    private javax.swing.JCheckBox cbxRutas;
    private javax.swing.JComboBox cmbAgencia;
    private javax.swing.JComboBox cmbCapasidad;
    private javax.swing.JComboBox cmbCosto;
    private javax.swing.JComboBox cmbEncargado;
    private javax.swing.JComboBox cmbMarca;
    private javax.swing.JComboBox cmbModelo;
    private javax.swing.JComboBox cmbPeso;
    private javax.swing.JComboBox cmbVelocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JTextField txtCapasidad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtVelocidad;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

}
