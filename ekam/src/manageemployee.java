
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL LAPTOP
 */
public class manageemployee extends javax.swing.JInternalFrame {

    Connection con;

    public manageemployee(Connection c) {
        initComponents();
        con = c;
        fillTable();
    }

    void fillTable() {
        try {
            String query = "select * from ekam_employee order by userid asc";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            Vector heading = new Vector();
            heading.add("User Id");
            heading.add("User Name");
            heading.add("Password");
            heading.add("Gender");
            heading.add("Date of Birth");
            heading.add("Email");
            heading.add("Phone No");
            heading.add("Address");

            Vector data = new Vector();

            String userid, username, password, gender, dob, email, phone, address;
            while (rs.next()) {
                userid = rs.getString("userid");
                username = rs.getString("username");
                password = rs.getString("password");
                gender = rs.getString("gender");
                dob = rs.getString("dob");
                email = rs.getString("email");
                phone = rs.getString("phone");

                address = rs.getString("address");

                Vector d = new Vector();
                d.add(userid);
                d.add(username);
                d.add(password);
                d.add(gender);
                d.add(dob);
                d.add(email);
                d.add(phone);
                d.add(address);

                data.add(d);
            }

            DefaultTableModel x = new DefaultTableModel(data, heading);
            jTable1.setModel(x);

            rs.close();
            ps.close();
        } 
        catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter the whole numbers only. Ex 1,2,3..");
        }
            catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtDob = new javax.swing.JTextField();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manage Employee's");

        jLabel1.setText("User Name:");

        jLabel2.setText("Password:");

        jLabel3.setText("Address:");

        jLabel4.setText("Email Id:");

        jLabel5.setText("Phone No:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoMale);
        rdoMale.setSelected(true);
        rdoMale.setText("Male");
        rdoMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Female");

        jLabel7.setText("Date Of Birth:");

        jLabel6.setText("Gender:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnModify)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(173, 173, 173)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel7))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(rdoMale)
                        .addGap(18, 18, 18)
                        .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoMale)
                    .addComponent(jLabel6)
                    .addComponent(rdoFemale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int a = jTable1.getSelectedRow();
        if (a >= 0) {
            TableModel y = jTable1.getModel();
            String userid = (String) y.getValueAt(a, 0);
            String username = (String) y.getValueAt(a, 1);
            String password = (String) y.getValueAt(a, 2);
            String gender = (String) y.getValueAt(a, 3);
            String dob = (String) y.getValueAt(a, 4);
            String email = (String) y.getValueAt(a, 5);
            String phone = (String) y.getValueAt(a, 6);
            String address = (String) y.getValueAt(a, 7);

            //txtUserid.setText(userid);
            txtUsername.setText(username);
            txtPassword.setText(password);
            if (gender.equalsIgnoreCase("male")) {
                rdoMale.setSelected(true);
            } else {
                rdoFemale.setSelected(true);
            }
            txtDob.setText(dob);
            txtEmail.setText(email);
            txtPhone.setText(phone);
            txtAddress.setText(address);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void rdoMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoMaleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String gender;
            if (rdoMale.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            String dob = txtDob.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();

            
            if (username.length() == 0) {
                JOptionPane.showMessageDialog(this, "User Name field cannot be left blank");
                return;
            }
            if (password.length() == 0) {
                JOptionPane.showMessageDialog(this, "Password field cannot be left blank");
                return;
            }
            if (dob.length() == 0) {
                JOptionPane.showMessageDialog(this, "Date of Birth field cannot be left blank");
                return;
            }
            if (email.length() == 0) {
                JOptionPane.showMessageDialog(this, "Email field cannot be left blank");
                return;
            }
            if (address.length() == 0) {
                JOptionPane.showMessageDialog(this, "address field cannot be left blank");
                return;
            }

            if (valid.isValidName(username) == false) {
                JOptionPane.showMessageDialog(this, "invalid name");
                return;
            }

            if (valid.isValidPhone(phone) == false) {
                JOptionPane.showMessageDialog(this, "invalid phone number");
                return;
            }

            if (valid.isValidEmail(email) == false) {
                JOptionPane.showMessageDialog(this, "invalid email");
                return;
            }

            String query = "insert into ekam_employee(username, password, gender, dob, email, phone, address) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, gender);
            ps.setString(4, dob);
            ps.setString(5, email);
            ps.setString(6, phone);
            ps.setString(7, address);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + " rows inserted");
            txtUsername.setText("");
            txtPassword.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
            ps.close();
            fillTable();

        } 
        catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter the whole numbers only. Ex 1,2,3..");
        }
        
        catch (java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(this, "This Phone Number or Email is already registered. Please try with another contact details.");
        }
        
        catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(this, "This Phone Number or Email is already registered. Please try with another contact details. ");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String username = txtUsername.getText();
            if (username.length() == 0) {
                JOptionPane.showMessageDialog(this, "User Name field cannot be left blank");
                return;
            }

            String query = "delete from ekam_employee where username=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);

            int x = ps.executeUpdate();
            if (x == 1) {
                JOptionPane.showMessageDialog(this, x + " record deleted");
            } else {
                JOptionPane.showMessageDialog(this, "unsuccessful");
            }
            
            txtUsername.setText("");
            txtPassword.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");

            ps.close();
            fillTable();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String gender;
            if (rdoMale.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            String dob = txtDob.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();

           
            if (username.length() == 0) {
                JOptionPane.showMessageDialog(this, "User Name field cannot be left blank");
                return;
            }
            if (password.length() == 0) {
                JOptionPane.showMessageDialog(this, "Password field cannot be left blank");
                return;
            }
            if (dob.length() == 0) {
                JOptionPane.showMessageDialog(this, "Date of Birth field cannot be left blank");
                return;
            }
            if (email.length() == 0) {
                JOptionPane.showMessageDialog(this, "Email field cannot be left blank");
                return;
            }
            if (address.length() == 0) {
                JOptionPane.showMessageDialog(this, "address field cannot be left blank");
                return;
            }

            if (valid.isValidName(username) == false) {
                JOptionPane.showMessageDialog(this, "invalid name");
                return;
            }

            if (valid.isValidPhone(phone) == false) {
                JOptionPane.showMessageDialog(this, "invalid phone number");
                return;
            }

            if (valid.isValidEmail(email) == false) {
                JOptionPane.showMessageDialog(this, "invalid email");
                return;
            }

            String query = "update ekam_employee set password=?, gender=?, dob=?, phone=?, email=?, address=? where username=? ";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, gender);
            ps.setString(3, dob);
            ps.setString(4, phone);
            ps.setString(5, email);
            ps.setString(6, address);
            ps.setString(7, username);

            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + " rows modified");
            txtUsername.setText("");
            txtPassword.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
            ps.close();
            fillTable();

        } 
        catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter the whole numbers only. Ex 1,2,3..");
        }
         catch (java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(this, "This Phone Number or Email is already registered. Please try with another contact details.");
        }
        catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(this, e.getMessage());
            JOptionPane.showMessageDialog(this, "This Phone Number or Email is already registered. Please try with another contact details. ");
        }                
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
            txtUsername.setText("");
            txtPassword.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
