package Lec9;

public class Lab9_660019 {
    public static void main(String[] args) {
       ex1(); 
    }
    static void ex1(){
        Employee emp1 = new Employee("yindee");
        Employee emp2 = new Employee("yindee");
        int id1 = emp1.hashCode();
        int id2 = emp2.hashCode();
        String s1 = Integer.toHexString(id1);
        String s2 = Integer.toHexString(id2);
        System.out.println(s1);
        System.out.println(s2 + " " + s1.compareTo(s2));
    }
    static void ex2(){
        Employee emp1 = new Employee("preeda");
    }
}
