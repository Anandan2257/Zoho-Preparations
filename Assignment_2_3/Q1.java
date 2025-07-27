import java.util.Scanner;
public class Q1 {
        public static void main(String ...args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                StringBuilder str = new StringBuilder();
                while(a > 0){
                        a--;
                        int b = a % 26;
                        str.insert(0,(char)(b + 'A'));
                        a = a / 26;
                }
                System.out.println(str);

                
        
        }
}
