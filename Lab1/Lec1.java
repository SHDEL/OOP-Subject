package Lab1;
public class Lec1 {
    public static void main(String[] args) {

        demo4();
    }
    
    static void demo3(){
        Person p1 = new Person("Del", 500);
        Person p2 = new Person("Dem", 100);
        
        System.out.println(p1.isWeathier(p2));
    }
    static void demo4(){
        Programmer prog1 = new Programmer("Del", 100, "Java");
        System.out.println(prog1);
        prog1.method2();

    }
}
