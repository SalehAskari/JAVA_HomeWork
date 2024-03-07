import java.util.stream.*;
import java.security.*;

class Car {
	private String name;
	private int year_create;
	private int number_of_sead;
	private Person driver;
	
	public Car(){
		name = "";
		year_create = 0;
		number_of_sead = 0;
		driver = new Person();
	}
	public Car(String name , int year_create , int number_of_sead , Person driver){
		this.name = name;
		this.year_create = year_create;
		this.number_of_sead = number_of_sead;
		this.driver = new Person(driver);
	}
	public Car(Car enter){
		name = enter.name;
		year_create = enter.year_create;
		number_of_sead = enter.number_of_sead;
		driver = new Person(enter.driver);
		
	}
	
	//toString && equals
	
	public String toString(){
		String out = "\nName : " + name + "\nYear Create : " + year_create + "\nNumber Of Sead : " + number_of_sead + "\n";
		
			out += "*Driver";
			out += driver.toString();
		
		return out;
	}
	public boolean equals(Object enter){
		if (enter != null) {
			if (this.getClass() == enter.getClass()) {
				Car e = (Car)enter;
					if(!(driver.equals(e.driver))){
						return false;
					}
				return (name == e.name) && (year_create == e.year_create) && (number_of_sead == e.number_of_sead);
			}
		}
		return false;
	}
	
	//geters && seters
	
	public String getName(){
		return this.name;
	}
	public int getYear_create(){
		return this.year_create;
	}
	public int getNumber_of_sead(){
		return this.number_of_sead;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setYear_create(int year_create){
		this.year_create = year_create;
	}
	public void setNumber_of_sead(int number_of_sead){
		this.number_of_sead = number_of_sead;
	}
	
}