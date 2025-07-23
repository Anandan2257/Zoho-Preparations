import java.util.Scanner;

public class Q4 {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
        }

        return (char)sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        String s1 = sc.nextLine();
        
        Q4 obj = new Q4(); 
        System.out.println(obj.findTheDifference(s, s1));
    }
}

