public class lec7 {
    public static void main(String[] args) {
        // demo1();
        demo2();
        // demo3();
    }
    static void demo1(){
        Talipia t1 = new Talipia("abc");
        Parot P1 = new Parot("def");
    }
    static void demo2(){
        Aquatic a1 = new Talipia("smooth");
        Talipia t1 = new Talipia("smooth");

        a1.method1(); // From Talipia
        
        t1.onlyTalipia(); 
        ((Talipia)a1).onlyTalipia();
        //downcasting
    }
    static void demo3(){
        canSwim nemo = new canSwim() {
            public void swim(){
                System.out.println("from clown fish");
            }
        };
        nemo.swim();
        canSwim seaHorse = () -> {System.out.println("sea horse");};
        seaHorse.swim();

    }
}
