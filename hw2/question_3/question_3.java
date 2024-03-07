class Untitled {
	public static void main(String[] args) {
		
		//test
		System.out.println(Substring("ddad",4));
	}
	
	//func
	public static int Substring(String enter , int a){
		
		//arrey
		String sub = "";
		int counter = 0;
		int result = 0;
		
		//halghe sakht majmoe hai a taee
		for (int i = 0 ; i < enter.length() ; i++) {
			counter = 0;
			sub += enter.charAt(i);
			for (int j = i + 1 ; (j < (i + a) ) && (j < enter.length() ); j++) {
				sub += enter.charAt(j);
			}
			
			// baray majmoeh haee ke a taee shde
			if(sub.length() == a){
				
				//baray check kardan shart a-1 harf
				for (int k = 0 ; k < sub.length() ; k++) {
					for (int m = k+1 ; m < sub.length() ; m++) {
						if(sub.charAt(k) == sub.charAt(m)){
							counter++;
						}
					}
				}
			}
			
			//shomaresh majmoe standard
			if(counter == (a-(a-1))){
				result++;
			}
			sub ="";
		}
		//output
		return result;
	}
}