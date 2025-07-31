import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter a: ");    
        int a = sc.nextInt();
        System.out.print("Enter b: ");   
        int b = sc.nextInt();
        System.out.println("Result: " + a / b);
        }catch(Exception e){
            System.err.println("Error: " + e);
        }finally{
            System.out.println("Always print");
        }
    }
}