package packA;
import java.lang.Math;
public class Salesperson extends Programmer{
    private int target;
    
    public Salesperson(String n, int exp, int sal, int assignedTarget){
        super(n, exp, sal);
        target = assignedTarget;
    }
    public Salesperson(String n, int exp){
       super();
    }
    public void setTarget(int target){
        this.target = target;
    }
    public int getTarget(){
        return target;
    }
    public void setSalary(int increasedAmount){
        this.salary += increasedAmount; 
    }
    public void setSalary(){
        salary = (int)(this.salary * 1.1);
    }
    public String makeQuotation(){
        int num = (int)(Math.random() * 1000);
        return "Dear value customer, " + num + " is my best offer.";

    }
    @Override
    public String toString() {
        return "Salesperson [target=" + target + " Programmer [name= " + getName() + "," + " salary=" + salary + "," + " experience=" +  getExperience() + "]";
    }
    
}
