package com.jonas;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Scanner;

class pic{
    public void encrypt(String file, String message, String save) throws IOException {
        int h=0;
        int w=0;
        int width=1920;
        int height=1080;
        BufferedImage image=null;
        File f = null;
        image=new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        image=ImageIO.read(getClass().getResource(file));
        width = image.getWidth();
        height = image.getHeight();
        for(int i=0;i<message.length();i++){
            Character p = message.toLowerCase().charAt(i);
            int r=(int)p;
            int[] pix;
            if(w>=1920){
                w=0;
                h=h+1;
            }
            pix=image.getRaster().getPixel(w,h,new int[3]);
            int pixel = 0<<24 | r<<16 | pix[1]<<8 | pix[2];
            image.setRGB(w, h, pixel);
            w+=5;
        }
        f=new File(save);
        ImageIO.write(image, "png", f);
        System.out.println("Writing complete");
    }
}