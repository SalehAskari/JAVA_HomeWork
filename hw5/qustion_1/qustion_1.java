import java.io.*;
import java.util.*;

class qustion_1 {
	public static void main(String[] args) {
		File file = new File("fial_1.txt");
		System.out.println(metode(file));
	}
	public static String metode(File enter){
		
		try{
			FileReader filereader = new FileReader(enter);
			Scanner scanner = new Scanner(filereader);
			String line="";
			String eqauls="";
			int counter_h = 0;
			int counter_t = 0;
			while (scanner.hasNext()) {
				
				eqauls = scanner.nextLine();
				for (int i = 0 ; i < eqauls.length() ; i++) {
					//System.out.println(eqauls);
					if (eqauls.charAt(i) == 't' || eqauls.charAt(i) == 'T'){
						counter_t++;
						//System.out.println(eqauls.charAt(i));
					}
					 else if (eqauls.charAt(i) == 'h' || eqauls.charAt(i) == 'H'){
						counter_h++;
						//System.out.println(eqauls.charAt(i));
					}
				}
				
				System.out.println("" + counter_h + " heads " + "(" + (counter_h * 100 / (counter_h + counter_t)) + "%)");
				counter_t = 0;
				counter_h = 0;
			}
			filereader.close();
		}catch (Exception e) {
				return "Error";
			
	}
	return "";
	}
}