import java.util.Scanner;
import java.util.*;

public class question_3 {
    public static void main(String[] args){
        
        //test
        
        //arrey
        int counter;
        
        //input lenght arrey
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter in array 1 , 2 ? ");
        counter = input.nextInt();
        char arey_1 [] = new char[counter];
        char arey_2 [] = new char[counter];
        
        //input number arrey1
        for (int i = 0 ; i < counter ; i++){
            System.out.print("enter : ");
            arey_1[i] = input.next().charAt(0);
        }

        //input number arrey2
        System.out.println("array 2 :");
        for (int i = 0 ; i < counter ; i++){
            System.out.print("enter : ");
            arey_2 [i] = input.next().charAt(0);
        }
        
        //test func and output result
        boolean out = eq(arey_1 , arey_2 ,counter);
        System.out.println(out);
        




    }
    
    //fucc
    public static boolean eq (char arrey1 [],char arrey2 [] , int counter){
        
        //arrey
        int count = 0;
        String enter_1 = new String();
        String enter_2 = new String();
        
        //hazf anasor tekrari der arrey1
        for (int i = 0 ; i < counter ; i++ ){
            if(enter_1.indexOf(arrey1[i]) < 0){
                
                enter_1 += arrey1[i];
            }
        }
        //hazf anasor tekrari der arrey2
        for (int i = 0 ; i < counter ; i++ ){
            if(enter_2.indexOf(arrey2[i]) < 0){
                
                enter_2 += arrey2[i];
            }
        }
        
        if(enter_1.length() != enter_2.length()){
            return false;
        }
        
        //for moghayese
        for (int j = 0 ; j < enter_1.length() ; j++) {
        
        for (int i = 0 ; i < enter_1.length() ; i++) {
                        
            //if for equal arrey
            if ((enter_1.charAt(j) == enter_1.charAt(i))){
            count++;
            }
        }}
        //if for output equal
        if (enter_1.length() == count) {
            return true;
        }
        //else for output not equal
        else {
            return false;
        }
    }
}
