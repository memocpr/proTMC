public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String bAutor, String bName, int bPage){
        this.author=bAutor;
        this.name=bName;
        this.pages=bPage;
    }

    public String getAuthor(){
        return author;
    }

    public String getName(){
        return name;
    }
    public int getPages(){
        return pages;
    }

    public String toString(){
        return author+", "+name+", "+pages+" pages";
    }
}
