package Lec8;

interface CanSwim {
    abstract public void swim();
}
public class lec8 {
    public static void main(String[] args) {
        demo3();
    }
    static void demo3(){
        CanSwim obj3 = new CanSwim() {  //anonymous
            public void swim(){
                System.out.println("from obj3");
            }
        };
        obj3.swim();
    }
}
class C implements CanSwim {
    public void swim(){
        System.out.println("from class c");
    }
}
