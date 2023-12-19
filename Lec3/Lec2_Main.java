import pack1.*;

public class Lec2_Main {
    public static void main(String[] args) {
        // Emp e1 = new Emp("yindee", 200);
        // Reader r1 = new Reader("preeda", 300, "Java");
        // System.out.println("bye");
        A [] arr = new A[4];
        arr[0] = new B();
        arr[1] = new C();
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        
        for (int i = 0; i < arr.length; i++){
            B ref;
            if (arr[i] instanceof B){
                ref = ((B) arr[i]);
                ref.onlyB();
            }
            if (arr[i] instanceof C){
                ((C) (arr[i])).onlyC();
            }
        }
    }
}
