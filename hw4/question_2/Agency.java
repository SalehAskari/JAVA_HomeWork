import java.util.*;

class Agency {
	private Person agency_manager;
	private long phone_number;
	private String address;
	private int number_of_car;
	private Car car[];
	
	public Agency(){
		agency_manager = new Person();
		phone_number = 0;
		address = "";
		number_of_car = 0;
		car = new Car[0];
	}
	public Agency(Person agency_manager , long phone_number , String address , int number_of_car , Car car[]){
		
		this.agency_manager = new Person(agency_manager);
		
		this.phone_number = phone_number;
		this.address = address;
		this.number_of_car = number_of_car;
		this.car = new Car[car.length];
		for (int i = 0 ; i < car.length ; i++) {
			this.car[i] = new Car(car[i]);
		}
	}
	public Agency(Agency enter){
		
		agency_manager = new Person(enter.agency_manager);
		
		phone_number = enter.phone_number;
		address = enter.address;
		number_of_car = enter.number_of_car;
		car = new Car[enter.car.length];
		for (int i = 0 ; i < enter.car.length ; i++) {
			this.car[i] = new Car(enter.car[i]);
		}
	}
	
	//func
	
	public void addCar(Car enter){
		Car temp [] = new Car[car.length + 1];
		for (int i = 0 ; i < car.length ; i++) {
			temp[i] = new Car(car[i]);
		}
		temp[temp.length-1] = enter;
		car = Arrays.copyOf(temp , temp.length);
		
	}
	public void removeCar(Car enter){
		Car temp[] = new Car[car.length - 1];
		int conter = 0;
		for (int i = 0 ; i < car.length ; i++) {
			//System.out.println((car[i].equals(enter)));
			//System.out.println(enter.toString());
			//System.out.println(car[i].toString());
			if (!(car[i].equals(enter))){
				temp [conter] = car[i];
				conter++;
			}
		}
		car = Arrays.copyOf(temp , temp.length);
	}
	
	// toString && equals
	
	public String toString(){
		String out ="";
		
		out += "*Agency Manager";
		out += agency_manager.toString();
	
		out += "*Agency Information" + "\nPhone Number : " + phone_number + "\nAddress : " + address + "\nNumber Of Car : " + number_of_car + "\n";
		for (int i = 0 ; i < car.length ; i++) {
			out += "*Car";
			out += car[i].toString();
		}
		return out;
	}
	public boolean equals(Object enter){
		if (enter != null) {
			if (this.getClass() == enter.getClass()) {
				
				Agency e = (Agency)enter;
					if (!(agency_manager.equals(e.agency_manager))) {
						return false;
					}
				for (int i = 0 ; i < e.car.length ; i++) {
					if(!(car[i].equals(e.car[i]))){
						return false;
					}
				}
				return (phone_number == e.phone_number) && (address == e.address) && (number_of_car == e.number_of_car);
			}
		}
		return false;
	}
	
	// geters && seters
	
	public long getPhone_number(){
		return this.phone_number;
	}
	public String getAddress(){
		return this.address;
	}
	public int getNumber_of_car(){
		return this.number_of_car;
	}
	
	
	
	public void setPhone_number(long phone_number){
		this.phone_number = phone_number;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setNumber_of_car(int number_of_car){
		this.number_of_car = number_of_car;
	}
}