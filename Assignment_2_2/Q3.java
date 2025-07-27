import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList <Integer> result = new ArrayList<>();
        int a = 0,b = 1;
        for(int i = 0; i < 30;i++){
            result.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(result);
    }    
}
