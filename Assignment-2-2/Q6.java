import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean result = false;
        int arr[]= {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == a){
                result = true;
                break;
            }
        }

        System.out.println(result);
    }
}
