public class Book {

    private String title;
    private int pages;
    private int pubYear;

    public Book(String bookTitle, int bookPages, int bookPubYear){
        this.title=bookTitle;
        this.pages=bookPages;
        this.pubYear=bookPubYear;
    }

    public String toString(){
        return title+", "+pages+" pages, "+pubYear;
    }

    public String getName(){
        return title;
    }
}
