import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

class qustion_2 {
	public static void main(String[] args) {
		File file_1 = new File("image.bmp");
		increasDcreas(file_1, true);
		
	}
	public static void chengeColor(File enter){
		try {
			BufferedImage image = ImageIO.read(enter);
			int rgb;
			int red;
			int blue;
			int green;
			int temp;
			
			for (int i = 0 ; i < image.getWidth() ; i++) {
				for (int j = 0 ; j < image.getHeight() ; j++) {
					rgb = image.getRGB(i, j);
					red = (rgb >> 16) & 0xff;
					green = (rgb >> 8) & 0xff;
					blue = (rgb >> 0) & 0xff;
					
					temp = red;
					red = blue;
					blue = green;
					green = temp;
					
					rgb = (red << 16) | (green << 8) | (blue << 0);
					image.setRGB(i, j, rgb);
					
					
				}
			}
			ImageIO.write(image, "png", new File("out_1.png"));
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		
	}
	public static void increasRed(File enter){
		try {
			BufferedImage image = ImageIO.read(enter);
			int red;
			int rgb;
			int green;
			int blue;
			for (int i = 0 ; i < image.getWidth() ; i++) {
				for (int j = 0 ; j < image.getHeight() ; j++) {
					rgb = image.getRGB(i, j);
					green = (rgb >> 8);
					blue = (rgb >> 0);
					red = (int)(1.1 * ((rgb >> 16) & 0xff));
					
					if (red > 256) {
						red = 255;
					}
					
					
					rgb = (red << 16) | (green << 8) | (blue << 0);
					
					image.setRGB(i, j, rgb);
					
				}
			}
			ImageIO.write(image, "png", new File("out_2.png"));
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	public  static void dcreasBlue(File enter){
		try {
			BufferedImage image = ImageIO.read(enter);
			int red;
			int green;
			int blue;
			int rgb;
			for (int i = 0 ; i < image.getWidth() ; i ++) {
				for (int j = 0 ; j < image.getHeight() ; j++) {
					rgb = image.getRGB(i, j);
					red = (rgb >> 16) & 0xff;
					green = (rgb >> 8) & 0xff;
					blue = (int)(0.9 * ((rgb >> 0) & 0xff));
					
					rgb = (red << 16) | (green << 8) | (blue << 0);
					image.setRGB(i, j, rgb);
					
				}
			}
			ImageIO.write(image, "png", new File("out_3.png"));
		} catch (Exception e) {
			System.out.println("Error");
		}
		
	}
	public static void deletcolor(File enter){
		try {
			BufferedImage image = ImageIO.read(enter);
			int rgb;
			int red;
			int green;
			int blue;
			
			for (int i = 0 ; i < image.getWidth() ; i++) {
				for (int j = 0 ; j < image.getHeight() ; j++) {
					rgb = image.getRGB(i, j);
					red = 0;
					green = (rgb >> 8) & 0xff;
					blue = (rgb >> 0) & 0xff;
					
					rgb = (red << 16) | (green << 8) | (blue << 0);
					image.setRGB(i, j, rgb);
					
				}
			}
			ImageIO.write(image, "png", new File("out_5.png"));
			
		} catch (Exception e) {
			System.out.println("Error");
			
		}
	}
	public static void increasDcreas(File enter , boolean status){
		try {
			BufferedImage image = ImageIO.read(enter);
			int rgb;
			int red;
			int green;
			int blue;
			if (status) {
				for (int i = 0 ; i < image.getWidth() ; i++) {
					for (int j = 0 ; j < image.getHeight() ; j++) {
						rgb = image.getRGB(i, j);
						red = (int)(1.1 * ((rgb >> 16) & 0xff));
						green = (int)(1.1 * ((rgb >> 8) & 0xff));
						blue = (int)(1.1 * ((rgb >> 0) & 0xff));
						
						if (red > 256) {
							red = 255;
						}
						if (green > 256) {
							green = 255;
						}
						if (blue > 256) {
							blue = 255;
						}
						rgb = (red << 16) | (green << 8) | (blue << 0);
						image.setRGB(i, j, rgb);
					}
				}
				ImageIO.write(image, "png", new File("out_4_in.png"));
			}
			else {
				for (int i = 0 ; i < image.getWidth() ; i++) {
					for (int j = 0 ; j < image.getHeight() ; j++) {
						rgb = image.getRGB(i, j);
						red = (int)(0.9 * ((rgb >> 16) & 0xff));
						green = (int)(0.9 * ((rgb >> 8) & 0xff));
						blue = (int)(0.9 * ((rgb >> 0) & 0xff));
						rgb = (red << 16) | (green << 8) | (blue << 0);
						image.setRGB(i, j, rgb);
					}
				}
			ImageIO.write(image, "png", new File("out_4_dc.png"));
				
			}
		}catch (Exception e){
			System.out.println("Error");
			
		}
		
		
	}
}