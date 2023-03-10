/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Data;

import Tools.DBConnection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Toshiba
 */
public class Form_mobil extends javax.swing.JFrame {
  
    DefaultTableModel tblmodel;
    Connection conn;
    
    public Form_mobil(){
        initComponents();
        DBConnection openconn = new DBConnection();
        this.conn = openconn.Koneksi();

        this.tblmodel = (DefaultTableModel)tabelMobil.getModel();

        this.load_data();
    }
    
    public void reset_table(){
        int rowCount = this.tblmodel.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--){
            this.tblmodel.removeRow(i);
        }
    }
           
    public void load_data(){
        try{
            String sql = "select *from mobil";
            Statement statement = this.conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            this.reset_table();
            
            while(result.next()){
                String id_mobil = result.getString(1);
                String nopol = result.getString(2);
                String tipe = result.getString(3);
                String harga = result.getString(4);
                String dataMenu[] = {id_mobil, nopol,tipe, harga};
                
                this.tblmodel.addRow(dataMenu);
            }
        }
        catch(SQLException e){
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
        TxtNopol = new javax.swing.JTextField();
        TxtTipe = new javax.swing.JTextField();
        TxtHarga = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMobil = new javax.swing.JTable();
        back = new javax.swing.JButton();
        TxtId_terpilih = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuTokoCabang = new javax.swing.JMenu();
        menuMobil = new javax.swing.JMenu();
        menuPembeli = new javax.swing.JMenu();
        menuKaryawan = new javax.swing.JMenu();
        menuPenjualan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Jual Mobil");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Form Mobil");

        jLabel2.setText("ID Terpilih");

        jLabel3.setText("No Polisi");

        jLabel4.setText("Tipe Mobil");

        jLabel5.setText("Harga Mobil");

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tabelMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "No Polisi", "Tipe Mobil", "Harga Mobil"
            }
        ));
        tabelMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMobil);

        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        TxtId_terpilih.setEditable(false);

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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubah)
                        .addGap(8, 8, 8)
                        .addComponent(hapus)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tambah)
                                    .addComponent(TxtNopol, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(TxtTipe)
                                    .addComponent(TxtHarga)
                                    .addComponent(TxtId_terpilih))))
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtNopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tambah)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtId_terpilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ubah)
                            .addComponent(hapus)
                            .addComponent(back)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
             // TODO add your handling code here:
        try{// TODO add your handling code here:
            String id_terpilih = TxtId_terpilih.getText();
            String sql = "Delete from mobil where id_mobil = ?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id_terpilih);

            int konfirmasi_hapus = JOptionPane.showConfirmDialog(null, "Apakah Ingin Hapus Data Mobil Dengan Nopol " + TxtNopol.getText());

            if(konfirmasi_hapus == 0){
                int rows = statement.executeUpdate();
                if(rows > 0){
                    this.load_data();
                    JOptionPane.showMessageDialog(this, "Mobil Dengan Nopol " + TxtNopol.getText() + " Terhapus");
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        try{
            String nopol = TxtNopol.getText();
            String tipe = TxtTipe.getText();
            String harga = TxtHarga.getText();
            
            String sql = "INSERT INTO mobil( nopol, tipe, harga) VALUES (?,?,?)";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nopol);
            statement.setString(2, tipe);
            statement.setString(3, harga);
            
            int rows = statement.executeUpdate();
            if (rows > 0) {
                this.load_data();
                JOptionPane.showMessageDialog(this, "Mobil Dengan Nopol " + TxtNopol.getText() + " Tersimpan");
            }
            
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_tambahActionPerformed

    private void tabelMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMobilMouseClicked
        // TODO add your handling code here:
        int cel = tabelMobil.getSelectedColumn();
        int row = tabelMobil.getSelectedRow();
        
        String selectedID = (String)tabelMobil.getValueAt(row, 0);
        TxtId_terpilih.setText(selectedID);
        
        try{
           String sql = "select *from mobil where id_mobil = " + selectedID;
           java.sql.Statement statement = conn.createStatement();
           ResultSet result = statement.executeQuery(sql);
           while(result.next()){
               String id_mobil = result.getString(1);
               String nopol = result.getString(2);
               
               TxtNopol.setText(result.getString(2));
               TxtTipe.setText(result.getString(3));
               TxtHarga.setText(result.getString(4));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_tabelMobilMouseClicked

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        try{
            String nopol = TxtNopol.getText();
            String tipe = TxtTipe.getText();
            String harga = TxtHarga.getText();
            String id_terpilih = TxtId_terpilih.getText();
            
            String sql = "update mobil set nopol = ?, tipe = ?, harga = ? where id_mobil = ?";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nopol);
            statement.setString(2, tipe);
            statement.setString(3, harga);            
            statement.setString(4, id_terpilih);
            
            int konfirmasi_update = JOptionPane.showConfirmDialog(null, "Apakah Ingin Ubah Data Mobil Dengan Nopol " + TxtNopol.getText());
            if(konfirmasi_update == 0){
                int rows = statement.executeUpdate();
                if(rows > 0){
                    this.load_data();
                    JOptionPane.showMessageDialog(this, "Data Mobil Dengan Nopol " + TxtNopol.getText() + " Terupdate");
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dispose();
        /*MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);*/        
    }//GEN-LAST:event_backActionPerformed

    private void menuTokoCabangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTokoCabangMouseClicked
        // TODO add your handling code here:
        dispose();
        new Form_tokocabang().setVisible(true);
    }//GEN-LAST:event_menuTokoCabangMouseClicked

    private void menuMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMobilMouseClicked
        // TODO add your handling code here:
        
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

    private void menuPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPenjualanMouseClicked
        // TODO add your handling code here:
        dispose();
        new Form_Penjualan().setVisible(true);
    }//GEN-LAST:event_menuPenjualanMouseClicked

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_menuHomeMouseClicked

    /**
     * @param args the command line arguments***/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtId_terpilih;
    private javax.swing.JTextField TxtNopol;
    private javax.swing.JTextField TxtTipe;
    private javax.swing.JButton back;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuKaryawan;
    private javax.swing.JMenu menuMobil;
    private javax.swing.JMenu menuPembeli;
    private javax.swing.JMenu menuPenjualan;
    private javax.swing.JMenu menuTokoCabang;
    private javax.swing.JTable tabelMobil;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
