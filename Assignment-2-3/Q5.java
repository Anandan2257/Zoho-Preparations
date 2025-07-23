import java.util.Scanner;

public class Q5 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        String s1 = sc.nextLine();
        
        Q5 obj = new Q5(); 
        System.out.println(obj.isSubsequence(s, s1));
    }
}

