class CreditCard {
	private int mony;
	
	CreditCard(){
		mony = 0;
	}
	CreditCard(int mony)throws Exception{
		if (mony >= 500000) {
			throw new Exception("The money limit is 500,000");
		}
		this.mony = mony;
	}
	CreditCard(CreditCard enter){
		mony = enter.mony;
	}
	public String toString(){
		return "Mony : " + mony;
	}
	public boolean equals(Object obj){
		if (obj != null) {
			if (this.getClass() == obj.getClass()) {
				CreditCard enter = (CreditCard)obj;
				return (mony == enter.mony);
			}
		}
		return false;
	}
	public int getMony(){
		return this.mony;
	}
	
	
}