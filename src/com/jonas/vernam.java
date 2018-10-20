package com.jonas;

import static java.lang.System.out;

public class vernam extends encryption{
    private int asciikey;
    private int asciitext;
    public void keyToAsc(){
        Character p=key.toLowerCase().charAt(0);;
        asciikey=(int)p;
    }
    protected void encryptCharacterNumber(int whichOne) {
        Character p = plaintext.toLowerCase().charAt(whichOne);
        asciitext=(int)p;
        int asciicyper = asciitext^asciikey;
        out.println("asciit "+asciitext);
        out.println("asciik "+asciikey);
        out.println("asciic "+asciicyper);
        out.println("words "+(char)asciicyper);
    }
}
