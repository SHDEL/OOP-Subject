package Lab7;

abstract class Book extends Library{
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
        currentPageNumber = 0;
    }
    // public Book(String title, String author, String pub, int yr, int numPages){
    //     this.title = title;
    //     this.author = author;
    //     publisher = pub;
    //     year = yr;
    //     numberOfPages = numPages;
    // }
    public void turnPageForward(){
        this.currentPageNumber += 1;
    }
    public void turnPageBackward(){
        if(this.currentPageNumber == 0){
            System.out.println("can't turn page backward");
            System.out.println("Now at page: " + this.currentPageNumber);
        }
        else{
            this.currentPageNumber -= 1;
        }
    }
    public int nowAtPage(){
        return this.currentPageNumber;
    }
    public String getTitle(){
        return this.title;
    }
    
}
