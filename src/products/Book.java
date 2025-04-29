package products;


public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
    private static int idCounterBook = 1001;

    public Book(String author, String publication, String genre, String title, Double price){
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    //methods
    @Override
    protected String generateId(){
        return String.format("%04d", idCounterBook++);
    }

    //setter & getter
    public String getPublication(){
        return publication;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public void setPublication(String publication){
        this.publication = publication;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public String toString(){
        return super.toString() + " " + "Author: "  + author + " Genre: " + genre + " Publication: " + publication ;

    }

}
