import javax.lang.model.element.*;

class Person {
	private String name;
	private long national_number;
	private boolean gender;
	private int age;
	private long drivers_license_number;
	//help variable
	private String gender_out;
	
	public Person(){
		name = "";
		national_number = 0;
		gender = false;
		age = 0;
		drivers_license_number = 0;
	}
	public Person(String name , long national_number , boolean gender , int age , long drivers_license_number){
		this.name = name;
		/*if (Math.log10(national_number) != 10) {
			System.out.println("Enter 10 digits");
			System.exit(0);
		}*/
			this.national_number = national_number;
			
		
		this.gender = gender;
		if (gender == true) {
			gender_out = "Male"; 
		}
		else {
			gender_out = "Famel";
		}
		this.age = age;
		/*if (Math.log10(drivers_license_number) != 10) {
			System.out.println("Enter 10 digits");
			System.exit(0);
		}*/
			this.drivers_license_number = drivers_license_number;
	}
	public Person(Person enter){
		name = enter.name;
		national_number = enter.national_number;
		gender = enter.gender;
		if (enter.gender == true) {
			gender_out = "Male"; 
		}
		else {
			gender_out = "Famel";
		}
		
		age = enter.age;
		drivers_license_number = enter.drivers_license_number;
		
	}
	// toString && equals
	
	public String toString(){
		String out = "\nName : " + name + "\nNational Number : " + national_number + "\nGender : " + gender_out + "\nAge : " + age + "\nDrivers License Number : " + drivers_license_number + "\n";
		
		return out;
	}
	
	public boolean equals(Object enter){
		if (enter != null) {
			if (this.getClass() == enter.getClass()) {
				Person e = (Person)enter;
		
				return (name == e.name) && (national_number == e.national_number) && (gender ==e.gender) && (age == e.age) && (drivers_license_number == e.drivers_license_number);
			}
		}
		
		return false;
	}
	// seters && geters
	
	public String getNAme(){
		return this.name;
	}
	public long getNational_number(){
		return this.national_number;
	}
	public boolean getGender(){
		return this.gender;
	}
	public int getAge(){
		return this.age;
	}
	public long getDrivers_license_number(){
		return this.drivers_license_number;
	}
	public void setNAme( String name){
		this.name = name;
	}
	
	public void setNational_number(long national_number){
		this.national_number = national_number;
	}
	
	public void setGender(boolean gender){
		this.gender = gender;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setDrivers_license_number(long drivers_license_number){
		this.drivers_license_number = drivers_license_number;
	}
}