/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author zoc
 */
public class DBConnection {

    public static Connection Koneksi() {
        String db = "jdbc:mysql://localhost:3306/uas_pbo";
        String user = "root";
        String password = "";
        try {
            Connection koneksi = DriverManager.getConnection(db, user, password);
            System.out.println("Koneksi ke database berhasil!");

            return koneksi;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
