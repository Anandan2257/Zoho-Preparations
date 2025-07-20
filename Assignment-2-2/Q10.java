import java.util.ArrayList;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int n = sc.nextInt();
        System.out.print("Enter a column: ");
        int m = sc.nextInt();

        int arr [][] = new int[n][m];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j] = sc.nextInt();
                list.add(arr[i][j]);
            }
        }
        System.out.println(list);
    }
}
