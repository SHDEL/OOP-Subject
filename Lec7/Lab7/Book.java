package Lab7;

abstract class Book {
    protected String isbn;
    protected String title;
    protected String author;
    protected String publisher;
    protected int year;
    protected int numberOfPages;
    private int currentPageNumber;

    public Book(){

    }
    public Book(String isbn, String title, String author, String pub, int yr, int numPages){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        publisher = pub;
        year = yr;
        numberOfPages = numPages;
    }
    public void turnPageForward(){

    }
    public void turnPageBackward(){

    }
    public int nowAtPage(){

    }
    public String getTitle(){
        return this.title;
    }
    
}
