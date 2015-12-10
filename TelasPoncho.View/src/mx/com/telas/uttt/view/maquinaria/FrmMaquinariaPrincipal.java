package mx.com.telas.uttt.view.maquinaria;

import java.awt.Frame;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import mx.com.telas.uttt.control.controller.CtrlCaracteristica;
import mx.com.telas.uttt.control.controller.CtrlDepartamento;
import mx.com.telas.uttt.control.controller.CtrlMaquinaria;
import mx.com.telas.uttt.data.conexion.Conexion;
import mx.com.telas.uttt.data.entity.Departamento;
import mx.com.telas.uttt.data.entity.Maquinaria;

/**
 *
 * @author Alexis Gasga
 */
public class FrmMaquinariaPrincipal extends javax.swing.JInternalFrame {

    private final Frame parent;
    private Connection connection;
    private DefaultTableModel modeloDepartamento;
    private DefaultTableModel modeloMaquinaria;
    private int idDepartamento = 0;
    private String modelo = "";

    public FrmMaquinariaPrincipal(Frame parent) {
        initComponents();
        initData();
        this.parent = parent;
    }

    private void initData() {
        try {
            connection = Conexion.getConexion();
            createTable();
            setTable();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void createTable() {
        try {
            createTable_Departamento();
            createTable_Maquinaria();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void createTable_Departamento() {
        try {
            String[] head = {"Object", "id", "idJefe", "Departamento", "Funcion"};
            Object[][] body = {};
            modeloDepartamento = new DefaultTableModel(body, head);
            tblDepartamentos.setModel(modeloDepartamento);
            hideColumns_Departamentos();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void hideColumns_Departamentos() {
        try {
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
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void createTable_Maquinaria() {
        try {
            String[] head = {"Object", "idMAquinaria", "idDepartamento", "idCaracteristica", "num. Serie", "Marca", "Modelo", "Moneda", "Funcionamiento"};
            Object[][] body = {};
            modeloMaquinaria = new DefaultTableModel(body, head);
            tblMaquinaria.setModel(modeloMaquinaria);
            hideColumns_Maquinaria();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void hideColumns_Maquinaria() {
        try {
            tblMaquinaria.getColumnModel().getColumn(0).setMinWidth(0);
            tblMaquinaria.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblMaquinaria.getColumnModel().getColumn(0).setMaxWidth(0);

            tblMaquinaria.getColumnModel().getColumn(1).setMinWidth(0);
            tblMaquinaria.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblMaquinaria.getColumnModel().getColumn(1).setMaxWidth(0);

            tblMaquinaria.getColumnModel().getColumn(2).setMinWidth(0);
            tblMaquinaria.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblMaquinaria.getColumnModel().getColumn(2).setMaxWidth(0);

            tblMaquinaria.getColumnModel().getColumn(3).setMinWidth(0);
            tblMaquinaria.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblMaquinaria.getColumnModel().getColumn(3).setMaxWidth(0);

            tblMaquinaria.getColumnModel().getColumn(7).setMinWidth(0);
            tblMaquinaria.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblMaquinaria.getColumnModel().getColumn(7).setMaxWidth(0);

            tblMaquinaria.getColumnModel().getColumn(8).setMinWidth(0);
            tblMaquinaria.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblMaquinaria.getColumnModel().getColumn(8).setMaxWidth(0);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void setTable() {
        try {
            setTable_Departamento();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void setTable_Departamento() {
        try {
            CtrlDepartamento ctrlDepartamento = new CtrlDepartamento(connection);
            List<Object> lstDepartamentos = ctrlDepartamento.find();
            Object[] fila = new Object[tblDepartamentos.getColumnCount()];
            fila[1] = 0;
            fila[3] = "Todos";
            modeloDepartamento.addRow(fila);
            for (int i = 0; i < lstDepartamentos.size(); i++) {
                Departamento temp = (Departamento) lstDepartamentos.get(i);
                fila[0] = temp;
                fila[1] = temp.getIdDepartamento();
                fila[2] = temp.getIdJefe();
                fila[3] = temp.getNombre();
                fila[4] = temp.getFuncion();
                modeloDepartamento.addRow(fila);
            }
            tblDepartamentos.setModel(modeloDepartamento);
            if (tblDepartamentos.getRowCount() > 0) {
                tblDepartamentos.setRowSelectionInterval(0, 0);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaquinaria = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblNumRegistros = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/Deployment-64.png"))); // NOI18N

        jLabel2.setText("jLabel2");

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        tblDepartamentos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse){
                tblDepartamentosValueChanged(lse);
            }
        });
        jScrollPane2.setViewportView(tblDepartamentos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros"));

        jScrollPane1.setViewportView(tblMaquinaria);

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

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/delete.png"))); // NOI18N
        btnDelete.setText("Borrar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/list.png"))); // NOI18N
        jButton4.setText("jButton4");

        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/telas/uttt/view/img/1447219501_search.png"))); // NOI18N

        lblNumRegistros.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNumRegistros.setText("[...]");

        jLabel5.setText("Numero de registros:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumRegistros))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumRegistros)
                    .addComponent(jLabel5)))
        );

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
            FrmMaquinariaManager frmMaquinariaManager = new FrmMaquinariaManager(parent, true);
            frmMaquinariaManager.setVisible(true);
            setTable_Mquinaria();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        try {
            modelo = this.txtBusqueda.getText().trim();
            setTable_Mquinaria();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if (tblMaquinaria.getSelectedRow() != -1) {
                Object maquina = tblMaquinaria.getValueAt(tblMaquinaria.getSelectedRow(), 0);
                FrmMaquinariaManager frmMaquinariaManager = new FrmMaquinariaManager(parent, true, maquina);
                frmMaquinariaManager.setVisible(true);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (tblMaquinaria.getSelectedRow() != -1) {
                int opcion = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar el registro permanentemente?", getTitle(), JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    int row = tblMaquinaria.getSelectedRow();
                    Maquinaria temp = (Maquinaria) tblMaquinaria.getValueAt(row, 0);
                    CtrlCaracteristica ctrlCar = new CtrlCaracteristica(connection);
                    if (ctrlCar.delete(temp.getIdCaracteristica().getIdCaracteristica())) {
                        JOptionPane.showMessageDialog(this, "El registro fué elinado satisfactoriamente", getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "La accion no se pudo completar", getTitle(), JOptionPane.ERROR_MESSAGE);
                    }
                    setTable_Mquinaria();
                }
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblDepartamentosValueChanged(ListSelectionEvent lse) {
        try {
            int row = tblDepartamentos.getSelectedRow();
            idDepartamento = (int) tblDepartamentos.getValueAt(row, 1);
            setTable_Mquinaria();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void setTable_Mquinaria() {
        try {
            cleanTable_Maquinaria();
            CtrlMaquinaria ctrlMaquinaria = new CtrlMaquinaria(connection);
            Object[] row = new Object[tblMaquinaria.getColumnCount()];
            List<Object> lstMaquinaria = null;
            if (idDepartamento != 0 && !modelo.isEmpty()) {
                lstMaquinaria = ctrlMaquinaria.find(idDepartamento, modelo);
            } else if (idDepartamento != 0 && modelo.isEmpty()) {
                lstMaquinaria = ctrlMaquinaria.find(idDepartamento);
            } else if (idDepartamento == 0 && !modelo.isEmpty()) {
                lstMaquinaria = ctrlMaquinaria.find(modelo);
            } else {
                lstMaquinaria = ctrlMaquinaria.find();
            }
            for (int i = 0; i < lstMaquinaria.size(); i++) {
                Maquinaria temp = (Maquinaria) lstMaquinaria.get(i);
                row[0] = temp;
                row[1] = temp.getIdMaquinaria();
                row[2] = temp.getIdDepartamento();
                row[3] = temp.getIdCaracteristica();
                row[4] = temp.getIdCaracteristica().getNumSerie();
                row[5] = temp.getIdCaracteristica().getMarca();
                row[6] = temp.getIdCaracteristica().getModelo();
                row[7] = temp.getIdCaracteristica().getMoneda();
                row[8] = temp.getFuncionamiento();
                modeloMaquinaria.addRow(row);
            }
            tblMaquinaria.setModel(modeloMaquinaria);
            if(tblMaquinaria.getRowCount() > 0){
                tblMaquinaria.setRowSelectionInterval(0, 0);
                lblNumRegistros.setText(String.valueOf(tblMaquinaria.getRowCount()));
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private void cleanTable_Maquinaria() {
        try {
            for (int i = 0; i < tblMaquinaria.getRowCount(); i++) {
                modeloMaquinaria.removeRow(i);
                i -= 1;
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNumRegistros;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTable tblMaquinaria;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
