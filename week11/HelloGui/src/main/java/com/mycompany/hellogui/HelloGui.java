/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hellogui;

/**
 *
 * @author ASUS TUF GAMING
 */
import javax.swing.JFrame;

public class HelloGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI");
        frame.setSize(400, 200);
        frame.setLocation(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
