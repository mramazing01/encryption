package com.jonas;
import java.util.Scanner;
import static java.lang.System.*;

public class encryption{
    private String plaintext;
    private String cyphertext;
    private String key;
    Scanner a =new Scanner(in);
    public void GetPlainText(){
        out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        out.println("Please enter your text");
        out.println("*Do not enter punctuation as");
        out.println("this will make your message");
        out.println("easier to decrypt*");
        out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        plaintext=a.nextLine();
    }
    public void GetCyperText(){
        out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        out.println("Please enter your text");
        out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        cyphertext=a.nextLine();
    }
    public void encrypt(){
        for(int i=0; i<plaintext.length();i++){
            encryptCharacterNumber(i);
        }
    }
    public void getKey(){
        out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        out.println("Please enter your key");
        out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        key=a.nextLine();
    }

    protected void encryptCharacterNumber(int whichOne) {
        Character p = plaintext.toLowerCase().charAt(whichOne);
        int keyy=Integer.parseInt(key);
        int m=(int)p;
        if(m>96&&m<123){
            int finalLetter=m+keyy;
            while(finalLetter>122){
                finalLetter-=26;
            }
            out.print((char)finalLetter);
        }else if(m>47&&m<58){
            int finalLetter=m+keyy;
            while(finalLetter>57) finalLetter-=9;
            out.print((char)finalLetter);
        }else if(m==32) out.print((char)m);
    }

}
