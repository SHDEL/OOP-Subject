import java.lang.reflect.Array;
import java.util.Arrays;

public class TestNut {
    public static void main(String[] args) {
        int m[][] = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int n[][] = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int ans[][] = new int[3][2];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                ans[i][j] = m[i][j] + n[n.length - 1 - i][j];
            }
        }
        for (int[] a : ans){
            System.out.println(Arrays.toString(a));
        }
        
    }
}
