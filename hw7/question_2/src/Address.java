
class Address {
	// khiaban
	private  String avenue;
	private  String city;
	private  String state;
	private  long postalCode;
	
	Address(){
		avenue = "";
		city = "";
		state = "";
		postalCode = 0;
	}
	Address(String state , String city , String avenue , long postalCode){
		this.state = state;
		this.city = city;
		this.avenue = avenue;
		this.postalCode = postalCode;
	}
	Address(Address enter){
		this.state = enter.state;
		this.city = enter.city;
		this.avenue = enter.avenue;
		this.postalCode = enter.postalCode;
	}
	
	public String toString(){
		return "State : " + state + "\nCity : " + city + "\nAvenue" + avenue + "\nPostal Code : " + postalCode;
}
	public boolean equals(Object obj){
		if (obj != null) {
			if (this.getClass() == obj.getClass()) {
				Address enter = (Address)obj;
				return ((state == enter.state) && (city == enter.city) && (avenue == enter.avenue) && postalCode == enter.postalCode);
			}
		}
		return false;
	}
}