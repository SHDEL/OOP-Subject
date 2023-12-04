package packA;

public class Salesperson extends Programmer{
    private int target;
    
    public Salesperson(String exp, int sal, int assigned){
        
    }
    public Salesperson(String n, int exp){
        super(exp, salary);
    }
    public void setTarget(int target){
        this.target = target;
    }
    public int getTarget(){
        return target;
    }
    public void setSalary(int increasedAmount){
        this.salary = increasedAmount; 
    }
    public String makeQuotation(){

    }
    @Override
    public String toString() {
        return "Salesperson [target=" + target + "]";
    }
    
}
