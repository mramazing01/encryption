package com.jonas;

import static java.lang.System.out;

public class vernam extends encryption{
    public int newKey;

    public String keytobin(){
        Character p=key.toLowerCase().charAt(0);;
        int m=(int)p;
        String x=Integer.toBinaryString(m);
        return x;
    }
    protected void encryptCharacterNumber(int whichOne) {
        out.println(plaintext);
        out.println(key);
        out.println("This works");

    }
}
