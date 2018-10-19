package com.jonas;
/*Vernam Vigere*/
public class Main {

    public static void main(String[] args) {
        vernam ver = new vernam();
        ver.GetPlainText();
        ver.getKey();
        ver.encryptCharacterNumber(1);
        encryption enc = new encryption();
        enc.GetPlainText();
        enc.getKey();
        enc.encrypt();
    }
}
