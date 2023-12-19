package packA;
import java.util.ArrayList;

public class Programmer extends Employee{
    private String name;
    protected int salary;
    private int experience;
    private ArrayList<String> skills;

    public Programmer(String n , int exp, int sal){
        name = n;
        experience = exp;
        salary = sal;
    }
    public Programmer(String n){
        name = n;
    }
    public Programmer(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }
    public int getSalary(){
        return salary;
    }
    public void setExperience(int exp){
        this.experience = exp;
    }
    public int getExperience(){
        return experience;
    }
    public String toString() {
        return "Programmer [name= " + getName() + "," + " salary=" + getSalary() + "," + " experience=" + getExperience() + "]";
    }
    public void sayHi(){
        System.out.println(" hi from " + this.name);
    }
    public String coding(){
        return "I'm coding";
    }
    
    
}
