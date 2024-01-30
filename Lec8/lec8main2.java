
package Lec8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/**
 * lec8main2
 */
public class lec8main2 {
    static List<Integer> nums = Arrays.asList(100,105);
    public static void main(String[] args) {
        demo1();
    }
    static void demo1(){
        Consumer <Integer> consumer = num -> System.out.println(num / 2);

        nums.forEach(consumer); // for each keep sending variables/member
        //50
        //52

        consumer.accept(200);
        // 100
    }
}