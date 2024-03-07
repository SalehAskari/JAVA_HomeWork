interface BookStore extends Store {

   // invoke this method when a customer tries to buy books.
   public boolean buy(Customer customer, Book book, int amount) throws Exception;

   // The BookStore tries to get more books by this methods.
   public void importBooks(Book book, int amount);
}
