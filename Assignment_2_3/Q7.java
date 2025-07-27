import java.util.Scanner;

public class Q7 {
    public int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !inSegment) {
                count++;
                inSegment = true;
            } else if (s.charAt(i) == ' ') {
                inSegment = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        
        Q7 obj = new Q7(); 
        System.out.println(obj.countSegments(s)); 
    }
}
