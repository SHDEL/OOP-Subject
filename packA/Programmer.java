package packA;
public class Programmer{
    private String name;
    protected int salary;
    private int experience;

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
        return getSalary();
    }
    public void setExperience(int exp){
        
    }

    void method2(){
        System.out.println("from programmer");
    }
    
    @Override
    public String toString() {
        return "Programmer [languages=" + languages + "]";
    }
    
    
}
