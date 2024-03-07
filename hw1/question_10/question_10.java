import java.util.*;
import javax.xml.transform.*;
/*

(2*enter)!
------------
enter!*enter!

*/
class question_10 {
	public static void main(String[] args) {
	
	//test
	System.out.println(network(2));
	}
	
	//func
	public static int network(int enter){
		
		//arrey
		int sorat = 1;
		int enter_fact = 1;
		
		//mohasebe sorat
		for (int i = (2 * enter) ; i > 0 ; i-- ) {
			sorat *= i;
		}
		
		//mohasebe enter_fact
		for (int i = enter ; i > 0 ; i --) {
			enter_fact *= i;
		}
		
		//output
		return (sorat/(enter_fact*enter_fact));
	}
}