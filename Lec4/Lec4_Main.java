package Lec4;

public class Lec4_Main {
    public static void main(String[] args) {
        // dem01();
        // demo2();
        demo3();
    }
    static void dem01(){
        // Emp e1 = new Emp();
        Programmer p1 = new Programmer();
        p1.name = "haha";
        System.out.println(p1.getName());
        p1.vacation();
    }
    static void demo2(){
        Sales s1 = new Sales();
        s1.name = "haha";
        s1.fingerScanIn();
        s1.fingerScanOut();
        s1.test();
    }
    static void demo3(){
        Accountant a1 = new Accountant();
        a1.name = "haha";
        a1.vacation();
        a1.fingerScanIn();
        a1.fingerScanOut();
    }
}
