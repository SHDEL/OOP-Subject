/**
 * Aquatic
 */
public class Aquatic {

    protected String skin;

    Aquatic(){
        
    }
    Aquatic(String s){
        skin = s;
    }
    void method1(){
        System.out.println("from Aquatic");
    }
    void setSkin(String s){

    }
    
}
class Talipia extends Aquatic {
    Talipia(String s){
        super(s);
    }
    void method1(){
        System.out.println("From Talipia");
    }
    void onlyTalipia(){
        System.out.println("yyy");
    }
}
class Parot extends Aquatic{
    Parot(String s){
        skin = s;
    }
}
interface canSwim{
    public void swim();
}