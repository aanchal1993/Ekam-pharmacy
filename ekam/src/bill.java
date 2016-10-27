
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import static javax.management.Query.attr;
import static javax.management.Query.attr;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL LAPTOP
 */
public class bill extends javax.swing.JInternalFrame {

    /**
     * Creates new form bill
     */
    Connection con;
    int rowcount = 0;
    DefaultTableModel xy;
    Vector data = null;
    Float total = 0f;

    //DefaultTableModel;
    public bill(Connection c) {
        initComponents();
        con = c;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBatchNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSellingPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Bill");

        jLabel1.setText("Batch No:");

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

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel9.setText("Quantity:");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer Name:");

        jLabel10.setText("Contact No:");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Manage BILLS");

        jLabel4.setText("VAT % :");

        jLabel5.setText("Please don't write % sign b=after the amount.");

        jLabel6.setText("Selling Price:");

        txtSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSellingPriceActionPerformed(evt);
            }
        });

        jLabel7.setText("If left blankk, then the initially saved Price will be picked.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBatchNo, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(txtVat)
                                    .addComponent(txtSellingPrice))
                                .addGap(1, 1, 1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(196, 196, 196))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnAdd)
                                                    .addGap(31, 31, 31)
                                                    .addComponent(btnReset)
                                                    .addGap(37, 37, 37)
                                                    .addComponent(btnPrint))
                                                .addComponent(jLabel4))))
                                    .addGap(7, 7, 7)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnReset)
                            .addComponent(btnPrint))))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            boolean flag;
            String customer_name = txtCustomerName.getText();
             String contact_no = txtContactNo.getText();
             String batchno = txtBatchNo.getText();
            String quantity = txtQuantity.getText();
            int input_quantity = Integer.parseInt(quantity);
            String vat = txtVat.getText();
            float vat_tax = Float.parseFloat(vat);
            String billed_selling_price = txtSellingPrice.getText();

            if (customer_name.length() == 0) {
                JOptionPane.showMessageDialog(this, "Customer Name field cannot be left blank");
                return;
            }
            if (contact_no.length() == 0) {
                JOptionPane.showMessageDialog(this, "Phone Number field cannot be left blank");
                return;
            }
            if (batchno.length() == 0) {
                JOptionPane.showMessageDialog(this, "Batch Code field cannot be left blank");
                return;
            }

            if (quantity.length() == 0) {
                JOptionPane.showMessageDialog(this, "Quantity field cannot be left blank");
                return;
            }
            
            if (valid.isValidPhone(contact_no) == false) {
                JOptionPane.showMessageDialog(this, "invalid phone number");
                return;
            }
            
            if (valid.isValidNumber(quantity) == false) {
                JOptionPane.showMessageDialog(this, "Invalid number. Enter whole number only.");
                return;
            }

            String query = "select * from ekam_product where batch_no=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, batchno);
            ResultSet rs = ps.executeQuery();

            Vector heading = new Vector();
            heading.add("Customer Name");
            heading.add("Contact No");
            heading.add("Company");
            heading.add("Product");
            heading.add("Batch No");
            heading.add("Selling Price");
            heading.add("Quantity");
            heading.add("Sum");
            heading.add("VAT %");
            heading.add("Sum After VAT");
            heading.add("Total");

            String name, product_name, product_id, batch_no, selling_price, sum, sum_after_vat, db_quantity;

            if (rs.next()) {

                name = rs.getString("name");
                db_quantity = rs.getString("quantity");
                product_name = rs.getString("product_name");
                product_id = rs.getString("product_id");
                batch_no = rs.getString("batch_no");
                if (billed_selling_price.length() != 0) {
                    float price = Integer.valueOf(billed_selling_price);
                    selling_price = String.valueOf(price);
                } else {
                    selling_price = rs.getString("selling_price");
                }
                float price = Float.parseFloat(selling_price);
                float qty = Float.parseFloat(quantity);
                float sum1 = qty * price;
                sum = String.valueOf(sum1);

                float tax = (vat_tax * sum1) / 100;

                float after_vat = sum1 + tax;
                sum_after_vat = String.valueOf(after_vat);

                total = total + Float.parseFloat(sum_after_vat);

                //JOptionPane.showMessageDialog(this, input_quantity);
                //JOptionPane.showMessageDialog(this, qty);
                //JOptionPane.showMessageDialog(this, db_quantity);
                // quantity check
                if (input_quantity > Integer.parseInt(db_quantity)) {
                    JOptionPane.showMessageDialog(this, "Stock Limited");
                    return;
                }

                Vector d = new Vector();
                d.add(customer_name);
                d.add(contact_no);
                d.add(name);
                d.add(product_name);
                d.add(batch_no);
                d.add(selling_price);
                d.add(quantity);
                d.add(sum);
                d.add(vat);
                d.add(sum_after_vat);
                if (rowcount == 0) {
                    //JOptionPane.showMessageDialog(this, "iffffffff");
                    data = new Vector();
                    data.add(d);
                    //JOptionPane.showMessageDialog(this, data.size());
                } else {
                    // JOptionPane.showMessageDialog(this, "elseeeeeeeeeeeeee");
                    // JOptionPane.showMessageDialog(this, data.size());
                    d.add(total);
                    data.add(d);

                }

                rowcount++;

            }
            // xy = new DefaultTableModel(data, heading);

            //JOptionPane.showMessageDialog(this, rowcount);
            xy = new DefaultTableModel(data, heading);
            jTable1.setModel(xy);

            rs.close();
            ps.close();

        } catch (java.lang.NumberFormatException e1) {
            JOptionPane.showMessageDialog(this, "VAT field cannot be left blank. Enter 0 is you don't want to add VAT.");
            //JOptionPane.showMessageDialog(this, "Something went wrong. Contact the developer.");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
            //JOptionPane.showMessageDialog(this, "Something went wrong. Contact the developer.");

        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtContactNo.setText("");
        txtCustomerName.setText("");
        txtBatchNo.setText("");
        txtQuantity.setText("");
        txtSellingPrice.setText("");
        txtVat.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            JOptionPane.showMessageDialog(this, "Total Bill is: Rs " + total + " You cannot change any values to the bill.");

            // Quantity Update
            String batchno = txtBatchNo.getText();
            String billed_quantity = txtQuantity.getText();
            int b_qty = Integer.parseInt(billed_quantity);
            String query = "select * from ekam_product where batch_no=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, batchno);
            ResultSet rs = ps.executeQuery();
            String database_qantity = "";
            if (rs.next()) {
                database_qantity = rs.getString("quantity");
            }
            int d_qty = Integer.parseInt(database_qantity);
            int r_qty = d_qty - b_qty;
            String remaining_quantity = String.valueOf(r_qty);
            String updation_query = "update ekam_product set quantity=? where batch_no= ?";
            PreparedStatement ps1 = con.prepareStatement(updation_query);
            ps1.setString(1, remaining_quantity);
            ps1.setString(2, batchno);
            ps1.executeUpdate();

            /* Updation in customers table
             String customer_name = txtCustomerName.getText();
             String contact_no = txtContactNo.getText();
             String total_amount = String.valueOf(total);

             String customer_query = "insert into ekam_customer(customer_name, contact_no, batch_no, quantity, total_amount) values(?,?,?,?,?)";
             PreparedStatement ps2 = con.prepareStatement(customer_query);
             ps2.setString(1, customer_name);
             ps2.setString(2, contact_no);
             ps2.setString(3, batchno);
             ps2.setString(4, billed_quantity);
             ps2.setString(5, total_amount);
             int x2 = ps2.executeUpdate();
             JOptionPane.showMessageDialog(this, x2 + " rows inserted");
             txtContactNo.setText("");
             txtCustomerName.setText("");
             txtBatchNo.setText("");
             txtQuantity.setText("");
             ps2.close();
             */
            
            jTable1.print();
            dispose();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int a = jTable1.getSelectedRow();
        if (a >= 0) {
            TableModel y = jTable1.getModel();
            String batchno = (String) y.getValueAt(a, 2);
            String quantity = (String) y.getValueAt(a, 4);

            txtBatchNo.setText(batchno);
            txtQuantity.setText(quantity);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSellingPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSellingPrice;
    private javax.swing.JTextField txtVat;
    // End of variables declaration//GEN-END:variables
}
