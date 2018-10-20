package com.jonas;
/*Vernam Vigere*/
public class Main {

    public static void main(String[] args) {
        vernam ver = new vernam();
        ver.GetPlainText();
        ver.getKey();
        String stringkey=ver.keytobin();
        int newkey=Integer.parseInt(stringkey);
        System.out.println(newkey);
        /*
        ver.encryptCharacterNumber(1);
        encryption enc = new encryption();
        enc.GetPlainText();
        enc.getKey();
        enc.encrypt(); */
    }
}
