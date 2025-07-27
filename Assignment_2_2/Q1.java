import java.util.Scanner;
import java.util.ArrayList;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[10];
        for(int i = 0; i < 10;i++){
            int a = sc.nextInt();
            arr[i] = a; 
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < 10;i++){
            if(arr[i] % 2 != 0){
                result.add(arr[i]);
            }
        }
        System.out.println(result.toString());
    }
}
