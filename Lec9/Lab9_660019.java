package Lec9;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Lab9_660019 {
    public static void main(String[] args) {
    //    ex1();
    //    ex2();
       ex3();
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
        System.out.println(emp1);
        ex2_1(emp1);
        System.out.println(emp1);
    }
    private static void ex2_1(Employee e){
        e.setName("aba abi abo abe");
    }
    static void ex3(){
        ArrayList<Employee> singers = new ArrayList<>();
        singers.add(new Employee("aba"));
        singers.add(new Employee("abi"));
        singers.add(new Employee("abo"));
        singers.add(new Employee("abe"));
        ex3_1(singers);
        System.out.println(singers.get(0));
        // cha cha cha
        System.out.println(singers);
    }
    private static void ex3_1(List<Employee> list){
        list.get(0).setName("cha cha cha");
        list = new ArrayList<>();
    }
    static void ex4(){
        ArrayList<Employee> singers = new ArrayList<>();
        singers = ex4_1();
        System.out.println(singers);
    }
    private static ArrayList<Employee> ex4_1(){
        
    }
}
