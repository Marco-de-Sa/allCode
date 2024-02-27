/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hobbza;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author gaurd
 */
public class FrmMain extends javax.swing.JFrame {
    private EmployeeArr users = new EmployeeArr();
    EmployeeManager employee = new EmployeeManager();
    DB HobbyZA = new DB();
    ResultSet rs;

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        txaEmployee.setText(employee.getEmployeeData());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup bngAlphSort = new javax.swing.ButtonGroup();
        FrmAdd = new javax.swing.JFrame();
        lblAddFirstname = new javax.swing.JLabel();
        lblAddSurname = new javax.swing.JLabel();
        lblAddManager = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        cboYesManager = new javax.swing.JCheckBox();
        cboNoManager = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cbxAddStore = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JTextField();
        lblAddPassword = new javax.swing.JLabel();
        FrmUpdate = new javax.swing.JFrame();
        lblUpdateFirstname = new javax.swing.JLabel();
        lblUpdateSurname = new javax.swing.JLabel();
        lblUpdateStore = new javax.swing.JLabel();
        lblUpdateManager = new javax.swing.JLabel();
        lblUpdatePassword = new javax.swing.JLabel();
        txtUpdateFirstname = new javax.swing.JTextField();
        txtUpdateSurname = new javax.swing.JTextField();
        txtUpdatePassword = new javax.swing.JTextField();
        cbxUpdateStore = new javax.swing.JComboBox<>();
        cboUpdateYesManager = new javax.swing.JCheckBox();
        cboUpdateNoManager = new javax.swing.JCheckBox();
        btnUpdate = new javax.swing.JButton();
        btnUpdateCancel = new javax.swing.JButton();
        lblUpdateEmpID = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        FrmDelete = new javax.swing.JFrame();
        lblIDDelete = new javax.swing.JLabel();
        txtDeleteID = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnDeleteCancel = new javax.swing.JButton();
        bngManager = new javax.swing.ButtonGroup();
        bngUpdateEmployee = new javax.swing.ButtonGroup();
        scpEmployee = new javax.swing.JScrollPane();
        txaEmployee = new javax.swing.JTextArea();
        lblStore = new javax.swing.JLabel();
        cbxStore = new javax.swing.JComboBox<>();
        lblSortAlph = new javax.swing.JLabel();
        cboAsc = new javax.swing.JCheckBox();
        cboDesc = new javax.swing.JCheckBox();
        lblEmployee = new javax.swing.JLabel();
        cbxEmployees = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        cboNone = new javax.swing.JCheckBox();
        btnLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        FrmAdd.setAlwaysOnTop(true);
        FrmAdd.setSize(new java.awt.Dimension(300, 340));

        lblAddFirstname.setText("Firstname:");

        lblAddSurname.setText("Surname:");

        lblAddManager.setText("is manager");

        bngManager.add(cboYesManager);
        cboYesManager.setText("yes");

