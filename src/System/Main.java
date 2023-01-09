/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package System;
import Data.MenuUtama;

/**
 *
 * @author zoc
 */
public class Main implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main app = new Main();
        Thread thread = new Thread(app);
        thread.start();
    }

    @Override
    public void run() {
        MenuUtama frame = new MenuUtama();
        frame.setVisible(true);
    }
    
}
