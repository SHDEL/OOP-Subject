package packA;

public class Lab3EmpTmp {
    protected String name;
    protected int salary;
    protected int experience;

    public Lab3EmpTmp(String n, int exp, int sal){
        name = n;
        experience = exp;
        salary = sal;
    }
    public Lab3EmpTmp(String n){
        name = n;
    }
    public Lab3EmpTmp(){

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
        return this.salary;
    }
    public void setExperience(int exp){
        this.experience = exp;
    }
    public int getExperience(){
        return this.getExperience();
    }
    public String toString(){
        return "EmpTmp[ " + getName() + ", " + getSalary() + ", " + getExperience() + "]";
    }
    public void sayHi(){
        System.out.println("hi from " + getName());
    }
}
