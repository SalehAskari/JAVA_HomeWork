class question_7 {
	public static void main(String[] args) {
		
		//test
		System.out.println(max_lenght_equale("Bigest", "khooobi"));
	}
	
	//func
	public static int max_lenght_equale(String enter_1,String enter_2){
		
		//arrey
		boolean loop = false;
		int counter = 0;
		int max = Integer.MIN_VALUE;
		
		//loop for check arrey
		for (int i = 0 ; i < (enter_1.length()-1) ; i++) {
				for (int j = 0 ; j < (enter_2.length()-1) ; j++) {
					
				if(enter_1.charAt(i) == enter_2.charAt(j)){
					counter++;
					i++;
					if(enter_1.charAt(i) != enter_2.charAt(j + 1)){
						loop = true;
					}
				}
			if (loop == true) {
				break;
			}
			}
			//max
			if(counter > max){
				max = counter;
			}
		}
	//output
	return (max+1);
	}
}