import java.util.ArrayList;

public class Lab1Coder {
    private String name;
    int experience;
    private ArrayList<String> languages;
    
    Lab1Coder(){
        
    }
    Lab1Coder(String n, int exp){
        name = n;
        experience = exp;
        languages = new ArrayList<>();
    }
    Lab1Coder(String n){
        name = n;
        experience = 0;
        languages = new ArrayList<>();
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setExperience(int exp){
        experience = exp;
    }
    int getExperience(){
        return this.experience;
    }
    void setLanguages(String ... lang){
        for (String i : lang){
            this.languages.add(i);
        }
    }
    ArrayList<String> getLanguages(){
        return languages;
    }
    ArrayList<String> findCommonLanguages(Lab1Coder other){
        ArrayList<String> match = new ArrayList<>();
        for (String language : this.languages){
            if (other.languages.contains(language)){
                match.add(language);
            }
        }
        if (match.isEmpty()){
            match.add("none");
        }
        else{
            return match;
        }
        return match;
    }
    @Override
    public String toString() {
        return name + "(" + experience + ")" + " knows " + languages;
        
    }
    
}
