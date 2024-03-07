public class NotEnoughMoney extends Exception{


    NotEnoughMoney(){
        super("Error");

    }
    public String getMessage(){
        return "NotEnoughMoney";
    }
}
