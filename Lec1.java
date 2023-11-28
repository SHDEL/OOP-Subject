public class Lec1 {
    public static void main(String[] args) {
        // demo1();
        demo3();
    }
    static void demo1(){
        Person p1 = new Person();
        p1.set_attributes("del", 100);
    }
    static void demo2(){
        Person [] arr = new Person[5];
        arr[0] = new Person();

    }
    static void demo3(){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.set_attributes("Del", 100);
        p2.set_attributes("Dem", 50);
        System.out.println(p1.isWeathier(p2));
    }
}
