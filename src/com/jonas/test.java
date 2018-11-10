package com.jonas;

import javax.swing.*;
import java.io.IOException;

class test {
    private JPanel panel1;
    private JButton caesarButton;
    private JButton vernamButton;
    private JButton vignereButton;
    private JButton pictureButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;

    private test() {
        caesarButton.addActionListener(actionEvent -> {
            try{
                String a=textField1.getText();
                String b=textField2.getText();
                encryption enc = new encryption();
                enc.setPlainText(a);
                enc.setKey(b);
                int box=comboBox1.getSelectedIndex();
                if(box==0){
                    enc.encrypt();
                }else{
                    enc.decrypt();
                }

                String temp=enc.cyphertext;
                temp=temp.replace("null","");
                textField3.setText(temp);
            }catch(Exception e){
                textField3.setText("Something went wrong - try again");
            }


        });
        vernamButton.addActionListener(actionEvent -> {
            try{
                String a=textField1.getText();
                String b=textField2.getText();
                vernam ver = new vernam();
                ver.setPlainText(a);
                ver.setKey(b);
                int box=comboBox1.getSelectedIndex();
                if(box==0){
                    ver.encrypt();
                }else{
                    ver.decrypt();
                }
                String temp=ver.cyphertext;
                temp=temp.replace("null","");
                textField3.setText(temp);
            }catch(Exception e){
                textField3.setText("Something went wrong - try again");
            }
        });
        vignereButton.addActionListener(actionEvent -> {
            try{
                String a=textField1.getText();
                String b=textField2.getText();
                vignere vig = new vignere();
                vig.setPlainText(a);
                vig.setKey(b);
                int box=comboBox1.getSelectedIndex();
                if(box==0){
                    vig.encrypt();
                }else{
                    vig.decrypt();
                }
                String temp=vig.cyphertext;
                temp=temp.replace("null","");
                textField3.setText(temp);
            }catch(Exception e){
                textField3.setText("Something went wrong - try again");
            }

        });
        pictureButton.addActionListener(actionEvent -> {
            try{
                String a=textField1.getText();
                String b=textField2.getText();
                String c=textField3.getText();
                pic pi=new pic();
                int box=comboBox1.getSelectedIndex();
                try {
                    if(box==0){
                        pi.encrypt(b,a,c
                        );
                    }else if(box==1){
                        pi.decrypt(b);
                        String x=pi.finalWord;
                        textField3.setText(x);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }catch(Exception e){
                textField3.setText("Something went wrong - try again");
                System.out.println(e);
            }

        });
    }

    public static void h(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Encrypter/Decrypter program");
    }
}
