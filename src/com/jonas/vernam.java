package com.jonas;

import static java.lang.System.out;

public class vernam extends encryption{
    private int asciikey;
    private int asciitext;

    protected void encryptCharacterNumber(int whichOne) {
        Character p = plaintext.charAt(whichOne);
        asciitext=(int)p;
        Character l=key.toLowerCase().charAt(whichOne);
        asciikey=(int)l;
        int asciicyper = asciitext^asciikey;
        /*String textcyper=Integer.toString(asciicyper);*/
        cyphertext+=(asciicyper+" ");
    }
    protected void decryptCharacterNumber(int whichOne){
        Character p = plaintext.charAt(whichOne);
        asciitext=(int)p;
        Character l=key.toLowerCase().charAt(whichOne);
        asciikey=(int)l;
        int asciicyper = asciitext^asciikey;
        String textcyper=Integer.toString(asciicyper);
        cyphertext+=(textcyper+" ");
    }
}
