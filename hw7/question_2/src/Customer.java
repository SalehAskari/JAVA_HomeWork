class Customer {
	int id;
	String name;
	String pasword;
	Address address;
	CreditCard creditCard;

	Customer(){
		id = 0;
		name = "";
		pasword = "";
		address = new Address();
		creditCard = new CreditCard();
	}

	Customer (int id , String name , String pasword , CreditCard creditCard , Address address ){
		this.id = id;
		this.name = name;
		this.pasword = pasword;
		this.creditCard = new CreditCard(creditCard);
		this.address = new Address(address);
	}

	Customer(Customer enter){
		id = enter.id;
		name = enter.name;
		pasword = enter.pasword;
		creditCard = new CreditCard(enter.creditCard);
		address = new Address(enter.address);
	}

	public String toString(){
		return "Id : " + id + "\nName : " + name + "\nPasword : " + pasword + "\nCreditCard\n" + creditCard.toString() + "\nAddress\n" + address.toString() ;
	}

	public boolean equals(Object obj){
		if (obj != null) {
			if (obj.getClass() == this.getClass()) {
				Customer enter = (Customer)obj;
				return ((id == enter.id) && (name == enter.name) && (pasword == enter.pasword) && (creditCard.equals(enter.creditCard)) && (address.equals(enter.address)));
			}
		}
		return false;
	}

	public int getId(){
		return id;
	}
	public CreditCard getCreditCard(){
		return this.creditCard;
	}


}
