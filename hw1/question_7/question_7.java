
import java.util.Scanner;

public class question_7{
    public static void main(String[]args)
    {
        System.out.print("how many number you want to enter? : ");
        Scanner in = new Scanner (System.in);
        int size = in.nextInt();

        // برای گرفتن یک ارایه عددی ابتدا سایزش رو از کاربر میگیریم


        int arraye [] = new int [200];

        // یک ارایه خالی فعلا درست میکنیم به اسم ارایه

        for( int counter2 = 0 ; counter2<size ; ++counter2)
        {
            System.out.print("enter number : ");
            int begir = in.nextInt();
            arraye[counter2]=begir;
        }

        // ی حلقه ساختیم برای اینکه بیاد و به اندازه ی اون سایزی که از کاربر گرفتیم عدد بگیره و بذاره در ارایه


        boolean awnser = metod(arraye , size);
        System.out.println(awnser);

        // برای اینکه درست و غلط رو در اخر چاپ کنیم یک متغیر از نوع بولین درست میکنیم
        // و تابع رو صدا میزنیم و سایزی که از کاربر گرفتیم رو همراه با ارایه به تابع میدیم
    }
        public static boolean metod (int[]x , int sizee)
        {
           boolean awnser = false;
           boolean shart1 = false;
           boolean shart2 = false;

        //    برای اینکه دو شرط 2&&2 و 4&&4 رو بررسی کنیم و در اخر هم این دو شرط رو باهم بررسی کنیم نیاز با سه تا متغیر از نوع بولین داریم
           
           for(int counter=0;counter<=sizee;++counter)
           {
                if(x[counter]==2)
                {
                    if(x[counter+1]==2)
                    {
                      shart1 = true;
                    }
                }
            }

            // در حلقه ی بالا 2&&2 رو بررسی کردیم که اگه درست بود شرط یک رو درست کنه برامون

            for(int counter1=0;counter1<=sizee;++counter1)
            {
                 if(x[counter1]==4)
                 {
                     if(x[counter1+1]==4)
                     {
                       shart2 = true;
                     }
                 }
             }
            //  در حلقه ی بالا 4&&4 رو بررسی کردیم که اگه درست بود شرط دو رو درست کنه برامون
            
          
      

            if((shart1==true)&&(shart2==false))
            {
                awnser = true;
            }
            if((shart2==true)&&(shart1==false))
            {
                awnser = true;
            }

            // شرط جواب در حالت پیش فرض نادرست است
            // زمانی شرط اخر ما درست است که شرط یک درست و شرط دو غلط باشد
            // و زمانی که شرط دو درست و شرط یک غلط باشد شرط اخر درست است

            // و در اخر هم شرط جواب رو برمیگردانیم به تابع اصلی

            return awnser;
        }
    
}
