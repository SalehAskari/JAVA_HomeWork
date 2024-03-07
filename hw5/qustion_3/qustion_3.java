import java.io.*;
import java.util.*;

class  qustion_3 {
	public static void main(String[] args) {
		File file_1 = new File("fial_1.txt");
		File file_2 = new File("fial_2.txt");
		File file_3 = new File("fial_3.txt");
		coder(file_1 , file_2);
		dcoder(file_2 , file_3);
		
	}
	public static void coder(File enter_1 , File enter_2){
		try{
			FileReader filereader = new FileReader(enter_1);
			Scanner scanner = new Scanner(filereader);
			FileWriter filewriter = new FileWriter(enter_2);
			PrintWriter printwriter = new PrintWriter(filewriter);
			String line;
			
			while (scanner.hasNext()) {
				line = scanner.nextLine();
				for (int i = 0 ; i < line.length() ; i++) {
					switch (line.charAt(i)) {
						case 'a':
							printwriter.print('D');
							break;
						case 'b':
							printwriter.print('K');
							break;
						case 'c':
							printwriter.print('V');
							break;
						case 'd':
							printwriter.print('Q');
							break;
						case 'e':
							printwriter.print('F');
							break;
						case 'f':
							printwriter.print('I');
							break;
						case 'g':
							printwriter.print('B');
							break;
						case 'h':
							printwriter.print('J');
							break;
						case 'i':
							printwriter.print('W');
							break;
						case 'j':
							printwriter.print('P');
							break;
						case 'k':
							printwriter.print('E');
							break;
						case 'l':
							printwriter.print('S');
							break;
						case 'o':
							printwriter.print('C');
							break;
						case 'm':
							printwriter.print('X');
							break;
						case 'n':
							printwriter.print('H');
							break;
						case 'p':
							printwriter.print('T');
							break;
						case 'q':
							printwriter.print('M');
							break;
						case 'r':
							printwriter.print('Y');
							break;
						case 's':
							printwriter.print('A');
							break;
						case 't':
							printwriter.print('U');
							break;
						case 'u':
							printwriter.print('O');
							break;
						case 'v':
							printwriter.print('L');
							break;
						case 'w':
							printwriter.print('R');
							break;
						case 'x':
							printwriter.print('G');
							break;
						
						case 'y':
							printwriter.print('Z');
							break;
						
						case 'z':
							printwriter.print('N');
							break;
						
						default:
						printwriter.print(line.charAt(i));
							break;
					}
				}
				printwriter.println();
			}
			
		filereader.close();
		filewriter.close();
		//printwriter.close();
		}catch (Exception e) {
			System.out.println("Error");
		}
	System.out.println("Done");
	}
		
		
	
	
	public static void dcoder(File enter_1 , File enter_2){
		try{
			FileReader filereader = new FileReader(enter_1);
			Scanner scanner = new Scanner(filereader);
			FileWriter filewriter = new FileWriter(enter_2);
			PrintWriter printwriter = new PrintWriter(filewriter);
			String line;
			
			while (scanner.hasNext()) {
				line = scanner.nextLine();
				for (int i = 0 ; i < line.length() ; i++) {
					switch (line.charAt(i)) {
						case 'D':
							printwriter.print('a');
							break;
						case 'K':
							printwriter.print('b');
							break;
						case 'V':
							printwriter.print('c');
							break;
						case 'Q':
							printwriter.print('d');
							break;
						case 'F':
							printwriter.print('e');
							break;
						case 'I':
							printwriter.print('f');
							break;
						case 'B':
							printwriter.print('g');
							break;
						case 'J':
							printwriter.print('h');
							break;
						case 'W':
							printwriter.print('i');
							break;
						case 'P':
							printwriter.print('j');
							break;
						case 'E':
							printwriter.print('k');
							break;
						case 'S':
							printwriter.print('l');
							break;
						case 'C':
							printwriter.print('o');
							break;
						case 'X':
							printwriter.print('m');
							break;
						case 'H':
							printwriter.print('n');
							break;
						case 'T':
							printwriter.print('P');
							break;
						case 'M':
							printwriter.print('q');
							break;
						case 'Y':
							printwriter.print('r');
							break;
						case 'A':
							printwriter.print('s');
							break;
						case 'U':
							printwriter.print('t');
							break;
						case 'O':
							printwriter.print('u');
							break;
						case 'L':
							printwriter.print('v');
							break;
						case 'R':
							printwriter.print('w');
							break;
						case 'G':
							printwriter.print('x');
							break;
						
						case 'Z':
							printwriter.print('y');
							break;
						
						case 'N':
							printwriter.print('z');
							break;
						
						default:
							printwriter.print(line.charAt(i));
							break;
					}
				}
				printwriter.println();
			}
			
		filereader.close();
		filewriter.close();
		//printwriter.close();
		}catch (Exception e) {
			System.out.println("Error");
		}
	System.out.println("Done");
		
	}
}
	