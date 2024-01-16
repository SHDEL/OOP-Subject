package Lab5;

import java.util.Arrays;

public class Lab5_660019 {
    static int[] data = {28, 58, 8, 77, 48, 39};
    static ArrayProcessor q1NumberofEvenElement;
    static ArrayProcessor q2IndexofLargestEvenValue;
    static ArrayProcessor myMedian;

    public static void main(String[] args){
        q1();
        q2();
        oneline();
    }
    static void q1(){
        q1NumberofEvenElement = list -> {
            int sum = 0;
            for (int i = 0; i < data.length; i++){
                if (data[i] % 2 == 0){
                    sum++;
                }
            }
            return sum;
        };
        System.out.println(q1NumberofEvenElement.calculate(data));
    }
    static void q2(){
        q2IndexofLargestEvenValue = list -> {
            int idx = 0;
            for (int i = 1; i < data.length; i++){
                if (data[i] % 2 == 0 && data[i] > data[i - 1]){
                    idx = i;
                }
            }
            return idx;
        };
        System.out.println(q2IndexofLargestEvenValue.calculate(data));

    }
    static void oneline(){
        int[] tmp = Arrays.copyOf(data, data.length);
        Arrays.sort(tmp);
        myMedian = idx -> tmp[tmp.length / 2];
        // q3 one statement
        System.out.println(myMedian.calculate(tmp)); // 48
    }
}
