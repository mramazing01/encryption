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
                String temp=enc.cyphertext;
                temp=temp.replace("null","");
                textField3.setText(temp);
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
                String temp=ver.cyphertext;
                temp=temp.replace("null","");
                textField3.setText(temp);
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
                String temp=vig.cyphertext;
                temp=temp.replace("null","");
                textField3.setText(temp);
            }
        });
        pictureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String a=textField1.getText();
                String b=textField2.getText();
                String c=textField3.getText();
                pic pi=new pic();
                try {
                    pi.encrypt(b,a,c);
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
