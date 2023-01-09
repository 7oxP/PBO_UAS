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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Fuada
 */
public class Form_Pembeli extends javax.swing.JFrame {

    /**
     * Creates new form Form_Pembeli
     */
    Connection koneksi = Tools.DBConnection.Koneksi();
    public Statement st;
    public ResultSet rs;
    
    public Form_Pembeli() {
        initComponents();
        TampilData();      
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
        TblPembeli = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InNik = new javax.swing.JTextField();
        InNama = new javax.swing.JTextField();
        InNomor = new javax.swing.JTextField();
        TxtIDpembeli = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuTokoCabang = new javax.swing.JMenu();
        menuMobil = new javax.swing.JMenu();
        menuPembeli = new javax.swing.JMenu();
        menuKaryawan = new javax.swing.JMenu();
        menuPenjualan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TblPembeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pembeli", "NIK", "Nama", "No HP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblPembeli.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TblPembeli);
        if (TblPembeli.getColumnModel().getColumnCount() > 0) {
            TblPembeli.getColumnModel().getColumn(0).setResizable(false);
            TblPembeli.getColumnModel().getColumn(1).setResizable(false);
            TblPembeli.getColumnModel().getColumn(2).setResizable(false);
            TblPembeli.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("NIK");

        jLabel2.setText("Nama");

        jLabel3.setText("No HP");

        jLabel4.setText("ID Terpilih");

        TxtIDpembeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtIDpembeliMouseClicked(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("DATA PEMBELI");

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

        menuPenjualan.setText("Form Penjualan");
        menuPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPenjualanMouseClicked(evt);
            }
        });
        menuBar.add(menuPenjualan);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKembali)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InNik, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(InNama)
                            .addComponent(InNomor)
                            .addComponent(TxtIDpembeli)
                            .addComponent(btnTambah)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHapus)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTambah))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtIDpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnHapus))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKembali)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TampilData() {
        try {
            st = koneksi.createStatement();
            String queryshow = "SELECT * FROM pembeli";
            rs = st.executeQuery(queryshow);

            DefaultTableModel tabel = new DefaultTableModel();

            tabel.addColumn("ID Pembeli");
            tabel.addColumn("NIK");
            tabel.addColumn("Nama");
            tabel.addColumn("No HP");

            tabel.getDataVector().removeAllElements();
            tabel.fireTableDataChanged();
            tabel.setRowCount(0);

            while (rs.next()) {
                Object[] data = {
                    rs.getString("id_pembeli"),
                    rs.getString("nik"),
                    rs.getString("nama"),
                    rs.getString("no_hp"),};
                tabel.addRow(data);
                TblPembeli.setModel(tabel);

            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    private void Bersih() {
        InNik.setText("");
        InNama.setText("");
        InNomor.setText("");
        TxtIDpembeli.setText("");
    }
    
    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        dispose();
//        MenuAdmin menu = new MenuAdmin();
//        menu.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        try {
            st = koneksi.createStatement();
            if (InNik.getText().equals("") || InNama.getText().equals("") || InNomor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                String queryInsert = "INSERT INTO pembeli(nik,nama,no_hp) VALUES ('" + InNik.getText() + "','" + InNama.getText() + "','" + InNomor.getText() + "')";
                try {
                    st.executeUpdate(queryInsert);
                    JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan!");
                    Bersih();
                    TampilData();
                } catch (SQLException ex) {
                    Logger.getLogger(Form_Karyawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form_Karyawan.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            st = koneksi.createStatement();
            String queryUpdate = "UPDATE pembeli SET nik = '"+InNik.getText()+"', nama = '"+InNama.getText()+"', no_hp ='"+InNomor.getText()+"' WHERE id_pembeli='"+TxtIDpembeli.getText()+"'";
            st.executeUpdate(queryUpdate);
            JOptionPane.showMessageDialog(null,"Data berhasil diupdate!");
            Bersih();
            TampilData();
        } catch (SQLException ex) {
            Logger.getLogger(Form_Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if (TxtIDpembeli.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih ID dari data yang ingin dihapus!");
        } else {
            int konfirmasi = JOptionPane.showConfirmDialog(null, "Data akan dihapus, lanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == 0) {
                try {
                    st = koneksi.createStatement();
                    String queryHapus = "DELETE FROM pembeli WHERE id_pembeli= '" + TxtIDpembeli.getText() + "'";
                    st.executeUpdate(queryHapus);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                    TampilData();
                    Bersih();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void TxtIDpembeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtIDpembeliMouseClicked
        // TODO add your handling code here:
        TxtIDpembeli.setText(TblPembeli.getValueAt(TblPembeli.getSelectedRow(), 0).toString());
        InNik.setText(TblPembeli.getValueAt(TblPembeli.getSelectedRow(), 1).toString());
        InNama.setText(TblPembeli.getValueAt(TblPembeli.getSelectedRow(), 2).toString());
        InNomor.setText(TblPembeli.getValueAt(TblPembeli.getSelectedRow(), 3).toString());
        
    }//GEN-LAST:event_TxtIDpembeliMouseClicked

    private void menuTokoCabangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTokoCabangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTokoCabangMouseClicked

    private void menuMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMobilMouseClicked
        // TODO add your handling code here:
        new Form_mobil().setVisible(true);
    }//GEN-LAST:event_menuMobilMouseClicked

    private void menuPembeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPembeliMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPembeliMouseClicked

    private void menuKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuKaryawanMouseClicked
        // TODO add your handling code here:
        new Form_Karyawan().setVisible(true);
    }//GEN-LAST:event_menuKaryawanMouseClicked

    private void menuPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPenjualanMouseClicked
        // TODO add your handling code here:
        new Form_Penjualan().setVisible(true);
    }//GEN-LAST:event_menuPenjualanMouseClicked

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(Form_Pembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Form_Pembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Form_Pembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Form_Pembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Form_Pembeli().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InNama;
    private javax.swing.JTextField InNik;
    private javax.swing.JTextField InNomor;
    private javax.swing.JTable TblPembeli;
    private javax.swing.JTextField TxtIDpembeli;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuKaryawan;
    private javax.swing.JMenu menuMobil;
    private javax.swing.JMenu menuPembeli;
    private javax.swing.JMenu menuPenjualan;
    private javax.swing.JMenu menuTokoCabang;
    // End of variables declaration//GEN-END:variables
}
