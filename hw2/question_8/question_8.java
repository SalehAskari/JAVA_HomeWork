import java.util.Arrays;
import java.util.Scanner;

public class question_9{
    public static void main(String[]atgs)
    {
        System.out.print("String_1 : ");
        Scanner in = new Scanner(System.in);
        String number1 =  in.nextLine();
        System.out.print("String_2 : ");
        String number2 = in.nextLine();
        System.out.println(metod(number1,number2));
        // در تابع اصلی دو رشته میگیریم و تابع متود را صدا میزنیم و دو رشته را بهش میدیم
    }
    public static String metod(String n1,String n2)
    {

        String N1 = new String();
        String N2 = new String();
        char temp1;
        
        // دو تا رشته جدید میسازیم برای اینکه دو رشته اول رو چک کنیم که حروف تکراری نداشته باشند و در این دو رشته قرار دهیم

        for(int counter = 0 ; counter < n1.length() ; ++counter)
        {
             temp1 = n1.charAt(counter);
            if (N1.indexOf(temp1) < 0)
            {
                N1 += temp1;
            }
        }
        
        // ی کاراکتر موقت درست میکنم در حلقه برای چک کردن تکراری نبودن حروف رشته و ان را برابر با کانتر حلقه میذارم
        // شرطمون اینه که اگه تکراری نداشت اونو =+کن با رشته ی خالی اولی ک تعریف کرده بودیم

        for(int counter2 = 0 ; counter2 < n2.length() ; ++counter2)
        {
            char temp2 = n2.charAt(counter2);

            if(N2.indexOf(temp2) < 0)
            {
                N2 += temp2;
            }
        }

          // ی کاراکتر موقت درست میکنم در حلقه برای چک کردن تکراری نبودن حروف رشته و ان را برابر با کانتر حلقه میذارم
        // شرطمون اینه که اگه تکراری نداشت اونو =+کن با رشته ی خالی دومی ک تعریف کرده بودیم

        String end = new String();

        // ی رشته قرار میدیم برای جواب اخر


        for(int i = 0 ; i < N1.length() ; ++i)
        {
            for(int y = 0 ; y < N2.length() ; ++y)
            {
             end += "" + N1.charAt(i) + N2.charAt(y) + " ";
            }
        }
        // حالا دو تا حلقه میذاریم که کارش اینه حرف اول رشته اول رو بگیره و با تمام حروف رشته دوم چاپشون کنه و ادامه بده 
        // قرارشون میدیم در رشته اخری
        
        return end;
    }
}
