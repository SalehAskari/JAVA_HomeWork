import javax.xml.crypto.*;

class MyBook implements Book{

  private String title;
  private java.util.Date  date;
  private int  edition;
  private String description;
  private float price;
  
  MyBook(){
    title = "";
    date = new java.util.Date();
    edition = 0;
    description = "";
    price = 0;
    
  }
  MyBook (String title, java.util.Date  date, int edition, String desc, float price  ) {
     // a constructor to create a new MyBook.
      this.title = title;
      this.date = date;
      this.edition = edition;
      this.description = desc;
      this.price = price;
  }
  MyBook(MyBook enter){
    this.title = enter.title;
    this.date = enter.date;
    this.edition = enter.edition;
    this.description = enter.description;
    this.price = enter.price;
    
    
    
  }
  public String toString(){
    return "Title : " + title + "\nDate : " + date.toString() + "\nEdition : " + edition + "\nDescription : " + description + "\nPrice : " + price;
  }
  
  // get the title of this book.
    public String getTitle(){
      
      return this.title;
    }
  
    // get the date of publishing this book.
    public java.util.Date  getDate(){
      
      return this.date;
    }
  
    // get the edition of this book.
    public int getEdition(){
      
      return this.edition;
    }
  
    // get the brief description of this book.
    public String getDescription(){
      
      return this.description;
    }
  
    // get the price of this book.
    public float getPrice(){
      
      return this.price;
    }
  

}
