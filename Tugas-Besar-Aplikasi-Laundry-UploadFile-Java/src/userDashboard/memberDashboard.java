
package userDashboard;

import Main.loginPage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksiDatabase.Connect;


public class memberDashboard extends javax.swing.JFrame {

    String date, time;
    public memberDashboard() throws SQLException {
        initComponents();
        showTables();
        showServices();
        defaultForm(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrder = new javax.swing.JButton();
        btnMyOrder = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        pricePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        orderNowPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        isiOtomatis = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        labelWaktuPickup = new javax.swing.JLabel();
        btnYaPickup = new javax.swing.JRadioButton();
        btnNoPickup = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        btnHariIniPickup = new javax.swing.JRadioButton();
        btnTglLainPickup = new javax.swing.JRadioButton();
        labelTglPickup = new javax.swing.JLabel();
        timeChooser = new com.toedter.components.JSpinField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        labelWaktuOperasi = new javax.swing.JLabel();
        btnGoOrder = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labelBerat = new javax.swing.JLabel();
        estimasiBerat = new javax.swing.JTextField();
        labelWaktuPickup1 = new javax.swing.JLabel();
        timeChooser1 = new com.toedter.components.JSpinField();
        labelWaktuOperasi1 = new javax.swing.JLabel();
        orderPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        activeTableOrder = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        historyOrderTable = new javax.swing.JTable();
        pointPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePoint = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        labelPoint = new javax.swing.JLabel();
        labelusername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));

