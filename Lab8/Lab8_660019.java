package Lab8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.Comparator;
import java.util.Collections;

interface HalfValueInterface{
    public abstract void printHalf(int n);
}
public class Lab8_660019 {
    static List<Singer> singerList;
    static {
        singerList = new ArrayList<>();
        singerList.add(new Singer("aba", Style.POP));
        singerList.add(new Singer("abi", Style.ROCK));
        singerList.add(new Singer("abo", Style.ROCK));
        singerList.add(new Singer("abe", Style.POP));
    }
    public static void main(String[] args) {
        // q1_halfEachNumber();
        // q2_forEachSingerName();
        q3_lambda_comparator();
        
    }
    public static void q1_halfEachNumber() {
        // first 
        List<Integer> nums = Arrays.asList(100, 105);
        HalfValueInterface q0 = new HalfValueInterface() {
            public void printHalf(int n) {
                System.out.println(n / 2); 
            }
        };
        for (int n : nums) {  
            q0.printHalf(n);
            // 50
            // 52
        }          
        // lambda express
        HalfValueInterface halfVal = n -> System.out.println(n / 2);  /* q1.1 */     
        for (int n : nums) {
            halfVal.printHalf(n);
            // 50
            // 52
        }
        // consumer with lambda use .accept()
        Consumer<Integer> consumer = n -> System.out.println(n / 2);  /* q1.2 */     
        for (int n : nums) {         
            consumer.accept(n);
            // [100, 105]
            // [100, 105]
        }
        // 
        Consumer<Integer> halfMe = n -> System.out.println(n / 2);     
        nums.forEach(halfMe);
        // 50
        // 52

        nums.forEach(n -> System.out.println(n / 2));
        // 50
        // 52
        
        NumberProcessor np = new NumberProcessor();     
        nums.forEach(np::printHalf);
        // 50
        // 52
    }
    public static void q2_forEachSingerName(){

        singerList.stream().map(singerList -> singerList.getName()).forEach(System.out::println);
        singerList.stream().map(Singer::getName).forEach(System.out::println);
    }
    public static void q3_lambda_comparator(){
        Comparator<Singer> byStyle1 = new Comparator<>(){
            @Override
            public int compare(Singer o1, Singer o2){
                return o1.getStyle().compareTo(o2.getStyle());
            }//by Enum .ordinal()
        };
        Collections.sort(singerList, byStyle1);
        singerList.forEach(System.out::println);
        
        Comparator<Singer> byStyle2 = (o1,o2) -> o1.getStyle().compareTo(o2.getStyle());
        Collections.sort(singerList, byStyle2);
        singerList.forEach(System.out::println);
    }
}
class NumberProcessor {
        void printHalf(int n){
            System.out.println(n / 2);
        }
    }
class Singer{
    String name;
    Style style;

    Singer(String name, Style style){
        this.name = name;
        this.style = style;
    }
    public String getName(){
        return this.name;
    }
    public Style getStyle(){
       return this.style;
    }
    public String toString(){
        return "Singer (" + this.name + "-SingerStyle." + this.style + ")";
    }
    public String getStyleString(){
        return style.toString();
    }
}
enum Style{
    POP, ROCK
}
// interface singerList{
//     
// }
