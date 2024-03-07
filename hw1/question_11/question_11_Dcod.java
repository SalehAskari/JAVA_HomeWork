import java.util.*;
import java.net.*;

class Untitled {
	public static void main(String[] args) {
		
		//input
		Scanner inpit = new Scanner(System.in);
		System.out.print("enter key :");
		String key = inpit.nextLine();
		System.out.print("enter sentence to decode :");
		String sent = inpit.nextLine();
		
		//arrey
		int index = 0;
		String enter_key_sort = sort(key);
		char table[][] = new char[key.length()][(sent.length()/key.length())+1];
		int r = sent.length() % key.length();
		int r_c = r;
		int k = 0;
		int l = 0;
		int f = 0;
		String result = "";
		
		//loop for gharar dadn horoof dar arrey2D
		for (int i = 0 ; i < key.length() ; i++) {
			index = key.indexOf(enter_key_sort.charAt(i));
			l += sent.length() / key.length();
			f = 0;
			
			//shart moshakhas shodan gharar gereftan horoof dar radif akhar
			if (r > 0 && (index < r_c)){
				l++;
			}
			
			//loop for gharar dadn horoof dar arrey2D
			for (int j = sent.length() - l ; j < (sent.length() - k) && (j >= 0) ; j++) {
				table[index][f] = sent.charAt(j);
				f++;
			}
			
			//shart moshakhas shodan gharar gereftan horoof dar radif akhar
			if (r > 0 && (index < r_c)){
				k++;
				r--;
				
			}
			k += sent.length() / key.length();
		}
		
		//output
		System.out.print("\n<<Encryption was successful>>\n" + "\nKey : " + key + "\nEncoded sentence : " + sent +"\n" + "Encrypted sentence:->" );
		
		//output
		for (int i = 0 ; i < (sent.length() / key.length() + 1) ; i++) {
			for (int j = 0 ; j < key.length()  ; j++) {
				System.out.print(table[j][i]);
			}
		}
	}
	
	//func baray moratab kardan horoof az akhar be aval alefba
	public static String sort(String enter){
		
		//arrey
		String result = "";
		char [] out = enter.toCharArray();
		char temp ;
		
		//loop for sort
		for(int i = 0 ; i < enter.length() ; i++){
			for(int j = (i + 1) ; j<enter.length() ; j++){
				if(out[i] < out[j]){
					temp = out[i];
					out[i] = out[j];
					out[j] = temp;
				}
		}
	}
			//loop for chararrey -> String
			for (int i = 0 ; i < enter.length() ; i++) {
				result+=out[i];
			}
			return result;
	}
}