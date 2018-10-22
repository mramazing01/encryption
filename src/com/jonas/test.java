package com.jonas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class test {
    private JPanel panel1;
    private JButton caesarButton;
    private JButton vernamButton;
    private JButton vignereButton;
    private JButton pictureButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public test() {
        caesarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String a=textField1.getText();
                String b=textField2.getText();
                encryption enc = new encryption();
                enc.setPlainText(a);
                enc.setKey(b);
                enc.encrypt();
                textField3.setText(enc.cyphertext);
            }
        });
        vernamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String a=textField1.getText();
                String b=textField2.getText();
                vernam ver = new vernam();
                ver.setPlainText(a);
                ver.setKey(b);
                ver.encrypt();
                textField3.setText(ver.cyphertext);
            }
        });
        vignereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String a=textField1.getText();
                String b=textField2.getText();
                vignere vig = new vignere();
                vig.setPlainText(a);
                vig.setKey(b);
                vig.encrypt();
                textField3.setText(vig.cyphertext);
            }
        });
        pictureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String a=textField1.getText();
                String b=textField2.getText();
                pic pi=new pic();
                try {
                    pi.encrypt();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void h(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("bob");

    }
}
