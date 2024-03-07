interface Store {
   public void register(Customer customer);
   public void remove(Customer customer);
   public Customer getCustomer(int id);
}
