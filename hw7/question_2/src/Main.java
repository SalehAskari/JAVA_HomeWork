import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Address address = new Address("Hafez" , "Esfahan" , "Sadi" , 2345678765L);
        CreditCard creditCard = new CreditCard(51000);
        Customer customer = new Customer(25 , "Saleh" , "1234as" , creditCard ,address );
        Customer customer1 = new Customer(24 , "Hadi" , "1234as" , creditCard ,address );
        java.util.Date  date = new Date();
        MyBook myBook = new MyBook("Math" ,date ,100,"is good",1800 );
        MyBook myBook1 = new MyBook("Math" ,date ,100,"is good",700 );
        MyBook myBook2 = new MyBook("Java" ,date ,100,"is good",700 );
        MyBook myBook3 = new MyBook("Java" ,date ,100,"is good",700 );
        MyBook myBook4 = new MyBook("Math" ,date ,100,"is good",700 );
        MyBook myBook5 = new MyBook("Java" ,date ,100,"is good",700 );

        MyStore myStore = new MyStore();
        myStore.importBooks(myBook , 1800);
        myStore.importBooks(myBook1 , 700);
        myStore.importBooks(myBook2 , 700);
        myStore.importBooks(myBook3 , 700);
        myStore.importBooks(myBook4 , 700);
        myStore.importBooks(myBook5 , 700);
        myStore.register(customer);
        myStore.register(customer1);
        myStore.remove(customer1);
        Customer test = new Customer(myStore.getCustomer(25));
//        System.out.println(test.toString());
//        System.out.println(myStore.buy(customer , myBook ,1800));
        System.out.println(myStore.getnumberOfBook("Java"));




    }
}