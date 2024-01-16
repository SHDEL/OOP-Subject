package Lab7;

import java.util.HashMap;

public class Lab7 {
    public static void main(String[] args) {
        demo1();
    }
    static void demo1(){
        HashMap <Integer,Book> allBooks = new HashMap<>();
        allBooks.put(1,new LibraryBook(1,"Charlotte's Web","EB White","abc",1952,100,PrintType.PRINT));
        allBooks.put(2,new LibraryBook(2,"Charlotte's Web","EB White","abc",1952,100,PrintType.ECOPY));
        allBooks.put(3,new LibraryBook(3,"The BFG","Roald Dahl","abc",1982,300,PrintType.PRINT));
        allBooks.put(4,new LibraryBook(4,"The Little Prince","Antoine de Saint-Exupéry","abc",1943,200,PrintType.ECOPY));
        allBooks.put(5,new ArchiveMaterial(5,"My Mister","not KBS","abc",2018,400,Status.READY));
        allBooks.put(6,new ArchiveMaterial(6,"Sword Snow Stride","CNTV","abc",2018,500,Status.REPAIRED));
        for (Book b: allBooks.values()) {
            System.out.println(b);
        }
    }

}
