package Lab7;

public class ArchiveMaterial extends Book{
    private int id;
    private Status type;

    ArchiveMaterial(int i, String title, String author, String publisher,int yr, int numPages, Status type ){
        super(String.valueOf(i), title, author, publisher, yr, numPages);
        this.id = i;
        this.type= type;
    }

    @Override
    public String toString() {
        return "ArchiveMaterial [id=" + id + ", title=" + getTitle() + ", status=" + this.type + " message= " + type.sayHi() + "]";
    }
    

}
