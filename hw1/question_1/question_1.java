/*
question : 
فرض کنید که مجاورت را به صورت عناصر مجاور آرایه با مقدار یکسان تعریف کنیم. متدی به اسم countClumps(int[] a) بنویسید که یک آرایه را دریافت کند و تعداد مجاورتهای آنرا چاپ کند.
*/
import java.util.Scanner;

public class question_1 {
    public  static void main(String [] args){
        
// test
    int [] a = {1,1,1,1,1};
    System.out.println(countClumps(a,5));
    }
    
// func
    public static int countClumps(int [] enter , int a){
        
        // arreys
        int counter = 0;
        int temp = 999999999;
        
// loop for check arrey
        for (int j = 0 ; j < a ; j++ ){
            
            // if baraie in hast ke vaghti yek mojaver tamam shod shart vared shodan be if bad ra faraham misazad
            if (enter[j] != temp){
                temp = 999999999;
            }
            
            // if baraie in hast ke be ezaie har bar tekrar adad yek mojaver shemordeh shavad
            if(enter[j] != temp){
                
                // if baraye check kardan mojaver bodan
            if (enter[j] == enter[j+1]){
                counter++;
                temp = enter[j];
                
            }}
            
        }
            return counter;
    }
}
