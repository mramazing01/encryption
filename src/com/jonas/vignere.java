package com.jonas;

import static java.lang.System.out;

public class vignere extends encryption{
    protected void encryptCharacterNumber(int whichOne,int howMuch) {
        Character p = plaintext.toLowerCase().charAt(whichOne);
        Character g = key.toLowerCase().charAt(howMuch);
        int m=(int)p;
        int h=(int)g;
        if(m>96&&m<123) {
            h = h - 97;
            int finalLetter = h + m;
            while (finalLetter > 122) finalLetter -= 26;
            cyphertext+=(char)finalLetter;
        }else cyphertext+=(char) m;
    }
    public void encrypt(){
        int a =0;
        for(int i=0; i<plaintext.length();i++){
            if(Character.isLetter(plaintext.charAt(i))==true){
                if(a==(key.length())){
                    a=0;
                }
                encryptCharacterNumber(i,a);
                a++;
            }else encryptCharacterNumber(i, 0);
        }
    }

    public void decrypt(){
        int a =0;
        for(int i=0; i<plaintext.length();i++){
            if(Character.isLetter(plaintext.charAt(i))==true){
                if(a==(key.length())){
                    a=0;
                }
                decryptCharacterNumber(i,a);
                a++;
            }else decryptCharacterNumber(i, 0);
        }
    }
    protected void decryptCharacterNumber(int whichOne,int howMuch) {
        Character p = plaintext.toLowerCase().charAt(whichOne);
        Character g = key.toLowerCase().charAt(howMuch);
        int m=(int)p;
        int h=(int)g;
        if(m>96&&m<123) {
            h = h - 97;
            int finalLetter = h - m;
            while (finalLetter < 122) finalLetter += 26;
            cyphertext+=(char)finalLetter;
        }else cyphertext+=(char) m;
    }
}
