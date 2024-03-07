class question_1 {
	public static void main(String[] args) {
		
		//test
		System.out.println(contain("saleh askari","askari"));
	}
	
	//func
	public static int contain (String temp_1 , String temp_2){
		
		//arrey
		int result_1 = 0;
		int result_2 = 0;
		String enter_1 = new String();
		String enter_2 = new String();
		
		for (int i = 0 ; i < temp_1.length() ; i++) {
			if (enter_1.indexOf(temp_1.charAt(i)) < 0) {
				enter_1 += temp_1.charAt(i);
			}
		}
		for (int i = 0 ; i < temp_2.length() ; i++) {
			if (enter_2.indexOf(temp_2.charAt(i)) < 0) {
				enter_2 += temp_2.charAt(i);
			}
		}
		
		//loop for check equal String1 and String2
		for (int i = 0 ; i < enter_1.length() ; i++) {
			for (int j = 0 ; j < enter_2.length() ; j++) {
				if(enter_1.charAt(i) == enter_2.charAt(j)){
					result_1++;
				}
			}
		}
		//loop for check equal String2 and String1
		for (int i = 0 ; i < enter_2.length() ; i++) {
			for (int j = 0 ; j < enter_1.length() ; j++) {
				if(enter_1.charAt(j) == enter_2.charAt(i)){
					result_2++;
				}
			}
		}
		//String1 -> String2
		if (result_1 == enter_1.length()){
			return -1;
		}
		//String2 -> String1
		else if (result_2 == enter_2.length()) {
			return 1;
		}
		//Strin1 == String2
		else {
			return 0;
		}
	}
}