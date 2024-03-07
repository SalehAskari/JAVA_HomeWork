import java.util.Scanner;
public class question_2{
    
    public static void main(String[]args){
        
        //for enter
        Scanner input = new Scanner(System.in);
        System.out.print("enter your height (m): ");
        float ghad = input.nextFloat();
        System.out.print("enter your weight (kg) : ");
        float wazn = input.nextFloat();

        // mohasebe BMI
        float akhar = wazn / (ghad*ghad);
        
        //output BMI
        System.out.println("BMI : " + akhar);



        // check body by BMI
        if (akhar < 15)
        {
            System.out.println("--------------------------------");
            System.out.println("| laghari shadid va khatarnak |");
            System.out.println("--------------------------------");
        }

        else if ((akhar < 16) && (akhar > 15))
        {
            System.out.println("------------------");
            System.out.println("| laghari shadid |");
            System.out.println("------------------");
        }

        else if ((akhar < 18.5) && (akhar > 16))
        {
            System.out.println("----------");
            System.out.println("| laghar |");
            System.out.println("----------");
        }

        else if((akhar > 18.5) && ( akhar < 25))
        {
            System.out.println("----------");
            System.out.println("| tabiee |");
            System.out.println("----------");
        }

        else if((akhar < 30) && (akhar > 25))
        {
            System.out.println("--------------");
            System.out.println("| ezafe wazn |");
            System.out.println("--------------");
        }

        else if((akhar > 30) && (akhar < 35))
        {
            System.out.println("---------");
            System.out.println("| chagh |");
            System.out.println("---------");

        }

        else if((akhar < 40) && (akhar > 35))
        {
            System.out.println("-----------------");
            System.out.println("| chaghi shadid |");
            System.out.println("-----------------");
        }

        else if(akhar > 40)
        {
            System.out.println("------------------------------");
            System.out.println("| chaghi shadid wa khatarnak |");
            System.out.println("------------------------------");

        }

    }
}