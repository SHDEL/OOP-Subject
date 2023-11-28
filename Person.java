/**
 * Person
 */
public class Person {

    String name;
    int saving;

    void set_attributes(String x , int y){
        name = x;
        saving = y;
    }
    boolean isWeathier(Person obj){
        return this.saving > obj.saving;
    }

}