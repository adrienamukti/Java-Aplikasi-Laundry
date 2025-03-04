
package cashierDashboard;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksiDatabase.Connect;

public class paymentForm extends javax.swing.JFrame {

    public paymentForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDPesanan = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNewTotal = new javax.swing.JTextField();
        txtPayment = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));

        jPanel2.setBackground(new java.awt.Color(255, 195, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payment Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Pesanan");

        txtIDPesanan.setEditable(false);
        txtIDPesanan.setBackground(new java.awt.Color(206, 212, 218));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Total");

        txtNewTotal.setEditable(false);
        txtNewTotal.setBackground(new java.awt.Color(206, 212, 218));

        txtPayment.setBackground(new java.awt.Color(206, 212, 218));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Payment");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Kembalian");

        txtKembalian.setEditable(false);
        txtKembalian.setBackground(new java.awt.Color(206, 212, 218));

        btnDone.setBackground(new java.awt.Color(0, 150, 199));
        btnDone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(193, 18, 31));
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnDone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNewTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDone)
                    .addComponent(btnBack))
                .addGap(0, 98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        
        //condition if total price is equal to 0
        if (txtNewTotal.getText().replace("Rp. ", "").equals("0")) {
            try {
                Statement stmt = (Statement) Connect.configDB().createStatement();
                stmt.execute("UPDATE tab_pesanan SET status = 'false' WHERE id_pesanan =('"+txtIDPesanan.getText()+"');"); 
                JOptionPane.showMessageDialog(this, "Order "+ txtIDPesanan.getText() + " Telah Selesai");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal Menyelesaikan Pembayaran");
            }    
        }else{
           //if total price is not equal to 0, then we calculate from total price, and the payment input from user
           
           //null exception
            int payment=0;
            try {
                payment = Integer.parseInt(txtPayment.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please fill the form");
                return;
            }
            
            //if total payment < total price
            if (payment < Integer.parseInt(txtNewTotal.getText().replace("Rp. ", ""))) {
                JOptionPane.showMessageDialog(this, "Payment kurang dari total tagihan");
                txtPayment.setText("");
            }else if(payment > Integer.parseInt(txtNewTotal.getText().replace("Rp. ", ""))){
                //if total payment > total price
                //show the change field
                jLabel21.setVisible(true);
                txtKembalian.setVisible(true);
                txtKembalian.setText("Rp. "+String.valueOf(payment - Integer.parseInt(txtNewTotal.getText().replace("Rp. ", ""))));
                
                //then we update value from tab_pesanan status to false
                try {
                    Statement stmt = (Statement) Connect.configDB().createStatement();
                    stmt.execute("UPDATE tab_pesanan SET status = 'false' WHERE id_pesanan =('"+txtIDPesanan.getText()+"');");
                    JOptionPane.showMessageDialog(this, "Order "+ txtIDPesanan.getText() + " Telah Selesai");
                    
                    //then we add some point to the user
                    insertPoint();
                    txtIDPesanan.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Gagal Menyelesaikan Pembayaran");
                }
                
            }else{
                try {
                    Statement stmt = (Statement) Connect.configDB().createStatement();
                    stmt.execute("UPDATE tab_pesanan SET status = 'false' WHERE id_pesanan =('"+txtIDPesanan.getText()+"');"); 
                    JOptionPane.showMessageDialog(this, "Order "+ txtIDPesanan.getText() + " Telah Selesai");
                    
                    //add some point to user
                    insertPoint();
                    txtIDPesanan.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Gagal Menyelesaikan Pembayaran");
                }
            }
        }
        
        
    }//GEN-LAST:event_btnDoneActionPerformed
    
    private void insertPoint () {
        //add point to user
        if (!isOrderFromCashier(getIDUserFromOrderID(txtIDPesanan.getText()))) {
            try {
                Statement stmt2 = (Statement) Connect.configDB().createStatement();
                stmt2.executeUpdate("UPDATE `point_diskon` SET `point` = '"+(getPointDiskonFromDB(getIDUserFromOrderID(txtIDPesanan.getText()))+calculatePointFromOrder())+"' WHERE `id_user` = '"+getIDUserFromOrderID(txtIDPesanan.getText())+"'");
            } catch (Exception e) {
            }
        }
    }
    
    private boolean isOrderFromCashier (String idUser) {
        boolean result = false;
        try {
           Statement stmt3 = (Statement) Connect.configDB().createStatement();
           ResultSet rs3 = stmt3.executeQuery("SELECT * FROM customer WHERE id_user = ('"+idUser+"')"); 
           
            if (rs3.next()) {
                if (rs3.getString("username").contains("kasir")) {
                    result = true;
                }
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private String getIDUserFromOrderID (String orderID) {
        String result = "";
        try {
           Statement stmt3 = (Statement) Connect.configDB().createStatement();
           ResultSet rs3 = stmt3.executeQuery("SELECT * FROM tab_pesanan WHERE id_pesanan = ('"+orderID+"')"); 
           
            if (rs3.next()) {
                result = rs3.getString("kode_customer");
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private int calculatePointFromOrder () {
        //calculate point from order 
        int counter=0;
        int totalBayar = Integer.parseInt(txtNewTotal.getText().replace("Rp. ", ""));
        while(totalBayar >= 25000) {
            if (totalBayar - 25000 >= 0) {
                counter++;
                totalBayar -= 25000;
                }
            } 
        return counter;
    }
    
    private int getPointDiskonFromDB (String idUser) throws SQLException {
        Statement stmt3 = (Statement) Connect.configDB().createStatement();
        ResultSet rs3 = stmt3.executeQuery("SELECT * FROM point_diskon WHERE id_user = ('"+idUser+"')");
        int diskon = 0;
        if (rs3.next()) {
            diskon = rs3.getInt("point");
        }
        
        return diskon;
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    
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
            java.util.logging.Logger.getLogger(paymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtIDPesanan;
    public javax.swing.JTextField txtKembalian;
    public javax.swing.JTextField txtNewTotal;
    public javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables
}
