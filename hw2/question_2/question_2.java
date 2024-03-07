import javax.crypto.*;
import java.sql.*;

class question_2 {
	public static void main(String[] args) {
	
		//test
		System.out.println(start_enth("abXYab"));
	}
	
	//func
	public static String start_enth (String enter){
		
	//arrey
	String result = "";
	String out = "";
	int i = 0;
	int j = 1;
	
	//halgheh baray check kardan akhrin index dar tol araye
	for (;i<enter.length();i++) {
		if (enter.charAt(i)==enter.charAt(enter.length()-j)) {
			break;
		}
	}
		//halghe baraye check kardan brabar bodan avah va akhar
		for (; i >= 0 ; i--) {
			if (enter.charAt(i)==enter.charAt(enter.length()-j)) {
				result+=enter.charAt(i);
			}
			
			//ouput if not eqaul
			else {
				return "NOP";
			}
			j++;
		}
		//loop for inveres
		for (int k = result.length()-1 ; k >= 0 ; k--) {
			out+=result.charAt(k);
		}
		
		//output if equal
		return out;
	}}