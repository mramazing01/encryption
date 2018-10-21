package com.jonas;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Scanner;

class pic{
    public void encrypt() throws IOException {
        int h=0;
        int w=0;
        int width=1920;
        int height=1080;
        BufferedImage image=null;
        File f = null;
        Scanner a = new Scanner(System.in);
        System.out.println("File name");
        String m=a.nextLine();
        System.out.println("save name");
        String n=a.nextLine();
        System.out.println("Message");
        String x=a.nextLine();
        image=new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        image=ImageIO.read(getClass().getResource(m));
        width = image.getWidth();
        height = image.getHeight();
        for(int i=0;i<x.length();i++){
            Character p = x.toLowerCase().charAt(i);
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
        f=new File(n);
        ImageIO.write(image, "png", f);
        System.out.println("Writing complete");
    }
}