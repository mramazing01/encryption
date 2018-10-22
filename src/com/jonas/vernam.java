package com.jonas;

import static java.lang.System.out;

public class vernam extends encryption{
    private int asciikey;
    private int asciitext;
    public void keyToAsc(){
        Character p=key.toLowerCase().charAt(0);
        asciikey=(int)p;
    }
    protected void encryptCharacterNumber(int whichOne) {
        Character p = plaintext.toLowerCase().charAt(whichOne);
        asciitext=(int)p;
        Character l=key.toLowerCase().charAt(whichOne);
        asciikey=(int)l;
        int asciicyper = asciitext^asciikey;
        out.println((char)asciikey);
        out.println(asciicyper);
        out.println((char)asciicyper);
    }
}
