import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;
// import javax.swing.text.html.HTMLDocument.Iterator;

public class Lab9_660019 {
    static Employee yindee = new Employee("yindee");
    static Employee pramote = new Employee("pramote");
    static Employee preeda = new Employee("preeda");
    static ArrayList<Employee> empList;
    static {
        empList = new ArrayList<>();
        try (Scanner input = new Scanner(Paths.get("Lec9\\packExercise\\names.csv"))){   
            input.nextLine(); // skip first row
            while (input.hasNext()) {
                String row = input.nextLine().trim();
                empList.add(new Employee(row));
            }
            System.out.println("There are " + empList.size() + " employees.");
        } 
        catch (IOException e) { e.printStackTrace(); }
    }
    public static void main(String[] args) {
        //    ex1();
        //    ex2();
        //    ex3();
        // ex4();
        // ex5();
        // q6();
        // q7();
        // q8();
        // q9();
        // q10();
        // q11();
        // q12();
        // q13();
        // q14();
        q15();
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
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("aba"));
        list.add(new Employee("abi"));
        return (ArrayList<Employee>) list;
    }
    static void ex5(){
        ArrayList<Employee> singers = new ArrayList<>();
        singers.add(new Employee("aba"));
        singers.add(new Employee("abi"));
        singers.add(new Employee("abo"));
        singers.add(new Employee("abe"));
        
        @SuppressWarnings("unchecked") // by clone
        List<Employee> tmp = (ArrayList<Employee>) singers.clone();
        tmp.get(0).setName("cha");
        System.out.println(singers);

        //by new ArrayList<>()
        tmp = new ArrayList<>(singers);
        tmp.get(1).setName("cha cha");
        System.out.println(singers);

        // by subList()
        tmp = singers.subList(0, singers.size() - 1);
        tmp.get(2).setName("cha cha cha");
        System.out.println(tmp);
    }
    static void q6(){
        List<Employee> singers1 = new ArrayList<Employee>(Arrays.asList(new Employee("aba"), new Employee("abi")));
        List<Employee> singers2 = new ArrayList<>();
        singers2.add(new Employee("abo"));
        singers2.add(new Employee("abe"));
        
        List<Employee> join = q6_1(singers1, singers2);

        System.out.println(singers1);
        System.out.println(singers2);
        System.out.println("from join: " + join);
        singers1.addAll(singers2);
        System.out.println(singers1);
    }
    private static List<Employee> q6_1(List<Employee> l1, List<Employee> l2){
        List<Employee> tmp = new ArrayList<>();
        tmp.addAll(l1);
        tmp.addAll(l2);
        return tmp;
    }
    static void q7(){
        List<Employee> singers = Arrays.asList(new Employee("aba"), new Employee("abi"));
        System.out.println(singers);
        singers = q7_1(singers);
        System.out.println(singers);
    }
    private static List<Employee> q7_1(List<Employee> list){
        List<Employee> tmp = new ArrayList<>();
        tmp = list.subList(0, 1);
        return tmp;
    }
    static void q8(){
        
        List<Employee> list1 = Arrays.asList(yindee,pramote);
        List<Employee> list2 = Arrays.asList(pramote,preeda);

        Set<Employee> empSet;
        // your task//
        empSet = new HashSet<>(list1);
        empSet.addAll(list2);
        List<Employee> q8_ans = new ArrayList<>(empSet);
        System.out.println(q8_ans);
    }
    static void q9(){
        Set<Employee> empSet1 = new HashSet<>(Arrays.asList(yindee,preeda,pramote));
        Set<Employee> empSet2 = new HashSet<>(Arrays.asList(yindee, pramote));
        
        empSet1.retainAll(empSet2);
        System.out.println(empSet1);
    }
    static void q10(){
        Set<Employee> empSet1 = new HashSet<>(Arrays.asList(yindee,preeda,pramote));
        Set<Employee> empSet2 = new HashSet<>(Arrays.asList(yindee, pramote));
        
        empSet1.removeAll(empSet2);
        System.out.println(empSet1);
    }
    static void q11(){
        Set<Employee> empSet = new HashSet<>(Arrays.asList(yindee, preeda, pramote, preeda));
        Employee[] q11_ans = new Employee[empSet.size()];
        empSet.toArray(q11_ans);
        for (Employee e : q11_ans){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    static void q12(){
        int n = 3;
        Map <String, Employee> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            String name = empList.get(i).getName();
            map.put(name, empList.get(i));
        }
        System.out.println(map);
    }
    static void q13(){
        int n = 3;
        Map <String, Employee> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            String name = empList.get(i).getName();
            map.put(name, empList.get(i));
        }
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
    }
    static void q14(){
        PriorityQueue<Employee> pq = new PriorityQueue<>((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        pq.addAll(empList);
        List<Employee> q14_ans = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            // task
            q14_ans.add(pq.poll());
        }
        System.out.println(q14_ans);
        
    }
    static void q15(){
        // PQ (60072) takes 950,100
        // ArrayList (60072) takes 657,400
        
        int sum = 0;
        int cnt = 0;
        Iterator<Employee> it;
        Long pqStart = System.nanoTime(); // System.currentTimeMillis();
        sum = 0;
        PriorityQueue<Employee> pq = new PriorityQueue<>((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        pq.addAll(empList);
        it = pq.iterator();
        while (it.hasNext()) {
            sum += it.next().getSalary();
            cnt++;
        }
        System.out.println("PQ (" + sum + ") takes " + String.format("%,d", System.nanoTime() - pqStart));
        Long listStart = System.nanoTime();
        ArrayList<Employee> clone = new ArrayList<>();
        sum = 0;
        clone.addAll(empList);

        Collections.sort(clone, (e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        it = clone.iterator();
        while (it.hasNext()) {
            sum += it.next().getSalary();
            cnt--;
        }
        System.out.println("ArrayList (" + sum + ") takes " + String.format("%,d", System.nanoTime() - listStart));
        if (cnt != 0){
            System.out.println("error on number of elements");
        }
    }

}
