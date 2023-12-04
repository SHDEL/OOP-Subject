package Lab1;
public class Programmer extends Person{
    private String languages;

    Programmer(String name , int save, String lang){
        super(name, save);
        this.languages = lang;
    }

    void method2(){
        System.out.println("from programmer");
    }
    
    @Override
    public String toString() {
        return "Programmer [languages=" + languages + "]";
    }
    
    
}
