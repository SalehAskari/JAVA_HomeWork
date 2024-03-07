class question_6 {
	public static void main(String[] args) {
	
	//test
	int [] input = (metod(5));
	String result = "{";
	
	for (int i = 0 ; input[i] != 0 ; i++) {
		result += input[i];
		result += ",";
	}
		result += "}";
		System.out.println(result);
	}
	
	//func
	public static int [] metod(int enter){
		
		//arrey
		int j = 0;
		int counter = 1;
		int out [] = new int[500];
		int i = 1;
				// loop donbaleh
				for ( ; ; i++,j++) {
					out [j] = i;
					if (i == enter ) {
						break;
					}
					
					if (i == counter) {
						counter++;
						i = 0;
					}
		}
		//input
		return out;
	}
}