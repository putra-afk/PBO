/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myinputform;

/**
 *
 * @author ASUS TUF GAMING
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInputForm extends JFrame {
    private JTextField textFieldA, textFieldB, textFieldResult;
    private JButton btnMultiply, btnAdd;

    public MyInputForm() {
        textFieldA = new JTextField(5);
        textFieldB = new JTextField(5);
        textFieldResult = new JTextField(10);
        btnMultiply = new JButton("Multiply");
        btnAdd = new JButton("Add");

        // Adding ActionListener for Multiply Button
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textFieldA.getText());
                int b = Integer.parseInt(textFieldB.getText());
                int result = a * b;
                textFieldResult.setText(Integer.toString(result));
            }
        });

        // Adding ActionListener for Add Button
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textFieldA.getText());
                int b = Integer.parseInt(textFieldB.getText());
                int result = a + b;
                textFieldResult.setText(Integer.toString(result));
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("A:"));
        panel.add(textFieldA);
        panel.add(new JLabel("B:"));
        panel.add(textFieldB);
        panel.add(btnMultiply);
        panel.add(btnAdd);
        panel.add(new JLabel("Result:"));
        panel.add(textFieldResult);

        add(panel);
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyInputForm();
    }
}