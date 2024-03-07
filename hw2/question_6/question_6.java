class Untitled {
	public static void main(String[] args) {
		
		//test
		System.out.println(invers_AB("sdaxbyyacs"));
	}
	
	//func
	public static String invers_AB(String enter){
		
		//arrey
		int temp_a = 0;
		int temp_b = 0;
		String result = "";
		boolean length = false;
		
		//check arrey
		for (int i = 0 ; i < enter.length() ; i++) {
			if (enter.charAt(i) == 'a'){
				temp_a = i;
			}
			if (enter.charAt(i) == 'b') {
				temp_b = i;
				
				//axxb
				if (((temp_a - temp_b) == 3) || ((temp_a - temp_b) == -3)){
					length = true;
					
					//reading output
					for (int j = 0 ; j < enter.length() ; j++) {
						if (enter.charAt(j) == 'a'){
							result += "b";
					}
						else if (enter.charAt(j) == 'b'){
							result += "a";
				}
				else {
					result += enter.charAt(j);
				}
			}
		}
	}
		}
		//output if axxb
		if(length == true){
			return result;
		}
		//output if ax...xb
		else {
			return enter;
		}
	}
}