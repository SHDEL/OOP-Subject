package Lab7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryBook extends Book implements BorrowAble{
    private int id;
    private boolean availForBorrow = true;
    private LocalDate dateBorrow;
    private PrintType type;
    

    LibraryBook(int id, String title, String author, String pub, int yr, int numPages, PrintType type){
        super(String.valueOf(id),title, author, pub, yr, numPages);
        this.id = id;
        this.type = type;
    }
    public void setBookAvailableFalse(){
        this.availForBorrow = false;
    }
    public void setBookAvailableTrue(){
        this.availForBorrow = true;
    }
    @Override
    public String toString() {
        checkoutitem(2024, 1, 10);
        returnitem(2024, 1, 16);
        return "LibraryBook [id=" + id + ", title=" + getTitle() + " type=" + type + ", avail=" + isAvailable() + "]";
    }
    public boolean isAvailable(){
        return this.availForBorrow;
    }
    public boolean checkoutitem(int yy, int mm, int dd){
        if (this.type == PrintType.PRINT && isAvailable() == true){
            dateBorrow = LocalDate.of(yy, mm, dd);
            this.availForBorrow = false;
            return true;
        }
        else{
            return false;
        }
    }
    public int returnitem(int yy, int mm, int dd){
        
        if (isAvailable() == false){
            LocalDate borrowDate = LocalDate.of(yy,mm,dd);
            long daysBetween = ChronoUnit.DAYS.between(dateBorrow, borrowDate);
            return (int)daysBetween;
        }
        else{
            return 0;
        }
    }
}

