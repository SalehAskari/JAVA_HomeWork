import java.util.*;

class question_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.print("enter key :");
		String enter_key = input.nextLine();
		System.out.print("enter sentence to encode :");
		String enter_sent = input.nextLine();
		
		//moratab kardan bar asas horof alefba
		String enter_key_sort = sort(enter_key);
		
		//arrey
		String result = "";
		int index = 0;
		
		//loop for encide
		for (int i = 0 ; i < enter_key.length() ; i++) {
			
			//peida kardan jaygah horoof moratab shode dar asl kalameh ramz
			index = enter_key.indexOf(enter_key_sort.charAt(i));
			
			//chinesh horof jomleh
			for (int j = index ; j < enter_sent.length() ; j += enter_key.length()) {
				result += enter_sent.charAt(j) ;
			}
		}
		
		//output
		System.out.println("\n<<The encryption process is done>>" + "\n\nKey : " + enter_key + "\nSentence : " + enter_sent + "\nEncrypted sentence:->" + result);
	}
	
	//func for sort alfabet
	public static String sort(String enter){
		
		//arrey
		String result = "";
		char temp ;
		
		//Strint -> chararrey
		char [] out = enter.toCharArray();
		
		//loop for sort
		for(int i = 0 ; i < enter.length() ; i++){
			for(int j = (i + 1) ; j<enter.length() ; j++){
				if(out[i] > out[j]){
					temp =out[i];
					out[i] = out[j];
					out[j] = temp;
				}
		}
	}
			//loop for chararrey -> String
			for (int i = 0 ; i < enter.length() ; i++) {
				result+=out[i];
			}
		
			//output
			return result;
	}
}

