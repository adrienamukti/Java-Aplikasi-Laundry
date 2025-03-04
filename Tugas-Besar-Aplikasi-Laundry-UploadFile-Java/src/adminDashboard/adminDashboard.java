
package adminDashboard;

import Main.loginPage;
import userDashboard.memberDashboard;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import koneksiDatabase.Connect;


public class adminDashboard extends javax.swing.JFrame {

    String username, password, idUser, nama, telepon, alamat;
    public adminDashboard() {
        initComponents();
        defaultForm(false);
        defaultForm2(false);
        
        showTablesLogin();
        showTableInformationUser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnUserManagement = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        userManagementPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLogin = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoUserTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnMainSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnMainSearch2 = new javax.swing.JButton();
        btnEdit2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIDUser = new javax.swing.JTextField();
        btnSearch2 = new javax.swing.JButton();
        btnRefresh2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));

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

        btnUserManagement.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnUserManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/profile.png"))); // NOI18N
        btnUserManagement.setText("Manajemen User");
        btnUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUserManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(60, 60, 60))
        );

        mainPanel.setBackground(new java.awt.Color(2, 48, 71));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        mainPanel.setLayout(new java.awt.CardLayout());

        userManagementPanel.setBackground(new java.awt.Color(2, 48, 71));

        tableLogin.setModel(new javax.swing.table.DefaultTableModel(
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
        tableLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLoginMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLogin);

        infoUserTable.setModel(new javax.swing.table.DefaultTableModel(
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
        infoUserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoUserTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(infoUserTable);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Table User ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Information Table");

        btnSearch.setBackground(new java.awt.Color(0, 150, 199));
        btnSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 150, 199));
        btnEdit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEdit.setText("Edit User Login");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 150, 199));
        btnDelete.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDelete.setText("Delete User Login");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 150, 199));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add User Login");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 150, 199)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Please Enter Your Username");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        txtUsername.setBackground(new java.awt.Color(206, 212, 218));

        btnMainSearch.setBackground(new java.awt.Color(0, 150, 199));
        btnMainSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnMainSearch.setText("Search User Login");
        btnMainSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainSearchActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(193, 18, 31));
        btnRefresh.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnMainSearch2.setBackground(new java.awt.Color(0, 150, 199));
        btnMainSearch2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnMainSearch2.setText("Search ID User");
        btnMainSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainSearch2ActionPerformed(evt);
            }
        });

        btnEdit2.setBackground(new java.awt.Color(0, 150, 199));
        btnEdit2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEdit2.setText("Edit Info User");
        btnEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Please Enter Your Username");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        txtIDUser.setBackground(new java.awt.Color(206, 212, 218));

        btnSearch2.setBackground(new java.awt.Color(0, 150, 199));
        btnSearch2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSearch2.setText("Search");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        btnRefresh2.setBackground(new java.awt.Color(193, 18, 31));
        btnRefresh2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRefresh2.setText("Refresh");
        btnRefresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userManagementPanelLayout = new javax.swing.GroupLayout(userManagementPanel);
        userManagementPanel.setLayout(userManagementPanelLayout);
        userManagementPanelLayout.setHorizontalGroup(
            userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userManagementPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userManagementPanelLayout.createSequentialGroup()
                        .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(userManagementPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(userManagementPanelLayout.createSequentialGroup()
                                .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(userManagementPanelLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefresh))
                            .addGroup(userManagementPanelLayout.createSequentialGroup()
                                .addComponent(btnMainSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(userManagementPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118))
                    .addGroup(userManagementPanelLayout.createSequentialGroup()
                        .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userManagementPanelLayout.createSequentialGroup()
                                    .addComponent(btnEdit2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(btnMainSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRefresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        userManagementPanelLayout.setVerticalGroup(
            userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagementPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userManagementPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnMainSearch)
                    .addComponent(btnEdit2)
                    .addComponent(btnMainSearch2)
                    .addComponent(btnRefresh2))
                .addGap(18, 18, 18)
                .addGroup(userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel5)
                    .addGroup(userManagementPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch2))
                    .addGroup(userManagementPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        mainPanel.add(userManagementPanel, "card2");

        jPanel2.setBackground(new java.awt.Color(255, 195, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh2ActionPerformed
        // TODO add your handling code here:
        this.nama = null;
        this.idUser = null;
        this.alamat = null;
        this.telepon = null;
        txtIDUser.setText("");
        showTableInformationUser();
    }//GEN-LAST:event_btnRefresh2ActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        // TODO add your handling code here:
        if (!getIDUser().equals("")) {
            int n = 0;
            String [] kolom = {"NO", "ID User", "Nama", "Telepon", "Alamat"};
            DefaultTableModel tb1 = new DefaultTableModel(null, kolom);

            try {
                Statement stmt = (Statement) Connect.configDB().createStatement();
                String query = "SELECT * FROM customer WHERE id_user = ('"+getIDUser()+"');";
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    n++;
                    String IDUser = rs.getString("id_user");
                    String nama = rs.getString("nama");
                    String telpon = rs.getString("telpon");
                    String addr = rs.getString("alamat");

                    tb1.addRow(new String[] {String.valueOf(n), IDUser, nama, telpon, addr});
                    infoUserTable.setModel(tb1);
                }else{
                    JOptionPane.showMessageDialog(this, "ID not found");
                }

            } catch (Exception e) {
                System.err.println(e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please fill out the form");
            return;
        }
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit2ActionPerformed
        // TODO add your handling code here:
        defaultForm2(false);
        try {
            if (!this.idUser.equals(null) && !this.nama.equals(null) && !this.telepon.equals(null) && !this.alamat.equals(null)) {
                insertIntoEditInfoUser(this.idUser, this.nama, this.telepon, this.alamat);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please choose an account");
        }
    }//GEN-LAST:event_btnEdit2ActionPerformed

    private void btnMainSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainSearch2ActionPerformed
        // TODO add your handling code here:
        defaultForm2(true);
    }//GEN-LAST:event_btnMainSearch2ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        this.username = null;
        this.password = null;
        txtUsername.setText("");
        showTablesLogin();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnMainSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainSearchActionPerformed
        // TODO add your handling code here:
        defaultForm(true);
    }//GEN-LAST:event_btnMainSearchActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            // TODO add your handling code here:
            addForm sg = new addForm();
            sg.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(adminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        defaultForm(false);

        try {
            if (!this.username.equals(null) && !this.password.equals(null)) {
                int response =JOptionPane.showConfirmDialog(this, "Do you really want to delete ?", "Confirm", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    try {
                        Statement stmt = (Statement) Connect.configDB().createStatement();
                        //delete record from login table
                        stmt.executeUpdate("DELETE FROM login WHERE username = '" + this.username+"';");

                        ////                                  //delete record from customer
                        //                            stmt.executeUpdate("DELETE FROM customer WHERE username = '" + this.username+"';");

                        JOptionPane.showMessageDialog(this, "The information was successfully updated");
                        showTablesLogin();
                    } catch (Exception e) {
                    }
                }else{
                    return;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please choose an account");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        defaultForm(false);
        try {
            if (!this.username.equals(null) && !this.password.equals(null)) {
                insertIntoEditForm(this.username, this.password);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please choose an account");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!getUsername().equals("")) {
            int n = 0;
            String [] kolom = {"NO", "Username", "Password"};
            DefaultTableModel tb1 = new DefaultTableModel(null, kolom);

            try {
                Statement stmt = (Statement) Connect.configDB().createStatement();
                String query = "SELECT * FROM login WHERE username = ('"+getUsername()+"');";
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    n++;
                    String username = rs.getString("username");
                    String password = rs.getString("password");

                    tb1.addRow(new String[] {String.valueOf(n), username, password});
                    tableLogin.setModel(tb1);
                }else{
                    JOptionPane.showMessageDialog(this, "Username not found");
                }

            } catch (Exception e) {
                System.err.println(e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please fill out the form");
            return;
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void infoUserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoUserTableMouseClicked
        // TODO add your handling code here:
        int row = infoUserTable.getSelectedRow();
        TableModel model = infoUserTable.getModel();

        this.idUser = model.getValueAt(row, 1).toString();
        this.nama = model.getValueAt(row, 2).toString();
        this.telepon = model.getValueAt(row, 3).toString();
        this.alamat = model.getValueAt(row, 4).toString();
    }//GEN-LAST:event_infoUserTableMouseClicked

    private void tableLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLoginMouseClicked
        // TODO add your handling code here:
        int row = tableLogin.getSelectedRow();
        TableModel model = tableLogin.getModel();

        this.username = model.getValueAt(row, 1).toString();
        this.password = model.getValueAt(row, 2).toString();
    }//GEN-LAST:event_tableLoginMouseClicked

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(userManagementPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnUserManagementActionPerformed

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

    private void showTablesLogin () {
        int n = 0;
        String [] kolom = {"NO", "Username", "Password", "Photo"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM login;";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
                n++;
                String username = rs.getString("username");
                String password = rs.getString("password");
                String photo = rs.getString("photo");
                
                tb1.addRow(new String[] {String.valueOf(n), username, password, photo});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        tableLogin.setModel(tb1);
    }
    
    private String getIDUserFromDB (String username) {
        String result = "";
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM customer WHERE username = '"+username+"';";
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                result = rs.getString("id_user");
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private void showTableInformationUser () {
        int n = 0;
        String [] kolom = {"NO", "ID User", "Nama", "Telepon", "Alamat"};
        DefaultTableModel tb1 = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) Connect.configDB().createStatement();
            String query = "SELECT * FROM customer;";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
                n++;
                String idUser = rs.getString("id_user");
                String Nama = rs.getString("nama");
                String noTelp = rs.getString("telpon");
                String alamat = rs.getString("alamat");
                
                tb1.addRow(new String[] {String.valueOf(n), idUser, Nama, noTelp, alamat});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        infoUserTable.setModel(tb1);
    }
    
    private String getIDUser () {
        return txtIDUser.getText();
    }
    
    private String getUsername () {
        return txtUsername.getText();
    }
    
    private void defaultForm (boolean condition){
        jLabel6.setVisible(condition);
        txtUsername.setVisible(condition);
        btnSearch.setVisible(condition);
    }   
    
    private void defaultForm2 (boolean condition) {
        jLabel7.setVisible(condition);
        txtIDUser.setVisible(condition);
        btnSearch2.setVisible(condition);
    }
    
    
    private void insertIntoEditInfoUser (String idUser, String nama, String noTelp, String addrs){
        editInfoUserForm edtInfoUser = new editInfoUserForm();
        edtInfoUser.txtID.setText(this.idUser);
        edtInfoUser.txtName.setText(this.nama);
        edtInfoUser.txtPhone.setText(this.telepon);
        edtInfoUser.txtAddrs.setText(this.alamat);
        edtInfoUser.setVisible(true);
    }
    
    private void insertIntoEditForm (String username, String password) {
        editLoginForm edit = new editLoginForm();
        edit.tempUsername = username;
        edit.txtUsername.setText(username);
        edit.txtPassword.setText(password);
        edit.setVisible(true);
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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEdit2;
    private javax.swing.JButton btnMainSearch;
    private javax.swing.JButton btnMainSearch2;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh2;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JTable infoUserTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tableLogin;
    private javax.swing.JTextField txtIDUser;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel userManagementPanel;
    // End of variables declaration//GEN-END:variables
}
