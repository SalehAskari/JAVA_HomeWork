import java.util.*;
import java.awt.*;

/*


*               *     *               *
**             **     **             * *
***           * *     * *           *   *
****         *  *     *  *         *     *
*****       *   *     *   *       *       *
******     ******     ******     * * * * * *
******     ******     ******     * * * * * *
*****      *   *       *   *      *       *
****       *  *         *  *       *     *
***        * *           * *        *   *
**         **             **         * *
*          *               *          *


*/


class question_5 {
	public static void main(String[] args) {
		
		//input
		int input ;
		System.out.print("enter number : ");
		Scanner enter = new Scanner(System.in);
		input = enter.nextInt();
		
		//arrey and mohasebat
		int space_1 = (input-1)*3;
		int space_2 = (input-1)*2;
		int space_3 = (input-1);
		int space_3_c = (input-1);
		int k = 1;
		int m = -1;
		boolean loop = true;
		int input_c = input;
		int input_cc = input;
		int fasel = (input - 2);
		
		//rasm nim tane bala
		for (int i = 0 ; i < input ; i++) {
			
			// shekl 1
			for (int j = k ; j > 0 ; j--) {
				System.out.print("*");
			}
	
			// space
			for (int j = space_1; j > 0 ; j--) {
				System.out.print(" ");
			}
			
			//shekl 2
			for (int j = k ; j > 0 ; j--) {
				
				System.out.print("*");
				if (k >= 3 && loop == true && (i != input-1)){
					for(int f = m ; f > 0 ; f-- ){
						System.out.print(" ");
						j--;
					}
					loop = false;
				}
			}
			loop = true;
			
			
				// space
				for (int j = space_3 ; j > 0 ; j--) {
					System.out.print(" ");
				}
			if(i > (input+2)){
				space_2+=2;
			}
			
			//shekl 3
			for (int j = k ; j > 0 ; j--) {
				System.out.print("*");
				if (k >= 3 && loop == true && (i != input-1)){
					for(int f = m ; f > 0 ; f-- ){
						System.out.print(" ");
						j--;
					}
					loop = false;
				}
			}
			
			loop = true;
			
			// space
			for (int j = space_1 ; j > 0 ; j-- ) {
				System.out.print(" ");
			}
			
			// shekl 4
			for (int j = k ; j > 0 ; j--) {
				System.out.print(" *");
				
				if (k >= 3 && loop == true && (i != input-1)){
					for(int f = m ; f > 0 ; f-- ){
						System.out.print("  ");
						j--;
					}
					loop = false;
				}
			}
			
			loop = true;
			
		
			
			
			space_1-=2;
			k++;
			m++;
			System.out.println();
		
			
		}
		
		loop = true;
		
		//rasm nim tane paeen
		for (int i = input ; i >= 0 ; i--) {
			
			// shekl 1
			for (int j = input_c ; j > 0 ; j--) {
				System.out.print("*");
			}
			
			// space
			for (int j = space_3 ; j > 0 ; j--) {
					System.out.print(" ");
					
			}
			
			// shekl 2
			for (int j = input_c ; j > 0 ; j-- ) {
				System.out.print("*");
				
				if((input > 2) && (loop == true) && (i != input)){
					for (int d = fasel ; d > 0 ; d-- ) {
						System.out.print(" ");
						j--;
					}
					loop = false;
					
				}
			}
			loop = true;
			
			// space
			for (int j = space_3_c ; j > 0 ; j--) {
				System.out.print(" ");
			}
			
			// shekl 3
			for (int j = input_c ; j > 0 ; j--) {
				System.out.print("*");
				
				if((input > 2) && (loop == true) && (i != input)){
					for (int d = fasel ; d > 0 ; d-- ) {
						System.out.print(" ");
						j--;
					}
					loop = false;
					
				}
				
			}
			loop = true;
			
			// space 
			for (int j = space_3 ; j > 0 ; j--) {
				System.out.print(" ");
			}
			
			// shekl 4
			for (int j = input_cc ; j > 0 ; j--) {
				System.out.print(" *");
				
				if((input > 2) && (loop == true) && (i != input)){
					for (int d = fasel ; d > 0 ; d-- ) {
						System.out.print("  ");
						j--;
					}
					loop = false;
					
				}
				
			}
			loop = true;
			
			System.out.println();
			space_3+=1;
			space_3_c+=2;
			input_c-=1;
			input_cc-=1;
			fasel--;
			
		}
	
	}
	
}