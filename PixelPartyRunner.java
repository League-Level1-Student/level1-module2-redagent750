package extra;

import java.util.Random;

public class PixelPartyRunner {
public static void main(String[] args) {
PixelParty pixel = new PixelParty();
Random a = new Random();

for(int i = 0; i<4;i++) {
int x = a.nextInt(300);
int y = a.nextInt(300);
int z = a.nextInt(300);
int q = a.nextInt(300);
int w = a.nextInt(300);
pixel.setColor(z,y,x);
pixel.drawRectangle(x,y,x,y);
pixel.setColor(q,w,z);
pixel.drawCircle(z,q,w);
pixel.drawTriangle(x,x,x,q,q,q);
pixel.setColor(q, z, x);
}
pixel.saveImage();
pixel.displayImage();

}
}
