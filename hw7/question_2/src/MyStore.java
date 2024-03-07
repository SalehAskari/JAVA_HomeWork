import java.util.*;

class MyStore implements BookStore {
  private Customer [] customers;
  private MyBook [] books;
  //how many books are available for each title 
  private int [] numberOfBook;
  MyStore(){
    customers = new Customer[0];
    books = new MyBook[0];
   numberOfBook = new int[0];
      }
  // invoke this method when a customer tries to buy books.
  public boolean buy(Customer customer, Book book, int amount) throws Exception {
    int status = 0;
    for (MyBook bookclass : books) {
      if (bookclass.getTitle().equals(book.getTitle())){
          status = -1;
          break;
      }

    }
    if (status == 0){
      throw new NotEnoughBook();

    }
    status = 2;
    for (Customer c : customers){
      if (c.getId() == customer.getId()){
        status = -1;
        break;
      }
    }
    if (status == 2){
      throw  new Exception("This customer is not find in store");
    }
      if (customer.getCreditCard().getMony() < amount){
        status = 1;
      }

    if (status == 1) {
      throw new NotEnoughMoney();
    }

    return true;
  }
  // The BookStore tries to get more books by this methods.
  public void importBooks(Book book, int amount){
    int cunt = 1;
    String title [] = new String[1];
    String temp2 [] = new String[books.length + 1];
    int temp1 [] = new  int [numberOfBook.length + 1 ];


    MyBook temp [] = new MyBook[books.length + 1];
    for (int i = 0 ; i < books.length ; i++) {
      temp[i] = new MyBook(books[i]);
    }
    temp[temp.length-1] = new MyBook(book.getTitle() , book.getDate() , book.getEdition() , book.getDescription() , amount);
    books = Arrays.copyOf(temp , temp.length);

    for (int i = 0 ; i < books.length ; i++){
      if ((temp2[i] == null) || (temp2[i].indexOf(books[i].getTitle()) <= 0)){
        temp2[cunt-1] = books[i].getTitle();
        cunt++;
      }
    }
    title = Arrays.copyOf(temp2 , cunt);
    for (int i = 0 ; i < title.length ; i++ ){
      for (int j = 0 ; j < books.length ; j++){
        if (title[i] == books[j].getTitle() ){
          temp1[i]++;
        }
      }
    }
    numberOfBook = Arrays.copyOf(temp1 , temp1.length);
    
  }
  
  public void register(Customer customer){

      Customer temp[] = new Customer[customers.length + 1];
      for (int i = 0; i < customers.length; i++) {
        temp[i] = new Customer(customers[i]);
      }
      temp[temp.length - 1] = new Customer(customer);
      customers = Arrays.copyOf(temp, temp.length);

    
    
    
  }
  public void remove(Customer customer){
    if (customers.length == 1){

      customers[0] = new Customer();
    }
    else {
      Customer temp[] = new Customer[customers.length - 1];
      int conter = 0;
      for (int i = 0; i < customers.length; i++) {
        if (customer.getId() != customers[i].getId()) {
          temp[conter] = customers[i];
          conter++;
        }
      }
      customers = Arrays.copyOf(temp, temp.length);
    }
  }
  public Customer getCustomer(int id){
    
    for (int i = 0 ; i < customers.length ; i++) {
      if (customers[i].getId() == id) {
        return customers[i];
      }
    }
    return null;
  }
  public int getnumberOfBook(String enter){
    int temp = -1;
    for(int i = 0 ; i < books.length ; i++){
      if (enter == books[i].getTitle()){
        temp = i;
        break;
      }
    }
    return numberOfBook[temp];
  }

}
