package Lec4;
public interface Dothese {
    void fingerScanIn();
    public void fingerScanOut();
    public default void test(){
        System.out.println("test");
    }
    
  
}
class Sales implements Dothese{
    String name;
    public void fingerScanIn(){
        System.out.println("Welcome " + name);
    }
    public void fingerScanOut(){
        System.out.println("have a good evening");
    }
}
class Accountant extends Emp implements Dothese{
    void vacation() {
        System.out.println("from accountant vacation");
    }
    public void fingerScanIn(){
        System.out.println(name + " arrives");
    }
    public void fingerScanOut(){
        System.out.println("going home happily");
    }
}