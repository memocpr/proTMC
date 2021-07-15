public class Book implements Packable {

    private String authorName;
    private String bookName;
    private double bookWeight;

    public Book(String author, String name, double weight){
        this.authorName=author;
        this.bookName=name;
        this.bookWeight=weight;

    }

    @Override
    public double weight() {
        return bookWeight;
    }

    @Override
    public String toString() {
        return authorName +": " + bookName;
    }
}
