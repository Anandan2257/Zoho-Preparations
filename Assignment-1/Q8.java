import java.util.Scanner;
public class Q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        sc.close();

        int index = 1;
        if(a == 0) System.out.println(0);

        while((a & 1) == 0){
            a = a >> 1;
            index++;
        }
        System.out.println(index);
    }

}
