package Lec4;

public abstract class Emp {
    String name;
    String getName(){
        return name;
    }
    abstract void vacation();
 
}

class Programmer extends Emp{
    void vacation(){
        System.out.println("bye bye kmitl");
    }
    
}
