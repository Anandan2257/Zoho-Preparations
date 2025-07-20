import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        
        if(mark >= 85 && mark <= 100){
            System.out.println("A");
        }else if(mark < 85 && mark >= 70){
            System.out.println("B");
        }else if(mark < 70 && mark >=50){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }
    }
}
