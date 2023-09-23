/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.hire.view;

import javax.swing.JOptionPane;
import pos.hire.Controller.UserController;
import pos.hire.Dto.UserDto;

/**
 *
 * @author BIMSARA
 */
public class LayoutView extends javax.swing.JFrame {

    private UserController userController;
    
    /**
     * Creates new form LayoutView
     */
    public LayoutView() {
        userController = new UserController();
        initComponents();
        loadDashboard();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        profileButton1 = new javax.swing.JButton();
        sideNavPanel = new javax.swing.JPanel();
        uname2Label = new javax.swing.JLabel();
        dashButton = new javax.swing.JButton();
        VehicleComboBox = new javax.swing.JComboBox<>();
        CustomerComboBox = new javax.swing.JComboBox<>();
        hireComboBox = new javax.swing.JComboBox<>();
        bodyPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userIdLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        unameText = new javax.swing.JTextField();
        conText = new javax.swing.JTextField();
        uText = new javax.swing.JTextField();
        pwField = new javax.swing.JPasswordField();
        pwCheckBox = new javax.swing.JCheckBox();
        updateButton = new javax.swing.JButton();
        bodyPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(204, 204, 204));

        headerLabel.setBackground(new java.awt.Color(204, 204, 204));
        headerLabel.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/hire/view/image/icons/icons8-car-30.png"))); // NOI18N
        headerLabel.setText("                             Smart Cars");
        headerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/hire/view/image/icons/icons8-logout-24.png"))); // NOI18N
        closeButton.setText("Exit");
        closeButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        profileButton1.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        profileButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/hire/view/image/icons/icons8-admin-settings-male-24.png"))); // NOI18N
        profileButton1.setText("Profile");
        profileButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        profileButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileButton1.setInheritsPopupMenu(true);
        profileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileButton1)
                .addGap(18, 18, 18)
                .addComponent(closeButton)
                .addGap(15, 15, 15))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))))
        );

        sideNavPanel.setBackground(new java.awt.Color(216, 216, 229));

        dashButton.setBackground(new java.awt.Color(129, 129, 129));
        dashButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        dashButton.setForeground(new java.awt.Color(255, 255, 255));
        dashButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/hire/view/image/icons/icons8-menu-24.png"))); // NOI18N
        dashButton.setText("Dash Board");
        dashButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashButtonActionPerformed(evt);
            }
        });

        VehicleComboBox.setBackground(new java.awt.Color(129, 129, 129));
        VehicleComboBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        VehicleComboBox.setForeground(new java.awt.Color(255, 255, 255));
        VehicleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         Vehicle", "Vehicle Details", "Manage Vehicle", "Manage Vehicle Category", " ", " " }));
        VehicleComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VehicleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehicleComboBoxActionPerformed(evt);
            }
        });

        CustomerComboBox.setBackground(new java.awt.Color(129, 129, 129));
        CustomerComboBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CustomerComboBox.setForeground(new java.awt.Color(255, 255, 255));
        CustomerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         Customer", "Customer Details", "Manage Customer", " " }));
        CustomerComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerComboBoxActionPerformed(evt);
            }
        });

        hireComboBox.setBackground(new java.awt.Color(129, 129, 129));
        hireComboBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        hireComboBox.setForeground(new java.awt.Color(255, 255, 255));
        hireComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         Hire", "Hire Details", "Add Hire", "Manage Hire", " ", " ", " " }));
        hireComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideNavPanelLayout = new javax.swing.GroupLayout(sideNavPanel);
        sideNavPanel.setLayout(sideNavPanelLayout);
        sideNavPanelLayout.setHorizontalGroup(
            sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VehicleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideNavPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(uname2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(dashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CustomerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hireComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideNavPanelLayout.setVerticalGroup(
            sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VehicleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hireComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361)
                .addComponent(uname2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/hire/view/image/icons/icons8-admin-settings-male-24.png"))); // NOI18N
        jLabel1.setText("Profile");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userIdLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        emailText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        unameText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        unameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameTextActionPerformed(evt);
            }
        });

        conText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact No", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        uText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pwField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pwCheckBox.setText("Show Password");
        pwCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pwCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwCheckBoxActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unameText)
                    .addComponent(conText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uText)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 179, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyPanel1Layout = new javax.swing.GroupLayout(bodyPanel1);
        bodyPanel1.setLayout(bodyPanel1Layout);
        bodyPanel1Layout.setHorizontalGroup(
            bodyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );
        bodyPanel1Layout.setVerticalGroup(
            bodyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 421, Short.MAX_VALUE)
                    .addComponent(bodyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 113, Short.MAX_VALUE)
                    .addComponent(bodyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        close();// TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void profileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton1ActionPerformed
        loadProfile();// TODO add your handling code here:
    }//GEN-LAST:event_profileButton1ActionPerformed

    private void dashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashButtonActionPerformed
        loadDashBoard();// TODO add your handling code here:
    }//GEN-LAST:event_dashButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateUser();// TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void pwCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwCheckBoxActionPerformed
        showpassword();// TODO add your handling code here:
    }//GEN-LAST:event_pwCheckBoxActionPerformed

    private void unameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameTextActionPerformed

    private void VehicleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehicleComboBoxActionPerformed
        String selectedOption = (String) VehicleComboBox.getSelectedItem();
    System.out.println("Selected option: " + selectedOption); 

    if ("Vehicle Details".equals(selectedOption)) {
        System.out.println("Loading CarPanel"); 
        loadCarPanel();
    } else if ("Manage Vehicle".equals(selectedOption)) {
        System.out.println("Loading EditCarForm"); 
        loadEditCarForm();
    
    }else if ("Manage Vehicle Category".equals(selectedOption)) {
        System.out.println("Loading CarCategoryPanel"); 
        loadCarCatagoryPanel();
    }
    }//GEN-LAST:event_VehicleComboBoxActionPerformed

    private void CustomerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerComboBoxActionPerformed
         String selectedOption = (String) CustomerComboBox.getSelectedItem();
    System.out.println("Selected option: " + selectedOption); 

    if ("Customer Details".equals(selectedOption)) {
        System.out.println("Loading CustomerDetails"); 
        loadCustomerDetails();
    } else if ("Manage Customer".equals(selectedOption)) {
        System.out.println("Customer Panel"); 
        loadCustomerPanel();
    
    }
    }//GEN-LAST:event_CustomerComboBoxActionPerformed

    private void hireComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireComboBoxActionPerformed
         String selectedOption = (String) hireComboBox.getSelectedItem();
    System.out.println("Selected option: " + selectedOption); 

    if ("Add Hire".equals(selectedOption)) {
        System.out.println("Loading Add Hire"); 
        loadAddHires();
    } else if ("Hire Details".equals(selectedOption)) {
        System.out.println("Hire Details"); 
        loadHireDetails();
    
    }else if ("Manage Hire".equals(selectedOption)) {
        System.out.println("Loading CarCategoryPanel"); 
        loadUpdateHirePanel();
    }
    }//GEN-LAST:event_hireComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CustomerComboBox;
    private javax.swing.JComboBox<String> VehicleComboBox;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel bodyPanel1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField conText;
    private javax.swing.JButton dashButton;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JComboBox<String> hireComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profileButton1;
    private javax.swing.JCheckBox pwCheckBox;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JPanel sideNavPanel;
    private javax.swing.JTextField uText;
    private javax.swing.JLabel uname2Label;
    private javax.swing.JTextField unameText;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userIdLabel;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerPanel() {
        bodyPanel.removeAll();
        CustomerPanel customerPanel = new CustomerPanel();
        customerPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(customerPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadCarPanel() {
         bodyPanel.removeAll();
        CarPanel carPanel = new CarPanel();
        carPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(carPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
        
    }

    private void loadHirePanel() {
         bodyPanel.removeAll();
        HirePanel hirePanel = new HirePanel();
        hirePanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(hirePanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadCarCatagoryPanel() {
         bodyPanel.removeAll();
        CarCategoryPanel carCategoryPanel = new CarCategoryPanel();
        carCategoryPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(carCategoryPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void close() {
         System.exit(0);
    }

    private void loadProfile() {
        initializeBodyPanel();
        
    }
    
     private void initializeBodyPanel() {
    
    bodyPanel.removeAll();
    
  
    bodyPanel.add(jPanel1);
    bodyPanel.repaint();
    bodyPanel.revalidate();
}
     
      public void setLoggedInUserdetails(String userName, String id, String name, String contactNo, String email, String password) {
        uText.setText(   userName);
        userIdLabel.setText( id);
        unameText.setText(  name);
        conText.setText(   contactNo);
        emailText.setText( email);
        pwField.setText( password);
        uname2Label.setText( "Login In as :" + userName);
      
    }

    private void showpassword() {
        if (pwCheckBox.isSelected()) {
            pwField.setEchoChar((char) 0);
        } else {
            pwField.setEchoChar('\u2022');
        }
    }

    private void updateUser() {
         try {
            UserDto userDto = new UserDto(userIdLabel.getText(),
                    conText.getText(), emailText.getText(),
                    unameText.getText(), uText.getText(), pwField.getText());

            String result = userController.updateUser(userDto);
            JOptionPane.showMessageDialog(this, result);
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    

    private void loadDashBoard() {
        bodyPanel.removeAll();
        DashBoard dashBoard = new DashBoard();
        dashBoard.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(dashBoard);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    
    }

    private void loadDashboard() {
        bodyPanel.removeAll();
        DashBoard dashBoard = new DashBoard();
        dashBoard.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(dashBoard);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadEditCarForm() {
        bodyPanel.removeAll();
        EditCarForm editCarForm = new EditCarForm();
        editCarForm.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(editCarForm);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }
    
    

    private void loadCustomerDetails() {
        bodyPanel.removeAll();
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(customerDetails);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadAddHires() {
        bodyPanel.removeAll();
        AddHirePanel addHirePanel = new AddHirePanel();
        addHirePanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(addHirePanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadHireDetails() {
        bodyPanel.removeAll();
        HirePanel hirePanel = new HirePanel();
        hirePanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(hirePanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadUpdateHirePanel() {
         bodyPanel.removeAll();
        UpdateHirePanel updateHirePanel = new UpdateHirePanel();
        updateHirePanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(updateHirePanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    
}
