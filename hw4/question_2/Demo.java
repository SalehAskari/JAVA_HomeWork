import java.math.*;
import javax.sound.sampled.*;

class Demo {
	public static void main(String[] args) {
	Person person[] = new Person[9];
	person[0] = new Person("Saleh" , 1190334992 , true , 20 , 1234567891);
	person[1] = new Person("Samrand" , 2880409675L , true , 21 , 1987654321);
	person[2] = new Person("Sara" , 3514105538L , false , 18 , 4561239871L);
	person[3] = new Person("Meysam" , 4361211104L , true , 22 , 8945120981L);
	person[4] = new Person("Alireza" , 9111234563L , true , 20 , 7682346573L);
	person[5] = new Person("Nazanin" , 1234567891 , false , 25 , 1987654321L);
	person[6] = new Person("Fatima" , 7649739246L , false , 30 , 7465392645L);
	person[7] = new Person("Hadi" , 6473892109L , true , 20 , 3640986765L);
	person[8] = new Person("Atena" , 4256723021L , false , 20 , 7563904236L);
	Car car_1[] = new Car[3];
	Car car_2[] = new Car[4];
	car_1[0] = new Car("Peugeot ELX" , 1397 , 5 , person[3]);
	car_1[1] = new Car("Dena+" , 1400 , 5 , person[6]);
	car_1[2] = new Car("Chevrolet Tahoe" , 2014 , 5 , person[4]);
	car_2[0] = new Car("Peugeot 206" , 1395 , 5 , person[2]);
	car_2[1] = new Car("Genesis" , 2016 , 2 , person[8]);
	car_2[2] = new Car("Ferrari" , 2020 , 2 , person[5]);
	car_2[3] = new Car("Lotus Elise" , 2023 , 2 , person[1]);
	Agency agency[] = new Agency[2];
	agency[0] = new Agency(person[0] , 9909944001L , "Esfahan" , 10 ,car_1 );
	agency[1] = new Agency(person[7] ,9923779022L , "Ghom" , 10 , car_2 );
	System.out.println(agency[1].toString());
	System.out.println(agency[0].equals(agency[1]));
	//System.out.println(car_1[0].toString());
	Agency test_1 = new Agency(agency[1]);
	System.out.println(agency[1].equals(test_1));
		
	}
}