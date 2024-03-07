class IllegalStateException extends Exception{
	private  int select;
	
	IllegalStateException(){
		super("Error");
		select = -1;
	}
	IllegalStateException(int enter){
		enter = select;
	}
	IllegalStateException(IllegalStateException enter){
		this.select = enter.select;
	}
	
	public String getMessage(){
		if (select == 0) {
			return "No max";
		}
		else if (select == 1) {
			return "No min";
		}
		return "Error";
	}
}