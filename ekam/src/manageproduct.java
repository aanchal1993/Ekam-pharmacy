
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
public class manageproduct extends javax.swing.JInternalFrame {

    /**
     * Creates new form manageproduct
     */
    Connection con;

    public manageproduct(Connection c) {
        initComponents();
        con = c;
        fillCompanyName();
        fillTable();
    }

    void fillCompanyName() {
        try {
            String query = "select * from ekam_company";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            String name;
            while (rs.next()) {
                name = rs.getString("name");
                cmbCompanyName.addItem(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fillTable() {
        try {
            String query = "select * from ekam_product order by product_id asc";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            Vector heading = new Vector();
            heading.add("Company");
            heading.add("Product");
            heading.add("Id");
            heading.add("Batch No");
            heading.add("Cost Price");
            heading.add("MRP");
            heading.add("Selling Price");
            heading.add("Quantity");
            Vector data = new Vector();

            String name, product_name, product_id, batch_no, cost_price, mrp, selling_price, quantity;
            while (rs.next()) {
                name = rs.getString("name");
                product_name = rs.getString("product_name");
                product_id = rs.getString("product_id");
                batch_no = rs.getString("batch_no");
                cost_price = rs.getString("cost_price");
                mrp = rs.getString("mrp");
                selling_price = rs.getString("selling_price");
                quantity = rs.getString("quantity");

                Vector d = new Vector();
                d.add(name);
                d.add(product_name);
                d.add(product_id);
                d.add(batch_no);
                d.add(cost_price);
                d.add(mrp);
                d.add(selling_price);
                d.add(quantity);

                data.add(d);
            }

            DefaultTableModel x = new DefaultTableModel(data, heading);
            jTable1.setModel(x);

            rs.close();
            ps.close();
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        cmbCompanyName = new javax.swing.JComboBox();
        txtProductName = new javax.swing.JTextField();
        txtBatchNo = new javax.swing.JTextField();
        txtCostPrice = new javax.swing.JTextField();
        txtMRP = new javax.swing.JTextField();
        txtSellingPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtProductId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manage Products");

        jLabel1.setText("Company Name:");

        jLabel2.setText("Product Name:");

        jLabel3.setText("Batch No:");

        jLabel4.setText("Cost Price:");

        jLabel5.setText("MRP:");

        jLabel6.setText("Selling Price:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");

        txtBatchNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchNoActionPerformed(evt);
            }
        });

        jLabel7.setText("If SP is left blank. Then the system will take SP = CP + 10% of CP");

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

        jLabel8.setText("Product Id:");

        jLabel9.setText("Quantity:");

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(12, 12, 12)
                        .addComponent(btnModify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(15, 15, 15)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCompanyName, 0, 156, Short.MAX_VALUE)
                            .addComponent(txtProductName)
                            .addComponent(txtBatchNo)
                            .addComponent(txtCostPrice)
                            .addComponent(txtMRP)
                            .addComponent(txtSellingPrice)
                            .addComponent(txtProductId))
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel9)
                .addGap(40, 40, 40)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnDelete)
                    .addComponent(btnReset)
                    .addComponent(btnModify))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String companyname = (String) cmbCompanyName.getSelectedItem();
            //String companyname = txtCompanyName.getText();
            String productname = txtProductName.getText();
            //String productid = txtProductId.getText();
            String batchno = txtBatchNo.getText();
            String cost_price = txtCostPrice.getText();
            String selling_price = txtSellingPrice.getText();
            String mrp = txtMRP.getText();
            //System.out.println("SELLING PRICEEEEE:"+sp);
            String quantity = txtQuantity.getText();

            if (selling_price.length() == 0) {
                float price = Integer.valueOf(cost_price);
                float sp = price + (price * 0.1f);
                selling_price = String.valueOf(sp);
            }

            if (productname.length() == 0) {
                JOptionPane.showMessageDialog(this, "Product Name field cannot be left blank");
                return;
            }
            if (cost_price.length() == 0) {
                JOptionPane.showMessageDialog(this, "Cost Price field cannot be left blank");
                return;
            }

            if (mrp.length() == 0) {
                JOptionPane.showMessageDialog(this, "MRP field cannot be left blank");
                return;
            }
            if (quantity.length() == 0) {
                JOptionPane.showMessageDialog(this, "Quantity field cannot be left blank");
                return;
            }
            if (valid.isValidMoney(cost_price) == false) {
                JOptionPane.showMessageDialog(this, "Invalid Price.");
                return;
            }
             if (valid.isValidMoney(mrp) == false) {
                JOptionPane.showMessageDialog(this, "Invalid Price.");
                return;
            }
              if (valid.isValidMoney(selling_price) == false) {
                JOptionPane.showMessageDialog(this, "Invalid Price.");
                return;
            }

            String query = "insert into ekam_product(product_id, name, product_name, batch_no, cost_price, mrp, selling_price, quantity) values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "0");
            ps.setString(2, companyname);
            ps.setString(3, productname);
            ps.setString(4, batchno);
            ps.setString(5, cost_price);
            ps.setString(6, mrp);
            ps.setString(7, selling_price);
            ps.setString(8, quantity);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + " rows inserted");
            // txtCompanyName.setText("");
            txtProductName.setText("");
            txtProductId.setText("");
            txtBatchNo.setText("");
            txtCostPrice.setText("");
            txtSellingPrice.setText("");
            txtMRP.setText("");
            txtQuantity.setText("");
            fillTable();
            ps.close();
        } 
        catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter the whole numbers only. Ex 1,2,3..");
        }
        catch (java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(this, "Batch Code already exits");
        }
        catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(this, e.getMessage());
            JOptionPane.showMessageDialog(this, "Something went wrong. Contact the developer.");

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBatchNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchNoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int a = jTable1.getSelectedRow();
        if (a >= 0) {
            TableModel y = jTable1.getModel();
            String name = (String) y.getValueAt(a, 0);
            String product_name = (String) y.getValueAt(a, 1);
            String product_id = (String) y.getValueAt(a, 2);
            String batch_no = (String) y.getValueAt(a, 3);
            String cost_price = (String) y.getValueAt(a, 4);
            String mrp = (String) y.getValueAt(a, 5);
            String selling_price = (String) y.getValueAt(a, 6);
            String quantity = (String) y.getValueAt(a, 7);

            //txtUserid.setText(userid);
            //txtCompanyName.setText(name);
            cmbCompanyName.setSelectedItem(name);
            txtProductName.setText(product_name);

            txtProductId.setText(product_id);
            txtBatchNo.setText(batch_no);
            txtCostPrice.setText(cost_price);
            txtMRP.setText(mrp);
            txtSellingPrice.setText(selling_price);
            txtQuantity.setText(quantity);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {

            String companyname = (String) cmbCompanyName.getSelectedItem();
            //String companyname = txtCompanyName.getText();
            String productname = txtProductName.getText();
            String productid = txtProductId.getText();
            String batchno = txtBatchNo.getText();
            String cost_price = txtCostPrice.getText();
            String selling_price = txtSellingPrice.getText();
            String mrp = txtMRP.getText();
            //System.out.println("SELLING PRICEEEEE:"+sp);
            String quantity = txtQuantity.getText();

            if (selling_price.length() == 0) {
                float price = Integer.valueOf(cost_price);
                float sp = price + (price * 0.1f);
                selling_price = String.valueOf(sp);
            }

            if (productname.length() == 0) {
                JOptionPane.showMessageDialog(this, "Product Name field cannot be left blank");
                return;
            }
            if (cost_price.length() == 0) {
                JOptionPane.showMessageDialog(this, "Cost Price field cannot be left blank");
                return;
            }

            if (mrp.length() == 0) {
                JOptionPane.showMessageDialog(this, "MRP field cannot be left blank");
                return;
            }
            if (quantity.length() == 0) {
                JOptionPane.showMessageDialog(this, "Quantity field cannot be left blank");
                return;
            }
            
              
            

            String query = "update ekam_product set name=?, product_name=?, cost_price=?, mrp=?, selling_price=?, quantity=? where batch_no= ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, companyname);
            ps.setString(2, productname);
            ps.setString(3, cost_price);
            ps.setString(4, mrp);
            ps.setString(5, selling_price);
            ps.setString(6, quantity);
            ps.setString(7, batchno);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + " rows modified");
            // txtCompanyName.setText("");
            txtProductName.setText("");
            txtProductId.setText("");
            txtBatchNo.setText("");
            txtCostPrice.setText("");
            txtSellingPrice.setText("");
            txtMRP.setText("");
            txtQuantity.setText("");
            fillTable();
            ps.close();
        } 
        catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter the whole numbers only. Ex 1,2,3..");
        }
        catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(this, e.getMessage());
            JOptionPane.showMessageDialog(this, "Something went wrong. Contact the developer.");

        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     try{
         String batchno = txtBatchNo.getText();
  
                 if (batchno.length() == 0) {
                JOptionPane.showMessageDialog(this, "Batch Code field cannot be left blank");
                return;
            }

            String query = "delete from ekam_product where batch_no=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, batchno);

            int x = ps.executeUpdate();
            txtProductName.setText("");
            txtProductId.setText("");
            txtBatchNo.setText("");
            txtCostPrice.setText("");
            txtSellingPrice.setText("");
            txtMRP.setText("");
            txtQuantity.setText("");
            fillTable();
            ps.close();
            if (x == 1) {
                JOptionPane.showMessageDialog(this, x + " record deleted");
            } else {
                JOptionPane.showMessageDialog(this, "unsuccessful");
            }
             }
        catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(this, e.getMessage());
            JOptionPane.showMessageDialog(this, "Something went wrong. Contact the developer.");

        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbCompanyName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtCostPrice;
    private javax.swing.JTextField txtMRP;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSellingPrice;
    // End of variables declaration//GEN-END:variables
}
