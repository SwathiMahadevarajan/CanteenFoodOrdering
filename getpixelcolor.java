import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.lang.Math;

public class GetPixelColor
{
  public static void main(String args[]) throws IOException{
  File file= new File("face.jpg");
  BufferedImage image = ImageIO.read(file);
for (int y = 0; y < image.getHeight(); y++) {
         for (int x = 0; x < image.getWidth(); x++) {
  int clr=  image.getRGB(x,y);
int A= (clr & 0x00ff0000) >> 24;
  int  R   = (clr & 0x00ff0000) >> 16;
  int  G = (clr & 0x0000ff00) >> 8;
  int  B  =  clr & 0x000000ff;
double Y= 0.299*R+0.287*G +0.11*B;
double CR=R-Y;
double CB=B-Y;
if(R>95 && G>40 && B>20 && R>G && R>B && Math.abs(R-B)>15 && CR >135 &&  Y>80)
{System.out.println("Red Color value = "+ R);
  System.out.println("Green Color value = "+ G);
  System.out.println("Blue Color value = "+ B);
}
} 
}
}
}
