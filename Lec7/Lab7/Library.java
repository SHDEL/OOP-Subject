package Lab7;
import java.time.LocalDate;
import java.util.HashMap;

public class Library{
    private HashMap<Integer, Book> allbooks;

    public void printAllitems(){

    }
    public Book getBookById(int id){
       return allBooks.get(id);
    }
    public boolean checkOut(Book item, int yy, int mm, int dd){
        if (item instanceof LibraryBook){
            LibraryBook book = (LibraryBook) item;
            boolean result = book.checkoutitem(yy, mm, dd);
            return result;
        }
        else{
            return false;
        }

    }
    public void checkIn(Book item, int yy, int  mm, int dd){
        if (item instanceof LibraryBook){
            LibraryBook book = (LibraryBook) item;
            int days = book.returnitem(yy, mm, dd);
            if (days == 0){
                System.out.println("The item has not been check out");
            }
            else if (days <= 7){
                System.out.println("see you next time");
            }
            else{
                System.out.println("Pay fine for " + (days - 7) + " days");
            }
        }
    }
    static HashMap<Integer, Book> allBooks = new HashMap<>();
    static{
        allBooks.put(1,new LibraryBook(1,"Charlotte's Web","EB White","abc",1952,100,PrintType.PRINT));
        allBooks.put(2,new LibraryBook(2,"Charlotte's Web","EB White","abc",1952,100,PrintType.ECOPY));
        allBooks.put(3,new LibraryBook(3,"The BFG","Roald Dahl","abc",1982,300,PrintType.PRINT));
        allBooks.put(4,new LibraryBook(4,"The Little Prince","Antoine de Saint-Exupéry","abc",1943,200,PrintType.ECOPY));
        allBooks.put(5,new ArchiveMaterial(5,"My Mister","not KBS","abc",2018,400,Status.READY));
        allBooks.put(6,new ArchiveMaterial(6,"Sword Snow Stride","CNTV","abc",2018,500,Status.REPAIRED));
    }
}
