package packA;

public class ProgrammerManager extends Programmer implements ManagerRoles{
    public ProgrammerManager(String n, int exp, int sal){
        super(n, exp, sal);
    }
    public void sayHi(){
        System.out.println("Coding in [solidity, typescript]");
    }
    public String coding(){
        return " ";
    }
    public int evaluate(Programmer p){
        p.salary = (int)(p.salary * 0.15) + p.salary;
        return p.salary;
    }
    public String toString(){
        return "ManagerProgrammer [name= " + getName() + ", experience= " + getExperience() + ", salary=" + salary + "]"; 
    }
}
