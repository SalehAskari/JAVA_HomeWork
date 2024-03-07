import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

class DemoDkoder{
	public static void main(String[] args) {
		File f = new File("koder_out.png");
		dkoder(f);
	}
	
	public static void dkoder(File enter){
		final int bonds_x = 5;
		final int bonds_y = 1;
		try {
			BufferedImage image = ImageIO.read(enter);
			int x = 0;
			int y = 0;
			int rgb;
			int red;
			String binery = "";
			int length;
			for (int i = 0 ; i < 8 ; i++) {
				rgb = image.getRGB(x, y);
				red = (rgb >> 16) & 0xff;
				binery += "" + (red % 2);
				x+=bonds_x;
			}
			length = Integer.parseInt(binery, 2);
			binery = "";
			for (int i = 0 ; i < length ; i++) {
			for (int j = 0 ; j < 8 ; j++) {
				rgb = image.getRGB(x, y);
				red = (rgb >> 16) & 0xff;
				
				binery += "" + (red % 2);
				x+=bonds_x;
				
				if(x >= image.getWidth() - bonds_x ){
					y+=bonds_y;
					x = 0;
				}
			}
				System.out.print((char)(Integer.parseInt(binery , 2)));
				binery ="";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}