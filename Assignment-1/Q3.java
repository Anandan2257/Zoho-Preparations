import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = a > b ? a:b; //ternary Operator
    System.out.print(c);
    }
    
}
