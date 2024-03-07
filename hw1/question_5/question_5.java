import java.util.*;
import java.awt.im.*;
import javax.swing.*;

class Untitled {
	public static void main(String[] args) {
		
		//input
		Scanner Input = new Scanner(System.in);
		System.out.print("enter base number : ");
		int enter_mabna_old = Input.nextInt();
		char enter_mabna = 'z';
		System.out.print("enter number : ");
		String enter_number = Input.next();
		
		//arrey
		char enter [] = new char[enter_number.length()];
		
		// Strint -> chararrey
		enter = enter_number.toCharArray();
		
		//arrey
		int sum = 0;
		int r = 0;
		String result = "";
		int out = 0;
		char temp_char = 'n';
		int temp_int = 0;
		
		//tabdil by aski number
		switch (enter_mabna_old) {
			case 1:
				enter_mabna = '1';
				break;
			case 2:
				enter_mabna = '2';
				break;
			case 3:
				enter_mabna = '3';
				break;
			case 4:
				enter_mabna = '4';
				break;
			case 5:
				enter_mabna = '5';
				break;
			case 6:
				enter_mabna = '6';
				break;
			case 7:
				enter_mabna = '7';
				break;
			case 8:
				enter_mabna = '8';
				break;
			case 9:
				enter_mabna = '9';
				break;
			case 10:
				enter_mabna = 'A';
				break;
			case 11:
				enter_mabna = 'B';
				break;
			case 12:
				enter_mabna = 'C';
				break;
			case 13:
				enter_mabna = 'D';
				break;
			case 14:
				enter_mabna = 'E';
				break;
			case 15:
				enter_mabna = 'F';
				break;
			case 16:
				enter_mabna = 'G';
				break;
		}
		
			
		//check loop
		for (int i = 0 ; i < enter_number.length() ; i++) {
			switch (enter[i]) {
				case 'a':
					enter[i] = 'A';
					break;
				
				case 'b':
					enter[i] = 'B';
					break;
				
				case 'c':
					enter[i] = 'C';
					break;
				
				case 'd':
					enter[i] = 'D';
					break;
				
				case 'e':
					enter[i] = 'E';
					break;
				
				case 'f':
					enter[i] = 'F';
					break;
					
					case 'g':
						enter[i] = 'G';
						break;
				
				
				
			}
			if (enter[i] >= enter_mabna){		
				System.out.println("The correct base is not entered.\nYou have exited the program.\nPlease try again.");
				System.exit(0);	
		}}
	
		//sum number
		for (int i = 0 ; i < enter_number.length() ; i++) {
			switch (enter[i]) {
				case 48:
					sum += 0;
					break;
					
				case 49:
					sum += 1;
					break;
					
				case 50:
					sum += 2;
					break;
					
				case 51:
					sum += 3;
					break;
					
				case 52:
					sum += 4;
					break;
					
				case 53:
					sum += 5;
					break;
					
				case 54:
					sum += 6;
					break;
					
				case 55:
					sum += 7;
					break;
					
				case 56:
					sum += 8;
					break;
					
				case 57:
					sum += 9;
					break;
					
				case 65: 
					sum += 10;
					break;
					
				case 66:
					sum += 11;
					break;
					
				case 67:
					sum += 12;
					break;
					
				case 68:
					sum += 13;
					break;
					
				case 69:
					sum += 14;
					break;
					
				case 70:
					sum += 15;
					break;
					
					case 71:
						sum += 16;
						break;
				
					
			}
		}
		int temp_sum = sum;
		
		//chararrey to int
		switch (enter_mabna) {
			case 48:
				r = 0;
				break;
			
			case 49:
				r = 1;
				break;
			
			case 50:
				r = 2;
				break;
			
			case 51:
				r = 3;
				break;
			
			case 52:
				r = 4;
				break;
			
			case 53:
				r = 5;
				break;
			
			case 54:
				r = 6;
				break;
			
			case 55:
				r = 7;
				break;
			
			case 56:
				r = 8;
				break;
			
			case 57:
				r = 9;
				break;
			
			case 65: 
				r = 10;
				break;
			
			case 66:
				r = 11;
				break;
			
			case 67:
				r = 12;
				break;
			
			case 68:
				r = 13;
				break;
			
			case 69:
				r = 14;
				break;
			
			case 70:
				r = 15;
				break;
				
			case 71:
				r = 16;
				break;
		}
		
		//mohasebe mabna
		while (sum != 0 ) {
			temp_int = sum % r;
			
			switch (temp_int) {
				case 0:
					temp_char = 48;
					break;
				
				case 1:
					temp_char = 49;
					break;
				
				case 2:
					temp_char = 50;
					break;
				
				case 3:
					temp_char = 51;
					break;
				
				case 4:
					temp_char = 52;
					break;
				
				case 5:
					temp_char = 53;
					break;
				
				case 6:
					temp_char = 54;
					break;
				
				case 7:
					temp_char = 55;
					break;
				
				case 8:
					temp_char = 56;
					break;
				
				case 9:
					temp_char = 57;
					break;
				
				case 10: 
					temp_char = 65;
					break;
				
				case 11:
					temp_char = 66;
					break;
				
				case 12:
					temp_char = 67;
					break;
				
				case 13:
					temp_char = 68;
					break;
				
				case 14:
					temp_char = 69;
					break;
				
				case 15:
					temp_char = 70;
					break;
				
				case 16:
					temp_char = 71;
					break;
			}
			
			
			sum /= r;
			result += temp_char;
		}
		
		//output
		System.out.println("\nNumber: " + enter_number + "\nIn base: " + enter_mabna_old + "\nSum: " + temp_sum);
		System.out.println("Base in sum: " + inverse(result));
	
}

	//func for inverse
	public static String inverse(String enter){
		String result = "";
		for (int i = (enter.length() - 1) ; i >= 0 ; i--) {
		result+=enter.charAt(i);
	}
		return result;
}
	

}