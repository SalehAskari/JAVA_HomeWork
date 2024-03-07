import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import java.util.*;

class Koder {
	public static void main(String[] args) {
		String masseg ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter for Encryption : ");
		masseg = scanner.nextLine();
		
		final int bonds_x = 5;
		final int bonds_y = 1;
		String length = Integer.toString(masseg.length(), 2);
		try {
			File file = new File("image.png"); 
			BufferedImage image = ImageIO.read(file);
			
			int rgb;
			int red;
			int green;
			int blue;
			
			String binaryString;
			for (int x = 0 , y = 0 , i = -1 ; i < masseg.length()  ; i++) {
				
				if (i == -1) {
					binaryString = length;
				}else {
					int charCode = (int)(masseg.charAt(i));
					binaryString = Integer.toBinaryString(charCode);
				}
					if ((8 - binaryString.length()) == 0){
						for (int j = 0 ; j < 8 ; j++) {
							rgb = image.getRGB(x, y);
							red = (rgb >> 16) & 0xff;
							green = (rgb >> 8) & 0xff;
							blue = (rgb >> 0) & 0xff;
							
							if (((red % 2) == 0) && (binaryString.charAt(j) == '0')) {
								rgb = (red << 16) | (green << 8) | (blue << 0);
								image.setRGB(x, y, rgb);
								x+=bonds_x;
								if(x >= image.getWidth() - bonds_x){
									y+=bonds_y;
									x = 0;
								}
							}
							else if (((red % 2) == 0) && (binaryString.charAt(j) == '1')) {
								red++;
								green++;
								blue++;
								rgb = (red << 16) | (green << 8) | (blue << 0);
								image.setRGB(x, y, rgb);
								x+=bonds_x;
								if(x >= image.getWidth() - bonds_x){
									y+=bonds_y;
									x = 0;
								}
							}
							else if (((red % 2) != 0) && (binaryString.charAt(j) == '0')) {
								red++;
								green++;
								blue++;
								rgb = (red << 16) | (green << 8) | (blue << 0);
								image.setRGB(x, y, rgb);
								x+=bonds_x;
								if(x >= image.getWidth() - bonds_x){
									y+=bonds_y;
									x = 0;
								}								
							}
							else if (((red % 2) != 0) && (binaryString.charAt(j) == '1')) {
								rgb = (red << 16) | (green << 8) | (blue << 0);
								image.setRGB(x, y, rgb);
								x+=bonds_x;
								if(x >= image.getWidth() - bonds_x){
									y+=bonds_y;
									x = 0;
								}
							}
						}
					}
					if ((8 - binaryString.length()) > 0) {
							for (int k = (8 - binaryString.length()) ; k > 0 ; k--) {								
								rgb = image.getRGB(x, y);
								red = (rgb >> 16) & 0xff;
								green = (rgb >> 8) & 0xff;
								blue = (rgb >> 0) & 0xff;
								if (red % 2 == 0) {
									rgb = (red << 16) | (green << 8) | (blue << 0);
									image.setRGB(x, y, rgb);
									x+=bonds_x;
									if(x >= image.getWidth() - bonds_x){
										y+=bonds_y;
										x = 0;
									}									
								}
								else {
									red++;
									green++;
									blue++;
									rgb = (red << 16) | (green << 8) | (blue << 0);
									image.setRGB(x, y, rgb);
									x+=bonds_x;
									if(x >= image.getWidth() - bonds_x){
										y+=bonds_y;
										x = 0;
									}
								}
							}
							for (int j = 0 ; j < (8 - ( 8 - binaryString.length())) ; j++ ) {
								rgb = image.getRGB(x, y);
								red = (rgb >> 16) & 0xff;
								green = (rgb >> 8) & 0xff;
								blue = (rgb >> 0) & 0xff;

							if (((red % 2) == 0)&& (binaryString.charAt(j) == '1')) {
									red++;
									green++;
									blue++;
									rgb = (red << 16) | (green << 8) | (blue << 0);
									image.setRGB(x, y, rgb);
									x+=bonds_x;
								if(x >= image.getWidth() - bonds_x){
									y+=bonds_y;
									x = 0;
								}
							}
							else if (((red % 2) == 0)&& (binaryString.charAt(j) == '0')) {
									rgb = (red << 16) | (green << 8) | (blue << 0);
									image.setRGB(x, y, rgb);
									x+=bonds_x;
								if(x >= image.getWidth() - bonds_x){
									y+=bonds_y;
									x = 0;
								}
									}
							else if (((red % 2) != 0) && (binaryString.charAt(j) == '1')) {
									rgb = (red << 16) | (green << 8) | (blue << 0);
									image.setRGB(x, y, rgb);
									x+=bonds_x;
								if(x >= image.getWidth() - bonds_x){
									y+=bonds_y;
									x = 0;
								}
							}
							else if (((red % 2) != 0) && (binaryString.charAt(j) == '0')) {
									red++;
									green++;
									blue++;
									rgb = (red << 16) | (green << 8) | (blue << 0);
									image.setRGB(x, y, rgb);
									x+=bonds_x;
								if(x >= image.getWidth() - bonds_x){
									y+=bonds_y;
									x = 0;
								}
									}
							}
						}
					
				}
				ImageIO.write(image, "png", new File("koder_out.png"));
				

	
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}