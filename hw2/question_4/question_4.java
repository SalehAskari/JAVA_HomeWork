class question_4 {
	public static void main(String[] args) {
		
		//tets
		System.out.println(splitNumber("I lo12ve ja14va "));
	}
	
	//func
	public static String splitNumber (String enter){
		
		//arrey
		String result = "";
		
		//loop for number
		for (int i = 0 ; i < enter.length() ; i++) {
			if ((enter.charAt(i) >= 48 ) && (enter.charAt(i) <= 57 )){
				result += enter.charAt(i);
			}
		}
		//loop for !number
		for (int i = 0 ; i < enter.length() ; i++) {
			if (!((enter.charAt(i) >= 48 ) && (enter.charAt(i) <= 57 ))){
				result += enter.charAt(i);
			}
		}
		//output
		return result;
	}
}