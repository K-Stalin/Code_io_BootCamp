package Week_4.com;

public class Book {
    String title,author;
    int price;

    Book(String author,String title,int price)
    {
        this.author = author;
        this.title = title;
        this.price = price;
    }
}

class TextBook extends  Book{
    int regulation;

    TextBook(int regulation,String title,String author,int price)
    {
        super(author,title,price);
        this.regulation = regulation;
    }

    void showDetails()
    {
        System.out.println("Title: "+ title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Regulation: "+regulation);
    }
}

class Magazine extends  Book{
    String categories;
    Magazine(String categories ,String title,String author,int price)
    {
        super(author,title,price);
        this.categories =categories;
    }

    void showDetails()
    {
        System.out.println("Title: "+ title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Categories: "+categories);
    }
}


class BookMain{
    public static void main(String[] args) {
        TextBook textBook = new TextBook(2021,"CIM","Nandha",567);
        textBook.showDetails();

        System.out.println("------------------------------------------------------------------");
        Magazine magazine = new Magazine("SPORTS","VOOLEY_FELLOW","SIMON",10000);
        magazine.showDetails();

    }
}