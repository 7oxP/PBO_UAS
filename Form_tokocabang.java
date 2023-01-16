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
 * @author Raffi.F.R
 */
public class Form_tokocabang extends javax.swing.JFrame {

    DefaultTableModel tblmodel;
    Connection conn;
    
    public Form_tokocabang() {
        initComponents();
        DBConnection openconn = new DBConnection();
        this.conn = openconn.Koneksi();
        
        this.tblmodel = (DefaultTableModel)TblMenu.getModel();

        this.load_data();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
     public void reset_table(){
        int rowCount = this.tblmodel.getRowCount();
        for (int i = rowCount - 1; i >= 0 ; i--){
            this.tblmodel.removeRow(i);
        }
    }
    
    public void resetInput(){
        String t = "";
        TxtCabang.setText(t);
        TxtAlamat.setText(t);
        TxtID.setText(t);
    }
    
    public void load_data(){
        try {
            String sql = "select * from cabang";
            Statement statement = this.conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            this.reset_table();
            
            while (result.next()){
                String id_cabang = result.getString(1);
                String nama = result.getString(2);
                String alamat = result.getString(3);
                
                String dataMenu[] = {id_cabang, nama, alamat};
                this.tblmodel.addRow(dataMenu);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtCabang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtAlamat = new javax.swing.JTextField();
        BtnKembali = new javax.swing.JButton();
        BtnUbah = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblMenu = new javax.swing.JTable();
        BtnTambah = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuCabang = new javax.swing.JMenu();
        menuMobil = new javax.swing.JMenu();
        menuPembeli = new javax.swing.JMenu();
        menuKaryawan = new javax.swing.JMenu();
        menuPenjual = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Jual Mobil");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Toko Cabang");

        jLabel2.setText("ID Cabang");

        TxtID.setEditable(false);
        TxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Cabang");

        jLabel4.setText("Alamat Cabang");

        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });

        BtnUbah.setText("Ubah");
        BtnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUbahActionPerformed(evt);
            }
        });

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        TblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama", "Alamat"
            }
        ));
        TblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblMenu);

        BtnTambah.setText("Tambah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        menuHome.setText("Home");
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHome);

        menuCabang.setText("Form Toko Cabang");
        menuCabang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCabangMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuCabang);

        menuMobil.setText("Form Mobil");
        menuMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMobilMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuMobil);

        menuPembeli.setText("Form Pembeli");
        menuPembeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPembeliMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPembeli);

        menuKaryawan.setText("Form Karyawan");
        menuKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuKaryawanMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuKaryawan);

        menuPenjual.setText("Form Penjualan");
        menuPenjual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPenjualMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPenjual);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnKembali)
                                .addGap(41, 41, 41)
                                .addComponent(BtnUbah)
                                .addGap(57, 57, 57)
                                .addComponent(BtnHapus))
                            .addComponent(BtnTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtID)
                                    .addComponent(TxtCabang)
                                    .addComponent(TxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtCabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnKembali)
                            .addComponent(BtnUbah)
                            .addComponent(BtnHapus)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
         dispose();
        MenuUtama menu = new MenuUtama();
        menu.setVisible(true);
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
        try{
            String nama = TxtCabang.getText();
            String alamat = TxtAlamat.getText();
            
            String sql = "INSERT INTO cabang(nama, alamat) VALUES (?,?)";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nama);
            statement.setString(2, alamat);
            
            int rows = statement.executeUpdate();
            if (rows > 0) {
                this.load_data();
                JOptionPane.showMessageDialog(this, "Data Cabang " + TxtCabang.getText() + " Tersimpan");
                resetInput();
            }
            
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUbahActionPerformed
        // TODO add your handling code here:
        try {
            String nama = TxtCabang.getText();
            String alamat = TxtAlamat.getText();
            

            String id_terpilih = TxtID.getText();
            
            String sql = "UPDATE cabang SET nama = ?, alamat = ? WHERE id_cabang = ?";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nama);
            statement.setString(2, alamat);
            
            statement.setString(3, id_terpilih);
            
            int konfirmasi_update = JOptionPane.showConfirmDialog(null, "Apakah Ingin Update Cabang " + TxtID.getText());
            
            if (konfirmasi_update == 0){
                int rows = statement.executeUpdate();
                if (rows > 0){
                    this.load_data();
                    JOptionPane.showMessageDialog(this, "Data Cabang " + TxtID.getText() + " Terupdate");
                    resetInput();
                }
            }            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnUbahActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        try {
            String id_terpilih = TxtID.getText();
            
            String sql = "DELETE FROM cabang WHERE id_cabang = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id_terpilih);
            
            int konfirmasi_delete = JOptionPane.showConfirmDialog(this, "Data Cabang " + TxtID.getText() + " Terhapus");
            
            if (konfirmasi_delete == 0){
                int rows = statement.executeUpdate();
                this.load_data();
                JOptionPane.showMessageDialog(this, "Data Cabang " + TxtID.getText() + " Terhapus");
                resetInput();
            }
                    
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuCabangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCabangMouseClicked
        dispose();
        new Form_tokocabang().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCabangMouseClicked

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

    private void menuPenjualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPenjualMouseClicked
        // TODO add your handling code here:
        dispose();
        new Form_Penjualan().setVisible(true);
    }//GEN-LAST:event_menuPenjualMouseClicked

    private void TxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDActionPerformed

    private void TblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblMenuMouseClicked
        // TODO add your handling code here:
        TxtID.setText(TblMenu.getValueAt(TblMenu.getSelectedRow(), 0).toString());
        TxtCabang.setText(TblMenu.getValueAt(TblMenu.getSelectedRow(), 1).toString());
        TxtAlamat.setText(TblMenu.getValueAt(TblMenu.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_TblMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnUbah;
    private javax.swing.JTable TblMenu;
    private javax.swing.JTextField TxtAlamat;
    private javax.swing.JTextField TxtCabang;
    private javax.swing.JTextField TxtID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuCabang;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuKaryawan;
    private javax.swing.JMenu menuMobil;
    private javax.swing.JMenu menuPembeli;
    private javax.swing.JMenu menuPenjual;
    // End of variables declaration//GEN-END:variables
}