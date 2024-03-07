class question_9 {
	public static void main(String[] args) {
		
		//test
		System.out.println(sumString("ABCDEfg"));
				
	}
	
	//func
	public static int sumString(String enter){
		
		//arrey
		int length = 0;
		int sum = 0;
		
		//check arrey
		for (int i = 0 ; i < enter.length() ;i++) {
			if (enter.charAt(i) >= 97 && enter.charAt(i) <= 122){
				length = enter.charAt(i) - 96;
				sum += length;
			}
			if (enter.charAt(i) >= 65 && enter.charAt(i) <= 90) {
				length = enter.charAt(i) - 64;
				sum += length;
			}
		}
	//output
	return sum;
	}
}