        bngManager.add(cboNoManager);
        cboNoManager.setText("no");

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setText("cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cbxAddStore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FunTimez.co", "Gadgetz" }));

        lblAddPassword.setText("Password:");

        javax.swing.GroupLayout FrmAddLayout = new javax.swing.GroupLayout(FrmAdd.getContentPane());
        FrmAdd.getContentPane().setLayout(FrmAddLayout);
        FrmAddLayout.setHorizontalGroup(
            FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbxAddStore, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FrmAddLayout.createSequentialGroup()
                            .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAddManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblAddPassword))
                            .addGap(18, 18, 18)
                            .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(FrmAddLayout.createSequentialGroup()
                                    .addComponent(cboYesManager, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboNoManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtSurname)
                                .addComponent(txtFirstname)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FrmAddLayout.setVerticalGroup(
            FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddFirstname)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddSurname)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddManager)
                    .addComponent(cboYesManager)
                    .addComponent(cboNoManager))
                .addGap(18, 18, 18)
                .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddPassword))
                .addGap(18, 18, 18)
                .addComponent(cbxAddStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FrmAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnCancel))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        FrmUpdate.setSize(new java.awt.Dimension(300, 345));

        lblUpdateFirstname.setText("Firstname: ");

        lblUpdateSurname.setText("Surname:");

        lblUpdateStore.setText("Store:");

        lblUpdateManager.setText("Manager:");

        lblUpdatePassword.setText("Password:");

        cbxUpdateStore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FunTimez.co", "Gadgetz" }));

        bngUpdateEmployee.add(cboUpdateYesManager);
        cboUpdateYesManager.setText("Yes");

        bngUpdateEmployee.add(cboUpdateNoManager);
        cboUpdateNoManager.setText("no");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnUpdateCancel.setText("Cancel");
        btnUpdateCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCancelActionPerformed(evt);
            }
        });

        lblUpdateEmpID.setText("Employee ID:");

        javax.swing.GroupLayout FrmUpdateLayout = new javax.swing.GroupLayout(FrmUpdate.getContentPane());
        FrmUpdate.getContentPane().setLayout(FrmUpdateLayout);
        FrmUpdateLayout.setHorizontalGroup(
            FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrmUpdateLayout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrmUpdateLayout.createSequentialGroup()
                        .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblUpdateManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUpdateStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUpdateSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUpdateFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUpdatePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblUpdateEmpID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrmUpdateLayout.createSequentialGroup()
                                .addComponent(cboUpdateYesManager)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboUpdateNoManager))
                            .addComponent(txtUpdateFirstname)
                            .addComponent(txtUpdateSurname)
                            .addComponent(cbxUpdateStore, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUpdatePassword)
                            .addComponent(txtEmpID))))
                .addContainerGap())
        );
        FrmUpdateLayout.setVerticalGroup(
            FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateEmpID)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateFirstname)
                    .addComponent(txtUpdateFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateSurname)
                    .addComponent(txtUpdateSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateStore)
                    .addComponent(cbxUpdateStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateManager)
                    .addComponent(cboUpdateYesManager)
                    .addComponent(cboUpdateNoManager))
                .addGap(18, 18, 18)
                .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdatePassword)
                    .addComponent(txtUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnUpdateCancel))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        FrmDelete.setSize(new java.awt.Dimension(226, 179));

        lblIDDelete.setText("ID you want to delete:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDeleteCancel.setText("cancel");
        btnDeleteCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrmDeleteLayout = new javax.swing.GroupLayout(FrmDelete.getContentPane());
        FrmDelete.getContentPane().setLayout(FrmDeleteLayout);
        FrmDeleteLayout.setHorizontalGroup(
            FrmDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrmDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrmDeleteLayout.createSequentialGroup()
                        .addComponent(lblIDDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDeleteID, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addGroup(FrmDeleteLayout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FrmDeleteLayout.setVerticalGroup(
            FrmDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrmDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDDelete)
                    .addComponent(txtDeleteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnDeleteCancel))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Yu Gothic Medium", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(51, 255, 51));

        txaEmployee.setEditable(false);
        txaEmployee.setColumns(20);
        txaEmployee.setRows(5);
        scpEmployee.setViewportView(txaEmployee);

        lblStore.setText("Store");

        cbxStore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Store 1", "Store 2" }));

        lblSortAlph.setText("Alphabetically sort:");

        bngAlphSort.add(cboAsc);
        cboAsc.setText("Asc");

        bngAlphSort.add(cboDesc);
        cboDesc.setText("Desc");

        lblEmployee.setText("Employee");

        cbxEmployees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "MANAGER", "EMPLOYEE" }));

        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        bngAlphSort.add(cboNone);
        cboNone.setText("none");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton1.setText("delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpEmployee)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblStore, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSortAlph)
                        .addGap(18, 18, 18)
                        .addComponent(cboAsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNone)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmployee)
                        .addGap(18, 18, 18)
                        .addComponent(cbxEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStore)
                    .addComponent(cbxStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSortAlph)
                    .addComponent(cboAsc)
                    .addComponent(cboDesc)
                    .addComponent(lblEmployee)
                    .addComponent(cbxEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(cboNone))
                .addGap(18, 18, 18)
                .addComponent(scpEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(69, 69, 69))
        );

        setSize(new java.awt.Dimension(875, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        populateEmployeeData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new FrmLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrmAdd.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int Store = 1;
        boolean Mngr = false;
        ButtonModel m = null;
        cboNoManager.setSelected(true);

        if (txtFirstname.getText().isBlank() || txtSurname.getText().isBlank() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Missing fields");
        } else {
            if (cbxAddStore.getSelectedItem().equals("FunTimeZ.co")) {
                Store = 1;
            } else if (cbxAddStore.getSelectedItem().equals("Gadgetz")) {
                Store = 2;
            }

            if (cboYesManager.isSelected()) {
                Mngr = true;
            } else if (cboNoManager.isSelected()) {
                Mngr = false;
            }

            try {
                employee.addEmployeeToDB(Store, txtFirstname.getText(), txtSurname.getText(), txtPassword.getText(), Mngr);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            populateEmployeeData();

            FrmAdd.setVisible(false);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        FrmAdd.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int Store = 1;
        boolean Mngr = false;
        ButtonModel m = null;
        Object EmpID = null;
        cboUpdateNoManager.setSelected(false);

        if (txtEmpID.getText().equals("") || txtUpdateFirstname.getText().isBlank() || txtUpdateSurname.getText().isBlank() || txtUpdatePassword.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Could not update");
        } else {
            if (cboUpdateYesManager.isSelected()) {
                Mngr = true;
            } else if (cboUpdateNoManager.isSelected()) {
                Mngr = false;
            }

            if (cbxUpdateStore.getSelectedItem().equals("FunTimeZ.co")) {
                Store = 1;
            } else if (cbxUpdateStore.getSelectedItem().equals("Gadgetz")) {
                Store = 2;
            }
            employee.updateEmployeeData(Store, txtUpdateFirstname.getText(), txtUpdateSurname.getText(), txtUpdatePassword.getText(), Mngr, txtEmpID.getText());
            
            
            populateEmployeeData();
            FrmUpdate.setVisible(false);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdateCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCancelActionPerformed
        FrmUpdate.setVisible(false);
    }//GEN-LAST:event_btnUpdateCancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmUpdate.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmDelete.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtDeleteID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please fill in ID");
        } else {
            int num = Integer.parseInt(txtDeleteID.getText());
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure", "confirm", JOptionPane.YES_NO_OPTION);

            if (confirm == 0) {
                employee.deleteEmployeeFromDB(Integer.parseInt(txtDeleteID.getText()));
                populateEmployeeData();
            }
        }
        
        FrmDelete.setVisible(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCancelActionPerformed
        FrmUpdate.setVisible(false);
    }//GEN-LAST:event_btnDeleteCancelActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FrmAdd;
    private javax.swing.JFrame FrmDelete;
    private javax.swing.JFrame FrmUpdate;
    private javax.swing.ButtonGroup bngManager;
    private javax.swing.ButtonGroup bngUpdateEmployee;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteCancel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateCancel;
    private javax.swing.JCheckBox cboAsc;
    private javax.swing.JCheckBox cboDesc;
    private javax.swing.JCheckBox cboNoManager;
    private javax.swing.JCheckBox cboNone;
    private javax.swing.JCheckBox cboUpdateNoManager;
    private javax.swing.JCheckBox cboUpdateYesManager;
    private javax.swing.JCheckBox cboYesManager;
    private javax.swing.JComboBox<String> cbxAddStore;
    private javax.swing.JComboBox<String> cbxEmployees;
    private javax.swing.JComboBox<String> cbxStore;
    private javax.swing.JComboBox<String> cbxUpdateStore;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblAddFirstname;
    private javax.swing.JLabel lblAddManager;
    private javax.swing.JLabel lblAddPassword;
    private javax.swing.JLabel lblAddSurname;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblIDDelete;
    private javax.swing.JLabel lblSortAlph;
    private javax.swing.JLabel lblStore;
    private javax.swing.JLabel lblUpdateEmpID;
    private javax.swing.JLabel lblUpdateFirstname;
    private javax.swing.JLabel lblUpdateManager;
    private javax.swing.JLabel lblUpdatePassword;
    private javax.swing.JLabel lblUpdateStore;
    private javax.swing.JLabel lblUpdateSurname;
    private javax.swing.JScrollPane scpEmployee;
    private javax.swing.JTextArea txaEmployee;
    private javax.swing.JTextField txtDeleteID;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUpdateFirstname;
    private javax.swing.JTextField txtUpdatePassword;
    private javax.swing.JTextField txtUpdateSurname;
    // End of variables declaration//GEN-END:variables

    private void populateEmployeeData() {
        String out = "EmployeeID\tName\t\tStoreID\t\tManager\t\tUsername\t\tPassword\n\n";
        String query = "SELECT * FROM tblEmployees ";
        txaEmployee.setText("");
        String store = "", sort = "", employees = "", where = "", and = "";
        boolean twoWhere = false, beforeSort = false;

        //the sort by store
        if (cbxStore.getSelectedItem().equals("Store 1")) {
            query += " WHERE StoreID = 1 ";
            twoWhere = true;
        } else if (cbxStore.getSelectedItem().equals("Store 2")) {
            query += " WHERE StoreID = 2 ";
            twoWhere = true;
        }

        //sort by the employment status of a person
        if (cbxEmployees.getSelectedItem().equals("MANAGER") && twoWhere == false) {
            query += " WHERE Manager = true ";
            beforeSort = true;
        } else if (cbxEmployees.getSelectedItem().equals("EMPLOYEE") && twoWhere == false) {
            query += " WHERE Manager = false ";
            beforeSort = true;
        } else if (cbxEmployees.getSelectedItem().equals("MANAGER") && twoWhere == true) {
            query += "AND Manager = true ";
            beforeSort = true;
        } else if (cbxEmployees.getSelectedItem().equals("EMPLOYEE") && twoWhere == true) {
            employees = "AND Manager = false ";
            beforeSort = true;
        }
        //sort name
        if (cboAsc.isSelected() && beforeSort == true) {
            query += " ORDER BY Firstname ";

        } else if (cboDesc.isSelected() && beforeSort == true) {
            query += " ORDER BY Firstname desc";

        } else if (cboAsc.isSelected() && beforeSort == false) {
            query += "ORDER BY Firstname ";

        } else if (cboDesc.isSelected() && beforeSort == false) {
            query += "ORDER BY Firstname desc";

        }
        
        
        
        try{
            rs = HobbyZA.queryDB(query);
            while (rs.next()){                
                out += rs.getInt("EmployeeID") + "\t";
                out += rs.getString("Firstname") + " ";
                out += rs.getString("Surname") + "\t\t";
                out += rs.getInt("StoreID") + "\t\t";
                if (rs.getBoolean("Manager")) {
                    out += "yes\t\t";
                }else{
                    out += "no\t\t";
                }
                out += rs.getString("Username") + "\t\t";
                out += rs.getString("Password") + "\n";
            } 
            txaEmployee.setText(out);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error data not found");
        }
    }
}
