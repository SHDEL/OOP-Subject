package Lab7;

import java.time.LocalDate;

public class LibraryBook extends Book{
    private int id;
    private boolean availForBorrow = true;
    private LocalDate dateBorrow;
    private PrintType type;

    LibraryBook(int id, String title, String author, String pub, int yr, int numPages, PrintType type){
        super(String.valueOf(id),title, author, pub, yr, numPages);
        this.id = id;
        this.type = type;

    }
    // public LibraryBook(int i, String string, String string2, String string3, int j, int k, PrintType print) {
    // }
    public void setBookAvailableFalse(){

    }
    public void setBookAvailableTrue(){

    }
    @Override
    public String toString() {
        return "LibraryBook [id=" + id + ", title=" + getTitle() + " type=" + type + ", avail=" + availForBorrow + "]";
    }
    // public boolean isAvailable(){
    
    // }
    
}

