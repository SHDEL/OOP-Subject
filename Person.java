/**
 * Person
 */
class Person {

    String name;
    int saving;

    Person(String x, int y){
        name = x;
        saving = y;
    }
    
    boolean isWeathier(Person obj){
        return this.saving > obj.saving;
    }
    void method2(){
        System.out.println("from person");
    }

}