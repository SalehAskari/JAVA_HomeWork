import java.util.stream.*;

class question_5 {
    public static void main(String[] args) {
        
        //test
        String test = "Ihello J10101110oe";
        System.out.println(binaryPart(test));
    }
    
    //func
    public static int binaryPart(String enter){
        
        //arrey
        boolean loop = false;
        int counter = 0;
        int k = 1;
        int single_number = 0;
        int number_int = 0;
        String number_string = new String();
        int max = Integer.MIN_VALUE;
        int out = 0;
        
        //discover 0 1
        for (int i = 0 ; i < enter.length() ; i++){
            loop = false;

            for (;(enter.charAt(i) == '1' || enter.charAt(i) == '0') && i <= enter.length()-1;i++){
                number_string += enter.charAt(i);
                loop = true;

                if(i == enter.length()-1){
                    break;
                }
            }
            if( loop == true ){
            
            //String -> int
            number_int = Integer.parseInt(number_string);
            
            //10 10
            for (int j = 0 ; j < number_string.length() ; j++){
                single_number = number_int % 10;
                number_int /= 10;
                out += single_number * k;
                k *= 2;
            }}
            
            //max
            if (out > max){
                max = out;
            }
            
            //arrey
            number_string = "";
            number_int = 0;
            k = 1;
            out = 0;
        }
        //output
        return max;
    }
}