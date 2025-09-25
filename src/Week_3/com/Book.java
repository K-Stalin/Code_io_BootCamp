package Week_3.com;

public class Book {
    String title ;
    String author;
    int price;
    Book()
    {
      this.title= "Cracking Coding Interview";
      this.author = "Benito";
      this.price  = 490;
    }
    Book(String author,String title,int price)
    {
        this.author = author;
        this.title = title;
        this.price = price;
    }
    void  printBookDetials()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
