
package cashierDashboard;

import Main.loginPage;
import userDashboard.memberDashboard;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import koneksiDatabase.Connect;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class kasirDashboard extends javax.swing.JFrame {

        String date, time;
    public kasirDashboard() {
        initComponents();
         showServices();
        clearPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        updatePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allOrderTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDPesanan = new javax.swing.JTextField();
        txtIDUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sevices = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        aktualBerat = new javax.swing.JTextField();
        labelBerat1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnYaPickup1 = new javax.swing.JRadioButton();
        btnNoPickup1 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnReview = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        searchBarPayment = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cariIDPesanan = new javax.swing.JTextField();
        btnResetSearch = new javax.swing.JButton();
        btnSearchIDPesanan1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        searchBarInfo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dateChooser1 = new com.toedter.calendar.JDateChooser();
        timeChooser2 = new com.toedter.components.JSpinField();
        JFileChooser = new javax.swing.JButton();

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
                .addComponent(labelNama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelNama))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(2, 48, 71));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/log-out.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOG OUT");

        btnUpdate.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        mainPanel.setBackground(new java.awt.Color(2, 48, 71));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        mainPanel.setLayout(new java.awt.CardLayout());

        updatePanel.setBackground(new java.awt.Color(33, 158, 188));

        allOrderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        allOrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allOrderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allOrderTable);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Order Table");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Order Information");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Pesanan");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID User");

        txtIDPesanan.setEditable(false);

        txtIDUser.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tanggal");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Waktu");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Services");

        sevices.setBackground(new java.awt.Color(206, 212, 218));
        sevices.setForeground(new java.awt.Color(206, 212, 218));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Berat");

        labelBerat1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelBerat1.setForeground(new java.awt.Color(255, 255, 255));
        labelBerat1.setText("/KG");
        labelBerat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBerat1MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Delivery");

        btnYaPickup1.setBackground(new java.awt.Color(33, 158, 188));
        buttonGroup3.add(btnYaPickup1);
        btnYaPickup1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnYaPickup1.setForeground(new java.awt.Color(255, 255, 255));
        btnYaPickup1.setText("Ya");
        btnYaPickup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaPickup1ActionPerformed(evt);
            }
        });

        btnNoPickup1.setBackground(new java.awt.Color(33, 158, 188));
        buttonGroup3.add(btnNoPickup1);
        btnNoPickup1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNoPickup1.setForeground(new java.awt.Color(255, 255, 255));
        btnNoPickup1.setText("Tidak");
        btnNoPickup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoPickup1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Total");

        txtTotal.setEditable(false);

        btnReview.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnReview.setText("Review");
        btnReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Info Customer");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cari ID-Pesanan");

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Id Pesanan");

        btnResetSearch.setBackground(new java.awt.Color(193, 18, 31));
        btnResetSearch.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnResetSearch.setText("Refresh");
        btnResetSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetSearchActionPerformed(evt);
            }
        });

        btnSearchIDPesanan1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSearchIDPesanan1.setText("Search");
        btnSearchIDPesanan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIDPesanan1ActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Input Pembayaran");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cari ID-Pesanan");

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dateChooser1.setDateFormatString("dd/MM/yyyy");

        JFileChooser.setText("Cetak Laporan");
        JFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(updatePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtIDUser, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                        .addComponent(txtIDPesanan)
                                        .addComponent(jButton3)
                                        .addComponent(searchBarPayment)
                                        .addComponent(timeChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                    .addComponent(sevices, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(updatePanelLayout.createSequentialGroup()
                                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(aktualBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnYaPickup1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNoPickup1)
                                            .addComponent(labelBerat1)))
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReview))))
                        .addGap(66, 66, 66))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updatePanelLayout.createSequentialGroup()
                                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(updatePanelLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(cariIDPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearchIDPesanan1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnResetSearch))
                                    .addGroup(updatePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(29, 29, 29)
                                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(searchBarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                                .addComponent(JFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(254, 254, 254)))
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(jLabel21))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(166, 166, 166))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12))
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIDPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cariIDPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(btnSearchIDPesanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23)))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(sevices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBerat1)
                            .addComponent(aktualBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updatePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))
                            .addGroup(updatePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNoPickup1)
                                    .addComponent(btnYaPickup1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReview)))
                .addGap(8, 8, 8)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBarPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24)
                    .addComponent(searchBarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(JFileChooser)
                .addContainerGap())
        );

        mainPanel.add(updatePanel, "card3");

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

    private void clear () {
//        txtName.setText("");
//        txtAddress.setText("");
//        txtPhoneNumber.setText("");
//        estimasiBerat.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
//        timeChooser.setValue(0);
//        timeChooser1.setValue(0);
    }
    
    private void clearPanel () {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
//        mainPanel.add(orderPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        clear();
//        defaultForm(false);
        defaultFormUpdatePanel();
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(updatePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        showAllOrder();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private String isDateNull () {
        String date = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = formatter.format(dateChooser1.getDate());
        } catch (Exception e) {
            return null;
        }
        return date;
    }

    private boolean isWeightValid2 () {
        boolean result;
        if (Integer.valueOf(aktualBerat.getText()) > 0 && Integer.valueOf(aktualBerat.getText()) > 30) {
            JOptionPane.showMessageDialog(this, "Berat maximum adalah 30 Kg");
            aktualBerat.setText("");
            result = false;
        }else{
            result = true;
        }
        return result;
    }
    
    
    private boolean isTimeValid2 () {
        boolean result;
        if (timeChooser2.getValue() >= 8 && timeChooser2.getValue() <= 17 ) {
                result = true;
            }else{
                JOptionPane.showMessageDialog(this, "Waktu tidak valid");
                timeChooser2.setValue(0);
                result = false;
            }
        return result;
    }
        
   private void showServices() {
    try {
        Statement stmt2 = (Statement) Connect.configDB().createStatement();
        String query2 = "SELECT * FROM services";              
        ResultSet rs2 = stmt2.executeQuery(query2);
        
        while(rs2.next()){
            if (rs2.getString("jenis_laundry").equals("Pickup and Delivery")) {
                continue;
            } else {
                sevices.addItem(rs2.getString("jenis_laundry"));
            }
        }
    } catch (Exception e) {
        System.err.print(e);
    }
}
    
    
    private void labelBerat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBerat1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelBerat1MouseClicked

    private void btnYaPickup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaPickup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYaPickup1ActionPerformed

    private void btnNoPickup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoPickup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNoPickup1ActionPerformed

    private void allOrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allOrderTableMouseClicked
        // TODO add your handling code here:
        int row = allOrderTable.getSelectedRow();
        TableModel model = allOrderTable.getModel();
        
        txtIDPesanan.setText(model.getValueAt(row, 0).toString());
        txtIDUser.setText(model.getValueAt(row, 3).toString());
        timeChooser2.setValue(Integer.parseInt(model.getValueAt(row, 2).toString()));
        aktualBerat.setText(model.getValueAt(row, 5).toString());
        txtTotal.setText("Rp. " + model.getValueAt(row, 7).toString());
        if (getOngkirFromDB(txtIDPesanan.getText()).equals("15000")) {
            btnYaPickup1.setSelected(true);
        }else if(getOngkirFromDB(txtIDPesanan.getText()).equals("0")){
            btnNoPickup1.setSelected(true);
        }
        sevices.setSelectedItem(model.getValueAt(row, 4));
        searchBarPayment.setText(model.getValueAt(row, 0).toString().replace("#ORD-", ""));
        searchBarInfo.setText(model.getValueAt(row, 0).toString().replace("#ORD-", ""));
    }//GEN-LAST:event_allOrderTableMouseClicked

    private void btnResetSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetSearchActionPerformed
        // TODO add your handling code here:
        showAllOrder();
        cariIDPesanan.setText("");
    }//GEN-LAST:event_btnResetSearchActionPerformed

    private void btnSearchIDPesanan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIDPesanan1ActionPerformed
        // TODO add your handling code here:
        showTableFromSearchBar("#ORD-"+cariIDPesanan.getText());
    }//GEN-LAST:event_btnSearchIDPesanan1ActionPerformed

    private String getDateFromDb (String orderID) {
        String date = "";
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_pesanan =('"+orderID+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                date = rs.getString("tanggal");
            }
            
        } catch (Exception e) {
        }
        return date;
    }
    
    private int getTimeFromDB (String orderID) {
        int result =0;
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_pesanan =('"+orderID+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getInt("jam");
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewActionPerformed
        // TODO add your handling code here:
        if (isTimeValid2() && isWeightValid2() && isOngkirSelected()) {
            //create review form objek
            reviewForm rev = new reviewForm();

            //set id pesanan
//            rev.txtIDPesanan.setText(txtIDPesanan.getText());
            rev.txtIDPesanan2.setText(txtIDPesanan.getText());

            //set id user
//            rev.txtIDUser.setText(txtIDUser.getText());
            rev.txtIDUser2.setText(txtIDUser.getText());

            //set date
//            rev.txtTgl.setText(getDateFromDb(txtIDPesanan.getText()));
            if (isDateNull() == null) {
                rev.txtTgl2.setText(getDateFromDb(txtIDPesanan.getText()));
            }else{
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                rev.txtTgl2.setText(formatter.format(dateChooser1.getDate()));
            }

            //set waktu
//            rev.txtWaktu.setText(String.valueOf(getTimeFromDB(txtIDPesanan.getText())));
            rev.txtWaktu2.setText(String.valueOf(timeChooser2.getValue()));

            //set services
//            rev.txtServices.setText(getServicesFromDB(txtIDPesanan.getText()));
            rev.txtServices2.setText(String.valueOf(sevices.getSelectedItem()));

            //set weight
//            rev.txtAktualBerat.setText(getWeightFromDB(txtIDPesanan.getText()));
            rev.txtAktualBerat2.setText(aktualBerat.getText());

            //set ongkir
            int ongkir = 0;
//            rev.txtDelivery.setText(getOngkirFromDB(txtIDPesanan.getText()));
            if (btnYaPickup1.isSelected()) {
                ongkir = 15000;
                rev.txtDelivery2.setText("15000");
            }else if(btnNoPickup1.isSelected()){
                rev.txtDelivery2.setText("0");
            }
            
            //set diskon
            int diskon = Integer.parseInt(getDiskonFromDB(txtIDPesanan.getText()));
//            rev.txtDiskon.setText(String.valueOf(diskon));
            rev.txtDiskon2.setText(String.valueOf(diskon));

            //set Total
//           rev.txtNewTotal.setText(txtTotal.getText());
            rev.txtNewTotal2.setText("Rp. "+String.valueOf(getNewTotalPrice(Integer.parseInt(aktualBerat.getText()), getHargaService(String.valueOf(sevices.getSelectedItem())), ongkir, diskon)));
            
            
            //update value in txtTotal from kasir dashboard
            txtTotal.setText("Rp. "+String.valueOf(getNewTotalPrice(Integer.parseInt(aktualBerat.getText()), getHargaService(String.valueOf(sevices.getSelectedItem())), ongkir, diskon)));
            rev.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Please fill the form");
        }
    }//GEN-LAST:event_btnReviewActionPerformed

    private String getDiskonFromDB (String orderID) {
        String result ="";
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_pesanan =('"+orderID+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getString("diskon");
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        paymentForm payform = new paymentForm();
        String idTX = "#ORD-"+searchBarPayment.getText();
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan WHERE id_pesanan =('"+idTX+"');";              
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next() && rs.getString("status").equals("true")) {

                payform.txtIDPesanan.setText(rs.getString("id_pesanan"));
                payform.txtNewTotal.setText("Rp. "+rs.getString("total_bayar"));
                
                if (rs.getString("total_bayar").equals("0")) {
                    payform.jLabel20.setVisible(false);
                    payform.jLabel21.setVisible(false);
                    payform.txtPayment.setVisible(false);
                    payform.txtKembalian.setVisible(false);
                }else{
                    payform.jLabel20.setVisible(true);
                    payform.txtPayment.setVisible(true);
                    
                    payform.jLabel21.setVisible(false);
                    payform.txtKembalian.setVisible(false);
                }
                payform.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "ID tidak valid atau sudah dibayar");
            }  
        } catch (Exception e) {
            System.err.print(e);
        }
        defaultFormUpdatePanel();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        infoCustomer info = new infoCustomer();
        info.labelOrder.setText("#ORD-"+searchBarInfo.getText());
        String [] kolom = {"Nama", "No Hp", "Alamat", "Status"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_pesanan =('#ORD-"+searchBarInfo.getText()+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                String nama = rs.getString("nama");
                String nohp = rs.getString("no_hp");
                String alamat = rs.getString("alamat");
                String status = rs.getString("status");
                
                if (status.equals("true")) {
                    status = "On going";
                }else{
                    status = "Paid";
                }

                tb1.addRow(new String[] {nama, nohp, alamat, status});
            }else{
                JOptionPane.showMessageDialog(this, "ID tidak valid");
                return;
            }
            
            
        } catch (Exception e) {
        }
        
        info.tableInfoCustomer.setModel(tb1);
        info.tableInfoCustomer.setEnabled(false);
        info.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFileChooserActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
    chooser.setCurrentDirectory(new File("cetak laporan"));
    chooser.setSelectedFile(new File("laporan-transaksi.xlsx")); // Ganti .xls dengan .xlsx
    int retrival = chooser.showSaveDialog(null);
    if (retrival == javax.swing.JFileChooser.APPROVE_OPTION) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Pesanan");
             
            // Buat header
            Row headerRow = sheet.createRow(0);
            String[] columns = {"No", "ID Pesanan", "Tanggal", "Jam", "ID User", "Nama", "No HP", "Alamat", "Services", "Berat", "Aktual Berat", "Ongkir", "Harga", "Diskon", "Total Bayar"};
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
            }

            // Ambil data dari database
            String query = "SELECT * FROM tab_pesanan";
            Statement stmt = (Statement) Connect.configDB().createStatement();
            ResultSet rs = stmt.executeQuery(query);
               
            int rowNum = 1;
            while (rs.next()) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(rs.getInt("no"));
                row.createCell(1).setCellValue(rs.getString("id_pesanan"));
                row.createCell(2).setCellValue(rs.getString("tanggal"));
                row.createCell(3).setCellValue(rs.getString("jam"));
                row.createCell(4).setCellValue(rs.getString("id_user"));
                row.createCell(5).setCellValue(rs.getString("nama"));
                row.createCell(6).setCellValue(rs.getString("no_hp"));
                row.createCell(7).setCellValue(rs.getString("alamat"));
                row.createCell(8).setCellValue(rs.getString("services"));
                row.createCell(9).setCellValue(rs.getString("berat"));
                row.createCell(10).setCellValue(rs.getString("aktual_berat"));
                row.createCell(11).setCellValue(rs.getString("ongkir"));
                row.createCell(12).setCellValue(rs.getString("harga"));
                row.createCell(13).setCellValue(rs.getString("diskon"));
                row.createCell(14).setCellValue(rs.getString("total_bayar"));
            }

            // Tulis ke file
            try (FileOutputStream outputStream = new FileOutputStream(chooser.getSelectedFile())) {
                workbook.write(outputStream);
            }

            JOptionPane.showMessageDialog(null, "Data berhasil diekspor!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }     
    }//GEN-LAST:event_JFileChooserActionPerformed
    
    private boolean isOngkirSelected () {
        if (btnYaPickup1.isSelected() || btnNoPickup1.isSelected()) {
            return true;
        }else{
            return false;
        }
    }
    
    private int getHargaService (String namaServices) {
        int result = 0;
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM services WHERE jenis_laundry =('"+namaServices+"');";              
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getInt("harga");
            }
            
        } catch (Exception e) {
            System.err.print(e);
        }
        return result;
    }
    
    private int getNewTotalPrice (int berat, int hargaService, int ongkir, int diskon) {
       return berat*hargaService + ongkir - diskon;
    }
    
    private String getOngkirFromDB (String orderID) {
        String result ="";
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_pesanan =('"+orderID+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getString("ongkir");
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private String getWeightFromDB (String orderID) {
        String result ="";
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_pesanan =('"+orderID+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getString("berat");
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private String getServicesFromDB (String orderID) {
        String services = "";
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_pesanan =('"+orderID+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                services = rs.getString("services");
            }
            
        } catch (Exception e) {
        }
        return services;
    }
    
    private void showTableFromSearchBar (String orderID) {
        String [] kolom = {"Tx ID", "Tgl Order", "Jam", "Cust ID", "Services", "Berat", "Ongkir", "Total"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where id_pesanan =('"+orderID+"');";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                if (rs.getString("status").equals("true")) {
                    String orderNumber = rs.getString("id_pesanan");
                    String tglOrder = rs.getString("tanggal");
                    String jam = rs.getString("jam");
                    String idUser = rs.getString("id_user");
                    String services = rs.getString("services");
                    String berat = rs.getString("Berat");
                    String ongkir = rs.getString("ongkir");
                    String diskon = rs.getString("diskon");
                    String total = rs.getString("total_bayar");

                    tb1.addRow(new String[] {orderNumber, tglOrder, jam, idUser, services, berat, ongkir, total});
                }else{
                    JOptionPane.showMessageDialog(this, "ID tidak valid");
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(this, "ID tidak valid");
                return;
            }
            
            
        } catch (Exception e) {
        }
        
        allOrderTable.setModel(tb1);
    }
    
    public void showAllOrder () {
        String [] kolom = {"Tx ID", "Tgl Order", "Jam", "Cust ID", "Services", "Berat", "Ongkir", "Total"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM tab_pesanan where status =('true');";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
                String orderNumber = rs.getString("id_pesanan");
                String tglOrder = rs.getString("tanggal");
                String jam = rs.getString("jam");
                String idUser = rs.getString("id_user");
                String services = rs.getString("services");
                String berat = rs.getString("Berat");
                String ongkir = rs.getString("ongkir");
                String diskon = rs.getString("diskon");
                String total = rs.getString("total_bayar");
                
                tb1.addRow(new String[] {orderNumber, tglOrder, jam, idUser, services, berat, ongkir, total});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        allOrderTable.setModel(tb1);
    }
    
    private void defaultFormUpdatePanel () {
        cariIDPesanan.setText("");
        txtIDPesanan.setText("");
        txtIDUser.setText("");
        timeChooser2.setValue(0);
        aktualBerat.setText("");
        buttonGroup3.clearSelection();
        searchBarPayment.setText("");
        searchBarInfo.setText("");
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
            java.util.logging.Logger.getLogger(kasirDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasirDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasirDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasirDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasirDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JFileChooser;
    private javax.swing.JTextField aktualBerat;
    private javax.swing.JTable allOrderTable;
    private javax.swing.JRadioButton btnNoPickup1;
    private javax.swing.JButton btnResetSearch;
    private javax.swing.JButton btnReview;
    private javax.swing.JButton btnSearchIDPesanan1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JRadioButton btnYaPickup1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField cariIDPesanan;
    private com.toedter.calendar.JDateChooser dateChooser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBerat1;
    public javax.swing.JLabel labelNama;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField searchBarInfo;
    private javax.swing.JTextField searchBarPayment;
    private javax.swing.JComboBox<String> sevices;
    private com.toedter.components.JSpinField timeChooser2;
    private javax.swing.JTextField txtIDPesanan;
    private javax.swing.JTextField txtIDUser;
    public javax.swing.JTextField txtTotal;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}
