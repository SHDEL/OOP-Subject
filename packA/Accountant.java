package packA;

public class Accountant extends Programmer{
    private static String companyName = "berk barn jamkad";
    private int experience;
    private String specialty;
    
    public Accountant(String name, int superExp, int experience, int sal, String talent){
        super(name, superExp, sal);
        this.experience = experience;
        specialty = talent;
    }
    public void setSpecialty(String newspecialty) {
        this.specialty = newspecialty;
    }
    public String getSpecialty(){
        return this.specialty;
    }
    public void setAccountExperience(int exp){
        this.experience = exp;
    }
    public int getAccountExperience(){
        return this.experience;
    }
    public String tellProfit(){
        int profit = (int)(Math.random() * 1000);
        return companyName + "'s profit is " + profit + ". " + "My salary is " + salary; 
    }
    public String toString(){
        return "Accountant [experience=" + getAccountExperience() + ", " + "specialty=" + getSpecialty() + "]";
    }
    public void sayHi(){
        System.out.println(getName() + " says hello");
    }
    public static String tellMyRole(){
        return "I am an accountant at " + companyName ;
    }


}
