/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Data;

import Tools.DBConnection;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Kingslaive
 */
public class Form_Penjualan extends javax.swing.JFrame {

    /**
     * Creates new form Form_Transaksi
     */
    DefaultTableModel tblmodel;
    Connection conn;

    public Form_Penjualan() {
        initComponents();
        DBConnection openconn = new DBConnection();
        this.conn = openconn.Koneksi();

        this.tblmodel = (DefaultTableModel) TableJual.getModel();

        this.load_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableJual = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboxPembeli = new javax.swing.JComboBox<>();
        cboxCabang1 = new javax.swing.JComboBox<>();
        cboxMobil = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtTanggalWaktu = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JToggleButton();
        cboxKaryawan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuTokoCabang = new javax.swing.JMenu();
        menuMobil = new javax.swing.JMenu();
        menuPembeli = new javax.swing.JMenu();
        menuKaryawan = new javax.swing.JMenu();
        menuSewa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Jual Mobil");

        TableJual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Jual", "ID Cabang", "ID Mobil", "ID Pembeli", "ID Karyawan", "Tanggal Beli"
            }
        ));
        jScrollPane1.setViewportView(TableJual);

        jLabel2.setText("ID Cabang");

        jLabel3.setText("ID Mobil");

        cboxCabang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCabang1ActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Pembeli");

        jLabel5.setText("ID Karyawan");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Terpilih");

        TxtID.setEditable(false);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Penjualan");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel8.setText("Tanggal Beli");

        menuHome.setText("Home");
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHomeMouseClicked(evt);
            }
        });
        menuBar.add(menuHome);

        menuTokoCabang.setText("Form Toko Cabang");
        menuTokoCabang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTokoCabangMouseClicked(evt);
            }
        });
        menuBar.add(menuTokoCabang);

        menuMobil.setText("Form Mobil");
        menuMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMobilMouseClicked(evt);
            }
        });
        menuBar.add(menuMobil);

        menuPembeli.setText("Form Pembeli");
        menuPembeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPembeliMouseClicked(evt);
            }
        });
        menuBar.add(menuPembeli);

        menuKaryawan.setText("Form Karyawan");
        menuKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuKaryawanMouseClicked(evt);
            }
        });
        menuBar.add(menuKaryawan);

        menuSewa.setText("Form Penjualan");
        menuSewa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSewaMouseClicked(evt);
            }
        });
        menuBar.add(menuSewa);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(cboxMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(cboxPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(61, 61, 61)
                                        .addComponent(cboxCabang1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboxKaryawan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TxtTanggalWaktu)))
                                    .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 125, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtID)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxCabang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboxMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboxPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboxKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(TxtTanggalWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTambah)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        try {
            String id_cabang = cboxCabang1.getSelectedItem().toString();
            String id_mobil = cboxMobil.getSelectedItem().toString();
            String id_pembeli = cboxPembeli.getSelectedItem().toString().split(" | ")[0];
            String id_karyawan = cboxKaryawan.getSelectedItem().toString();
            String tanggal = TxtTanggalWaktu.getText();

            String sql = "INSERT INTO jual(id_cabang,id_mobil, id_pembeli, id_karyawan, tanggal) VALUES (?,?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id_cabang);
            statement.setString(2, id_mobil);
            statement.setString(3, id_pembeli);
            statement.setString(4, id_karyawan);
            statement.setString(5, tanggal);

            int rows = statement.executeUpdate();
            if (rows > 0) {
                this.load_data();
                JOptionPane.showMessageDialog(this, "Pembelian Telah Dimasukan");
                resetInput();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            String id_cabang = cboxCabang1.getSelectedItem().toString();
            String id_mobil = cboxMobil.getSelectedItem().toString();
            String id_pembeli = cboxPembeli.getSelectedItem().toString();
            String id_karyawan = cboxKaryawan.getSelectedItem().toString();
            String tanggal = TxtTanggalWaktu.getText();

            String id_terpilih = TxtID.getText();

            String sql = "UPDATE jual SET id_cabang = ?, id_mobil = ?, id_pembeli = ?, id_karyawan = ?, tanggal = ? WHERE id_jual = ?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id_cabang);
            statement.setString(2, id_mobil);
            statement.setString(3, id_pembeli);
            statement.setString(4, id_karyawan);
            statement.setString(5, tanggal);

            statement.setString(6, id_terpilih);

            int konfirmasi_update = JOptionPane.showConfirmDialog(null, "Apakah Ingin Mengubah Pembelian " + TxtID.getText());

            if (konfirmasi_update == 0) {
                int rows = statement.executeUpdate();
                if (rows > 0) {
                    this.load_data();
                    JOptionPane.showMessageDialog(this, "Pembelian  " + TxtID.getText() + " Dipebaharui");
                    resetInput();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String id_terpilih = TxtID.getText();

            String sql = "DELETE FROM jual WHERE id_jual = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id_terpilih);

            int konfirmasi_delete = JOptionPane.showConfirmDialog(this, "Transaksi " + TxtID.getText() + " Terhapus");

            if (konfirmasi_delete == 0) {
                int rows = statement.executeUpdate();
                this.load_data();
                JOptionPane.showMessageDialog(this, "Transaksi " + TxtID.getText() + " Terhapus");
                resetInput();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cboxCabang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCabang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCabang1ActionPerformed

    private void menuTokoCabangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTokoCabangMouseClicked
        // TODO add your handling code here:
        dispose();
        new Form_tokocabang().setVisible(true);
    }//GEN-LAST:event_menuTokoCabangMouseClicked

    private void menuMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMobilMouseClicked
        // TODO add your handling code here:
        dispose();
        new Form_mobil().setVisible(true);
    }//GEN-LAST:event_menuMobilMouseClicked

    private void menuPembeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPembeliMouseClicked
        // TODO add your handling code here:
        dispose();
        new Form_Pembeli().setVisible(true);
    }//GEN-LAST:event_menuPembeliMouseClicked

    private void menuKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuKaryawanMouseClicked
        // TODO add your handling code here:
        dispose();
        new Form_Karyawan().setVisible(true);
    }//GEN-LAST:event_menuKaryawanMouseClicked

    private void menuSewaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSewaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSewaMouseClicked

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_menuHomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public void reset_table() {
        int rowCount = this.tblmodel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            this.tblmodel.removeRow(i);
        }
    }

    public void resetInput() {
        String a = "";
        cboxCabang1.setSelectedItem(null);
        cboxMobil.setSelectedItem(null);
        cboxPembeli.setSelectedItem(null);
        cboxKaryawan.setSelectedItem(null);
        TxtTanggalWaktu.setText(a);
        TxtID.setText(a);
    }

    public void load_data() {
        try {
            String sql = "select * from jual";
            Statement statement = this.conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            this.reset_table();

            while (result.next()) {
                String id_jual = result.getString(1);
                String id_cabang = result.getString(2);
                String id_mobil = result.getString(3);
                String id_pembeli = result.getString(4);
                String id_karyawan = result.getString(5);
                String tanggal_waktu = result.getString(6);

                String dataMenu[] = {id_jual, id_cabang, id_mobil, id_pembeli, id_karyawan, tanggal_waktu};
                this.tblmodel.addRow(dataMenu);
            }
            load_comboBox();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void load_comboBox() {

        try {

            String sql = "select id_pembeli, nama from pembeli";
            Statement statement = this.conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            cboxPembeli.removeAllItems();
            cboxPembeli.addItem(null);
            while (result.next()) {
                String id = result.getString(1) + " | " + result.getString(2);
                cboxPembeli.addItem(id);
            }

            sql = "select id_cabang from cabang";
            result = statement.executeQuery(sql);
            cboxCabang1.removeAllItems();
            cboxCabang1.addItem(null);
            while (result.next()) {
                String id = result.getString(1);
                cboxCabang1.addItem(id);
            }

            sql = "select id_mobil from mobil";
            result = statement.executeQuery(sql);
            cboxMobil.removeAllItems();
            cboxMobil.addItem(null);
            while (result.next()) {
                String id = result.getString(1);
                cboxMobil.addItem(id);
            }
            sql = "select id_karyawan from karyawan";
            result = statement.executeQuery(sql);
            cboxKaryawan.removeAllItems();
            cboxKaryawan.addItem(null);
            while (result.next()) {
                String id = result.getString(1);
                cboxKaryawan.addItem(id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Form_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Form_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Form_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Form_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Form_Transaksi().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableJual;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtTanggalWaktu;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cboxCabang1;
    private javax.swing.JComboBox<String> cboxKaryawan;
    private javax.swing.JComboBox<String> cboxMobil;
    private javax.swing.JComboBox<String> cboxPembeli;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuKaryawan;
    private javax.swing.JMenu menuMobil;
    private javax.swing.JMenu menuPembeli;
    private javax.swing.JMenu menuSewa;
    private javax.swing.JMenu menuTokoCabang;
    // End of variables declaration//GEN-END:variables
}