        jPanel2.setBackground(new java.awt.Color(255, 195, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME");

        labelNama.setBackground(new java.awt.Color(255, 255, 255));
        labelNama.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(labelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(2, 48, 71));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        btnOrder.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/online-order (2).png"))); // NOI18N
        btnOrder.setText("Order Laundry");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnMyOrder.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnMyOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/tracking.png"))); // NOI18N
        btnMyOrder.setText("   My Order");
        btnMyOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyOrderActionPerformed(evt);
            }
        });

        btnPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/coupon.png"))); // NOI18N
        btnPoint.setText("    My Points");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/log-out.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOG OUT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(btnMyOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPoint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMyOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(2, 48, 71));
        mainPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(2, 48, 71));
        homePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        homePanel.setLayout(new java.awt.CardLayout());

        pricePanel.setBackground(new java.awt.Color(2, 48, 71));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRICE LIST");

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(0, 150, 199));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("ORDER SEKARANG");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pricePanelLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jButton2)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        homePanel.add(pricePanel, "card2");

        orderNowPanel.setBackground(new java.awt.Color(2, 48, 71));
        orderNowPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ORDER FORM");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Full Name");

        txtName.setBackground(new java.awt.Color(206, 212, 218));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone Number");

        txtPhoneNumber.setBackground(new java.awt.Color(206, 212, 218));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");

        txtAddress.setBackground(new java.awt.Color(206, 212, 218));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        isiOtomatis.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        isiOtomatis.setForeground(new java.awt.Color(255, 255, 255));
        isiOtomatis.setText("ISI OTOMATIS ?");
        isiOtomatis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isiOtomatisMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Laundry Service");

        jComboBox1.setBackground(new java.awt.Color(206, 212, 218));
        jComboBox1.setForeground(new java.awt.Color(206, 212, 218));

        labelWaktuPickup.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelWaktuPickup.setForeground(new java.awt.Color(255, 255, 255));
        labelWaktuPickup.setText("Waktu Pickup");

        btnYaPickup.setBackground(new java.awt.Color(2, 48, 71));
        buttonGroup1.add(btnYaPickup);
        btnYaPickup.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnYaPickup.setForeground(new java.awt.Color(255, 255, 255));
        btnYaPickup.setText("Ya");
        btnYaPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaPickupActionPerformed(evt);
            }
        });

        btnNoPickup.setBackground(new java.awt.Color(2, 48, 71));
        buttonGroup1.add(btnNoPickup);
        btnNoPickup.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNoPickup.setForeground(new java.awt.Color(255, 255, 255));
        btnNoPickup.setText("Tidak");
        btnNoPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoPickupActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pickup & Delivery");

        btnHariIniPickup.setBackground(new java.awt.Color(2, 48, 71));
        buttonGroup2.add(btnHariIniPickup);
        btnHariIniPickup.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnHariIniPickup.setForeground(new java.awt.Color(255, 255, 255));
        btnHariIniPickup.setText("Hari Ini");
        btnHariIniPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariIniPickupActionPerformed(evt);
            }
        });

        btnTglLainPickup.setBackground(new java.awt.Color(2, 48, 71));
        buttonGroup2.add(btnTglLainPickup);
        btnTglLainPickup.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnTglLainPickup.setForeground(new java.awt.Color(255, 255, 255));
        btnTglLainPickup.setText("Tanggal Lain");
        btnTglLainPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTglLainPickupActionPerformed(evt);
            }
        });

        labelTglPickup.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelTglPickup.setForeground(new java.awt.Color(255, 255, 255));
        labelTglPickup.setText("Tanggal Pickup");

        timeChooser.setBackground(new java.awt.Color(206, 212, 218));
        timeChooser.setMaximum(99999999);
        timeChooser.setMinimum(0);
        timeChooser.setValue(8);

        dateChooser.setDateFormatString("dd/MM/yyyy");

        labelWaktuOperasi.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelWaktuOperasi.setForeground(new java.awt.Color(255, 255, 255));
        labelWaktuOperasi.setText("08.00 - 17.00");
        labelWaktuOperasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelWaktuOperasiMouseClicked(evt);
            }
        });

        btnGoOrder.setBackground(new java.awt.Color(0, 150, 199));
        btnGoOrder.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnGoOrder.setText("ORDER");
        btnGoOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoOrderActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estimasi Berat");

        labelBerat.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelBerat.setForeground(new java.awt.Color(255, 255, 255));
        labelBerat.setText("/KG");
        labelBerat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBeratMouseClicked(evt);
            }
        });

        estimasiBerat.setBackground(new java.awt.Color(206, 212, 218));

        labelWaktuPickup1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelWaktuPickup1.setForeground(new java.awt.Color(255, 255, 255));
        labelWaktuPickup1.setText("Jam Pickup");

        timeChooser1.setBackground(new java.awt.Color(206, 212, 218));
        timeChooser1.setMaximum(99999999);
        timeChooser1.setMinimum(0);
        timeChooser1.setValue(8);

        labelWaktuOperasi1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelWaktuOperasi1.setForeground(new java.awt.Color(255, 255, 255));
        labelWaktuOperasi1.setText("08.00 - 17.00");
        labelWaktuOperasi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelWaktuOperasi1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout orderNowPanelLayout = new javax.swing.GroupLayout(orderNowPanel);
        orderNowPanel.setLayout(orderNowPanelLayout);
        orderNowPanelLayout.setHorizontalGroup(
            orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderNowPanelLayout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTglLainPickup)
                    .addComponent(btnNoPickup))
                .addGap(0, 216, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderNowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(orderNowPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(74, 74, 74))
                    .addGroup(orderNowPanelLayout.createSequentialGroup()
                        .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(labelWaktuPickup)
                            .addComponent(labelWaktuPickup1)
                            .addComponent(labelTglPickup))
                        .addGap(18, 18, 18)))
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGoOrder)
                    .addComponent(btnYaPickup)
                    .addComponent(btnHariIniPickup)
                    .addGroup(orderNowPanelLayout.createSequentialGroup()
                        .addComponent(estimasiBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelBerat))
                    .addGroup(orderNowPanelLayout.createSequentialGroup()
                        .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(orderNowPanelLayout.createSequentialGroup()
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(timeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                                .addGroup(orderNowPanelLayout.createSequentialGroup()
                                    .addComponent(timeChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelWaktuOperasi1))))
                        .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderNowPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(isiOtomatis))
                            .addGroup(orderNowPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelWaktuOperasi)))))
                .addGap(64, 64, 64))
        );
        orderNowPanelLayout.setVerticalGroup(
            orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderNowPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiOtomatis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(estimasiBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBerat))
                .addGap(9, 9, 9)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnYaPickup)
                    .addComponent(btnNoPickup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWaktuPickup)
                    .addComponent(btnHariIniPickup)
                    .addComponent(btnTglLainPickup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timeChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWaktuOperasi1)
                    .addComponent(labelWaktuPickup1))
                .addGap(18, 18, 18)
                .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(orderNowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelTglPickup)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(timeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelWaktuOperasi))
                .addGap(18, 18, 18)
                .addComponent(btnGoOrder)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        homePanel.add(orderNowPanel, "card3");

        mainPanel.add(homePanel, "card2");

        orderPanel.setBackground(new java.awt.Color(0, 129, 167));
        orderPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("HISTORY ORDER");

        activeTableOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(activeTableOrder);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ACTIVE ORDER");

        historyOrderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(historyOrderTable);

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        mainPanel.add(orderPanel, "card3");

        pointPanel.setBackground(new java.awt.Color(42, 157, 143));
        pointPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        tablePoint.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablePoint);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TOTAL POINT : ");

        labelPoint.setBackground(new java.awt.Color(255, 255, 255));
        labelPoint.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelPoint.setForeground(new java.awt.Color(255, 255, 255));

        labelusername.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pointPanelLayout = new javax.swing.GroupLayout(pointPanel);
        pointPanel.setLayout(pointPanelLayout);
        pointPanelLayout.setHorizontalGroup(
            pointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pointPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(pointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pointPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        pointPanelLayout.setVerticalGroup(
            pointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pointPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        labelPoint.setText(String.valueOf(getTotalPoint(labelusername.getText())));

        mainPanel.add(pointPanel, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        int response =JOptionPane.showConfirmDialog(this, "Are you sure ?", "Confirm", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            loginPage logout = null;
            try {
                logout = new loginPage();
            } catch (SQLException ex) {
                Logger.getLogger(memberDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            logout.setVisible(true);
            this.dispose();
        }else{
            return;
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(homePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnMyOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyOrderActionPerformed
        // TODO add your handling code here:  
        clear();
        defaultForm(false);
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(orderPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        showActiveOrder();
        showHistoryOrder();

    }//GEN-LAST:event_btnMyOrderActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        // TODO add your handling code here:
        clear();
        defaultForm(false);
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(pointPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        labelusername.setVisible(false);
        labelPoint.setText(String.valueOf(getTotalPoint(labelusername.getText())));
        showTablePoint();
        tablePoint.setEnabled(false);
    }//GEN-LAST:event_btnPointActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(orderNowPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void isiOtomatisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isiOtomatisMouseClicked
        // TODO add your handling code here:
        try {
            Statement stmt2 = (Statement) Connect.configDB().createStatement();
            String query2 = "SELECT * FROM customer where nama = ('" + labelNama.getText() + "');" ;              
            ResultSet rs2 = stmt2.executeQuery(query2);
            
            if (rs2.next()) {
                txtName.setText(rs2.getString("nama"));
                txtPhoneNumber.setText(rs2.getString("telpon"));
                txtAddress.setText(rs2.getString("alamat"));
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_isiOtomatisMouseClicked

    private void labelWaktuOperasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelWaktuOperasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelWaktuOperasiMouseClicked

    private void btnYaPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaPickupActionPerformed
        // TODO add your handling code here:
        if (btnYaPickup.isSelected()) {
            labelWaktuPickup.setVisible(true);
            btnHariIniPickup.setVisible(true);
            btnTglLainPickup.setVisible(true);
        }
    }//GEN-LAST:event_btnYaPickupActionPerformed

    private void defaultForm (boolean condition) {
        labelWaktuPickup.setVisible(condition);
        btnHariIniPickup.setVisible(condition);
        btnTglLainPickup.setVisible(condition);
        labelTglPickup.setVisible(condition);
        dateChooser.setVisible(condition);
        timeChooser.setVisible(condition);
        labelWaktuOperasi.setVisible(condition);
        labelWaktuPickup1.setVisible(condition);
        labelWaktuOperasi1.setVisible(condition);
        timeChooser1.setVisible(condition);
        
    }
    
    private void labelBeratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBeratMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelBeratMouseClicked

    private void btnNoPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoPickupActionPerformed
        // TODO add your handling code here:
        if (btnNoPickup.isSelected()) {
            defaultForm(false);
            buttonGroup2.clearSelection();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
            LocalDateTime now = LocalDateTime.now();
        
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH");  
            LocalDateTime now2 = LocalDateTime.now();
            
            this.date = dtf.format(now);
            this.time = dtf2.format(now2);
            
            timeChooser1.setValue(0);
            timeChooser.setValue(0);
        }
    }//GEN-LAST:event_btnNoPickupActionPerformed

    private void btnHariIniPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariIniPickupActionPerformed
        // TODO add your handling code here:
        if (btnHariIniPickup.isSelected()) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
            LocalDateTime now = LocalDateTime.now();

            this.date = dtf.format(now);
            
            labelWaktuPickup1.setVisible(true);
            labelWaktuOperasi1.setVisible(true);
            timeChooser1.setVisible(true);
        
            labelTglPickup.setVisible(false);
            dateChooser.setVisible(false);
            timeChooser.setVisible(false);
            labelWaktuOperasi.setVisible(false);
            
            timeChooser.setValue(0);
        }
        
    }//GEN-LAST:event_btnHariIniPickupActionPerformed

    private void btnTglLainPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTglLainPickupActionPerformed
        // TODO add your handling code here:
        if (btnTglLainPickup.isSelected()) {
            labelTglPickup.setVisible(true);
            dateChooser.setVisible(true);
            timeChooser.setVisible(true);
            labelWaktuOperasi.setVisible(true);
            
            labelWaktuPickup1.setVisible(false);
            timeChooser1.setVisible(false);
            labelWaktuOperasi1.setVisible(false);
            
            timeChooser1.setValue(0);
        }
    }//GEN-LAST:event_btnTglLainPickupActionPerformed

    private void btnGoOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoOrderActionPerformed

                

        // TODO add your handling code here:
        int n = 0;
        if (btnTglLainPickup.isSelected()) { 
            this.date = getDate();
            n = 1;
            this.time = getTime(n);
        }else if (btnHariIniPickup.isSelected()){
            n = 2;
            this.time = getTime(n);
        }
        
        
        try {
            if (checkAllField() && isWeightValid()&& isTimeValid(n) && this.date != null) {
                
                //get row number
                Statement stmt = (Statement) Connect.configDB().createStatement();
                String query = "SELECT * FROM tab_pesanan ORDER BY no ASC" ;              
                ResultSet rs = stmt.executeQuery(query);
                
                int getRowNumber = 0;
                while (rs.next()) {
                    getRowNumber = rs.getInt("no");
                }
                
                //get id user
                Statement stmt2 = (Statement) Connect.configDB().createStatement();
                ResultSet rs2 = stmt2.executeQuery("SELECT * FROM customer WHERE nama = ('"+labelNama.getText()+"')");
                String kodeCustomer = "";
                if (rs2.next()) {
                    kodeCustomer = rs2.getString("id_user");
                }
                
                //get point diskon
                Statement stmt3 = (Statement) Connect.configDB().createStatement();
                ResultSet rs3 = stmt3.executeQuery("SELECT * FROM point_diskon WHERE id_user = ('"+kodeCustomer+"')");
                int diskon = 0;
                if (rs3.next()) {
                    diskon = rs3.getInt("point");
                }
                
                //get point value and check, after that make it -10
                int priceDiskon = 0;
                if (diskon >= 10) {
                    priceDiskon = 15000;
                    Statement stmt4 = (Statement) Connect.configDB().createStatement();
                    stmt4.executeUpdate("UPDATE `point_diskon` SET `point` = '"+(diskon-10)+"' WHERE `point_diskon`.`id_user` = '"+kodeCustomer+"'");
                    //to get actual point
                    diskon-=10;
                }
                
                //calculate total price
                int totalBayar = Integer.parseInt(estimasiBerat.getText()) * getHargaService() + getOngkir();
                if (totalBayar <= priceDiskon) {
                    totalBayar = 0;
                }else{
                    totalBayar = totalBayar - priceDiskon;
                }
                
                
                
                //insert to table
                Statement stmt5 = (Statement) Connect.configDB().createStatement();
                stmt5.executeUpdate("INSERT INTO tab_pesanan VALUES ('"+(getRowNumber+1)+"','"+generateIDPesanan(getRowNumber)+"','"+String.valueOf(this.date)+"','"+this.time+"','"+kodeCustomer+"','"+txtName.getText()+"','"+txtPhoneNumber.getText()+"','"+txtAddress.getText()+"','"+getServices()+"','"+Integer.parseInt(estimasiBerat.getText())+"','"+Integer.parseInt(estimasiBerat.getText())+"','"+getOngkir()+"','"+getHargaService()+"','"+priceDiskon+"','"+totalBayar+"','"+true+"');");
                
                JOptionPane.showMessageDialog(this, "Order dalam antrian");
            }
        } catch (Exception e) {
          System.err.print(e);
        }
        
    }//GEN-LAST:event_btnGoOrderActionPerformed

    private void labelWaktuOperasi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelWaktuOperasi1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelWaktuOperasi1MouseClicked

    private void showActiveOrder () {
        String [] kolom = {"Order Number", "Tgl Order", "Services", "Berat", "Ongkir", "Diskon", "Total"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_user =('"+getIdUser(labelusername.getText())+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
                String orderNumber = rs.getString("id_pesanan");
                String tglOrder = rs.getString("tanggal");
                String services = rs.getString("services");
                String berat = rs.getString("aktual_berat");
                String ongkir = rs.getString("ongkir");
                String diskon = rs.getString("diskon");
                String total = rs.getString("total_bayar");
                String status = rs.getString("status");
                        
                if (status.equals("true")) {
                    tb1.addRow(new String[] {orderNumber, tglOrder, services, berat, ongkir, diskon, total});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        activeTableOrder.setModel(tb1);
        activeTableOrder.setEnabled(false);
    }
    
    private void showHistoryOrder () {
        String [] kolom = {"Order Number", "Tgl Order", "Services", "Berat", "Ongkir", "Diskon", "Total"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_user =('"+getIdUser(labelusername.getText())+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
                String orderNumber = rs.getString("id_pesanan");
                String tglOrder = rs.getString("tanggal");
                String services = rs.getString("services");
                String berat = rs.getString("aktual_berat");
                String ongkir = rs.getString("ongkir");
                String diskon = rs.getString("diskon");
                String total = rs.getString("total_bayar");
                String status = rs.getString("status");
                        
                if (status.equals("false")) {
                    tb1.addRow(new String[] {orderNumber, tglOrder, services, berat, ongkir, diskon, total});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        historyOrderTable.setModel(tb1);
        historyOrderTable.setEnabled(false);
    }
    
    private boolean isTimeValid (int n) {
        boolean result = false;
        
        if (btnNoPickup.isSelected()) {
            return true;
        }
        
        if (n == 1) {
            if (timeChooser.getValue() >= 8 && timeChooser.getValue() <= 17 ) {
                result = true;
            }else{
                JOptionPane.showMessageDialog(this, "Waktu tidak valid");
                timeChooser.setValue(0);
                result = false;
            }
        }else if (n == 2){
            if (timeChooser1.getValue() >= 8 && timeChooser1.getValue() <= 17) {
                result = true;
            }else{
                JOptionPane.showMessageDialog(this, "Waktu tidak valid");
                timeChooser1.setValue(0);
                result = false;
            }
        }else{
            JOptionPane.showMessageDialog(this, "Waktu tidak valid");
        }
        return result;
    }
    
    private boolean isWeightValid () {
        boolean result;
        if (Integer.valueOf(estimasiBerat.getText()) > 0 && Integer.valueOf(estimasiBerat.getText()) > 30) {
            JOptionPane.showMessageDialog(this, "Berat maximum adalah 30 Kg");
            estimasiBerat.setText("");
            result = false;
        }else{
            result = true;
        }
        return result;
    }
    
    private String generateIDPesanan (int n) {
        //template order
        String kalimat = "#ORD-0000";
	
        //get substring from index 0 to index (n+1).length
        //after substring return its value, the we add the rest of index with (n+1)
	String result = kalimat.substring(0, kalimat.length()- String.valueOf(n+1).length()) + String.valueOf(n+1);
        return result;
    }
    
    private void showServices () {
        try {
            Statement stmt2 = (Statement) Connect.configDB().createStatement();
            String query2 = "SELECT * FROM services" ;              
            ResultSet rs2 = stmt2.executeQuery(query2);
            
            while(rs2.next()){
                if (rs2.getString("jenis_laundry").equals("Pickup and Delivery")) {
                    continue;
                }else{
                    jComboBox1.addItem(rs2.getString("jenis_laundry"));
                }
            }
            
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    private void showTables() throws SQLException{
        
        String [] kolom = {"Laundry Kiloan", "Harga"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM services";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
                String jenisLaundry = rs.getString("jenis_laundry");
                String harga = "Rp. "+rs.getString("harga");
                
                tb1.addRow(new String[] {jenisLaundry, harga});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jTable1.setModel(tb1);
        jTable1.setEnabled(false);
    } 
    
    private String getDate () {
        String strDate= null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            strDate= formatter.format(dateChooser.getDate()); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tanggal tidak valid");
        }
        
        return strDate;
    }
    
    private String getTime (int n) {
        String result = null;
        if (n == 1) {
            result = String.valueOf(timeChooser.getValue());
        }else if (n == 2){
            result = String.valueOf(timeChooser1.getValue());
        }
        return result;
    }
    
    private boolean checkAllField () {
       if (!txtName.getText().isEmpty() && !txtAddress.getText().isEmpty() && !txtPhoneNumber.getText().isEmpty() && !estimasiBerat.getText().isEmpty()) {
            return true;
        }else{
           JOptionPane.showMessageDialog(this, "Please fill the form");
           return false;
       }
    }
    
    private String getServices () {
        return String.valueOf(jComboBox1.getSelectedItem());
    }
    
    private int getHargaService () {
        int result = 0;
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM services WHERE jenis_laundry =('"+getServices()+"');";              
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getInt("harga");
            }
            
        } catch (Exception e) {
            System.err.print(e);
        }
        return result;
    }
    
    private int getOngkir () {
        int ongkir = 0;
        if (btnYaPickup.isSelected()) {
            ongkir = 15000;
        }else if(btnNoPickup.isSelected()){
            ongkir = 0;
        }
        return ongkir;
    }
    
    public void setLabelUsername(String username) {
    this.labelusername.setText(username);
}
    
    private int getTotalPoint (String username) {
        int result = 0;
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM point_diskon WHERE id_user = ('"+getIdUser(username)+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getInt("point");
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private int getPoint (int totalBayar) {
        int counter=0;
	while(totalBayar >= 25000) {
            if (totalBayar - 25000 >= 0) {
        	counter++;
		totalBayar -= 25000;
                }
            }
        return counter;
    }
    
    public String getIdUser (String username) {
        String result = "";
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM customer WHERE username = ('"+labelusername.getText()+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getString("id_user");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "User not found");
        }
        return result;
    }
    
    private void showTablePoint () {
        String [] kolom = {"No", "Order Number", "Total Price", "Point from Order"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan WHERE id_user = ('"+getIdUser(labelusername.getText())+"') AND status ='false';";
            ResultSet rs = stmt.executeQuery(query);
            
            int no =0;
            while (rs.next()){
                no++;
                String orderNumber = rs.getString("id_pesanan");
                String totalPrice = rs.getString("total_bayar");
                int point = getPoint(Integer.parseInt(totalPrice));
                
                tb1.addRow(new String[] {String.valueOf(no), orderNumber, totalPrice, String.valueOf(point)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        tablePoint.setModel(tb1);
    }
    
    private void clear () {
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        estimasiBerat.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        timeChooser.setValue(0);
        timeChooser1.setValue(0);
    }
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
            java.util.logging.Logger.getLogger(memberDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(memberDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(memberDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(memberDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new memberDashboard().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(memberDashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable activeTableOrder;
    private javax.swing.JButton btnGoOrder;
    private javax.swing.JRadioButton btnHariIniPickup;
    private javax.swing.JButton btnMyOrder;
    private javax.swing.JRadioButton btnNoPickup;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPoint;
    private javax.swing.JRadioButton btnTglLainPickup;
    private javax.swing.JRadioButton btnYaPickup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JTextField estimasiBerat;
    private javax.swing.JTable historyOrderTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel isiOtomatis;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelBerat;
    public javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPoint;
    private javax.swing.JLabel labelTglPickup;
    private javax.swing.JLabel labelWaktuOperasi;
    private javax.swing.JLabel labelWaktuOperasi1;
    private javax.swing.JLabel labelWaktuPickup;
    private javax.swing.JLabel labelWaktuPickup1;
    public javax.swing.JLabel labelusername;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel orderNowPanel;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JPanel pointPanel;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JTable tablePoint;
    private com.toedter.components.JSpinField timeChooser;
    private com.toedter.components.JSpinField timeChooser1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
