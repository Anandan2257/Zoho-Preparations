import java.util.Scanner;
import java.util.ArrayList;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[3];

        for(int i = 0; i < 3;i++){
            int a = sc.nextInt();
            arr[i] = a; 
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < 3;i++){
            int count = 0;
            for(int j = 1; j < arr[i];j++){
                if(arr[i] % j == 0){
                    count ++;
                }
            }
            if(count <= 1){
                result.add(arr[i]);
            }
        }
        System.out.println(result.toString());
    }
}
