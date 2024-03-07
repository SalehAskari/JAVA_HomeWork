class NotEnoughBook extends Exception {

	
	NotEnoughBook(){
		super("Error");

	}
	public String getMessage(){
		return "NotEnoughBook";
	}
}